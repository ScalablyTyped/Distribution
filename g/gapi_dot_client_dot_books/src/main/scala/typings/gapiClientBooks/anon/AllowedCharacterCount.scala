package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedCharacterCount extends js.Object {
  /** Maximum allowed characters on this layer, especially for the "copy" layer. */
  var allowedCharacterCount: js.UndefOr[Double] = js.native
  /** Type of limitation on this layer. "limited" or "unlimited" for the "copy" layer. */
  var limitType: js.UndefOr[String] = js.native
  /** Remaining allowed characters on this layer, especially for the "copy" layer. */
  var remainingCharacterCount: js.UndefOr[Double] = js.native
}

object AllowedCharacterCount {
  @scala.inline
  def apply(): AllowedCharacterCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedCharacterCount]
  }
  @scala.inline
  implicit class AllowedCharacterCountOps[Self <: AllowedCharacterCount] (val x: Self) extends AnyVal {
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
    def setAllowedCharacterCount(value: Double): Self = this.set("allowedCharacterCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedCharacterCount: Self = this.set("allowedCharacterCount", js.undefined)
    @scala.inline
    def setLimitType(value: String): Self = this.set("limitType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimitType: Self = this.set("limitType", js.undefined)
    @scala.inline
    def setRemainingCharacterCount(value: Double): Self = this.set("remainingCharacterCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemainingCharacterCount: Self = this.set("remainingCharacterCount", js.undefined)
  }
  
}

