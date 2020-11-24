package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsDecimalOptions extends js.Object {
  
  var decimal_digits: js.UndefOr[String] = js.native
  
  var force_decimal: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[AlphanumericLocale] = js.native
}
object IsDecimalOptions {
  
  @scala.inline
  def apply(): IsDecimalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsDecimalOptions]
  }
  
  @scala.inline
  implicit class IsDecimalOptionsOps[Self <: IsDecimalOptions] (val x: Self) extends AnyVal {
    
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
    def setDecimal_digits(value: String): Self = this.set("decimal_digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimal_digits: Self = this.set("decimal_digits", js.undefined)
    
    @scala.inline
    def setForce_decimal(value: Boolean): Self = this.set("force_decimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce_decimal: Self = this.set("force_decimal", js.undefined)
    
    @scala.inline
    def setLocale(value: AlphanumericLocale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
}
