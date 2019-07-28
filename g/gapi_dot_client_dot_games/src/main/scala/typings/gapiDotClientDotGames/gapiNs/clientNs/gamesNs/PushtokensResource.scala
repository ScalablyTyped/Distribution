package typings.gapiDotClientDotGames.gapiNs.clientNs.gamesNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushtokensResource extends js.Object {
  /** Removes a push token for the current user and application. Removing a non-existent push token will report success. */
  def remove(request: Anon_AltConsistencyTokenFields): Request[Unit]
  /** Registers a push token for the current user and application. */
  def update(request: Anon_AltConsistencyTokenFields): Request[Unit]
}

object PushtokensResource {
  @scala.inline
  def apply(
    remove: Anon_AltConsistencyTokenFields => Request[Unit],
    update: Anon_AltConsistencyTokenFields => Request[Unit]
  ): PushtokensResource = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PushtokensResource]
  }
}

