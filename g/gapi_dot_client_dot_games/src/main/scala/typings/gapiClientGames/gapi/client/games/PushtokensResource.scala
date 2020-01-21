package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGames.AnonAltConsistencyTokenFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushtokensResource extends js.Object {
  /** Removes a push token for the current user and application. Removing a non-existent push token will report success. */
  def remove(request: AnonAltConsistencyTokenFields): Request_[Unit]
  /** Registers a push token for the current user and application. */
  def update(request: AnonAltConsistencyTokenFields): Request_[Unit]
}

object PushtokensResource {
  @scala.inline
  def apply(
    remove: AnonAltConsistencyTokenFields => Request_[Unit],
    update: AnonAltConsistencyTokenFields => Request_[Unit]
  ): PushtokensResource = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PushtokensResource]
  }
}

