package typings.discordRpc.mod

import typings.discordRpc.anon.Avatar
import typings.discordRpc.anon.Capacity
import typings.discordRpc.anon.Code
import typings.discordRpc.anon.Description
import typings.discordRpc.anon.Force
import typings.discordRpc.anon.Id
import typings.discordRpc.anon.Timeout
import typings.discordRpc.discordRpcStrings.connected
import typings.discordRpc.discordRpcStrings.ready
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("discord-rpc", "Client")
@js.native
class Client protected () extends EventEmitter {
  def this(options: RPCClientOptions) = this()
  var application: Description = js.native
  var user: Avatar = js.native
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
}

