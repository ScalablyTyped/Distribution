package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.formatterMod.CommunityResourcable
import typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlJsonRpcProviderMod {
  
  @JSImport("@ethersproject/providers/lib/url-json-rpc-provider", "StaticJsonRpcProvider")
  @js.native
  class StaticJsonRpcProvider () extends JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: js.UndefOr[scala.Nothing], network: Networkish) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  @JSImport("@ethersproject/providers/lib/url-json-rpc-provider", "UrlJsonRpcProvider")
  @js.native
  abstract class UrlJsonRpcProvider ()
    extends StaticJsonRpcProvider
       with CommunityResourcable {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
    
    val apiKey: js.Any = js.native
    
    /* InferMemberOverrides */
    override def lookupAddress(address: String): js.Promise[String] = js.native
    
    /* InferMemberOverrides */
    override def resolveName(name: String): js.Promise[String] = js.native
  }
  /* static members */
  object UrlJsonRpcProvider {
    
    @JSImport("@ethersproject/providers/lib/url-json-rpc-provider", "UrlJsonRpcProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers/lib/url-json-rpc-provider", "UrlJsonRpcProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): String | ConnectionInfo = js.native
  }
}
