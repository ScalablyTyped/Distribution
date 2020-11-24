package typings.dineroJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeRatesApiOptions extends js.Object {
  
  var endpoint: String | js.Promise[StringDictionary[_]] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var propertyPath: js.UndefOr[String] = js.native
  
  var roundingMode: js.UndefOr[RoundingMode] = js.native
}
object ExchangeRatesApiOptions {
  
  @scala.inline
  def apply(endpoint: String | js.Promise[StringDictionary[_]]): ExchangeRatesApiOptions = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeRatesApiOptions]
  }
  
  @scala.inline
  implicit class ExchangeRatesApiOptionsOps[Self <: ExchangeRatesApiOptions] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: String | js.Promise[StringDictionary[_]]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setPropertyPath(value: String): Self = this.set("propertyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyPath: Self = this.set("propertyPath", js.undefined)
    
    @scala.inline
    def setRoundingMode(value: RoundingMode): Self = this.set("roundingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoundingMode: Self = this.set("roundingMode", js.undefined)
  }
}
