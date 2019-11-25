package typings.freedom.freedom.RTCDataChannel

import typings.freedom.freedom.Method1
import typings.freedom.freedomStrings.onclose
import typings.freedom.freedomStrings.onerror
import typings.freedom.freedomStrings.onmessage_
import typings.freedom.freedomStrings.onopen
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Constructed by |freedom['rtcdatachannel'](id)| where |id| is a string
// representing the channel id created by an |rtcpeerconnection| object.
@js.native
trait RTCDataChannel extends js.Object {
  @JSName("sendBuffer")
  var sendBuffer_Original: Method1[ArrayBuffer, Unit] = js.native
  @JSName("send")
  var send_Original: Method1[String, Unit] = js.native
  def close(): js.Promise[Unit] = js.native
  def getBinaryType(): js.Promise[String] = js.native
  def getBufferedAmount(): js.Promise[Double] = js.native
  def getId(): js.Promise[Double] = js.native
  def getLabel(): js.Promise[String] = js.native
  def getMaxPacketLifeTime(): js.Promise[Double] = js.native
  def getMaxRetransmits(): js.Promise[Double] = js.native
  def getNegotiated(): js.Promise[Boolean] = js.native
  def getOrdered(): js.Promise[Boolean] = js.native
  def getProtocol(): js.Promise[String] = js.native
  def getReadyState(): js.Promise[String] = js.native
  def on(t: String, f: js.Function): Unit = js.native
  @JSName("on")
  def on_onclose(t: onclose, f: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_onerror(t: onerror, f: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_onmessage(t: onmessage_, f: js.Function1[/* m */ Message, Unit]): Unit = js.native
  @JSName("on")
  def on_onopen(t: onopen, f: js.Function0[Unit]): Unit = js.native
  def send(a: String): js.Promise[Unit] = js.native
  def sendBuffer(a: ArrayBuffer): js.Promise[Unit] = js.native
  def setBinaryType(`type`: String): js.Promise[Unit] = js.native
}

