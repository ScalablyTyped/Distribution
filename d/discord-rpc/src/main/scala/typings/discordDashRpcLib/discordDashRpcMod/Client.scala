package typings
package discordDashRpcLib.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("discord-rpc", "Client")
@js.native
class Client protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: RPCClientOptions) = this()
  var application: discordDashRpcLib.Anon_Name = js.native
  var user: discordDashRpcLib.Anon_Username = js.native
  def captureShortcut(
    callback: js.Function2[
      /* shortcut */ js.Array[discordDashRpcLib.Anon_Type], 
      /* stop */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): stdLib.Promise[js.Function0[scala.Unit]] = js.native
  def clearActivity(): stdLib.Promise[_] = js.native
  def clearActivity(pid: scala.Double): stdLib.Promise[_] = js.native
  def closeJoinRequest(user: discordDashRpcLib.Anon_Id): stdLib.Promise[_] = js.native
  def closeJoinRequest(user: java.lang.String): stdLib.Promise[_] = js.native
  def connect(clientId: java.lang.String): stdLib.Promise[Client] = js.native
  def connectToLobby(id: java.lang.String, secret: java.lang.String): stdLib.Promise[_] = js.native
  def createLobby(`type`: java.lang.String, capacity: scala.Double, metadata: js.Any): stdLib.Promise[_] = js.native
  def deleteLobby(lobby: discordDashRpcLib.Anon_Id): stdLib.Promise[_] = js.native
  def deleteLobby(lobby: java.lang.String): stdLib.Promise[_] = js.native
  def destroy(): stdLib.Promise[scala.Unit] = js.native
  def disconnectFromLobby(lobby: discordDashRpcLib.Anon_Id): stdLib.Promise[_] = js.native
  def disconnectFromLobby(lobby: java.lang.String): stdLib.Promise[_] = js.native
  def getChannel(id: java.lang.String): stdLib.Promise[Channel] = js.native
  def getChannel(id: java.lang.String, timeout: scala.Double): stdLib.Promise[Channel] = js.native
  def getChannels(): stdLib.Promise[js.Array[Channel]] = js.native
  def getChannels(id: java.lang.String): stdLib.Promise[js.Array[Channel]] = js.native
  def getChannels(id: java.lang.String, timeout: scala.Double): stdLib.Promise[js.Array[Channel]] = js.native
  def getGuild(id: java.lang.String): stdLib.Promise[Guild] = js.native
  def getGuild(id: java.lang.String, timeout: scala.Double): stdLib.Promise[Guild] = js.native
  def getGuilds(): stdLib.Promise[js.Array[Guild]] = js.native
  def getGuilds(timeout: scala.Double): stdLib.Promise[js.Array[Guild]] = js.native
  def getVoiceSettings(): stdLib.Promise[VoiceSettings] = js.native
  def login(): stdLib.Promise[this.type] = js.native
  def login(options: RPCLoginOptions): stdLib.Promise[this.type] = js.native
  def selectTextChannel(id: java.lang.String): stdLib.Promise[Channel] = js.native
  def selectTextChannel(id: java.lang.String, options: discordDashRpcLib.Anon_ForceTimeout): stdLib.Promise[Channel] = js.native
  def selectVoiceChannel(id: java.lang.String): stdLib.Promise[Channel] = js.native
  def selectVoiceChannel(id: java.lang.String, options: discordDashRpcLib.Anon_Force): stdLib.Promise[Channel] = js.native
  def sendJoinInvite(user: discordDashRpcLib.Anon_Id): stdLib.Promise[_] = js.native
  def sendJoinInvite(user: java.lang.String): stdLib.Promise[_] = js.native
  def sendJoinRequest(user: discordDashRpcLib.Anon_Id): stdLib.Promise[_] = js.native
  def sendJoinRequest(user: java.lang.String): stdLib.Promise[_] = js.native
  def sendToLobby(lobby: discordDashRpcLib.Anon_Id, data: js.Any): stdLib.Promise[_] = js.native
  def sendToLobby(lobby: java.lang.String, data: js.Any): stdLib.Promise[_] = js.native
  def setActivity(): stdLib.Promise[_] = js.native
  def setActivity(args: Presence): stdLib.Promise[_] = js.native
  def setActivity(args: Presence, pid: scala.Double): stdLib.Promise[_] = js.native
  def setCertifiedDevices(devices: js.Array[CertifiedDevice]): stdLib.Promise[scala.Null] = js.native
  def setUserVoiceSettings(id: java.lang.String, settings: UserVoiceSettings): stdLib.Promise[_] = js.native
  def setVoiceSettings(args: VoiceSettings): stdLib.Promise[_] = js.native
  def subscribe(event: java.lang.String, args: js.Any, callback: js.Function1[/* data */ js.Any, scala.Unit]): stdLib.Promise[Subscription] = js.native
  def subscribe(event: java.lang.String, callback: js.Function1[/* data */ js.Any, scala.Unit]): stdLib.Promise[Subscription] = js.native
  def updateLobby(lobby: discordDashRpcLib.Anon_Id): stdLib.Promise[_] = js.native
  def updateLobby(lobby: discordDashRpcLib.Anon_Id, options: discordDashRpcLib.Anon_TypeMetadata): stdLib.Promise[_] = js.native
  def updateLobby(lobby: java.lang.String): stdLib.Promise[_] = js.native
  def updateLobby(lobby: java.lang.String, options: discordDashRpcLib.Anon_TypeMetadata): stdLib.Promise[_] = js.native
  def updateLobbyMember(lobby: discordDashRpcLib.Anon_Id, user: discordDashRpcLib.Anon_Id, metadata: js.Any): stdLib.Promise[_] = js.native
  def updateLobbyMember(lobby: discordDashRpcLib.Anon_Id, user: java.lang.String, metadata: js.Any): stdLib.Promise[_] = js.native
  def updateLobbyMember(lobby: java.lang.String, user: discordDashRpcLib.Anon_Id, metadata: js.Any): stdLib.Promise[_] = js.native
  def updateLobbyMember(lobby: java.lang.String, user: java.lang.String, metadata: js.Any): stdLib.Promise[_] = js.native
}

