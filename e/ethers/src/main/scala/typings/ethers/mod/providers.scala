package typings.ethers.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectNetworks.libTypesMod.Network
import typings.ethersprojectNetworks.libTypesMod.Networkish
import typings.ethersprojectProviders.libFallbackProviderMod.FallbackProviderConfig
import typings.ethersprojectProviders.libFormatterMod.FormatFunc
import typings.ethersprojectProviders.libWeb3ProviderMod.ExternalProvider
import typings.ethersprojectProviders.libWeb3ProviderMod.JsonRpcFetchFunc
import typings.ethersprojectProviders.libWebsocketProviderMod.WebSocketLike
import typings.ethersprojectTransactions.mod.AccessList
import typings.ethersprojectWeb.mod.ConnectionInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providers {
  
  @JSImport("ethers", "providers")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers", "providers.AlchemyProvider")
  @js.native
  open class AlchemyProvider ()
    extends typings.ethersprojectProviders.mod.AlchemyProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
  }
  /* static members */
  object AlchemyProvider {
    
    @JSImport("ethers", "providers.AlchemyProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network, apiKey: String): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
    
    inline def getWebSocketProvider(): typings.ethersprojectProviders.libAlchemyProviderMod.AlchemyWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")().asInstanceOf[typings.ethersprojectProviders.libAlchemyProviderMod.AlchemyWebSocketProvider]
    inline def getWebSocketProvider(network: Unit, apiKey: Any): typings.ethersprojectProviders.libAlchemyProviderMod.AlchemyWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.libAlchemyProviderMod.AlchemyWebSocketProvider]
    inline def getWebSocketProvider(network: Networkish): typings.ethersprojectProviders.libAlchemyProviderMod.AlchemyWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectProviders.libAlchemyProviderMod.AlchemyWebSocketProvider]
    inline def getWebSocketProvider(network: Networkish, apiKey: Any): typings.ethersprojectProviders.libAlchemyProviderMod.AlchemyWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.libAlchemyProviderMod.AlchemyWebSocketProvider]
  }
  
  @JSImport("ethers", "providers.AlchemyWebSocketProvider")
  @js.native
  open class AlchemyWebSocketProvider ()
    extends typings.ethersprojectProviders.mod.AlchemyWebSocketProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
  }
  
  @JSImport("ethers", "providers.AnkrProvider")
  @js.native
  open class AnkrProvider ()
    extends typings.ethersprojectProviders.mod.AnkrProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
  }
  /* static members */
  object AnkrProvider {
    
    @JSImport("ethers", "providers.AnkrProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network, apiKey: Any): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
  }
  
  @JSImport("ethers", "providers.BaseProvider")
  @js.native
  open class BaseProvider protected ()
    extends typings.ethersprojectProviders.mod.BaseProvider {
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
    
    @JSImport("ethers", "providers.BaseProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getFormatter(): typings.ethersprojectProviders.libFormatterMod.Formatter = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatter")().asInstanceOf[typings.ethersprojectProviders.libFormatterMod.Formatter]
    
    inline def getNetwork(network: Networkish): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetwork")(network.asInstanceOf[js.Any]).asInstanceOf[Network]
  }
  
  @JSImport("ethers", "providers.CloudflareProvider")
  @js.native
  open class CloudflareProvider ()
    extends typings.ethersprojectProviders.mod.CloudflareProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
  }
  /* static members */
  object CloudflareProvider {
    
    @JSImport("ethers", "providers.CloudflareProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getUrl(network: Network, apiKey: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("ethers", "providers.EtherscanProvider")
  @js.native
  open class EtherscanProvider ()
    extends typings.ethersprojectProviders.mod.EtherscanProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: String) = this()
    def this(network: Networkish, apiKey: String) = this()
  }
  
  @JSImport("ethers", "providers.FallbackProvider")
  @js.native
  open class FallbackProvider protected ()
    extends typings.ethersprojectProviders.mod.FallbackProvider {
    def this(providers: js.Array[typings.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig]) = this()
    def this(
      providers: js.Array[typings.ethersprojectAbstractProvider.mod.Provider | FallbackProviderConfig],
      quorum: Double
    ) = this()
  }
  
  @JSImport("ethers", "providers.Formatter")
  @js.native
  open class Formatter ()
    extends typings.ethersprojectProviders.mod.Formatter
  /* static members */
  object Formatter {
    
    @JSImport("ethers", "providers.Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def allowFalsish(format: FormatFunc, replaceValue: Any): FormatFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("allowFalsish")(format.asInstanceOf[js.Any], replaceValue.asInstanceOf[js.Any])).asInstanceOf[FormatFunc]
    
    inline def allowNull(format: FormatFunc): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("allowNull")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    inline def allowNull(format: FormatFunc, nullValue: Any): FormatFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("allowNull")(format.asInstanceOf[js.Any], nullValue.asInstanceOf[js.Any])).asInstanceOf[FormatFunc]
    
    inline def arrayOf(format: FormatFunc): FormatFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayOf")(format.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    inline def check(format: StringDictionary[FormatFunc], `object`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(format.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  @JSImport("ethers", "providers.InfuraProvider")
  @js.native
  open class InfuraProvider ()
    extends typings.ethersprojectProviders.mod.InfuraProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
  }
  /* static members */
  object InfuraProvider {
    
    @JSImport("ethers", "providers.InfuraProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network, apiKey: Any): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
    
    inline def getWebSocketProvider(): typings.ethersprojectProviders.libInfuraProviderMod.InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")().asInstanceOf[typings.ethersprojectProviders.libInfuraProviderMod.InfuraWebSocketProvider]
    inline def getWebSocketProvider(network: Unit, apiKey: Any): typings.ethersprojectProviders.libInfuraProviderMod.InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.libInfuraProviderMod.InfuraWebSocketProvider]
    inline def getWebSocketProvider(network: Networkish): typings.ethersprojectProviders.libInfuraProviderMod.InfuraWebSocketProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectProviders.libInfuraProviderMod.InfuraWebSocketProvider]
    inline def getWebSocketProvider(network: Networkish, apiKey: Any): typings.ethersprojectProviders.libInfuraProviderMod.InfuraWebSocketProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getWebSocketProvider")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.libInfuraProviderMod.InfuraWebSocketProvider]
  }
  
  @JSImport("ethers", "providers.InfuraWebSocketProvider")
  @js.native
  open class InfuraWebSocketProvider ()
    extends typings.ethersprojectProviders.mod.InfuraWebSocketProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
  }
  
  @JSImport("ethers", "providers.IpcProvider")
  @js.native
  open class IpcProvider protected ()
    extends typings.ethersprojectProviders.mod.IpcProvider {
    def this(path: String) = this()
    def this(path: String, network: Networkish) = this()
  }
  
  @JSImport("ethers", "providers.JsonRpcBatchProvider")
  @js.native
  open class JsonRpcBatchProvider ()
    extends typings.ethersprojectProviders.mod.JsonRpcBatchProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: Unit, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  @JSImport("ethers", "providers.JsonRpcProvider")
  @js.native
  open class JsonRpcProvider ()
    extends typings.ethersprojectProviders.mod.JsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: Unit, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  /* static members */
  object JsonRpcProvider {
    
    @JSImport("ethers", "providers.JsonRpcProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUrl")().asInstanceOf[String]
    
    inline def hexlifyTransaction(transaction: TransactionRequest): StringDictionary[String | AccessList] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexlifyTransaction")(transaction.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[String | AccessList]]
    inline def hexlifyTransaction(transaction: TransactionRequest, allowExtra: StringDictionary[Boolean]): StringDictionary[String | AccessList] = (^.asInstanceOf[js.Dynamic].applyDynamic("hexlifyTransaction")(transaction.asInstanceOf[js.Any], allowExtra.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[String | AccessList]]
  }
  
  @JSImport("ethers", "providers.JsonRpcSigner")
  @js.native
  open class JsonRpcSigner protected ()
    extends typings.ethersprojectProviders.mod.JsonRpcSigner {
    def this(
      constructorGuard: Any,
      provider: typings.ethersprojectProviders.libJsonRpcProviderMod.JsonRpcProvider
    ) = this()
    def this(
      constructorGuard: Any,
      provider: typings.ethersprojectProviders.libJsonRpcProviderMod.JsonRpcProvider,
      addressOrIndex: String
    ) = this()
    def this(
      constructorGuard: Any,
      provider: typings.ethersprojectProviders.libJsonRpcProviderMod.JsonRpcProvider,
      addressOrIndex: Double
    ) = this()
  }
  
  @JSImport("ethers", "providers.NodesmithProvider")
  @js.native
  open class NodesmithProvider ()
    extends typings.ethersprojectProviders.mod.NodesmithProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
  }
  /* static members */
  object NodesmithProvider {
    
    @JSImport("ethers", "providers.NodesmithProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getUrl(network: Network, apiKey: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("ethers", "providers.PocketProvider")
  @js.native
  open class PocketProvider ()
    extends typings.ethersprojectProviders.mod.PocketProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
  }
  /* static members */
  object PocketProvider {
    
    @JSImport("ethers", "providers.PocketProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network, apiKey: Any): ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[ConnectionInfo]
  }
  
  /* note: abstract class */ @JSImport("ethers", "providers.Provider")
  @js.native
  open class Provider ()
    extends typings.ethersprojectProviders.mod.Provider
  /* static members */
  object Provider {
    
    @JSImport("ethers", "providers.Provider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isProvider(value: Any): /* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.Provider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProvider")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abstract-provider.@ethersproject/abstract-provider.Provider */ Boolean]
  }
  
  @JSImport("ethers", "providers.Resolver")
  @js.native
  open class Resolver protected ()
    extends typings.ethersprojectProviders.mod.Resolver {
    def this(
      provider: typings.ethersprojectProviders.libBaseProviderMod.BaseProvider,
      address: String,
      name: String
    ) = this()
    def this(
      provider: typings.ethersprojectProviders.libBaseProviderMod.BaseProvider,
      address: String,
      name: String,
      resolvedAddress: String
    ) = this()
  }
  
  @JSImport("ethers", "providers.StaticJsonRpcProvider")
  @js.native
  open class StaticJsonRpcProvider ()
    extends typings.ethersprojectProviders.mod.StaticJsonRpcProvider {
    def this(url: String) = this()
    def this(url: ConnectionInfo) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: Unit, network: Networkish) = this()
    def this(url: ConnectionInfo, network: Networkish) = this()
  }
  
  /* note: abstract class */ @JSImport("ethers", "providers.UrlJsonRpcProvider")
  @js.native
  open class UrlJsonRpcProvider ()
    extends typings.ethersprojectProviders.mod.UrlJsonRpcProvider {
    def this(network: Networkish) = this()
    def this(network: Unit, apiKey: Any) = this()
    def this(network: Networkish, apiKey: Any) = this()
  }
  /* static members */
  object UrlJsonRpcProvider {
    
    @JSImport("ethers", "providers.UrlJsonRpcProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getApiKey(apiKey: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getUrl(network: Network, apiKey: Any): String | ConnectionInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("getUrl")(network.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[String | ConnectionInfo]
  }
  
  @JSImport("ethers", "providers.Web3Provider")
  @js.native
  open class Web3Provider protected ()
    extends typings.ethersprojectProviders.mod.Web3Provider {
    def this(provider: ExternalProvider) = this()
    def this(provider: JsonRpcFetchFunc) = this()
    def this(provider: ExternalProvider, network: Networkish) = this()
    def this(provider: JsonRpcFetchFunc, network: Networkish) = this()
  }
  
  @JSImport("ethers", "providers.WebSocketProvider")
  @js.native
  open class WebSocketProvider protected ()
    extends typings.ethersprojectProviders.mod.WebSocketProvider {
    def this(url: String) = this()
    def this(url: WebSocketLike) = this()
    def this(url: String, network: Networkish) = this()
    def this(url: WebSocketLike, network: Networkish) = this()
  }
  /* static members */
  object WebSocketProvider {
    
    @JSImport("ethers", "providers.WebSocketProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultUrl")().asInstanceOf[String]
  }
  
  inline def getDefaultProvider(): typings.ethersprojectProviders.libBaseProviderMod.BaseProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")().asInstanceOf[typings.ethersprojectProviders.libBaseProviderMod.BaseProvider]
  inline def getDefaultProvider(network: Unit, options: Any): typings.ethersprojectProviders.libBaseProviderMod.BaseProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.libBaseProviderMod.BaseProvider]
  inline def getDefaultProvider(network: Networkish): typings.ethersprojectProviders.libBaseProviderMod.BaseProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectProviders.libBaseProviderMod.BaseProvider]
  inline def getDefaultProvider(network: Networkish, options: Any): typings.ethersprojectProviders.libBaseProviderMod.BaseProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectProviders.libBaseProviderMod.BaseProvider]
  
  inline def getNetwork(network: Networkish): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("getNetwork")(network.asInstanceOf[js.Any]).asInstanceOf[Network]
  
  inline def isCommunityResourcable(value: Any): /* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommunityResourcable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/providers.@ethersproject/providers/lib/formatter.CommunityResourcable */ Boolean]
  
  inline def isCommunityResource(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommunityResource")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def showThrottleMessage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showThrottleMessage")().asInstanceOf[Unit]
}
