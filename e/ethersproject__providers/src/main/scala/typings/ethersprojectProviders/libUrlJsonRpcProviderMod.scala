package typings.ethersprojectProviders

import typings.ethersprojectNetworks.libTypesMod.Network
import typings.ethersprojectNetworks.libTypesMod.Networkish
import typings.ethersprojectProviders.libFormatterMod.CommunityResourcable
import typings.ethersprojectProviders.libJsonRpcProviderMod.JsonRpcProvider
import typings.ethersprojectWeb.ethersprojectWebStrings.block
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUrlJsonRpcProviderMod {
  
  @JSImport("@ethersproject/providers/lib/url-json-rpc-provider", "StaticJsonRpcProvider")
  @js.native
  open class StaticJsonRpcProvider () extends JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: Unit, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  /* note: abstract class */ @JSImport("@ethersproject/providers/lib/url-json-rpc-provider", "UrlJsonRpcProvider")
  @js.native
  open class UrlJsonRpcProvider ()
    extends StaticJsonRpcProvider
       with CommunityResourcable {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
    
    val apiKey: Any = js.native
    
    /* CompleteClass */
    override def isCommunityResource(): Boolean = js.native
    
    /* InferMemberOverrides */
    override def lookupAddress(address: String): js.Promise[Null | String] = js.native
    
    /* InferMemberOverrides */
    @JSName("once")
    override def once_block(eventName: block, handler: js.Function0[Unit]): Unit = js.native
    
    /* InferMemberOverrides */
    override def resolveName(name: String): js.Promise[Null | String] = js.native
  }
  /* static members */
  object UrlJsonRpcProvider {
    
    @JSImport("@ethersproject/providers/lib/url-json-rpc-provider", "UrlJsonRpcProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network, apiKey: Any): String | ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[String | ConnectionInfo]
  }
}
