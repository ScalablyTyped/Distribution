package typings.ethers.anon

import typings.ethers.ethersStrings.getLogs
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionFilter
import typings.ethers.typesProvidersAbstractProviderMod.PerformActionRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterMethod
  extends StObject
     with PerformActionRequest {
  
  var filter: PerformActionFilter
  
  var method: getLogs
}
object FilterMethod {
  
  inline def apply(filter: PerformActionFilter): FilterMethod = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], method = "getLogs")
    __obj.asInstanceOf[FilterMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterMethod] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: PerformActionFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: getLogs): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
