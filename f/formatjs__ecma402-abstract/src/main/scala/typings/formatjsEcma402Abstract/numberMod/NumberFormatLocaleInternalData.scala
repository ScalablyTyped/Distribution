package typings.formatjsEcma402Abstract.numberMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFormatLocaleInternalData extends js.Object {
  
  var currencies: Record[String, CurrencyData] = js.native
  
  var nu: js.Array[String] = js.native
  
  var numbers: RawNumberData = js.native
  
  var units: UnitDataTable = js.native
}
object NumberFormatLocaleInternalData {
  
  @scala.inline
  def apply(
    currencies: Record[String, CurrencyData],
    nu: js.Array[String],
    numbers: RawNumberData,
    units: UnitDataTable
  ): NumberFormatLocaleInternalData = {
    val __obj = js.Dynamic.literal(currencies = currencies.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatLocaleInternalData]
  }
  
  @scala.inline
  implicit class NumberFormatLocaleInternalDataOps[Self <: NumberFormatLocaleInternalData] (val x: Self) extends AnyVal {
    
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
    def setCurrencies(value: Record[String, CurrencyData]): Self = this.set("currencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNuVarargs(value: String*): Self = this.set("nu", js.Array(value :_*))
    
    @scala.inline
    def setNu(value: js.Array[String]): Self = this.set("nu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumbers(value: RawNumberData): Self = this.set("numbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnits(value: UnitDataTable): Self = this.set("units", value.asInstanceOf[js.Any])
  }
}
