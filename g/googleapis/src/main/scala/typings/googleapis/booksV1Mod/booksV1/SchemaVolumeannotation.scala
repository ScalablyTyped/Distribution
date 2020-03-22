package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.AnonContentVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVolumeannotation extends js.Object {
  /**
    * The annotation data id for this volume annotation.
    */
  var annotationDataId: js.UndefOr[String] = js.native
  /**
    * Link to get data for this annotation.
    */
  var annotationDataLink: js.UndefOr[String] = js.native
  /**
    * The type of annotation this is.
    */
  var annotationType: js.UndefOr[String] = js.native
  /**
    * The content ranges to identify the selected text.
    */
  var contentRanges: js.UndefOr[AnonContentVersion] = js.native
  /**
    * Data for this annotation.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * Indicates that this annotation is deleted.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  /**
    * Unique id of this volume annotation.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource Type
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The Layer this annotation is for.
    */
  var layerId: js.UndefOr[String] = js.native
  /**
    * Pages the annotation spans.
    */
  var pageIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Excerpt from the volume.
    */
  var selectedText: js.UndefOr[String] = js.native
  /**
    * URL to this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Timestamp for the last time this anntoation was updated. (RFC 3339 UTC
    * date-time format).
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The Volume this annotation is for.
    */
  var volumeId: js.UndefOr[String] = js.native
}

object SchemaVolumeannotation {
  @scala.inline
  def apply(
    annotationDataId: String = null,
    annotationDataLink: String = null,
    annotationType: String = null,
    contentRanges: AnonContentVersion = null,
    data: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    layerId: String = null,
    pageIds: js.Array[String] = null,
    selectedText: String = null,
    selfLink: String = null,
    updated: String = null,
    volumeId: String = null
  ): SchemaVolumeannotation = {
    val __obj = js.Dynamic.literal()
    if (annotationDataId != null) __obj.updateDynamic("annotationDataId")(annotationDataId.asInstanceOf[js.Any])
    if (annotationDataLink != null) __obj.updateDynamic("annotationDataLink")(annotationDataLink.asInstanceOf[js.Any])
    if (annotationType != null) __obj.updateDynamic("annotationType")(annotationType.asInstanceOf[js.Any])
    if (contentRanges != null) __obj.updateDynamic("contentRanges")(contentRanges.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (pageIds != null) __obj.updateDynamic("pageIds")(pageIds.asInstanceOf[js.Any])
    if (selectedText != null) __obj.updateDynamic("selectedText")(selectedText.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVolumeannotation]
  }
}

