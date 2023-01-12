package typings.freedom.freedom

import typings.freedom.anon.Stream
import typings.freedom.freedomStrings.onaddstream
import typings.freedom.freedomStrings.ondatachannel
import typings.freedom.freedomStrings.onicecandidate
import typings.freedom.freedomStrings.oniceconnectionstatechange
import typings.freedom.freedomStrings.onnegotiationneeded
import typings.freedom.freedomStrings.onremovestream
import typings.freedom.freedomStrings.onsignalingstatechange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RTCPeerConnection {
  
  trait OnIceCandidateEvent extends StObject {
    
    var candidate: RTCIceCandidate
  }
  object OnIceCandidateEvent {
    
    inline def apply(candidate: RTCIceCandidate): OnIceCandidateEvent = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnIceCandidateEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnIceCandidateEvent] (val x: Self) extends AnyVal {
      
      inline def setCandidate(value: RTCIceCandidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    }
  }
  
  trait RTCConfiguration extends StObject {
    
    var iceServers: js.Array[RTCIceServer]
    
    var iceTransports: js.UndefOr[String] = js.undefined
    
    var peerIdentity: js.UndefOr[String] = js.undefined
  }
  object RTCConfiguration {
    
    inline def apply(iceServers: js.Array[RTCIceServer]): RTCConfiguration = {
      val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTCConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RTCConfiguration] (val x: Self) extends AnyVal {
      
      inline def setIceServers(value: js.Array[RTCIceServer]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
      
      inline def setIceServersVarargs(value: RTCIceServer*): Self = StObject.set(x, "iceServers", js.Array(value*))
      
      inline def setIceTransports(value: String): Self = StObject.set(x, "iceTransports", value.asInstanceOf[js.Any])
      
      inline def setIceTransportsUndefined: Self = StObject.set(x, "iceTransports", js.undefined)
      
      inline def setPeerIdentity(value: String): Self = StObject.set(x, "peerIdentity", value.asInstanceOf[js.Any])
      
      inline def setPeerIdentityUndefined: Self = StObject.set(x, "peerIdentity", js.undefined)
    }
  }
  
  trait RTCDataChannelInit extends StObject {
    
    var id: js.UndefOr[Double] = js.undefined
    
    var maxPacketLifeTime: js.UndefOr[Double] = js.undefined
    
    var maxRetransmits: js.UndefOr[Double] = js.undefined
    
    var negotiated: js.UndefOr[Boolean] = js.undefined
    
    var ordered: js.UndefOr[Boolean] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
  }
  object RTCDataChannelInit {
    
    inline def apply(): RTCDataChannelInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RTCDataChannelInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RTCDataChannelInit] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMaxPacketLifeTime(value: Double): Self = StObject.set(x, "maxPacketLifeTime", value.asInstanceOf[js.Any])
      
      inline def setMaxPacketLifeTimeUndefined: Self = StObject.set(x, "maxPacketLifeTime", js.undefined)
      
      inline def setMaxRetransmits(value: Double): Self = StObject.set(x, "maxRetransmits", value.asInstanceOf[js.Any])
      
      inline def setMaxRetransmitsUndefined: Self = StObject.set(x, "maxRetransmits", js.undefined)
      
      inline def setNegotiated(value: Boolean): Self = StObject.set(x, "negotiated", value.asInstanceOf[js.Any])
      
      inline def setNegotiatedUndefined: Self = StObject.set(x, "negotiated", js.undefined)
      
      inline def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      inline def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  trait RTCIceCandidate extends StObject {
    
    var candidate: String
    
    var sdpMLineIndex: js.UndefOr[Double] = js.undefined
    
    var sdpMid: js.UndefOr[String] = js.undefined
  }
  object RTCIceCandidate {
    
    inline def apply(candidate: String): RTCIceCandidate = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTCIceCandidate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RTCIceCandidate] (val x: Self) extends AnyVal {
      
      inline def setCandidate(value: String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
      
      inline def setSdpMLineIndex(value: Double): Self = StObject.set(x, "sdpMLineIndex", value.asInstanceOf[js.Any])
      
      inline def setSdpMLineIndexUndefined: Self = StObject.set(x, "sdpMLineIndex", js.undefined)
      
      inline def setSdpMid(value: String): Self = StObject.set(x, "sdpMid", value.asInstanceOf[js.Any])
      
      inline def setSdpMidUndefined: Self = StObject.set(x, "sdpMid", js.undefined)
    }
  }
  
  trait RTCIceServer extends StObject {
    
    var credential: js.UndefOr[String] = js.undefined
    
    var urls: js.Array[String]
    
    var username: js.UndefOr[String] = js.undefined
  }
  object RTCIceServer {
    
    inline def apply(urls: js.Array[String]): RTCIceServer = {
      val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTCIceServer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RTCIceServer] (val x: Self) extends AnyVal {
      
      inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      inline def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait RTCOfferOptions extends StObject {
    
    var iceRestart: js.UndefOr[Boolean] = js.undefined
    
    var offerToReceiveAudio: js.UndefOr[Double] = js.undefined
    
    var offerToReceiveVideo: js.UndefOr[Double] = js.undefined
    
    var voiceActivityDetection: js.UndefOr[Boolean] = js.undefined
  }
  object RTCOfferOptions {
    
    inline def apply(): RTCOfferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RTCOfferOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RTCOfferOptions] (val x: Self) extends AnyVal {
      
      inline def setIceRestart(value: Boolean): Self = StObject.set(x, "iceRestart", value.asInstanceOf[js.Any])
      
      inline def setIceRestartUndefined: Self = StObject.set(x, "iceRestart", js.undefined)
      
      inline def setOfferToReceiveAudio(value: Double): Self = StObject.set(x, "offerToReceiveAudio", value.asInstanceOf[js.Any])
      
      inline def setOfferToReceiveAudioUndefined: Self = StObject.set(x, "offerToReceiveAudio", js.undefined)
      
      inline def setOfferToReceiveVideo(value: Double): Self = StObject.set(x, "offerToReceiveVideo", value.asInstanceOf[js.Any])
      
      inline def setOfferToReceiveVideoUndefined: Self = StObject.set(x, "offerToReceiveVideo", js.undefined)
      
      inline def setVoiceActivityDetection(value: Boolean): Self = StObject.set(x, "voiceActivityDetection", value.asInstanceOf[js.Any])
      
      inline def setVoiceActivityDetectionUndefined: Self = StObject.set(x, "voiceActivityDetection", js.undefined)
    }
  }
  
  // Note: the freedom factory constructor
  // |freedom['rtcpeerconnection'](config)| to create an RTCPeerConnection has
  // |RTCConfiguration| as the type of its config its argument.
  @js.native
  trait RTCPeerConnection extends StObject {
    
    def addIceCandidate(candidate: RTCIceCandidate): js.Promise[Unit] = js.native
    
    def addStream(ref: String): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def createAnswer(): js.Promise[RTCSessionDescription] = js.native
    
    def createDataChannel(label: String, init: RTCDataChannelInit): js.Promise[String] = js.native
    
    def createOffer(): js.Promise[RTCSessionDescription] = js.native
    def createOffer(options: RTCOfferOptions): js.Promise[RTCSessionDescription] = js.native
    
    def getConfiguration(): js.Promise[RTCConfiguration] = js.native
    
    def getIceConnectionState(): js.Promise[String] = js.native
    
    def getIceGatheringState(): js.Promise[String] = js.native
    
    def getLocalDescription(): js.Promise[RTCSessionDescription] = js.native
    
    def getLocalStreams(): js.Promise[js.Array[String]] = js.native
    
    def getRemoteDescription(): js.Promise[RTCSessionDescription] = js.native
    
    def getRemoteStreams(): js.Promise[js.Array[String]] = js.native
    
    def getSignalingState(): js.Promise[String] = js.native
    
    def getStats(): js.Promise[Any] = js.native
    def getStats(selector: String): js.Promise[Any] = js.native
    
    def getStreamById(id: String): js.Promise[String] = js.native
    
    def on(t: String, f: js.Function): Unit = js.native
    @JSName("on")
    def on_onaddstream(t: onaddstream, f: js.Function1[/* d */ Stream, Unit]): Unit = js.native
    @JSName("on")
    def on_ondatachannel(t: ondatachannel, f: js.Function1[/* d */ typings.freedom.anon.Channel, Unit]): Unit = js.native
    @JSName("on")
    def on_onicecandidate(t: onicecandidate, f: js.Function1[/* d */ OnIceCandidateEvent, Unit]): Unit = js.native
    @JSName("on")
    def on_oniceconnectionstatechange(t: oniceconnectionstatechange, f: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_onnegotiationneeded(t: onnegotiationneeded, f: js.Function0[Unit]): Unit = js.native
    @JSName("on")
    def on_onremovestream(t: onremovestream, f: js.Function1[/* d */ Stream, Unit]): Unit = js.native
    @JSName("on")
    def on_onsignalingstatechange(t: onsignalingstatechange, f: js.Function0[Unit]): Unit = js.native
    
    def removeStream(ref: String): js.Promise[Unit] = js.native
    
    def setLocalDescription(desc: RTCSessionDescription): js.Promise[Unit] = js.native
    
    def setRemoteDescription(desc: RTCSessionDescription): js.Promise[Unit] = js.native
    
    def updateIce(configuration: RTCConfiguration): js.Promise[Unit] = js.native
  }
  
  trait RTCSessionDescription extends StObject {
    
    var sdp: String
    
    var `type`: String
  }
  object RTCSessionDescription {
    
    inline def apply(sdp: String, `type`: String): RTCSessionDescription = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTCSessionDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RTCSessionDescription] (val x: Self) extends AnyVal {
      
      inline def setSdp(value: String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
