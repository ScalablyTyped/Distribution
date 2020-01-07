package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Annotationdata extends js.Object {
  /**
    * The type of annotation this data is for.
    */
  var annotationType: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Base64 encoded data for this annotation data.
    */
  var encoded_data: js.UndefOr[String] = js.native
  /**
    * Unique id for this annotation data.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource Type
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The Layer id for this data. *
    */
  var layerId: js.UndefOr[String] = js.native
  /**
    * URL for this resource. *
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Timestamp for the last time this data was updated. (RFC 3339 UTC
    * date-time format).
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The volume id for this data. *
    */
  var volumeId: js.UndefOr[String] = js.native
}

object Schema$Annotationdata {
  @scala.inline
  def apply(
    annotationType: String = null,
    data: js.Any = null,
    encoded_data: String = null,
    id: String = null,
    kind: String = null,
    layerId: String = null,
    selfLink: String = null,
    updated: String = null,
    volumeId: String = null
  ): Schema$Annotationdata = {
    val __obj = js.Dynamic.literal()
    if (annotationType != null) __obj.updateDynamic("annotationType")(annotationType.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (encoded_data != null) __obj.updateDynamic("encoded_data")(encoded_data.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Annotationdata]
  }
}

