package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLayersummary extends js.Object {
  /**
    * The number of annotations for this layer.
    */
  var annotationCount: js.UndefOr[Double] = js.native
  /**
    * The list of annotation types contained for this layer.
    */
  var annotationTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Link to get data for this annotation.
    */
  var annotationsDataLink: js.UndefOr[String] = js.native
  /**
    * The link to get the annotations for this layer.
    */
  var annotationsLink: js.UndefOr[String] = js.native
  /**
    * The content version this resource is for.
    */
  var contentVersion: js.UndefOr[String] = js.native
  /**
    * The number of data items for this layer.
    */
  var dataCount: js.UndefOr[Double] = js.native
  /**
    * Unique id of this layer summary.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource Type
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The layer id for this summary.
    */
  var layerId: js.UndefOr[String] = js.native
  /**
    * URL to this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Timestamp for the last time an item in this layer was updated. (RFC 3339
    * UTC date-time format).
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The current version of this layer&#39;s volume annotations. Note that
    * this version applies only to the data in the
    * books.layers.volumeAnnotations.* responses. The actual annotation data is
    * versioned separately.
    */
  var volumeAnnotationsVersion: js.UndefOr[String] = js.native
  /**
    * The volume id this resource is for.
    */
  var volumeId: js.UndefOr[String] = js.native
}

object SchemaLayersummary {
  @scala.inline
  def apply(
    annotationCount: js.UndefOr[Double] = js.undefined,
    annotationTypes: js.Array[String] = null,
    annotationsDataLink: String = null,
    annotationsLink: String = null,
    contentVersion: String = null,
    dataCount: js.UndefOr[Double] = js.undefined,
    id: String = null,
    kind: String = null,
    layerId: String = null,
    selfLink: String = null,
    updated: String = null,
    volumeAnnotationsVersion: String = null,
    volumeId: String = null
  ): SchemaLayersummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotationCount)) __obj.updateDynamic("annotationCount")(annotationCount.get.asInstanceOf[js.Any])
    if (annotationTypes != null) __obj.updateDynamic("annotationTypes")(annotationTypes.asInstanceOf[js.Any])
    if (annotationsDataLink != null) __obj.updateDynamic("annotationsDataLink")(annotationsDataLink.asInstanceOf[js.Any])
    if (annotationsLink != null) __obj.updateDynamic("annotationsLink")(annotationsLink.asInstanceOf[js.Any])
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(dataCount)) __obj.updateDynamic("dataCount")(dataCount.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (volumeAnnotationsVersion != null) __obj.updateDynamic("volumeAnnotationsVersion")(volumeAnnotationsVersion.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLayersummary]
  }
}

