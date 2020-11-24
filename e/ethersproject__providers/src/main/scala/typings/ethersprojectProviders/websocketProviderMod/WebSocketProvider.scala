package typings.ethersprojectProviders.websocketProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectNetworks.typesMod.Network
import typings.ethersprojectNetworks.typesMod.Networkish
import typings.ethersprojectProviders.jsonRpcProviderMod.JsonRpcProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/providers/lib/websocket-provider", "WebSocketProvider")
@js.native
class WebSocketProvider protected () extends JsonRpcProvider {
  def this(url: String) = this()
  def this(url: String, network: Networkish) = this()
  
  val _detectNetwork: js.Promise[Network] = js.native
  
  val _requests: StringDictionary[InflightRequest] = js.native
  
  val _subIds: StringDictionary[js.Promise[String]] = js.native
  
  val _subs: StringDictionary[Subscription] = js.native
  
  def _subscribe(tag: String, param: js.Array[_], processFunc: js.Function1[/* result */ js.Any, Unit]): js.Promise[Unit] = js.native
  
  val _websocket: js.Any = js.native
  
  var _wsReady: Boolean = js.native
  
  def destroy(): js.Promise[Unit] = js.native
  
  def send(method: String): js.Promise[_] = js.native
}
/* static members */
@JSImport("@ethersproject/providers/lib/websocket-provider", "WebSocketProvider")
@js.native
object WebSocketProvider extends js.Object {
  
  def defaultUrl(): String = js.native
}
