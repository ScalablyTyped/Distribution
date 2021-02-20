package typings.ethersprojectProviders

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.fallbackProviderMod.FallbackProviderConfig
import typings.ethersprojectProviders.formatterMod.FormatFunc
import typings.ethersprojectProviders.web3ProviderMod.ExternalProvider
import typings.ethersprojectProviders.web3ProviderMod.JsonRpcFetchFunc
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/providers", "AlchemyProvider")
  @js.native
  class AlchemyProvider ()
    extends typings.ethersprojectProviders.alchemyProviderMod.AlchemyProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object AlchemyProvider {
    
    @JSImport("@ethersproject/providers", "AlchemyProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "AlchemyProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: String): ConnectionInfo = js.native
    
    @JSImport("@ethersproject/providers", "AlchemyProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(): typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
    @JSImport("@ethersproject/providers", "AlchemyProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
    @JSImport("@ethersproject/providers", "AlchemyProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(network: Networkish): typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = js.native
  }
  
  @JSImport("@ethersproject/providers", "AlchemyWebSocketProvider")
  @js.native
  class AlchemyWebSocketProvider ()
    extends typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  
  @JSImport("@ethersproject/providers", "BaseProvider")
  @js.native
  class BaseProvider protected ()
    extends typings.ethersprojectProviders.baseProviderMod.BaseProvider {
    def this(network: js.Promise[Network]) = this()
    /**
      *  ready
      *
      *  A Promise<Network> that resolves only once the provider is ready.
      *
      *  Sub-classes that call the super with a network without a chainId
      *  MUST set this. Standard named networks have a known chainId.
      *
      */
    def this(network: Networkish) = this()
  }
  /* static members */
  object BaseProvider {
    
    @JSImport("@ethersproject/providers", "BaseProvider.getFormatter")
    @js.native
    def getFormatter(): typings.ethersprojectProviders.formatterMod.Formatter = js.native
    
    @JSImport("@ethersproject/providers", "BaseProvider.getNetwork")
    @js.native
    def getNetwork(network: Networkish): Network = js.native
  }
  
  @JSImport("@ethersproject/providers", "CloudflareProvider")
  @js.native
  class CloudflareProvider ()
    extends typings.ethersprojectProviders.cloudflareProviderMod.CloudflareProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object CloudflareProvider {
    
    @JSImport("@ethersproject/providers", "CloudflareProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "CloudflareProvider.getUrl")
    @js.native
    def getUrl(network: Network): String = js.native
    @JSImport("@ethersproject/providers", "CloudflareProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): String = js.native
  }
  
  @JSImport("@ethersproject/providers", "EtherscanProvider")
  @js.native
  class EtherscanProvider ()
    extends typings.ethersprojectProviders.etherscanProviderMod.EtherscanProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: String) = this()
  }
  
  @JSImport("@ethersproject/providers", "FallbackProvider")
  @js.native
  class FallbackProvider protected ()
    extends typings.ethersprojectProviders.fallbackProviderMod.FallbackProvider {
    def this(providers: js.Array[typings.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig]) = this()
    def this(
      providers: js.Array[typings.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig],
      quorum: Double
    ) = this()
  }
  
  @JSImport("@ethersproject/providers", "Formatter")
  @js.native
  class Formatter ()
    extends typings.ethersprojectProviders.formatterMod.Formatter
  /* static members */
  object Formatter {
    
    @JSImport("@ethersproject/providers", "Formatter.allowFalsish")
    @js.native
    def allowFalsish(format: FormatFunc, replaceValue: js.Any): FormatFunc = js.native
    
    @JSImport("@ethersproject/providers", "Formatter.allowNull")
    @js.native
    def allowNull(format: FormatFunc): FormatFunc = js.native
    @JSImport("@ethersproject/providers", "Formatter.allowNull")
    @js.native
    def allowNull(format: FormatFunc, nullValue: js.Any): FormatFunc = js.native
    
    @JSImport("@ethersproject/providers", "Formatter.arrayOf")
    @js.native
    def arrayOf(format: FormatFunc): FormatFunc = js.native
    
    @JSImport("@ethersproject/providers", "Formatter.check")
    @js.native
    def check(format: StringDictionary[FormatFunc], `object`: js.Any): js.Any = js.native
  }
  
  @JSImport("@ethersproject/providers", "InfuraProvider")
  @js.native
  class InfuraProvider ()
    extends typings.ethersprojectProviders.infuraProviderMod.InfuraProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object InfuraProvider {
    
    @JSImport("@ethersproject/providers", "InfuraProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "InfuraProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
    
    @JSImport("@ethersproject/providers", "InfuraProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(): typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
    @JSImport("@ethersproject/providers", "InfuraProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(network: js.UndefOr[Networkish], apiKey: js.Any): typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
    @JSImport("@ethersproject/providers", "InfuraProvider.getWebSocketProvider")
    @js.native
    def getWebSocketProvider(network: Networkish): typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = js.native
  }
  
  @JSImport("@ethersproject/providers", "InfuraWebSocketProvider")
  @js.native
  class InfuraWebSocketProvider ()
    extends typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  
  @JSImport("@ethersproject/providers", "IpcProvider")
  @js.native
  class IpcProvider protected ()
    extends typings.ethersprojectProviders.ipcProviderMod.IpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
  }
  
  @JSImport("@ethersproject/providers", "JsonRpcProvider")
  @js.native
  class JsonRpcProvider ()
    extends typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: js.UndefOr[scala.Nothing], network: Networkish) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  /* static members */
  object JsonRpcProvider {
    
    @JSImport("@ethersproject/providers", "JsonRpcProvider.defaultUrl")
    @js.native
    def defaultUrl(): String = js.native
    
    @JSImport("@ethersproject/providers", "JsonRpcProvider.hexlifyTransaction")
    @js.native
    def hexlifyTransaction(transaction: TransactionRequest): StringDictionary[String] = js.native
    @JSImport("@ethersproject/providers", "JsonRpcProvider.hexlifyTransaction")
    @js.native
    def hexlifyTransaction(transaction: TransactionRequest, allowExtra: StringDictionary[Boolean]): StringDictionary[String] = js.native
  }
  
  @JSImport("@ethersproject/providers", "JsonRpcSigner")
  @js.native
  class JsonRpcSigner protected ()
    extends typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcSigner {
    def this(
      constructorGuard: js.Any,
      provider: typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
    ) = this()
    def this(
      constructorGuard: js.Any,
      provider: typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider,
      addressOrIndex: String
    ) = this()
    def this(
      constructorGuard: js.Any,
      provider: typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider,
      addressOrIndex: Double
    ) = this()
  }
  
  @JSImport("@ethersproject/providers", "NodesmithProvider")
  @js.native
  class NodesmithProvider ()
    extends typings.ethersprojectProviders.nodesmithProviderMod.NodesmithProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object NodesmithProvider {
    
    @JSImport("@ethersproject/providers", "NodesmithProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "NodesmithProvider.getUrl")
    @js.native
    def getUrl(network: Network): String = js.native
    @JSImport("@ethersproject/providers", "NodesmithProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): String = js.native
  }
  
  @JSImport("@ethersproject/providers", "PocketProvider")
  @js.native
  class PocketProvider ()
    extends typings.ethersprojectProviders.pocketProviderMod.PocketProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object PocketProvider {
    
    @JSImport("@ethersproject/providers", "PocketProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "PocketProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = js.native
  }
  
  @JSImport("@ethersproject/providers", "Provider")
  @js.native
  abstract class Provider ()
    extends typings.ethersprojectAbstractProvider.mod.Provider
  /* static members */
  object Provider {
    
    @JSImport("@ethersproject/providers", "Provider.isProvider")
    @js.native
    def isProvider(value: js.Any): /* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.Provider */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/providers", "Resolver")
  @js.native
  class Resolver protected ()
    extends typings.ethersprojectProviders.baseProviderMod.Resolver {
    def this(
      provider: typings.ethersprojectProviders.baseProviderMod.BaseProvider,
      address: String,
      name: String
    ) = this()
  }
  
  @JSImport("@ethersproject/providers", "StaticJsonRpcProvider")
  @js.native
  class StaticJsonRpcProvider ()
    extends typings.ethersprojectProviders.urlJsonRpcProviderMod.StaticJsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: js.UndefOr[scala.Nothing], network: Networkish) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  @JSImport("@ethersproject/providers", "UrlJsonRpcProvider")
  @js.native
  abstract class UrlJsonRpcProvider ()
    extends typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: js.UndefOr[Networkish], apiKey: js.Any) = this()
  }
  /* static members */
  object UrlJsonRpcProvider {
    
    @JSImport("@ethersproject/providers", "UrlJsonRpcProvider.getApiKey")
    @js.native
    def getApiKey(apiKey: js.Any): js.Any = js.native
    
    @JSImport("@ethersproject/providers", "UrlJsonRpcProvider.getUrl")
    @js.native
    def getUrl(network: Network, apiKey: js.Any): String | ConnectionInfo = js.native
  }
  
  @JSImport("@ethersproject/providers", "Web3Provider")
  @js.native
  class Web3Provider protected ()
    extends typings.ethersprojectProviders.web3ProviderMod.Web3Provider {
    def this(provider: ExternalProvider) = this()
    def this(provider: JsonRpcFetchFunc) = this()
    def this(provider: ExternalProvider, network: Networkish) = this()
    def this(provider: JsonRpcFetchFunc, network: Networkish) = this()
  }
  
  @JSImport("@ethersproject/providers", "WebSocketProvider")
  @js.native
  class WebSocketProvider protected ()
    extends typings.ethersprojectProviders.websocketProviderMod.WebSocketProvider {
    def this(url: String) = this()
    def this(url: String, network: Networkish) = this()
  }
  /* static members */
  object WebSocketProvider {
    
    @JSImport("@ethersproject/providers", "WebSocketProvider.defaultUrl")
    @js.native
    def defaultUrl(): String = js.native
  }
  
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(network: js.UndefOr[scala.Nothing], options: js.Any): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(network: String): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(network: String, options: js.Any): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(network: Network): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  @JSImport("@ethersproject/providers", "getDefaultProvider")
  @js.native
  def getDefaultProvider(network: Network, options: js.Any): typings.ethersprojectProviders.baseProviderMod.BaseProvider = js.native
  
  @JSImport("@ethersproject/providers", "getNetwork")
  @js.native
  def getNetwork(network: Networkish): Network = js.native
  
  @JSImport("@ethersproject/providers", "isCommunityResourcable")
  @js.native
  def isCommunityResourcable(value: js.Any): /* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean = js.native
  
  @JSImport("@ethersproject/providers", "isCommunityResource")
  @js.native
  def isCommunityResource(value: js.Any): Boolean = js.native
  
  @JSImport("@ethersproject/providers", "showThrottleMessage")
  @js.native
  def showThrottleMessage(): Unit = js.native
}
