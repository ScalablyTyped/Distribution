package typings.gapiDotClientDotGames.gapi.client.games

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGames.Anon_Alt
import typings.gapiDotClientDotGames.Anon_AltConsistencyTokenFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Returns a list showing the current progress on events in this application for the currently authenticated user. */
  def listByPlayer(request: Anon_Alt): Request[PlayerEventListResponse]
  /** Returns a list of the event definitions in this application. */
  def listDefinitions(request: Anon_Alt): Request[EventDefinitionListResponse]
  /** Records a batch of changes to the number of times events have occurred for the currently authenticated user of this application. */
  def record(request: Anon_AltConsistencyTokenFieldsKey): Request[EventUpdateResponse]
}

object EventsResource {
  @scala.inline
  def apply(
    listByPlayer: Anon_Alt => Request[PlayerEventListResponse],
    listDefinitions: Anon_Alt => Request[EventDefinitionListResponse],
    record: Anon_AltConsistencyTokenFieldsKey => Request[EventUpdateResponse]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(listByPlayer = js.Any.fromFunction1(listByPlayer), listDefinitions = js.Any.fromFunction1(listDefinitions), record = js.Any.fromFunction1(record))
  
    __obj.asInstanceOf[EventsResource]
  }
}

