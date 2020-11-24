package typings.formatjsEcma402Abstract.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencyDigitsData extends js.Object {
  
  var currencyDigitsData: Record[String, Double] = js.native
}
object CurrencyDigitsData {
  
  @scala.inline
  def apply(currencyDigitsData: Record[String, Double]): CurrencyDigitsData = {
    val __obj = js.Dynamic.literal(currencyDigitsData = currencyDigitsData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyDigitsData]
  }
  
  @scala.inline
  implicit class CurrencyDigitsDataOps[Self <: CurrencyDigitsData] (val x: Self) extends AnyVal {
    
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
    def setCurrencyDigitsData(value: Record[String, Double]): Self = this.set("currencyDigitsData", value.asInstanceOf[js.Any])
  }
}
