package typings.freedom.freedom.Social

import typings.freedom.freedomStrings.onClientState
import typings.freedom.freedomStrings.onMessage
import typings.freedom.freedomStrings.onUserProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Social extends js.Object {
  
  // Forget any tokens/credentials used for logging in with the last used
  // userId.
  def clearCachedCredentials(): js.Promise[Unit] = js.native
  
  def getClients(): js.Promise[Clients] = js.native
  
  def getUsers(): js.Promise[Users] = js.native
  
  def login(loginRequest: LoginRequest): js.Promise[ClientState] = js.native
  
  // Logs the user out of the social network. After the logout promise, the
  // user status is OFFLINE.
  def logout(): js.Promise[Unit] = js.native
  
  // Generic Freedom Event stuff. |on| binds an event handler to event type
  // |eventType|. Every time |eventType|  event is raised, the function |f|
  // will be called.
  //
  // Message type |onMessage| happens when the user receives a message from
  // another contact.
  def on(eventType: String, f: js.Function): Unit = js.native
  // Message type |onMyStatus| is received when the user's client's status
  // changes, e.g. when disconnected and online status becomes offline.
  @JSName("on")
  def on_onClientState(eventType: onClientState, f: js.Function1[/* status */ ClientState, Unit]): Unit = js.native
  @JSName("on")
  def on_onMessage(eventType: onMessage, f: js.Function1[/* message */ IncomingMessage, Unit]): Unit = js.native
  // Message type |onRosterProfile| events are received when another user's
  // profile is received or when a client changes status.
  @JSName("on")
  def on_onUserProfile(eventType: onUserProfile, f: js.Function1[/* profile */ UserProfile, Unit]): Unit = js.native
  
  // Do a singleton event binding: |f| will only be called once, on the next
  // event of type |eventType|. Same events as above.
  def once(eventType: String, f: js.Function): Unit = js.native
  
  // Send a message to user on your network
  // If the message is sent to a userId, it is sent to all clients
  // If the message is sent to a clientId, it is sent to just that one client
  // If the destination id is not specified or invalid, promise rejects.
  def sendMessage(destinationId: String, message: String): js.Promise[Unit] = js.native
}
