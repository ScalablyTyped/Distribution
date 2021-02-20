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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RTCPeerConnection {
  
  @js.native
  trait OnIceCandidateEvent extends StObject {
    
    var candidate: RTCIceCandidate = js.native
  }
  object OnIceCandidateEvent {
    
    @scala.inline
    def apply(candidate: RTCIceCandidate): OnIceCandidateEvent = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnIceCandidateEvent]
    }
    
    @scala.inline
    implicit class OnIceCandidateEventMutableBuilder[Self <: OnIceCandidateEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidate(value: RTCIceCandidate): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RTCConfiguration extends StObject {
    
    var iceServers: js.Array[RTCIceServer] = js.native
    
    var iceTransports: js.UndefOr[String] = js.native
    
    var peerIdentity: js.UndefOr[String] = js.native
  }
  object RTCConfiguration {
    
    @scala.inline
    def apply(iceServers: js.Array[RTCIceServer]): RTCConfiguration = {
      val __obj = js.Dynamic.literal(iceServers = iceServers.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTCConfiguration]
    }
    
    @scala.inline
    implicit class RTCConfigurationMutableBuilder[Self <: RTCConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIceServers(value: js.Array[RTCIceServer]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIceServersVarargs(value: RTCIceServer*): Self = StObject.set(x, "iceServers", js.Array(value :_*))
      
      @scala.inline
      def setIceTransports(value: String): Self = StObject.set(x, "iceTransports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIceTransportsUndefined: Self = StObject.set(x, "iceTransports", js.undefined)
      
      @scala.inline
      def setPeerIdentity(value: String): Self = StObject.set(x, "peerIdentity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerIdentityUndefined: Self = StObject.set(x, "peerIdentity", js.undefined)
    }
  }
  
  @js.native
  trait RTCDataChannelInit extends StObject {
    
    var id: js.UndefOr[Double] = js.native
    
    var maxPacketLifeTime: js.UndefOr[Double] = js.native
    
    var maxRetransmits: js.UndefOr[Double] = js.native
    
    var negotiated: js.UndefOr[Boolean] = js.native
    
    var ordered: js.UndefOr[Boolean] = js.native
    
    var protocol: js.UndefOr[String] = js.native
  }
  object RTCDataChannelInit {
    
    @scala.inline
    def apply(): RTCDataChannelInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RTCDataChannelInit]
    }
    
    @scala.inline
    implicit class RTCDataChannelInitMutableBuilder[Self <: RTCDataChannelInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMaxPacketLifeTime(value: Double): Self = StObject.set(x, "maxPacketLifeTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxPacketLifeTimeUndefined: Self = StObject.set(x, "maxPacketLifeTime", js.undefined)
      
      @scala.inline
      def setMaxRetransmits(value: Double): Self = StObject.set(x, "maxRetransmits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetransmitsUndefined: Self = StObject.set(x, "maxRetransmits", js.undefined)
      
      @scala.inline
      def setNegotiated(value: Boolean): Self = StObject.set(x, "negotiated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegotiatedUndefined: Self = StObject.set(x, "negotiated", js.undefined)
      
      @scala.inline
      def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  @js.native
  trait RTCIceCandidate extends StObject {
    
    var candidate: String = js.native
    
    var sdpMLineIndex: js.UndefOr[Double] = js.native
    
    var sdpMid: js.UndefOr[String] = js.native
  }
  object RTCIceCandidate {
    
    @scala.inline
    def apply(candidate: String): RTCIceCandidate = {
      val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTCIceCandidate]
    }
    
    @scala.inline
    implicit class RTCIceCandidateMutableBuilder[Self <: RTCIceCandidate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCandidate(value: String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdpMLineIndex(value: Double): Self = StObject.set(x, "sdpMLineIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdpMLineIndexUndefined: Self = StObject.set(x, "sdpMLineIndex", js.undefined)
      
      @scala.inline
      def setSdpMid(value: String): Self = StObject.set(x, "sdpMid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdpMidUndefined: Self = StObject.set(x, "sdpMid", js.undefined)
    }
  }
  
  @js.native
  trait RTCIceServer extends StObject {
    
    var credential: js.UndefOr[String] = js.native
    
    var urls: js.Array[String] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object RTCIceServer {
    
    @scala.inline
    def apply(urls: js.Array[String]): RTCIceServer = {
      val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTCIceServer]
    }
    
    @scala.inline
    implicit class RTCIceServerMutableBuilder[Self <: RTCIceServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialUndefined: Self = StObject.set(x, "credential", js.undefined)
      
      @scala.inline
      def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait RTCOfferOptions extends StObject {
    
    var iceRestart: js.UndefOr[Boolean] = js.native
    
    var offerToReceiveAudio: js.UndefOr[Double] = js.native
    
    var offerToReceiveVideo: js.UndefOr[Double] = js.native
    
    var voiceActivityDetection: js.UndefOr[Boolean] = js.native
  }
  object RTCOfferOptions {
    
    @scala.inline
    def apply(): RTCOfferOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RTCOfferOptions]
    }
    
    @scala.inline
    implicit class RTCOfferOptionsMutableBuilder[Self <: RTCOfferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIceRestart(value: Boolean): Self = StObject.set(x, "iceRestart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIceRestartUndefined: Self = StObject.set(x, "iceRestart", js.undefined)
      
      @scala.inline
      def setOfferToReceiveAudio(value: Double): Self = StObject.set(x, "offerToReceiveAudio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfferToReceiveAudioUndefined: Self = StObject.set(x, "offerToReceiveAudio", js.undefined)
      
      @scala.inline
      def setOfferToReceiveVideo(value: Double): Self = StObject.set(x, "offerToReceiveVideo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfferToReceiveVideoUndefined: Self = StObject.set(x, "offerToReceiveVideo", js.undefined)
      
      @scala.inline
      def setVoiceActivityDetection(value: Boolean): Self = StObject.set(x, "voiceActivityDetection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoiceActivityDetectionUndefined: Self = StObject.set(x, "voiceActivityDetection", js.undefined)
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
    
    def getStats(): js.Promise[_] = js.native
    def getStats(selector: String): js.Promise[_] = js.native
    
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
  
  @js.native
  trait RTCSessionDescription extends StObject {
    
    var sdp: String = js.native
    
    var `type`: String = js.native
  }
  object RTCSessionDescription {
    
    @scala.inline
    def apply(sdp: String, `type`: String): RTCSessionDescription = {
      val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTCSessionDescription]
    }
    
    @scala.inline
    implicit class RTCSessionDescriptionMutableBuilder[Self <: RTCSessionDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSdp(value: String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
