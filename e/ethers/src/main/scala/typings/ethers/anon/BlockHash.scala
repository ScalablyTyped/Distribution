package typings.ethers.anon

import typings.ethers.typesProvidersAbstractProviderMod.PerformActionFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockHash
  extends StObject
     with PerformActionFilter {
  
  var address: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var blockHash: js.UndefOr[String] = js.undefined
  
  var topics: js.UndefOr[js.Array[Null | String | js.Array[String]]] = js.undefined
}
object BlockHash {
  
  inline def apply(): BlockHash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockHash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockHash] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String | js.Array[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: String*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    inline def setBlockHashUndefined: Self = StObject.set(x, "blockHash", js.undefined)
    
    inline def setTopics(value: js.Array[Null | String | js.Array[String]]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: (Null | String | js.Array[String])*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
