package typings.ethersprojectNetworks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait Network extends StObject {
    
    var _defaultProvider: js.UndefOr[js.Function2[/* providers */ Any, /* options */ js.UndefOr[Any], Any]] = js.undefined
    
    var chainId: Double
    
    var ensAddress: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object Network {
    
    inline def apply(chainId: Double, name: String): Network = {
      val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Network]
    }
    
    extension [Self <: Network](x: Self) {
      
      inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      inline def setEnsAddress(value: String): Self = StObject.set(x, "ensAddress", value.asInstanceOf[js.Any])
      
      inline def setEnsAddressUndefined: Self = StObject.set(x, "ensAddress", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def set_defaultProvider(value: (/* providers */ Any, /* options */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "_defaultProvider", js.Any.fromFunction2(value))
      
      inline def set_defaultProviderUndefined: Self = StObject.set(x, "_defaultProvider", js.undefined)
    }
  }
  
  type Networkish = Network | String | Double
}
