package typings.formatjsEcma402Abstract.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrencyDigitsData extends StObject {
  
  var currencyDigitsData: Record[String, Double] = js.native
}
object CurrencyDigitsData {
  
  @scala.inline
  def apply(currencyDigitsData: Record[String, Double]): CurrencyDigitsData = {
    val __obj = js.Dynamic.literal(currencyDigitsData = currencyDigitsData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyDigitsData]
  }
  
  @scala.inline
  implicit class CurrencyDigitsDataMutableBuilder[Self <: CurrencyDigitsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyDigitsData(value: Record[String, Double]): Self = StObject.set(x, "currencyDigitsData", value.asInstanceOf[js.Any])
  }
}
