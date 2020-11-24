package typings.freedom.freedom.UdpSocket

import typings.freedom.freedom.Method3
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Socket extends js.Object {
  
  def bind(address: String, port: Double): js.Promise[Unit] = js.native
  
  def destroy(): js.Promise[Unit] = js.native
  
  def getInfo(): js.Promise[SocketInfo] = js.native
  
  def on(name: String, listener: js.Function): Unit = js.native
  
  def sendTo(a: ArrayBuffer, b: String, c: Double): js.Promise[Double] = js.native
  @JSName("sendTo")
  var sendTo_Original: Method3[ArrayBuffer, String, Double, Double] = js.native
}
