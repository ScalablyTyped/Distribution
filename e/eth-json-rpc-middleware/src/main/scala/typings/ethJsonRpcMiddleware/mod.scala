package typings.ethJsonRpcMiddleware

import typings.ethJsonRpcMiddleware.blockCacheMod.BlockCacheMiddlewareOptions
import typings.ethJsonRpcMiddleware.blockRefMod.BlockRefMiddlewareOptions
import typings.ethJsonRpcMiddleware.blockRefRewriteMod.BlockRefRewriteMiddlewareOptions
import typings.ethJsonRpcMiddleware.blockTrackerInspectorMod.BlockTrackerInspectorMiddlewareOptions
import typings.ethJsonRpcMiddleware.fetchMod.FetchConfig
import typings.ethJsonRpcMiddleware.fetchMod.FetchMiddlewareFromReqOptions
import typings.ethJsonRpcMiddleware.fetchMod.FetchMiddlewareOptions
import typings.ethJsonRpcMiddleware.retryOnEmptyMod.RetryOnEmptyMiddlewareOptions
import typings.ethJsonRpcMiddleware.typesMod.SafeEventEmitterProvider
import typings.ethJsonRpcMiddleware.walletMod.WalletMiddlewareOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("eth-json-rpc-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createBlockCacheMiddleware(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockCacheMiddleware")().asInstanceOf[Any]
  inline def createBlockCacheMiddleware(hasBlockTracker: BlockCacheMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockCacheMiddleware")(hasBlockTracker.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createBlockRefMiddleware(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockRefMiddleware")().asInstanceOf[Any]
  inline def createBlockRefMiddleware(hasProviderBlockTracker: BlockRefMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockRefMiddleware")(hasProviderBlockTracker.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createBlockRefRewriteMiddleware(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockRefRewriteMiddleware")().asInstanceOf[Any]
  inline def createBlockRefRewriteMiddleware(hasBlockTracker: BlockRefRewriteMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockRefRewriteMiddleware")(hasBlockTracker.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createBlockTrackerInspectorMiddleware(hasBlockTracker: BlockTrackerInspectorMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createBlockTrackerInspectorMiddleware")(hasBlockTracker.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createFetchConfigFromReq(hasReqRpcUrlOriginHttpHeaderKey: FetchMiddlewareFromReqOptions): FetchConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("createFetchConfigFromReq")(hasReqRpcUrlOriginHttpHeaderKey.asInstanceOf[js.Any]).asInstanceOf[FetchConfig]
  
  inline def createFetchMiddleware(hasRpcUrlOriginHttpHeaderKey: FetchMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createFetchMiddleware")(hasRpcUrlOriginHttpHeaderKey.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createInflightCacheMiddleware(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createInflightCacheMiddleware")().asInstanceOf[Any]
  
  inline def createRetryOnEmptyMiddleware(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createRetryOnEmptyMiddleware")().asInstanceOf[Any]
  inline def createRetryOnEmptyMiddleware(hasProviderBlockTracker: RetryOnEmptyMiddlewareOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createRetryOnEmptyMiddleware")(hasProviderBlockTracker.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def createWalletMiddleware(
    hasGetAccountsProcessDecryptMessageProcessEncryptionPublicKeyProcessEthSignMessageProcessPersonalMessageProcessTransactionProcessSignTransactionProcessTypedMessageProcessTypedMessageV3ProcessTypedMessageV4: WalletMiddlewareOptions
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createWalletMiddleware")(hasGetAccountsProcessDecryptMessageProcessEncryptionPublicKeyProcessEthSignMessageProcessPersonalMessageProcessTransactionProcessSignTransactionProcessTypedMessageProcessTypedMessageV3ProcessTypedMessageV4.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def ethersProviderAsMiddleware(provider: SafeEventEmitterProvider): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ethersProviderAsMiddleware")(provider.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def providerAsMiddleware(provider: SafeEventEmitterProvider): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("providerAsMiddleware")(provider.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def providerFromEngine(
    engine: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcEngine */ Any
  ): SafeEventEmitterProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("providerFromEngine")(engine.asInstanceOf[js.Any]).asInstanceOf[SafeEventEmitterProvider]
  
  inline def providerFromMiddleware(
    middleware: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JsonRpcMiddleware<Array<string>, Block> */ Any
  ): SafeEventEmitterProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("providerFromMiddleware")(middleware.asInstanceOf[js.Any]).asInstanceOf[SafeEventEmitterProvider]
}
