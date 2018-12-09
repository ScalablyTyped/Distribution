package typings
package freedomLib.freedomNs.RTCDataChannelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Constructed by |freedom['rtcdatachannel'](id)| where |id| is a string
// representing the channel id created by an |rtcpeerconnection| object.
@js.native
trait RTCDataChannel extends js.Object {
  @JSName("sendBuffer")
  var sendBuffer_Original: freedomLib.freedomNs.Method1[stdLib.ArrayBuffer, scala.Unit] = js.native
  @JSName("send")
  var send_Original: freedomLib.freedomNs.Method1[java.lang.String, scala.Unit] = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def getBinaryType(): js.Promise[java.lang.String] = js.native
  def getBufferedAmount(): js.Promise[scala.Double] = js.native
  def getId(): js.Promise[scala.Double] = js.native
  def getLabel(): js.Promise[java.lang.String] = js.native
  def getMaxPacketLifeTime(): js.Promise[scala.Double] = js.native
  def getMaxRetransmits(): js.Promise[scala.Double] = js.native
  def getNegotiated(): js.Promise[scala.Boolean] = js.native
  def getOrdered(): js.Promise[scala.Boolean] = js.native
  def getProtocol(): js.Promise[java.lang.String] = js.native
  def getReadyState(): js.Promise[java.lang.String] = js.native
  def on(t: java.lang.String, f: js.Function): scala.Unit = js.native
  @JSName("on")
  def on_onclose(t: freedomLib.freedomLibStrings.onclose, f: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_onerror(t: freedomLib.freedomLibStrings.onerror, f: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_onmessage(t: freedomLib.freedomLibStrings.onmessage, f: js.Function1[/* m */ Message, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_onopen(t: freedomLib.freedomLibStrings.onopen, f: js.Function0[scala.Unit]): scala.Unit = js.native
  def send(a: java.lang.String): js.Promise[scala.Unit] = js.native
  def sendBuffer(a: stdLib.ArrayBuffer): js.Promise[scala.Unit] = js.native
  def setBinaryType(`type`: java.lang.String): js.Promise[scala.Unit] = js.native
}

