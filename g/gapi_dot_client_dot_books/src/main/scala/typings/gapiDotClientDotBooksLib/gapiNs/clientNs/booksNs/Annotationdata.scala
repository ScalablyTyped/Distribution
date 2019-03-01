package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotationdata extends js.Object {
  /** The type of annotation this data is for. */
  var annotationType: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  /** Base64 encoded data for this annotation data. */
  var encoded_data: js.UndefOr[java.lang.String] = js.undefined
  /** Unique id for this annotation data. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Resource Type */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The Layer id for this data. &#42; */
  var layerId: js.UndefOr[java.lang.String] = js.undefined
  /** URL for this resource. &#42; */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp for the last time this data was updated. (RFC 3339 UTC date-time format). */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** The volume id for this data. &#42; */
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

object Annotationdata {
  @scala.inline
  def apply(
    annotationType: java.lang.String = null,
    data: js.Any = null,
    encoded_data: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    layerId: java.lang.String = null,
    selfLink: java.lang.String = null,
    updated: java.lang.String = null,
    volumeId: java.lang.String = null
  ): Annotationdata = {
    val __obj = js.Dynamic.literal()
    if (annotationType != null) __obj.updateDynamic("annotationType")(annotationType)
    if (data != null) __obj.updateDynamic("data")(data)
    if (encoded_data != null) __obj.updateDynamic("encoded_data")(encoded_data)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (layerId != null) __obj.updateDynamic("layerId")(layerId)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId)
    __obj.asInstanceOf[Annotationdata]
  }
}

