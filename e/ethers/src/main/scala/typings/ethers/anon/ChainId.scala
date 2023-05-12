package typings.ethers.anon

import typings.ethers.typesProvidersNetworkMod._Networkish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChainId
  extends StObject
     with _Networkish {
  
  var chainId: js.UndefOr[Double] = js.undefined
  
  var ensAddress: js.UndefOr[String] = js.undefined
  
  var ensNetwork: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ChainId {
  
  inline def apply(): ChainId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChainId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChainId] (val x: Self) extends AnyVal {
    
    inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
    
    inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
    
    inline def setEnsAddress(value: String): Self = StObject.set(x, "ensAddress", value.asInstanceOf[js.Any])
    
    inline def setEnsAddressUndefined: Self = StObject.set(x, "ensAddress", js.undefined)
    
    inline def setEnsNetwork(value: Double): Self = StObject.set(x, "ensNetwork", value.asInstanceOf[js.Any])
    
    inline def setEnsNetworkUndefined: Self = StObject.set(x, "ensNetwork", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
