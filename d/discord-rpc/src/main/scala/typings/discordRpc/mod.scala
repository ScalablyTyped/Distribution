package typings.discordRpc

import org.scalablytyped.runtime.StringDictionary
import typings.discordRpc.anon.AutoThreshold
import typings.discordRpc.anon.Capacity
import typings.discordRpc.anon.Code
import typings.discordRpc.anon.Device
import typings.discordRpc.anon.Force
import typings.discordRpc.anon.Id
import typings.discordRpc.anon.Label
import typings.discordRpc.anon.Left
import typings.discordRpc.anon.Name
import typings.discordRpc.anon.Timeout
import typings.discordRpc.discordRpcStrings.AUDIO_INPUT
import typings.discordRpc.discordRpcStrings.AUDIO_OUTPUT
import typings.discordRpc.discordRpcStrings.VIDEO_INPUT
import typings.discordRpc.discordRpcStrings.consent
import typings.discordRpc.discordRpcStrings.ipc
import typings.discordRpc.discordRpcStrings.none
import typings.discordRpc.discordRpcStrings.websocket
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("discord-rpc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("discord-rpc", "BaseClient")
  @js.native
  open class BaseClient () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("discord-rpc", "Client")
  @js.native
  open class Client protected () extends BaseClient {
    /**
      * @param options Options for the client.
      * You must provide a transport
      */
    def this(options: RPCClientOptions) = this()
    
    /**
      * Application used in this client
      */
    var application: js.UndefOr[ClientApplication] = js.native
    
    /**
      * Capture a shortcut using the client
      * The callback takes (key, stop) where `stop` is a function that will stop capturing.
      * This `stop` function must be called before disconnecting or else the user will have
      * to restart their client.
      * @param callback Callback handling keys
      */
    def captureShortcut(callback: js.Function2[/* key */ js.Array[Code], /* stop */ js.Function0[Unit], Unit]): js.Promise[js.Function0[Unit]] = js.native
    
    /**
      * Clears the currently set presence, if any. This will hide the "Playing X" message
      * displayed below the user's name.
      * @param pid The application's process ID. Defaults to the executing process' PID.
      */
    def clearActivity(): js.Promise[Any] = js.native
    def clearActivity(pid: Double): js.Promise[Any] = js.native
    
    def closeJoinRequest(user: String): js.Promise[Any] = js.native
    /**
      * Reject a join request from a user
      * @param user The user whose request you wish to reject
      */
    def closeJoinRequest(user: User): js.Promise[Any] = js.native
    
    /**
      * Search and connect to RPC
      */
    def connect(clientId: String): js.Promise[Client] = js.native
    
    def connectToLobby(id: String, secret: String): js.Promise[Any] = js.native
    
    def createLobby(`type`: String, capacity: Double, metadata: Any): js.Promise[Any] = js.native
    
    def deleteLobby(lobby: String): js.Promise[Any] = js.native
    def deleteLobby(lobby: Id): js.Promise[Any] = js.native
    
    /**
      * Destroy the client
      */
    def destroy(): js.Promise[Unit] = js.native
    
    def disconnectFromLobby(lobby: String): js.Promise[Any] = js.native
    def disconnectFromLobby(lobby: Id): js.Promise[Any] = js.native
    
    /**
      * Get a channel
      * @param id Channel ID
      * @param timeout Timeout request
      */
    def getChannel(id: Snowflake): js.Promise[Channel] = js.native
    def getChannel(id: Snowflake, timeout: Double): js.Promise[Channel] = js.native
    
    /**
      * Get all channels
      * @param id Guild ID
      * @param timeout Timeout request
      */
    def getChannels(): js.Promise[js.Array[Channel]] = js.native
    def getChannels(id: Unit, timeout: Double): js.Promise[js.Array[Channel]] = js.native
    def getChannels(id: Snowflake): js.Promise[js.Array[Channel]] = js.native
    def getChannels(id: Snowflake, timeout: Double): js.Promise[js.Array[Channel]] = js.native
    
    /**
      * Fetch a guild
      * @param id Guild ID
      * @param timeout Timeout request
      */
    def getGuild(id: Snowflake): js.Promise[Guild] = js.native
    def getGuild(id: Snowflake, timeout: Double): js.Promise[Guild] = js.native
    
    /**
      * Fetch all guilds
      * @param timeout Timeout request
      */
    def getGuilds(): js.Promise[js.Array[Guild]] = js.native
    def getGuilds(timeout: Double): js.Promise[js.Array[Guild]] = js.native
    
    /**
      * Get current voice settings
      */
    def getVoiceSettings(): js.Promise[VoiceSettings] = js.native
    
    /**
      * Performs authentication flow. Automatically calls Client#connect if needed.
      * @param options Options for authentication.
      * At least one property must be provided to perform login.
      * @example client.login({ clientId: '1234567', clientSecret: 'abcdef123' });
      */
    def login(): js.Promise[this.type] = js.native
    def login(options: RPCLoginOptions): js.Promise[this.type] = js.native
    
    def off(event: eventNames, listener: Listener): this.type = js.native
    
    def on(event: eventNames, listener: Listener): this.type = js.native
    
    def once(event: eventNames, listener: Listener): this.type = js.native
    
    /**
      * Move the user to a text channel
      * @param id ID of the voice channel
      * @param options Options
      */
    def selectTextChannel(id: Snowflake): js.Promise[Channel] = js.native
    def selectTextChannel(id: Snowflake, options: Timeout): js.Promise[Channel] = js.native
    
    /**
      * Move the user to a voice channel
      * @param id ID of the voice channel
      * @param options Options
      */
    def selectVoiceChannel(id: Snowflake): js.Promise[Channel] = js.native
    def selectVoiceChannel(id: Snowflake, options: Force): js.Promise[Channel] = js.native
    
    def sendJoinInvite(user: String): js.Promise[Any] = js.native
    /**
      * Invite a user to join the game the RPC user is currently playing
      * @param user The user to invite
      */
    def sendJoinInvite(user: User): js.Promise[Any] = js.native
    
    def sendJoinRequest(user: String): js.Promise[Any] = js.native
    /**
      * Request to join the game the user is playing
      * @param user The user whose game you want to request to join
      */
    def sendJoinRequest(user: User): js.Promise[Any] = js.native
    
    def sendToLobby(lobby: String, data: Any): js.Promise[Any] = js.native
    def sendToLobby(lobby: Id, data: Any): js.Promise[Any] = js.native
    
    /**
      * Sets the presence for the logged in user.
      * @param args The rich presence to pass.
      * @param pid The application's process ID. Defaults to the executing process' PID.
      */
    def setActivity(): js.Promise[Any] = js.native
    def setActivity(args: Unit, pid: Double): js.Promise[Any] = js.native
    def setActivity(args: Presence): js.Promise[Any] = js.native
    def setActivity(args: Presence, pid: Double): js.Promise[Any] = js.native
    
    /**
      * Tell discord which devices are certified
      * @param devices Certified devices to send to discord
      */
    def setCertifiedDevices(devices: js.Array[CertifiedDevice]): js.Promise[Null] = js.native
    
    /**
      * Set the voice settings for a user, by id
      * @param id ID of the user to set
      * @param settings Settings
      */
    def setUserVoiceSettings(id: Snowflake, settings: UserVoiceSettings): js.Promise[Any] = js.native
    
    /**
      * Set current voice settings, overriding the current settings until this session disconnects.
      * This also locks the settings for any other rpc sessions which may be connected.
      * @param args Settings
      */
    def setVoiceSettings(args: VoiceSettings): js.Promise[Any] = js.native
    
    /**
      * Subscribe to an event
      * @param event Name of event e.g. `MESSAGE_CREATE`
      * @param args Args for event e.g. `{ channel_id: '1234' }`
      */
    def subscribe(event: RPCEvents, args: Any): js.Promise[Subscription] = js.native
    
    def updateLobby(lobby: String): js.Promise[Any] = js.native
    def updateLobby(lobby: String, options: Capacity): js.Promise[Any] = js.native
    def updateLobby(lobby: Id): js.Promise[Any] = js.native
    def updateLobby(lobby: Id, options: Capacity): js.Promise[Any] = js.native
    
    def updateLobbyMember(lobby: String, user: String, metadata: Any): js.Promise[Any] = js.native
    def updateLobbyMember(lobby: String, user: Id, metadata: Any): js.Promise[Any] = js.native
    def updateLobbyMember(lobby: Id, user: String, metadata: Any): js.Promise[Any] = js.native
    def updateLobbyMember(lobby: Id, user: Id, metadata: Any): js.Promise[Any] = js.native
    
    /**
      * User used in this application
      */
    var user: js.UndefOr[User] = js.native
  }
  
  inline def register(id: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(id.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait CertifiedDevice extends StObject {
    
    /**
      * If the device has automatic gain control
      */
    var automaticGainControl: Boolean
    
    /**
      * If the device has echo cancellation
      */
    var echoCancellation: Boolean
    
    /**
      * If the device has a hardware mute
      */
    var hardwareMute: Boolean
    
    /**
      * Model information
      */
    var model: Name
    
    /**
      * If the device has noise suppression
      */
    var noiseSuppression: Boolean
    
    /**
      * Array of related product's Windows UUIDs
      */
    var related: js.Array[String]
    
    /**
      * One of `AUDIO_INPUT`, `AUDIO_OUTPUT`, `VIDEO_INPUT`
      */
    var `type`: AUDIO_INPUT | AUDIO_OUTPUT | VIDEO_INPUT
    
    /**
      * This device's Windows UUID
      */
    var uuid: String
    
    /**
      * Vendor information
      */
    var vendor: Name
  }
  object CertifiedDevice {
    
    inline def apply(
      automaticGainControl: Boolean,
      echoCancellation: Boolean,
      hardwareMute: Boolean,
      model: Name,
      noiseSuppression: Boolean,
      related: js.Array[String],
      `type`: AUDIO_INPUT | AUDIO_OUTPUT | VIDEO_INPUT,
      uuid: String,
      vendor: Name
    ): CertifiedDevice = {
      val __obj = js.Dynamic.literal(automaticGainControl = automaticGainControl.asInstanceOf[js.Any], echoCancellation = echoCancellation.asInstanceOf[js.Any], hardwareMute = hardwareMute.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], noiseSuppression = noiseSuppression.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertifiedDevice]
    }
    
    extension [Self <: CertifiedDevice](x: Self) {
      
      inline def setAutomaticGainControl(value: Boolean): Self = StObject.set(x, "automaticGainControl", value.asInstanceOf[js.Any])
      
      inline def setEchoCancellation(value: Boolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
      
      inline def setHardwareMute(value: Boolean): Self = StObject.set(x, "hardwareMute", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Name): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setNoiseSuppression(value: Boolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
      
      inline def setRelated(value: js.Array[String]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
      
      inline def setRelatedVarargs(value: String*): Self = StObject.set(x, "related", js.Array(value*))
      
      inline def setType(value: AUDIO_INPUT | AUDIO_OUTPUT | VIDEO_INPUT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: Name): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Channel extends StObject {
    
    /**
      * (voice)
      */
    var bitrate: js.UndefOr[Double] = js.undefined
    
    var guild_id: js.UndefOr[String] = js.undefined
    
    var id: String
    
    /**
      * (text) https://discordapp.com/developers/docs/resources/channel#message-object
      */
    var messages: js.UndefOr[js.Array[Any]] = js.undefined
    
    var name: String
    
    /**
      * (text)
      */
    var position: js.UndefOr[Double] = js.undefined
    
    /**
      * (text)
      */
    var topic: js.UndefOr[String] = js.undefined
    
    /**
      * Guild text: 0, Guild voice: 2, DM: 1, Group DM: 3
      */
    var `type`: Double
    
    /**
      * (voice) 0 if none
      */
    var user_limit: js.UndefOr[Double] = js.undefined
    
    /**
      * (voice) https://discordapp.com/developers/docs/resources/voice#voice-state-object
      */
    var voice_states: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object Channel {
    
    inline def apply(id: String, name: String, `type`: Double): Channel = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
      
      inline def setGuild_id(value: String): Self = StObject.set(x, "guild_id", value.asInstanceOf[js.Any])
      
      inline def setGuild_idUndefined: Self = StObject.set(x, "guild_id", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessages(value: js.Array[Any]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMessagesVarargs(value: Any*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUser_limit(value: Double): Self = StObject.set(x, "user_limit", value.asInstanceOf[js.Any])
      
      inline def setUser_limitUndefined: Self = StObject.set(x, "user_limit", js.undefined)
      
      inline def setVoice_states(value: js.Array[Any]): Self = StObject.set(x, "voice_states", value.asInstanceOf[js.Any])
      
      inline def setVoice_statesUndefined: Self = StObject.set(x, "voice_states", js.undefined)
      
      inline def setVoice_statesVarargs(value: Any*): Self = StObject.set(x, "voice_states", js.Array(value*))
    }
  }
  
  trait ClientApplication extends StObject {
    
    var description: String
    
    var icon: String
    
    var id: String
    
    var name: String
    
    var rpc_origins: js.Array[String]
  }
  object ClientApplication {
    
    inline def apply(description: String, icon: String, id: String, name: String, rpc_origins: js.Array[String]): ClientApplication = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rpc_origins = rpc_origins.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientApplication]
    }
    
    extension [Self <: ClientApplication](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRpc_origins(value: js.Array[String]): Self = StObject.set(x, "rpc_origins", value.asInstanceOf[js.Any])
      
      inline def setRpc_originsVarargs(value: String*): Self = StObject.set(x, "rpc_origins", js.Array(value*))
    }
  }
  
  type ClientOptions = StringDictionary[Any]
  
  trait Guild extends StObject {
    
    var icon_url: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var members: js.UndefOr[js.Array[Any]] = js.undefined
    
    var name: String
  }
  object Guild {
    
    inline def apply(id: String, name: String): Guild = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Guild]
    }
    
    extension [Self <: Guild](x: Self) {
      
      inline def setIcon_url(value: String): Self = StObject.set(x, "icon_url", value.asInstanceOf[js.Any])
      
      inline def setIcon_urlUndefined: Self = StObject.set(x, "icon_url", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: js.Array[Any]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      inline def setMembersVarargs(value: Any*): Self = StObject.set(x, "members", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Listener extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait Presence extends StObject {
    
    var buttons: js.UndefOr[js.Array[Label]] = js.undefined
    
    var details: js.UndefOr[String] = js.undefined
    
    var endTimestamp: js.UndefOr[Double | js.Date] = js.undefined
    
    var instance: js.UndefOr[Boolean] = js.undefined
    
    var joinSecret: js.UndefOr[String] = js.undefined
    
    var largeImageKey: js.UndefOr[String] = js.undefined
    
    var largeImageText: js.UndefOr[String] = js.undefined
    
    var matchSecret: js.UndefOr[String] = js.undefined
    
    var partyId: js.UndefOr[String] = js.undefined
    
    var partyMax: js.UndefOr[Double] = js.undefined
    
    var partySize: js.UndefOr[Double] = js.undefined
    
    var smallImageKey: js.UndefOr[String] = js.undefined
    
    var smallImageText: js.UndefOr[String] = js.undefined
    
    var spectateSecret: js.UndefOr[String] = js.undefined
    
    var startTimestamp: js.UndefOr[Double | js.Date] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object Presence {
    
    inline def apply(): Presence = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Presence]
    }
    
    extension [Self <: Presence](x: Self) {
      
      inline def setButtons(value: js.Array[Label]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: Label*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setEndTimestamp(value: Double | js.Date): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      inline def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
      
      inline def setInstance(value: Boolean): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setJoinSecret(value: String): Self = StObject.set(x, "joinSecret", value.asInstanceOf[js.Any])
      
      inline def setJoinSecretUndefined: Self = StObject.set(x, "joinSecret", js.undefined)
      
      inline def setLargeImageKey(value: String): Self = StObject.set(x, "largeImageKey", value.asInstanceOf[js.Any])
      
      inline def setLargeImageKeyUndefined: Self = StObject.set(x, "largeImageKey", js.undefined)
      
      inline def setLargeImageText(value: String): Self = StObject.set(x, "largeImageText", value.asInstanceOf[js.Any])
      
      inline def setLargeImageTextUndefined: Self = StObject.set(x, "largeImageText", js.undefined)
      
      inline def setMatchSecret(value: String): Self = StObject.set(x, "matchSecret", value.asInstanceOf[js.Any])
      
      inline def setMatchSecretUndefined: Self = StObject.set(x, "matchSecret", js.undefined)
      
      inline def setPartyId(value: String): Self = StObject.set(x, "partyId", value.asInstanceOf[js.Any])
      
      inline def setPartyIdUndefined: Self = StObject.set(x, "partyId", js.undefined)
      
      inline def setPartyMax(value: Double): Self = StObject.set(x, "partyMax", value.asInstanceOf[js.Any])
      
      inline def setPartyMaxUndefined: Self = StObject.set(x, "partyMax", js.undefined)
      
      inline def setPartySize(value: Double): Self = StObject.set(x, "partySize", value.asInstanceOf[js.Any])
      
      inline def setPartySizeUndefined: Self = StObject.set(x, "partySize", js.undefined)
      
      inline def setSmallImageKey(value: String): Self = StObject.set(x, "smallImageKey", value.asInstanceOf[js.Any])
      
      inline def setSmallImageKeyUndefined: Self = StObject.set(x, "smallImageKey", js.undefined)
      
      inline def setSmallImageText(value: String): Self = StObject.set(x, "smallImageText", value.asInstanceOf[js.Any])
      
      inline def setSmallImageTextUndefined: Self = StObject.set(x, "smallImageText", js.undefined)
      
      inline def setSpectateSecret(value: String): Self = StObject.set(x, "spectateSecret", value.asInstanceOf[js.Any])
      
      inline def setSpectateSecretUndefined: Self = StObject.set(x, "spectateSecret", js.undefined)
      
      inline def setStartTimestamp(value: Double | js.Date): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      inline def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait RPCClientOptions
    extends StObject
       with ClientOptions {
    
    /**
      * RPC transport. one of `ipc` or `websocket`
      */
    var transport: ipc | websocket
  }
  object RPCClientOptions {
    
    inline def apply(transport: ipc | websocket): RPCClientOptions = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[RPCClientOptions]
    }
    
    extension [Self <: RPCClientOptions](x: Self) {
      
      inline def setTransport(value: ipc | websocket): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.discordRpc.discordRpcStrings.CURRENT_USER_UPDATE
    - typings.discordRpc.discordRpcStrings.GUILD_STATUS
    - typings.discordRpc.discordRpcStrings.GUILD_CREATE
    - typings.discordRpc.discordRpcStrings.CHANNEL_CREATE
    - typings.discordRpc.discordRpcStrings.RELATIONSHIP_UPDATE
    - typings.discordRpc.discordRpcStrings.VOICE_CHANNEL_SELECT
    - typings.discordRpc.discordRpcStrings.VOICE_STATE_CREATE
    - typings.discordRpc.discordRpcStrings.VOICE_STATE_DELETE
    - typings.discordRpc.discordRpcStrings.VOICE_STATE_UPDATE
    - typings.discordRpc.discordRpcStrings.VOICE_SETTINGS_UPDATE
    - typings.discordRpc.discordRpcStrings.VOICE_SETTINGS_UPDATE_2
    - typings.discordRpc.discordRpcStrings.VOICE_CONNECTION_STATUS
    - typings.discordRpc.discordRpcStrings.SPEAKING_START
    - typings.discordRpc.discordRpcStrings.SPEAKING_STOP
    - typings.discordRpc.discordRpcStrings.GAME_JOIN
    - typings.discordRpc.discordRpcStrings.GAME_SPECTATE
    - typings.discordRpc.discordRpcStrings.ACTIVITY_JOIN
    - typings.discordRpc.discordRpcStrings.ACTIVITY_JOIN_REQUEST
    - typings.discordRpc.discordRpcStrings.ACTIVITY_SPECTATE
    - typings.discordRpc.discordRpcStrings.ACTIVITY_INVITE
    - typings.discordRpc.discordRpcStrings.NOTIFICATION_CREATE
    - typings.discordRpc.discordRpcStrings.MESSAGE_CREATE
    - typings.discordRpc.discordRpcStrings.MESSAGE_UPDATE
    - typings.discordRpc.discordRpcStrings.MESSAGE_DELETE
    - typings.discordRpc.discordRpcStrings.LOBBY_DELETE
    - typings.discordRpc.discordRpcStrings.LOBBY_UPDATE
    - typings.discordRpc.discordRpcStrings.LOBBY_MEMBER_CONNECT
    - typings.discordRpc.discordRpcStrings.LOBBY_MEMBER_DISCONNECT
    - typings.discordRpc.discordRpcStrings.LOBBY_MEMBER_UPDATE
    - typings.discordRpc.discordRpcStrings.LOBBY_MESSAGE
    - typings.discordRpc.discordRpcStrings.CAPTURE_SHORTCUT_CHANGE
    - typings.discordRpc.discordRpcStrings.OVERLAY
    - typings.discordRpc.discordRpcStrings.OVERLAY_UPDATE
    - typings.discordRpc.discordRpcStrings.ENTITLEMENT_CREATE
    - typings.discordRpc.discordRpcStrings.ENTITLEMENT_DELETE
    - typings.discordRpc.discordRpcStrings.USER_ACHIEVEMENT_UPDATE
    - typings.discordRpc.discordRpcStrings.READY
    - typings.discordRpc.discordRpcStrings.ERROR
  */
  trait RPCEvents extends StObject
  object RPCEvents {
    
    inline def ACTIVITY_INVITE: typings.discordRpc.discordRpcStrings.ACTIVITY_INVITE = "ACTIVITY_INVITE".asInstanceOf[typings.discordRpc.discordRpcStrings.ACTIVITY_INVITE]
    
    inline def ACTIVITY_JOIN: typings.discordRpc.discordRpcStrings.ACTIVITY_JOIN = "ACTIVITY_JOIN".asInstanceOf[typings.discordRpc.discordRpcStrings.ACTIVITY_JOIN]
    
    inline def ACTIVITY_JOIN_REQUEST: typings.discordRpc.discordRpcStrings.ACTIVITY_JOIN_REQUEST = "ACTIVITY_JOIN_REQUEST".asInstanceOf[typings.discordRpc.discordRpcStrings.ACTIVITY_JOIN_REQUEST]
    
    inline def ACTIVITY_SPECTATE: typings.discordRpc.discordRpcStrings.ACTIVITY_SPECTATE = "ACTIVITY_SPECTATE".asInstanceOf[typings.discordRpc.discordRpcStrings.ACTIVITY_SPECTATE]
    
    inline def CAPTURE_SHORTCUT_CHANGE: typings.discordRpc.discordRpcStrings.CAPTURE_SHORTCUT_CHANGE = "CAPTURE_SHORTCUT_CHANGE".asInstanceOf[typings.discordRpc.discordRpcStrings.CAPTURE_SHORTCUT_CHANGE]
    
    inline def CHANNEL_CREATE: typings.discordRpc.discordRpcStrings.CHANNEL_CREATE = "CHANNEL_CREATE".asInstanceOf[typings.discordRpc.discordRpcStrings.CHANNEL_CREATE]
    
    inline def CURRENT_USER_UPDATE: typings.discordRpc.discordRpcStrings.CURRENT_USER_UPDATE = "CURRENT_USER_UPDATE".asInstanceOf[typings.discordRpc.discordRpcStrings.CURRENT_USER_UPDATE]
    
    inline def ENTITLEMENT_CREATE: typings.discordRpc.discordRpcStrings.ENTITLEMENT_CREATE = "ENTITLEMENT_CREATE".asInstanceOf[typings.discordRpc.discordRpcStrings.ENTITLEMENT_CREATE]
    
    inline def ENTITLEMENT_DELETE: typings.discordRpc.discordRpcStrings.ENTITLEMENT_DELETE = "ENTITLEMENT_DELETE".asInstanceOf[typings.discordRpc.discordRpcStrings.ENTITLEMENT_DELETE]
    
    inline def ERROR: typings.discordRpc.discordRpcStrings.ERROR = "ERROR".asInstanceOf[typings.discordRpc.discordRpcStrings.ERROR]
    
    inline def GAME_JOIN: typings.discordRpc.discordRpcStrings.GAME_JOIN = "GAME_JOIN".asInstanceOf[typings.discordRpc.discordRpcStrings.GAME_JOIN]
    
    inline def GAME_SPECTATE: typings.discordRpc.discordRpcStrings.GAME_SPECTATE = "GAME_SPECTATE".asInstanceOf[typings.discordRpc.discordRpcStrings.GAME_SPECTATE]
    
    inline def GUILD_CREATE: typings.discordRpc.discordRpcStrings.GUILD_CREATE = "GUILD_CREATE".asInstanceOf[typings.discordRpc.discordRpcStrings.GUILD_CREATE]
    
    inline def GUILD_STATUS: typings.discordRpc.discordRpcStrings.GUILD_STATUS = "GUILD_STATUS".asInstanceOf[typings.discordRpc.discordRpcStrings.GUILD_STATUS]
    
    inline def LOBBY_DELETE: typings.discordRpc.discordRpcStrings.LOBBY_DELETE = "LOBBY_DELETE".asInstanceOf[typings.discordRpc.discordRpcStrings.LOBBY_DELETE]
    
    inline def LOBBY_MEMBER_CONNECT: typings.discordRpc.discordRpcStrings.LOBBY_MEMBER_CONNECT = "LOBBY_MEMBER_CONNECT".asInstanceOf[typings.discordRpc.discordRpcStrings.LOBBY_MEMBER_CONNECT]
    
    inline def LOBBY_MEMBER_DISCONNECT: typings.discordRpc.discordRpcStrings.LOBBY_MEMBER_DISCONNECT = "LOBBY_MEMBER_DISCONNECT".asInstanceOf[typings.discordRpc.discordRpcStrings.LOBBY_MEMBER_DISCONNECT]
    
    inline def LOBBY_MEMBER_UPDATE: typings.discordRpc.discordRpcStrings.LOBBY_MEMBER_UPDATE = "LOBBY_MEMBER_UPDATE".asInstanceOf[typings.discordRpc.discordRpcStrings.LOBBY_MEMBER_UPDATE]
    
    inline def LOBBY_MESSAGE: typings.discordRpc.discordRpcStrings.LOBBY_MESSAGE = "LOBBY_MESSAGE".asInstanceOf[typings.discordRpc.discordRpcStrings.LOBBY_MESSAGE]
    
    inline def LOBBY_UPDATE: typings.discordRpc.discordRpcStrings.LOBBY_UPDATE = "LOBBY_UPDATE".asInstanceOf[typings.discordRpc.discordRpcStrings.LOBBY_UPDATE]
    
    inline def MESSAGE_CREATE: typings.discordRpc.discordRpcStrings.MESSAGE_CREATE = "MESSAGE_CREATE".asInstanceOf[typings.discordRpc.discordRpcStrings.MESSAGE_CREATE]
    
    inline def MESSAGE_DELETE: typings.discordRpc.discordRpcStrings.MESSAGE_DELETE = "MESSAGE_DELETE".asInstanceOf[typings.discordRpc.discordRpcStrings.MESSAGE_DELETE]
    
    inline def MESSAGE_UPDATE: typings.discordRpc.discordRpcStrings.MESSAGE_UPDATE = "MESSAGE_UPDATE".asInstanceOf[typings.discordRpc.discordRpcStrings.MESSAGE_UPDATE]
    
    inline def NOTIFICATION_CREATE: typings.discordRpc.discordRpcStrings.NOTIFICATION_CREATE = "NOTIFICATION_CREATE".asInstanceOf[typings.discordRpc.discordRpcStrings.NOTIFICATION_CREATE]
    
    inline def OVERLAY: typings.discordRpc.discordRpcStrings.OVERLAY = "OVERLAY".asInstanceOf[typings.discordRpc.discordRpcStrings.OVERLAY]
    
    inline def OVERLAY_UPDATE: typings.discordRpc.discordRpcStrings.OVERLAY_UPDATE = "OVERLAY_UPDATE".asInstanceOf[typings.discordRpc.discordRpcStrings.OVERLAY_UPDATE]
    
    inline def READY: typings.discordRpc.discordRpcStrings.READY = "READY".asInstanceOf[typings.discordRpc.discordRpcStrings.READY]
    
    inline def RELATIONSHIP_UPDATE: typings.discordRpc.discordRpcStrings.RELATIONSHIP_UPDATE = "RELATIONSHIP_UPDATE".asInstanceOf[typings.discordRpc.discordRpcStrings.RELATIONSHIP_UPDATE]
    
    inline def SPEAKING_START: typings.discordRpc.discordRpcStrings.SPEAKING_START = "SPEAKING_START".asInstanceOf[typings.discordRpc.discordRpcStrings.SPEAKING_START]
    
    inline def SPEAKING_STOP: typings.discordRpc.discordRpcStrings.SPEAKING_STOP = "SPEAKING_STOP".asInstanceOf[typings.discordRpc.discordRpcStrings.SPEAKING_STOP]
    
    inline def USER_ACHIEVEMENT_UPDATE: typings.discordRpc.discordRpcStrings.USER_ACHIEVEMENT_UPDATE = "USER_ACHIEVEMENT_UPDATE".asInstanceOf[typings.discordRpc.discordRpcStrings.USER_ACHIEVEMENT_UPDATE]
    
    inline def VOICE_CHANNEL_SELECT: typings.discordRpc.discordRpcStrings.VOICE_CHANNEL_SELECT = "VOICE_CHANNEL_SELECT".asInstanceOf[typings.discordRpc.discordRpcStrings.VOICE_CHANNEL_SELECT]
    
    inline def VOICE_CONNECTION_STATUS: typings.discordRpc.discordRpcStrings.VOICE_CONNECTION_STATUS = "VOICE_CONNECTION_STATUS".asInstanceOf[typings.discordRpc.discordRpcStrings.VOICE_CONNECTION_STATUS]
    
    inline def VOICE_SETTINGS_UPDATE: typings.discordRpc.discordRpcStrings.VOICE_SETTINGS_UPDATE = "VOICE_SETTINGS_UPDATE".asInstanceOf[typings.discordRpc.discordRpcStrings.VOICE_SETTINGS_UPDATE]
    
    inline def VOICE_SETTINGS_UPDATE_2: typings.discordRpc.discordRpcStrings.VOICE_SETTINGS_UPDATE_2 = "VOICE_SETTINGS_UPDATE_2".asInstanceOf[typings.discordRpc.discordRpcStrings.VOICE_SETTINGS_UPDATE_2]
    
    inline def VOICE_STATE_CREATE: typings.discordRpc.discordRpcStrings.VOICE_STATE_CREATE = "VOICE_STATE_CREATE".asInstanceOf[typings.discordRpc.discordRpcStrings.VOICE_STATE_CREATE]
    
    inline def VOICE_STATE_DELETE: typings.discordRpc.discordRpcStrings.VOICE_STATE_DELETE = "VOICE_STATE_DELETE".asInstanceOf[typings.discordRpc.discordRpcStrings.VOICE_STATE_DELETE]
    
    inline def VOICE_STATE_UPDATE: typings.discordRpc.discordRpcStrings.VOICE_STATE_UPDATE = "VOICE_STATE_UPDATE".asInstanceOf[typings.discordRpc.discordRpcStrings.VOICE_STATE_UPDATE]
  }
  
  trait RPCLoginOptions extends StObject {
    
    /**
      * Access token
      */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /**
      * Client ID
      */
    var clientId: String
    
    /**
      * Client secret
      */
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var prompt: js.UndefOr[none | consent] = js.undefined
    
    /**
      * Token endpoint
      */
    var redirectUri: js.UndefOr[String] = js.undefined
    
    /**
      * RPC token
      */
    var rpcToken: js.UndefOr[String] = js.undefined
    
    /**
      * Scopes to authorize with
      */
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object RPCLoginOptions {
    
    inline def apply(clientId: String): RPCLoginOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RPCLoginOptions]
    }
    
    extension [Self <: RPCLoginOptions](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setPrompt(value: none | consent): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      inline def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      inline def setRpcToken(value: String): Self = StObject.set(x, "rpcToken", value.asInstanceOf[js.Any])
      
      inline def setRpcTokenUndefined: Self = StObject.set(x, "rpcToken", js.undefined)
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
    }
  }
  
  type Snowflake = String
  
  trait Subscription extends StObject {
    
    def unsubscribe(): js.Promise[Boolean]
  }
  object Subscription {
    
    inline def apply(unsubscribe: () => js.Promise[Boolean]): Subscription = {
      val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setUnsubscribe(value: () => js.Promise[Boolean]): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  trait User extends StObject {
    
    var avatar: js.UndefOr[String] = js.undefined
    
    var discriminator: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var username: js.UndefOr[String] = js.undefined
  }
  object User {
    
    inline def apply(id: String): User = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setAvatar(value: String): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
      
      inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait UserVoiceSettings extends StObject {
    
    /**
      * ID of the user these settings apply to
      */
    var id: Snowflake
    
    /**
      * If the user is muted
      */
    var mute: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pan settings, an object with `left` and `right` set between
      * 0.0 and 1.0, inclusive
      */
    var pan: js.UndefOr[Left] = js.undefined
    
    /**
      * The volume
      */
    var volume: js.UndefOr[Double] = js.undefined
  }
  object UserVoiceSettings {
    
    inline def apply(id: Snowflake): UserVoiceSettings = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserVoiceSettings]
    }
    
    extension [Self <: UserVoiceSettings](x: Self) {
      
      inline def setId(value: Snowflake): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
      
      inline def setPan(value: Left): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
    }
  }
  
  trait VoiceSettings extends StObject {
    
    var automaticGainControl: Boolean
    
    var deaf: Boolean
    
    var echoCancellation: Boolean
    
    var input: js.UndefOr[Device] = js.undefined
    
    var mode: js.UndefOr[AutoThreshold] = js.undefined
    
    var mute: Boolean
    
    var noiseSuppression: Boolean
    
    var output: js.UndefOr[Device] = js.undefined
    
    var qos: Boolean
    
    var silenceWarning: Boolean
  }
  object VoiceSettings {
    
    inline def apply(
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
    
    extension [Self <: VoiceSettings](x: Self) {
      
      inline def setAutomaticGainControl(value: Boolean): Self = StObject.set(x, "automaticGainControl", value.asInstanceOf[js.Any])
      
      inline def setDeaf(value: Boolean): Self = StObject.set(x, "deaf", value.asInstanceOf[js.Any])
      
      inline def setEchoCancellation(value: Boolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Device): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setMode(value: AutoThreshold): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      inline def setNoiseSuppression(value: Boolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Device): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setQos(value: Boolean): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setSilenceWarning(value: Boolean): Self = StObject.set(x, "silenceWarning", value.asInstanceOf[js.Any])
    }
  }
  
  trait _eventNames extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.discordRpc.discordRpcStrings.ready_
    - typings.discordRpc.discordRpcStrings.connected
    - typings.discordRpc.discordRpcStrings.disconnected
    - java.lang.String
  */
  type eventNames = _eventNames | String
}
