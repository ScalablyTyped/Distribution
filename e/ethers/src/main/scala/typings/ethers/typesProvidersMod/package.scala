package typings.ethers.typesProvidersMod

import typings.ethers.typesProvidersMod.^
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderMod.PreparedTransactionRequest
import typings.ethers.typesProvidersProviderMod.TransactionRequest
import typings.ethers.typesProvidersProviderWebsocketMod.WebSocketLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def copyRequest(req: TransactionRequest): PreparedTransactionRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("copyRequest")(req.asInstanceOf[js.Any]).asInstanceOf[PreparedTransactionRequest]

inline def getDefaultProvider(network: String): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]
inline def getDefaultProvider(network: String, options: Any): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]
inline def getDefaultProvider(network: Networkish): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]
inline def getDefaultProvider(network: Networkish, options: Any): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]
inline def getDefaultProvider(network: WebSocketLike): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]
inline def getDefaultProvider(network: WebSocketLike, options: Any): typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider]

inline def showThrottleMessage(service: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showThrottleMessage")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]
