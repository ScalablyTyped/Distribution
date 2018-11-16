package typings
package freedomLib.freedomNs.RTCPeerConnectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Note: the freedom factory constructor
// |freedom['rtcpeerconnection'](config)| to create an RTCPeerConnection has
// |RTCConfiguration| as the type of its config its argument.
@js.native
trait RTCPeerConnection extends js.Object {
  def addIceCandidate(candidate: RTCIceCandidate): stdLib.Promise[scala.Unit] = js.native
  def addStream(ref: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def close(): stdLib.Promise[scala.Unit] = js.native
  def createAnswer(): stdLib.Promise[RTCSessionDescription] = js.native
  def createDataChannel(label: java.lang.String, init: RTCDataChannelInit): stdLib.Promise[java.lang.String] = js.native
  def createOffer(): stdLib.Promise[RTCSessionDescription] = js.native
  def createOffer(options: RTCOfferOptions): stdLib.Promise[RTCSessionDescription] = js.native
  def getConfiguration(): stdLib.Promise[RTCConfiguration] = js.native
  def getIceConnectionState(): stdLib.Promise[java.lang.String] = js.native
  def getIceGatheringState(): stdLib.Promise[java.lang.String] = js.native
  def getLocalDescription(): stdLib.Promise[RTCSessionDescription] = js.native
  def getLocalStreams(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getRemoteDescription(): stdLib.Promise[RTCSessionDescription] = js.native
  def getRemoteStreams(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getSignalingState(): stdLib.Promise[java.lang.String] = js.native
  def getStats(): stdLib.Promise[_] = js.native
  def getStats(selector: java.lang.String): stdLib.Promise[_] = js.native
  def getStreamById(id: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def on(t: java.lang.String, f: js.Function): scala.Unit = js.native
  @JSName("on")
  def on_onaddstream(
    t: freedomLib.freedomLibStrings.onaddstream,
    f: js.Function1[/* d */ freedomLib.Anon_Stream, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_ondatachannel(
    t: freedomLib.freedomLibStrings.ondatachannel,
    f: js.Function1[/* d */ freedomLib.Anon_Channel, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_onicecandidate(
    t: freedomLib.freedomLibStrings.onicecandidate,
    f: js.Function1[/* d */ OnIceCandidateEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_oniceconnectionstatechange(t: freedomLib.freedomLibStrings.oniceconnectionstatechange, f: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_onnegotiationneeded(t: freedomLib.freedomLibStrings.onnegotiationneeded, f: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_onremovestream(
    t: freedomLib.freedomLibStrings.onremovestream,
    f: js.Function1[/* d */ freedomLib.Anon_Stream, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_onsignalingstatechange(t: freedomLib.freedomLibStrings.onsignalingstatechange, f: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeStream(ref: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def setLocalDescription(desc: RTCSessionDescription): stdLib.Promise[scala.Unit] = js.native
  def setRemoteDescription(desc: RTCSessionDescription): stdLib.Promise[scala.Unit] = js.native
  def updateIce(configuration: RTCConfiguration): stdLib.Promise[scala.Unit] = js.native
}

