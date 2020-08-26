package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsNumericOptions extends js.Object {
  var locale: js.UndefOr[AlphanumericLocale] = js.native
  var no_symbols: Boolean = js.native
}

object IsNumericOptions {
  @scala.inline
  def apply(no_symbols: Boolean): IsNumericOptions = {
    val __obj = js.Dynamic.literal(no_symbols = no_symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsNumericOptions]
  }
  @scala.inline
  implicit class IsNumericOptionsOps[Self <: IsNumericOptions] (val x: Self) extends AnyVal {
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
    def setNo_symbols(value: Boolean): Self = this.set("no_symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: AlphanumericLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
  
}

