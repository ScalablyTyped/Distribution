package typings.ethers.anon

import typings.ethers.typesProvidersAbstractProviderMod.PerformActionFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address
  extends StObject
     with PerformActionFilter {
  
  var address: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var fromBlock: js.UndefOr[typings.ethers.typesProvidersProviderMod.BlockTag] = js.undefined
  
  var toBlock: js.UndefOr[typings.ethers.typesProvidersProviderMod.BlockTag] = js.undefined
  
  var topics: js.UndefOr[js.Array[Null | String | js.Array[String]]] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String | js.Array[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: String*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setFromBlock(value: typings.ethers.typesProvidersProviderMod.BlockTag): Self = StObject.set(x, "fromBlock", value.asInstanceOf[js.Any])
    
    inline def setFromBlockUndefined: Self = StObject.set(x, "fromBlock", js.undefined)
    
    inline def setToBlock(value: typings.ethers.typesProvidersProviderMod.BlockTag): Self = StObject.set(x, "toBlock", value.asInstanceOf[js.Any])
    
    inline def setToBlockUndefined: Self = StObject.set(x, "toBlock", js.undefined)
    
    inline def setTopics(value: js.Array[Null | String | js.Array[String]]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: (Null | String | js.Array[String])*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
