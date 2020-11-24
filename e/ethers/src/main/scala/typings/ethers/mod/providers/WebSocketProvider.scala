package typings.ethers.mod.providers

import typings.ethersprojectNetworks.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "providers.WebSocketProvider")
@js.native
class WebSocketProvider protected ()
  extends typings.ethersprojectProviders.mod.WebSocketProvider {
  def this(url: String) = this()
  def this(url: String, network: Networkish) = this()
}
/* static members */
@JSImport("ethers", "providers.WebSocketProvider")
@js.native
object WebSocketProvider extends js.Object {
  
  def defaultUrl(): String = js.native
}
