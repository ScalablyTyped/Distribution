package typings
package freedomLib.freedomNs.TcpSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The TcpSocket class (freedom['core.TcpSocket'])
@js.native
trait Socket extends js.Object {
  @JSName("pause")
  var pause_Original: freedomLib.freedomNs.Method0[scala.Unit] = js.native
  @JSName("resume")
  var resume_Original: freedomLib.freedomNs.Method0[scala.Unit] = js.native
  @JSName("write")
  var write_Original: freedomLib.freedomNs.Method1[stdLib.ArrayBuffer, WriteInfo] = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def connect(hostname: java.lang.String, port: scala.Double): js.Promise[scala.Unit] = js.native
  def getInfo(): js.Promise[SocketInfo] = js.native
  def listen(address: java.lang.String, port: scala.Double): js.Promise[scala.Unit] = js.native
  def off(eventType: java.lang.String, f: js.Function1[/* i */ js.Object, scala.Unit]): scala.Unit = js.native
  @JSName("off")
  def off_onData(`type`: freedomLib.freedomLibStrings.onData, f: js.Function1[/* i */ ReadInfo, scala.Unit]): scala.Unit = js.native
  def on(eventType: java.lang.String, f: js.Function1[/* i */ js.Object, scala.Unit]): scala.Unit = js.native
  // TcpSockets have 3 types of events:
  @JSName("on")
  def on_onConnection(
    `type`: freedomLib.freedomLibStrings.onConnection,
    f: js.Function1[/* i */ ConnectInfo, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_onData(`type`: freedomLib.freedomLibStrings.onData, f: js.Function1[/* i */ ReadInfo, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_onDisconnect(
    `type`: freedomLib.freedomLibStrings.onDisconnect,
    f: js.Function1[/* i */ DisconnectInfo, scala.Unit]
  ): scala.Unit = js.native
  def pause(): js.Promise[scala.Unit] = js.native
  def resume(): js.Promise[scala.Unit] = js.native
  def secure(): js.Promise[scala.Unit] = js.native
  def write(a: stdLib.ArrayBuffer): js.Promise[WriteInfo] = js.native
}

