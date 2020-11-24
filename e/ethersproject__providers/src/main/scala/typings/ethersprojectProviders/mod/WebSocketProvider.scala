package typings.ethersprojectProviders.mod

import typings.ethersprojectNetworks.typesMod.Networkish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers", "WebSocketProvider")
@js.native
class WebSocketProvider protected ()
  extends typings.ethersprojectProviders.websocketProviderMod.WebSocketProvider {
  def this(url: String) = this()
  def this(url: String, network: Networkish) = this()
}
/* static members */
@JSImport("@ethersproject/providers", "WebSocketProvider")
@js.native
object WebSocketProvider extends js.Object {
  
  def defaultUrl(): String = js.native
}
