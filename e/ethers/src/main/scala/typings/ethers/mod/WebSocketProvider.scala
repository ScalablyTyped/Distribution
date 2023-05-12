package typings.ethers.mod

import typings.ethers.typesProvidersNetworkMod.Networkish
import typings.ethers.typesProvidersProviderWebsocketMod.WebSocketCreator
import typings.ethers.typesProvidersProviderWebsocketMod.WebSocketLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "WebSocketProvider")
@js.native
open class WebSocketProvider protected ()
  extends typings.ethers.typesEthersMod.WebSocketProvider {
  def this(url: String) = this()
  def this(url: WebSocketCreator) = this()
  def this(url: WebSocketLike) = this()
  def this(url: String, network: Networkish) = this()
  def this(url: WebSocketCreator, network: Networkish) = this()
  def this(url: WebSocketLike, network: Networkish) = this()
}
