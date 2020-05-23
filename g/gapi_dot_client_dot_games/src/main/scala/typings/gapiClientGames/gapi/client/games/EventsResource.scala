package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.Alt
import typings.gapiClientGames.anon.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Returns a list showing the current progress on events in this application for the currently authenticated user. */
  def listByPlayer(request: Alt): Request[PlayerEventListResponse]
  /** Returns a list of the event definitions in this application. */
  def listDefinitions(request: Alt): Request[EventDefinitionListResponse]
  /** Records a batch of changes to the number of times events have occurred for the currently authenticated user of this application. */
  def record(request: Language): Request[EventUpdateResponse]
}

object EventsResource {
  @scala.inline
  def apply(
    listByPlayer: Alt => Request[PlayerEventListResponse],
    listDefinitions: Alt => Request[EventDefinitionListResponse],
    record: Language => Request[EventUpdateResponse]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(listByPlayer = js.Any.fromFunction1(listByPlayer), listDefinitions = js.Any.fromFunction1(listDefinitions), record = js.Any.fromFunction1(record))
    __obj.asInstanceOf[EventsResource]
  }
}

