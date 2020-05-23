package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncatableString extends js.Object {
  /**
    * The number of bytes removed from the original string. If this
    * value is 0, then the string was not shortened.
    */
  var truncatedByteCount: js.UndefOr[Double] = js.undefined
  /**
    * The shortened string. For example, if the original string was 500
    * bytes long and the limit of the string was 128 bytes, then this
    * value contains the first 128 bytes of the 500-byte string. Note that
    * truncation always happens on the character boundary, to ensure that
    * truncated string is still valid UTF8. In case of multi-byte characters,
    * size of truncated string can be less than truncation limit.
    */
  var value: js.UndefOr[String] = js.undefined
}

object TruncatableString {
  @scala.inline
  def apply(truncatedByteCount: js.UndefOr[Double] = js.undefined, value: String = null): TruncatableString = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(truncatedByteCount)) __obj.updateDynamic("truncatedByteCount")(truncatedByteCount.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncatableString]
  }
}

