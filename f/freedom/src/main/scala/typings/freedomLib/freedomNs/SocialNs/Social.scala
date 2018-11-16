package typings
package freedomLib.freedomNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Social extends js.Object {
  // Forget any tokens/credentials used for logging in with the last used
  // userId.
  def clearCachedCredentials(): stdLib.Promise[scala.Unit] = js.native
  def getClients(): stdLib.Promise[Clients] = js.native
  def getUsers(): stdLib.Promise[Users] = js.native
  def login(loginRequest: LoginRequest): stdLib.Promise[ClientState] = js.native
  // Logs the user out of the social network. After the logout promise, the
  // user status is OFFLINE.
  def logout(): stdLib.Promise[scala.Unit] = js.native
  // Generic Freedom Event stuff. |on| binds an event handler to event type
  // |eventType|. Every time |eventType|  event is raised, the function |f|
  // will be called.
  //
  // Message type |onMessage| happens when the user receives a message from
  // another contact.
  def on(eventType: java.lang.String, f: js.Function): scala.Unit = js.native
  // Message type |onMyStatus| is received when the user's client's status
  // changes, e.g. when disconnected and online status becomes offline.
  @JSName("on")
  def on_onClientState(
    eventType: freedomLib.freedomLibStrings.onClientState,
    f: js.Function1[/* status */ ClientState, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_onMessage(
    eventType: freedomLib.freedomLibStrings.onMessage,
    f: js.Function1[/* message */ IncomingMessage, scala.Unit]
  ): scala.Unit = js.native
  // Message type |onRosterProfile| events are received when another user's
  // profile is received or when a client changes status.
  @JSName("on")
  def on_onUserProfile(
    eventType: freedomLib.freedomLibStrings.onUserProfile,
    f: js.Function1[/* profile */ UserProfile, scala.Unit]
  ): scala.Unit = js.native
  // Do a singleton event binding: |f| will only be called once, on the next
  // event of type |eventType|. Same events as above.
  def once(eventType: java.lang.String, f: js.Function): scala.Unit = js.native
  // Send a message to user on your network
  // If the message is sent to a userId, it is sent to all clients
  // If the message is sent to a clientId, it is sent to just that one client
  // If the destination id is not specified or invalid, promise rejects.
  def sendMessage(destinationId: java.lang.String, message: java.lang.String): stdLib.Promise[scala.Unit] = js.native
}

