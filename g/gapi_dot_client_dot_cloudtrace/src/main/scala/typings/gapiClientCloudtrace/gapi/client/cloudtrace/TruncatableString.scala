package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TruncatableString extends js.Object {
  /**
    * The number of bytes removed from the original string. If this
    * value is 0, then the string was not shortened.
    */
  var truncatedByteCount: js.UndefOr[Double] = js.native
  /**
    * The shortened string. For example, if the original string was 500
    * bytes long and the limit of the string was 128 bytes, then this
    * value contains the first 128 bytes of the 500-byte string. Note that
    * truncation always happens on the character boundary, to ensure that
    * truncated string is still valid UTF8. In case of multi-byte characters,
    * size of truncated string can be less than truncation limit.
    */
  var value: js.UndefOr[String] = js.native
}

object TruncatableString {
  @scala.inline
  def apply(): TruncatableString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncatableString]
  }
  @scala.inline
  implicit class TruncatableStringOps[Self <: TruncatableString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTruncatedByteCount(value: Double): Self = this.set("truncatedByteCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncatedByteCount: Self = this.set("truncatedByteCount", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

