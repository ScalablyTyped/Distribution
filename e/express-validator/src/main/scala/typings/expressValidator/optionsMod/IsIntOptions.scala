package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsIntOptions extends MinMaxExtendedOptions {
  var allow_leading_zeroes: js.UndefOr[Boolean] = js.native
}

object IsIntOptions {
  @scala.inline
  def apply(): IsIntOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsIntOptions]
  }
  @scala.inline
  implicit class IsIntOptionsOps[Self <: IsIntOptions] (val x: Self) extends AnyVal {
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
    def setAllow_leading_zeroes(value: Boolean): Self = this.set("allow_leading_zeroes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_leading_zeroes: Self = this.set("allow_leading_zeroes", js.undefined)
  }
  
}

