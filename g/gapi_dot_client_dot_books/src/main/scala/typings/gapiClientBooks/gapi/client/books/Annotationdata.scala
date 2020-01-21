package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotationdata extends js.Object {
  /** The type of annotation this data is for. */
  var annotationType: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  /** Base64 encoded data for this annotation data. */
  var encoded_data: js.UndefOr[String] = js.undefined
  /** Unique id for this annotation data. */
  var id: js.UndefOr[String] = js.undefined
  /** Resource Type */
  var kind: js.UndefOr[String] = js.undefined
  /** The Layer id for this data. &#42; */
  var layerId: js.UndefOr[String] = js.undefined
  /** URL for this resource. &#42; */
  var selfLink: js.UndefOr[String] = js.undefined
  /** Timestamp for the last time this data was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[String] = js.undefined
  /** The volume id for this data. &#42; */
  var volumeId: js.UndefOr[String] = js.undefined
}

object Annotationdata {
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
  ): Annotationdata = {
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
    __obj.asInstanceOf[Annotationdata]
  }
}

