package typings.ethersprojectProviders

import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.formatterMod.CommunityResourcable
import typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
import typings.ethersprojectWeb.ethersprojectWebStrings.block
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlJsonRpcProviderMod {
  
  @JSImport("@ethersproject/providers/lib/url-json-rpc-provider", "StaticJsonRpcProvider")
  @js.native
  class StaticJsonRpcProvider () extends JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: Unit, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  @JSImport("@ethersproject/providers/lib/url-json-rpc-provider", "UrlJsonRpcProvider")
  @js.native
  abstract class UrlJsonRpcProvider ()
    extends StaticJsonRpcProvider
       with CommunityResourcable {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
    
    val apiKey: js.Any = js.native
    
    /* CompleteClass */
    override def isCommunityResource(): Boolean = js.native
    
    /* InferMemberOverrides */
    override def lookupAddress(address: String): js.Promise[String] = js.native
    
    /* InferMemberOverrides */
    @JSName("once")
    override def once_block(eventName: block, handler: js.Function0[Unit]): Unit = js.native
    
    /* InferMemberOverrides */
    override def resolveName(name: String): js.Promise[String] = js.native
  }
  /* static members */
  object UrlJsonRpcProvider {
    
    @JSImport("@ethersproject/providers/lib/url-json-rpc-provider", "UrlJsonRpcProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    inline def getUrl(network: Network, apiKey: js.Any): String | ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[String | ConnectionInfo]
  }
}
