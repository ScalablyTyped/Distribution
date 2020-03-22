package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushtokensResource extends js.Object {
  /** Removes a push token for the current user and application. Removing a non-existent push token will report success. */
  def remove(request: AnonOauthtoken): Request_[Unit]
  /** Registers a push token for the current user and application. */
  def update(request: AnonOauthtoken): Request_[Unit]
}

object PushtokensResource {
  @scala.inline
  def apply(remove: AnonOauthtoken => Request_[Unit], update: AnonOauthtoken => Request_[Unit]): PushtokensResource = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PushtokensResource]
  }
}

