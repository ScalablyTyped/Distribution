package typings.extenso.mod.Extenso

import typings.extenso.anon.Type
import typings.extenso.extensoStrings.currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencyModeOptions
  extends BaseOptions
     with Options {
  
  var currency: js.UndefOr[Type] = js.native
  
  var mode: currency = js.native
}
object CurrencyModeOptions {
  
  @scala.inline
  def apply(mode: currency): CurrencyModeOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyModeOptions]
  }
  
  @scala.inline
  implicit class CurrencyModeOptionsOps[Self <: CurrencyModeOptions] (val x: Self) extends AnyVal {
    
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
    def setMode(value: currency): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: Type): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
  }
}
