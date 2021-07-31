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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/providers", "AlchemyProvider")
  @js.native
  class AlchemyProvider ()
    extends typings.ethersprojectProviders.alchemyProviderMod.AlchemyProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
  }
  /* static members */
  object AlchemyProvider {
    
    @JSImport("@ethersproject/providers", "AlchemyProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getApiKey(apiKey: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getUrl(network: Network, apiKey: String): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
    
    @scala.inline
    def getWebSocketProvider(): typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")().asInstanceOf[typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider]
    @scala.inline
    def getWebSocketProvider(network: Unit, apiKey: js.Any): typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider]
    @scala.inline
    def getWebSocketProvider(network: Networkish): typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider]
    @scala.inline
    def getWebSocketProvider(network: Networkish, apiKey: js.Any): typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider]
  }
  
  @JSImport("@ethersproject/providers", "AlchemyWebSocketProvider")
  @js.native
  class AlchemyWebSocketProvider ()
    extends typings.ethersprojectProviders.alchemyProviderMod.AlchemyWebSocketProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
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
    
    @JSImport("@ethersproject/providers", "BaseProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getFormatter(): typings.ethersprojectProviders.formatterMod.Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")().asInstanceOf[typings.ethersprojectProviders.formatterMod.Formatter]
    
    @scala.inline
    def getNetwork(network: Networkish): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetwork")(network.asInstanceOf[js.Any]).asInstanceOf[Network]
  }
  
  @JSImport("@ethersproject/providers", "CloudflareProvider")
  @js.native
  class CloudflareProvider ()
    extends typings.ethersprojectProviders.cloudflareProviderMod.CloudflareProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
  }
  /* static members */
  object CloudflareProvider {
    
    @JSImport("@ethersproject/providers", "CloudflareProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getApiKey(apiKey: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getUrl(network: Network): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def getUrl(network: Network, apiKey: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@ethersproject/providers", "EtherscanProvider")
  @js.native
  class EtherscanProvider ()
    extends typings.ethersprojectProviders.etherscanProviderMod.EtherscanProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: String) = this()
    def this(network: Networkish, apiKey: String) = this()
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
    
    @JSImport("@ethersproject/providers", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def allowFalsish(format: FormatFunc, replaceValue: js.Any): FormatFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("allowFalsish")(format.asInstanceOf[js.Any], replaceValue.asInstanceOf[js.Any])).asInstanceOf[FormatFunc]
    
    @scala.inline
    def allowNull(format: FormatFunc): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("allowNull")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    @scala.inline
    def allowNull(format: FormatFunc, nullValue: js.Any): FormatFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("allowNull")(format.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any])).asInstanceOf[FormatFunc]
    
    @scala.inline
    def arrayOf(format: FormatFunc): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOf")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @scala.inline
    def check(format: StringDictionary[FormatFunc], `object`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(format.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @JSImport("@ethersproject/providers", "InfuraProvider")
  @js.native
  class InfuraProvider ()
    extends typings.ethersprojectProviders.infuraProviderMod.InfuraProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
  }
  /* static members */
  object InfuraProvider {
    
    @JSImport("@ethersproject/providers", "InfuraProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getApiKey(apiKey: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
    
    @scala.inline
    def getWebSocketProvider(): typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")().asInstanceOf[typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider]
    @scala.inline
    def getWebSocketProvider(network: Unit, apiKey: js.Any): typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider]
    @scala.inline
    def getWebSocketProvider(network: Networkish): typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider]
    @scala.inline
    def getWebSocketProvider(network: Networkish, apiKey: js.Any): typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider]
  }
  
  @JSImport("@ethersproject/providers", "InfuraWebSocketProvider")
  @js.native
  class InfuraWebSocketProvider ()
    extends typings.ethersprojectProviders.infuraProviderMod.InfuraWebSocketProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
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
    def this(url: String, network: Networkish) = this()
    def this(url: Unit, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  /* static members */
  object JsonRpcProvider {
    
    @JSImport("@ethersproject/providers", "JsonRpcProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUrl")().asInstanceOf[String]
    
    @scala.inline
    def hexlifyTransaction(transaction: TransactionRequest): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlifyTransaction")(transaction.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String]]
    @scala.inline
    def hexlifyTransaction(transaction: TransactionRequest, allowExtra: StringDictionary[Boolean]): StringDictionary[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlifyTransaction")(transaction.asInstanceOf[js.Any], allowExtra.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String]]
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
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
  }
  /* static members */
  object NodesmithProvider {
    
    @JSImport("@ethersproject/providers", "NodesmithProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getApiKey(apiKey: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getUrl(network: Network): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def getUrl(network: Network, apiKey: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@ethersproject/providers", "PocketProvider")
  @js.native
  class PocketProvider ()
    extends typings.ethersprojectProviders.pocketProviderMod.PocketProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
  }
  /* static members */
  object PocketProvider {
    
    @JSImport("@ethersproject/providers", "PocketProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getApiKey(apiKey: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getUrl(network: Network, apiKey: js.Any): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
  }
  
  @JSImport("@ethersproject/providers", "Provider")
  @js.native
  abstract class Provider ()
    extends typings.ethersprojectAbstractProvider.mod.Provider
  /* static members */
  object Provider {
    
    @JSImport("@ethersproject/providers", "Provider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isProvider(value: js.Any): /* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.Provider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProvider")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.Provider */ Boolean]
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
    def this(url: String, network: Networkish) = this()
    def this(url: Unit, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  @JSImport("@ethersproject/providers", "UrlJsonRpcProvider")
  @js.native
  abstract class UrlJsonRpcProvider ()
    extends typings.ethersprojectProviders.urlJsonRpcProviderMod.UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: js.Any) = this()
    def this(network: Networkish, apiKey: js.Any) = this()
  }
  /* static members */
  object UrlJsonRpcProvider {
    
    @JSImport("@ethersproject/providers", "UrlJsonRpcProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getApiKey(apiKey: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getUrl(network: Network, apiKey: js.Any): String | ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[String | ConnectionInfo]
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
    
    @JSImport("@ethersproject/providers", "WebSocketProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def defaultUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUrl")().asInstanceOf[String]
  }
  
  @scala.inline
  def getDefaultProvider(): typings.ethersprojectProviders.baseProviderMod.BaseProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")().asInstanceOf[typings.ethersprojectProviders.baseProviderMod.BaseProvider]
  @scala.inline
  def getDefaultProvider(network: String): typings.ethersprojectProviders.baseProviderMod.BaseProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectProviders.baseProviderMod.BaseProvider]
  @scala.inline
  def getDefaultProvider(network: String, options: js.Any): typings.ethersprojectProviders.baseProviderMod.BaseProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.baseProviderMod.BaseProvider]
  @scala.inline
  def getDefaultProvider(network: Unit, options: js.Any): typings.ethersprojectProviders.baseProviderMod.BaseProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.baseProviderMod.BaseProvider]
  @scala.inline
  def getDefaultProvider(network: Network): typings.ethersprojectProviders.baseProviderMod.BaseProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectProviders.baseProviderMod.BaseProvider]
  @scala.inline
  def getDefaultProvider(network: Network, options: js.Any): typings.ethersprojectProviders.baseProviderMod.BaseProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.baseProviderMod.BaseProvider]
  
  @scala.inline
  def getNetwork(network: Networkish): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetwork")(network.asInstanceOf[js.Any]).asInstanceOf[Network]
  
  @scala.inline
  def isCommunityResourcable(value: js.Any): /* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommunityResourcable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean]
  
  @scala.inline
  def isCommunityResource(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommunityResource")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def showThrottleMessage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showThrottleMessage")().asInstanceOf[Unit]
}
