package typings.ethereumProtocol.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterObject extends StObject {
  
  var address: js.UndefOr[String] = js.undefined
  
  var fromBlock: js.UndefOr[Double | String] = js.undefined
  
  var toBlock: js.UndefOr[Double | String] = js.undefined
  
  var topics: js.UndefOr[js.Array[LogTopic]] = js.undefined
}
object FilterObject {
  
  inline def apply(): FilterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterObject]
  }
  
  extension [Self <: FilterObject](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setFromBlock(value: Double | String): Self = StObject.set(x, "fromBlock", value.asInstanceOf[js.Any])
    
    inline def setFromBlockUndefined: Self = StObject.set(x, "fromBlock", js.undefined)
    
    inline def setToBlock(value: Double | String): Self = StObject.set(x, "toBlock", value.asInstanceOf[js.Any])
    
    inline def setToBlockUndefined: Self = StObject.set(x, "toBlock", js.undefined)
    
    inline def setTopics(value: js.Array[LogTopic]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: LogTopic*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
