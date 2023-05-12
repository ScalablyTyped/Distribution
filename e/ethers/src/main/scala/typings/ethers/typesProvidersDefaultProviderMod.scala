package typings.ethers

import typings.ethers.typesProvidersAbstractProviderMod.AbstractProvider
import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderWebsocketMod.WebSocketLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProvidersDefaultProviderMod {
  
  @JSImport("ethers/types/providers/default-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultProvider(network: String): AbstractProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[AbstractProvider]
  inline def getDefaultProvider(network: String, options: Any): AbstractProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AbstractProvider]
  inline def getDefaultProvider(network: Networkish): AbstractProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[AbstractProvider]
  inline def getDefaultProvider(network: Networkish, options: Any): AbstractProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AbstractProvider]
  inline def getDefaultProvider(network: WebSocketLike): AbstractProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any]).asInstanceOf[AbstractProvider]
  inline def getDefaultProvider(network: WebSocketLike, options: Any): AbstractProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultProvider")(network.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AbstractProvider]
}
