package typings.ethersprojectProviders

import typings.ethersprojectNetworks.libTypesMod.Network
import typings.ethersprojectNetworks.libTypesMod.Networkish
import typings.ethersprojectProviders.libUrlJsonRpcProviderMod.UrlJsonRpcProvider
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnkrProviderMod {
  
  @JSImport("@ethersproject/providers/lib/ankr-provider", "AnkrProvider")
  @js.native
  open class AnkrProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
    
    @JSName("apiKey")
    val apiKey_AnkrProvider: String = js.native
  }
  /* static members */
  object AnkrProvider {
    
    @JSImport("@ethersproject/providers/lib/ankr-provider", "AnkrProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network, apiKey: Any): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
  }
}
