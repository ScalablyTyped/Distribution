package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudflareProviderMod {
  
  @JSImport("@ethersproject/providers/lib/cloudflare-provider", "CloudflareProvider")
  @js.native
  class CloudflareProvider () extends UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
  }
  /* static members */
  object CloudflareProvider {
    
    @JSImport("@ethersproject/providers/lib/cloudflare-provider", "CloudflareProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getApiKey(apiKey: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getUrl(network: Network): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def getUrl(network: Network, apiKey: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
