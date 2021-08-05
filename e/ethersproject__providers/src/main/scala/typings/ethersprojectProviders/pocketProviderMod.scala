package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pocketProviderMod {
  
  @JSImport("@ethersproject/providers/lib/pocket-provider", "PocketProvider")
  @js.native
  class PocketProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
    
    val applicationId: String = js.native
    
    val applicationSecretKey: String = js.native
  }
  /* static members */
  object PocketProvider {
    
    @JSImport("@ethersproject/providers/lib/pocket-provider", "PocketProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
  }
}
