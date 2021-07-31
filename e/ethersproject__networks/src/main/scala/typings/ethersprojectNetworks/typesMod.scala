package typings.ethersprojectNetworks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Network extends StObject {
    
    var _defaultProvider: js.UndefOr[js.Function2[/* providers */ js.Any, /* options */ js.UndefOr[js.Any], js.Any]] = js.undefined
    
    var chainId: Double
    
    var ensAddress: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object Network {
    
    @scala.inline
    def apply(chainId: Double, name: String): Network = {
      val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Network]
    }
    
    @scala.inline
    implicit class NetworkMutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnsAddress(value: String): Self = StObject.set(x, "ensAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnsAddressUndefined: Self = StObject.set(x, "ensAddress", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_defaultProvider(value: (/* providers */ js.Any, /* options */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "_defaultProvider", js.Any.fromFunction2(value))
      
      @scala.inline
      def set_defaultProviderUndefined: Self = StObject.set(x, "_defaultProvider", js.undefined)
    }
  }
  
  type Networkish = Network | String | Double
}
