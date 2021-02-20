package typings.discordRpc

import typings.discordRpc.anon.AutoThreshold
import typings.discordRpc.anon.Avatar
import typings.discordRpc.anon.Capacity
import typings.discordRpc.anon.Code
import typings.discordRpc.anon.Description
import typings.discordRpc.anon.Device
import typings.discordRpc.anon.Force
import typings.discordRpc.anon.Id
import typings.discordRpc.anon.Left
import typings.discordRpc.anon.Name
import typings.discordRpc.anon.Timeout
import typings.discordRpc.discordRpcStrings.audioinput
import typings.discordRpc.discordRpcStrings.audiooutput
import typings.discordRpc.discordRpcStrings.connected
import typings.discordRpc.discordRpcStrings.ipc
import typings.discordRpc.discordRpcStrings.ready
import typings.discordRpc.discordRpcStrings.videoinput
import typings.discordRpc.discordRpcStrings.websocket
import typings.node.eventsMod.EventEmitter
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("discord-rpc", "Client")
  @js.native
  class Client protected () extends EventEmitter {
    def this(options: RPCClientOptions) = this()
    
    var application: Description = js.native
    
    def captureShortcut(callback: js.Function2[/* shortcut */ js.Array[Code], /* stop */ js.Function0[Unit], Unit]): js.Promise[js.Function0[Unit]] = js.native
    
    def clearActivity(): js.Promise[_] = js.native
    def clearActivity(pid: Double): js.Promise[_] = js.native
    
    def closeJoinRequest(user: String): js.Promise[_] = js.native
    def closeJoinRequest(user: Id): js.Promise[_] = js.native
    
    def connect(clientId: String): js.Promise[Client] = js.native
    
    def connectToLobby(id: String, secret: String): js.Promise[_] = js.native
    
    def createLobby(`type`: String, capacity: Double, metadata: js.Any): js.Promise[_] = js.native
    
    def deleteLobby(lobby: String): js.Promise[_] = js.native
    def deleteLobby(lobby: Id): js.Promise[_] = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def disconnectFromLobby(lobby: String): js.Promise[_] = js.native
    def disconnectFromLobby(lobby: Id): js.Promise[_] = js.native
    
    def getChannel(id: String): js.Promise[Channel] = js.native
    def getChannel(id: String, timeout: Double): js.Promise[Channel] = js.native
    
    def getChannels(): js.Promise[js.Array[Channel]] = js.native
    def getChannels(id: js.UndefOr[scala.Nothing], timeout: Double): js.Promise[js.Array[Channel]] = js.native
    def getChannels(id: String): js.Promise[js.Array[Channel]] = js.native
    def getChannels(id: String, timeout: Double): js.Promise[js.Array[Channel]] = js.native
    
    def getGuild(id: String): js.Promise[Guild] = js.native
    def getGuild(id: String, timeout: Double): js.Promise[Guild] = js.native
    
    def getGuilds(): js.Promise[js.Array[Guild]] = js.native
    def getGuilds(timeout: Double): js.Promise[js.Array[Guild]] = js.native
    
    def getVoiceSettings(): js.Promise[VoiceSettings] = js.native
    
    def login(): js.Promise[this.type] = js.native
    def login(options: RPCLoginOptions): js.Promise[this.type] = js.native
    
    @JSName("off")
    def off_connected(event: connected, listener: js.Function0[Unit]): this.type = js.native
    @JSName("off")
    def off_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("on")
    def on_connected(event: connected, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_connected(event: connected, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
    
    def selectTextChannel(id: String): js.Promise[Channel] = js.native
    def selectTextChannel(id: String, options: Timeout): js.Promise[Channel] = js.native
    
    def selectVoiceChannel(id: String): js.Promise[Channel] = js.native
    def selectVoiceChannel(id: String, options: Force): js.Promise[Channel] = js.native
    
    def sendJoinInvite(user: String): js.Promise[_] = js.native
    def sendJoinInvite(user: Id): js.Promise[_] = js.native
    
    def sendJoinRequest(user: String): js.Promise[_] = js.native
    def sendJoinRequest(user: Id): js.Promise[_] = js.native
    
    def sendToLobby(lobby: String, data: js.Any): js.Promise[_] = js.native
    def sendToLobby(lobby: Id, data: js.Any): js.Promise[_] = js.native
    
    def setActivity(): js.Promise[_] = js.native
    def setActivity(args: js.UndefOr[scala.Nothing], pid: Double): js.Promise[_] = js.native
    def setActivity(args: Presence): js.Promise[_] = js.native
    def setActivity(args: Presence, pid: Double): js.Promise[_] = js.native
    
    def setCertifiedDevices(devices: js.Array[CertifiedDevice]): js.Promise[Null] = js.native
    
    def setUserVoiceSettings(id: String, settings: UserVoiceSettings): js.Promise[_] = js.native
    
    def setVoiceSettings(args: VoiceSettings): js.Promise[_] = js.native
    
    def subscribe(event: String, args: js.Any, callback: js.Function1[/* data */ js.Any, Unit]): js.Promise[Subscription] = js.native
    def subscribe(event: String, callback: js.Function1[/* data */ js.Any, Unit]): js.Promise[Subscription] = js.native
    
    def updateLobby(lobby: String): js.Promise[_] = js.native
    def updateLobby(lobby: String, options: Capacity): js.Promise[_] = js.native
    def updateLobby(lobby: Id): js.Promise[_] = js.native
    def updateLobby(lobby: Id, options: Capacity): js.Promise[_] = js.native
    
    def updateLobbyMember(lobby: String, user: String, metadata: js.Any): js.Promise[_] = js.native
    def updateLobbyMember(lobby: String, user: Id, metadata: js.Any): js.Promise[_] = js.native
    def updateLobbyMember(lobby: Id, user: String, metadata: js.Any): js.Promise[_] = js.native
    def updateLobbyMember(lobby: Id, user: Id, metadata: js.Any): js.Promise[_] = js.native
    
    var user: Avatar = js.native
  }
  
  @JSImport("discord-rpc", "register")
  @js.native
  def register(id: String): Boolean = js.native
  
  @js.native
  trait CertifiedDevice extends StObject {
    
    var automaticGainControl: js.UndefOr[Boolean] = js.native
    
    var echoCancellation: js.UndefOr[Boolean] = js.native
    
    var hardwareMute: js.UndefOr[Boolean] = js.native
    
    var model: Name = js.native
    
    var noiseSuppression: js.UndefOr[Boolean] = js.native
    
    var related: js.Array[String] = js.native
    
    var `type`: audioinput | audiooutput | videoinput = js.native
    
    var uuid: String = js.native
    
    var vendor: Name = js.native
  }
  object CertifiedDevice {
    
    @scala.inline
    def apply(
      model: Name,
      related: js.Array[String],
      `type`: audioinput | audiooutput | videoinput,
      uuid: String,
      vendor: Name
    ): CertifiedDevice = {
      val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertifiedDevice]
    }
    
    @scala.inline
    implicit class CertifiedDeviceMutableBuilder[Self <: CertifiedDevice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticGainControl(value: Boolean): Self = StObject.set(x, "automaticGainControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutomaticGainControlUndefined: Self = StObject.set(x, "automaticGainControl", js.undefined)
      
      @scala.inline
      def setEchoCancellation(value: Boolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
      
      @scala.inline
      def setHardwareMute(value: Boolean): Self = StObject.set(x, "hardwareMute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardwareMuteUndefined: Self = StObject.set(x, "hardwareMute", js.undefined)
      
      @scala.inline
      def setModel(value: Name): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoiseSuppression(value: Boolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoiseSuppressionUndefined: Self = StObject.set(x, "noiseSuppression", js.undefined)
      
      @scala.inline
      def setRelated(value: js.Array[String]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedVarargs(value: String*): Self = StObject.set(x, "related", js.Array(value :_*))
      
      @scala.inline
      def setType(value: audioinput | audiooutput | videoinput): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendor(value: Name): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Channel extends StObject {
    
    /**
      * (voice)
      */
    var bitrate: js.UndefOr[Double] = js.native
    
    var guild_id: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    /**
      * (text) https://discordapp.com/developers/docs/resources/channel#message-object
      */
    var messages: js.UndefOr[js.Array[_]] = js.native
    
    var name: String = js.native
    
    /**
      * (text)
      */
    var position: js.UndefOr[Double] = js.native
    
    /**
      * (text)
      */
    var topic: js.UndefOr[String] = js.native
    
    /**
      * Guild text: 0, Guild voice: 2, DM: 1, Group DM: 3
      */
    var `type`: Double = js.native
    
    /**
      * (voice) 0 if none
      */
    var user_limit: js.UndefOr[Double] = js.native
    
    /**
      * (voice) https://discordapp.com/developers/docs/resources/voice#voice-state-object
      */
    var voice_states: js.UndefOr[js.Array[_]] = js.native
  }
  object Channel {
    
    @scala.inline
    def apply(id: String, name: String, `type`: Double): Channel = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    @scala.inline
    implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
      
      @scala.inline
      def setGuild_id(value: String): Self = StObject.set(x, "guild_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuild_idUndefined: Self = StObject.set(x, "guild_id", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessages(value: js.Array[_]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMessagesVarargs(value: js.Any*): Self = StObject.set(x, "messages", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_limit(value: Double): Self = StObject.set(x, "user_limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_limitUndefined: Self = StObject.set(x, "user_limit", js.undefined)
      
      @scala.inline
      def setVoice_states(value: js.Array[_]): Self = StObject.set(x, "voice_states", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVoice_statesUndefined: Self = StObject.set(x, "voice_states", js.undefined)
      
      @scala.inline
      def setVoice_statesVarargs(value: js.Any*): Self = StObject.set(x, "voice_states", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Guild extends StObject {
    
    var icon_url: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var members: js.UndefOr[js.Array[_]] = js.native
    
    var name: String = js.native
  }
  object Guild {
    
    @scala.inline
    def apply(id: String, name: String): Guild = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Guild]
    }
    
    @scala.inline
    implicit class GuildMutableBuilder[Self <: Guild] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon_url(value: String): Self = StObject.set(x, "icon_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon_urlUndefined: Self = StObject.set(x, "icon_url", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembers(value: js.Array[_]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      @scala.inline
      def setMembersVarargs(value: js.Any*): Self = StObject.set(x, "members", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Presence extends StObject {
    
    var details: js.UndefOr[String] = js.native
    
    var endTimestamp: js.UndefOr[Double | Date] = js.native
    
    var instance: js.UndefOr[Boolean] = js.native
    
    var joinSecret: js.UndefOr[String] = js.native
    
    var largeImageKey: js.UndefOr[String] = js.native
    
    var largeImageText: js.UndefOr[String] = js.native
    
    var matchSecret: js.UndefOr[String] = js.native
    
    var partyMax: js.UndefOr[Double] = js.native
    
    var partySize: js.UndefOr[Double] = js.native
    
    var smallImageKey: js.UndefOr[String] = js.native
    
    var smallImageText: js.UndefOr[String] = js.native
    
    var spectateSecret: js.UndefOr[String] = js.native
    
    var startTimestamp: js.UndefOr[Double | Date] = js.native
    
    var state: js.UndefOr[String] = js.native
  }
  object Presence {
    
    @scala.inline
    def apply(): Presence = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Presence]
    }
    
    @scala.inline
    implicit class PresenceMutableBuilder[Self <: Presence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setEndTimestamp(value: Double | Date): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
      
      @scala.inline
      def setInstance(value: Boolean): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      @scala.inline
      def setJoinSecret(value: String): Self = StObject.set(x, "joinSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinSecretUndefined: Self = StObject.set(x, "joinSecret", js.undefined)
      
      @scala.inline
      def setLargeImageKey(value: String): Self = StObject.set(x, "largeImageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeImageKeyUndefined: Self = StObject.set(x, "largeImageKey", js.undefined)
      
      @scala.inline
      def setLargeImageText(value: String): Self = StObject.set(x, "largeImageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeImageTextUndefined: Self = StObject.set(x, "largeImageText", js.undefined)
      
      @scala.inline
      def setMatchSecret(value: String): Self = StObject.set(x, "matchSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchSecretUndefined: Self = StObject.set(x, "matchSecret", js.undefined)
      
      @scala.inline
      def setPartyMax(value: Double): Self = StObject.set(x, "partyMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartyMaxUndefined: Self = StObject.set(x, "partyMax", js.undefined)
      
      @scala.inline
      def setPartySize(value: Double): Self = StObject.set(x, "partySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartySizeUndefined: Self = StObject.set(x, "partySize", js.undefined)
      
      @scala.inline
      def setSmallImageKey(value: String): Self = StObject.set(x, "smallImageKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallImageKeyUndefined: Self = StObject.set(x, "smallImageKey", js.undefined)
      
      @scala.inline
      def setSmallImageText(value: String): Self = StObject.set(x, "smallImageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallImageTextUndefined: Self = StObject.set(x, "smallImageText", js.undefined)
      
      @scala.inline
      def setSpectateSecret(value: String): Self = StObject.set(x, "spectateSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpectateSecretUndefined: Self = StObject.set(x, "spectateSecret", js.undefined)
      
      @scala.inline
      def setStartTimestamp(value: Double | Date): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait RPCClientOptions extends StObject {
    
    var transport: ipc | websocket = js.native
  }
  object RPCClientOptions {
    
    @scala.inline
    def apply(transport: ipc | websocket): RPCClientOptions = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[RPCClientOptions]
    }
    
    @scala.inline
    implicit class RPCClientOptionsMutableBuilder[Self <: RPCClientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransport(value: ipc | websocket): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RPCLoginOptions extends StObject {
    
    var accessToken: js.UndefOr[String] = js.native
    
    var clientId: String = js.native
    
    var clientSecret: js.UndefOr[String] = js.native
    
    var rpcToken: js.UndefOr[String] = js.native
    
    var scopes: js.UndefOr[js.Array[String]] = js.native
    
    var tokenEndpoint: js.UndefOr[String] = js.native
  }
  object RPCLoginOptions {
    
    @scala.inline
    def apply(clientId: String): RPCLoginOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RPCLoginOptions]
    }
    
    @scala.inline
    implicit class RPCLoginOptionsMutableBuilder[Self <: RPCLoginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      @scala.inline
      def setRpcToken(value: String): Self = StObject.set(x, "rpcToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRpcTokenUndefined: Self = StObject.set(x, "rpcToken", js.undefined)
      
      @scala.inline
      def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      @scala.inline
      def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
      
      @scala.inline
      def setTokenEndpoint(value: String): Self = StObject.set(x, "tokenEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenEndpointUndefined: Self = StObject.set(x, "tokenEndpoint", js.undefined)
    }
  }
  
  @js.native
  trait Subscription extends StObject {
    
    def unsubscribe(): js.Promise[Boolean] = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(unsubscribe: () => js.Promise[Boolean]): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnsubscribe(value: () => js.Promise[Boolean]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait UserVoiceSettings extends StObject {
    
    var id: String = js.native
    
    var mute: js.UndefOr[Boolean] = js.native
    
    var pan: js.UndefOr[Left] = js.native
    
    var volume: js.UndefOr[Double] = js.native
  }
  object UserVoiceSettings {
    
    @scala.inline
    def apply(id: String): UserVoiceSettings = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserVoiceSettings]
    }
    
    @scala.inline
    implicit class UserVoiceSettingsMutableBuilder[Self <: UserVoiceSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      @scala.inline
      def setPan(value: Left): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  @js.native
  trait VoiceSettings extends StObject {
    
    var automaticGainControl: Boolean = js.native
    
    var deaf: Boolean = js.native
    
    var echoCancellation: Boolean = js.native
    
    var input: js.UndefOr[Device] = js.native
    
    var mode: js.UndefOr[AutoThreshold] = js.native
    
    var mute: Boolean = js.native
    
    var noiseSuppression: Boolean = js.native
    
    var output: js.UndefOr[Device] = js.native
    
    var qos: Boolean = js.native
    
    var silenceWarning: Boolean = js.native
  }
  object VoiceSettings {
    
    @scala.inline
    def apply(
      automaticGainControl: Boolean,
      deaf: Boolean,
      echoCancellation: Boolean,
      mute: Boolean,
      noiseSuppression: Boolean,
      qos: Boolean,
      silenceWarning: Boolean
    ): VoiceSettings = {
      val __obj = js.Dynamic.literal(automaticGainControl = automaticGainControl.asInstanceOf[js.Any], deaf = deaf.asInstanceOf[js.Any], echoCancellation = echoCancellation.asInstanceOf[js.Any], mute = mute.asInstanceOf[js.Any], noiseSuppression = noiseSuppression.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], silenceWarning = silenceWarning.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoiceSettings]
    }
    
    @scala.inline
    implicit class VoiceSettingsMutableBuilder[Self <: VoiceSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomaticGainControl(value: Boolean): Self = StObject.set(x, "automaticGainControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeaf(value: Boolean): Self = StObject.set(x, "deaf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEchoCancellation(value: Boolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: Device): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setMode(value: AutoThreshold): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoiseSuppression(value: Boolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: Device): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setQos(value: Boolean): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilenceWarning(value: Boolean): Self = StObject.set(x, "silenceWarning", value.asInstanceOf[js.Any])
    }
  }
}
