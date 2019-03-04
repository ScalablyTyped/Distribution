package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Returns a list showing the current progress on events in this application for the currently authenticated user. */
  def listByPlayer(request: gapiDotClientDotGamesLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[PlayerEventListResponse]
  /** Returns a list of the event definitions in this application. */
  def listDefinitions(request: gapiDotClientDotGamesLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[EventDefinitionListResponse]
  /** Records a batch of changes to the number of times events have occurred for the currently authenticated user of this application. */
  def record(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[EventUpdateResponse]
}

object EventsResource {
  @scala.inline
  def apply(
    listByPlayer: js.Function1[
      gapiDotClientDotGamesLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[PlayerEventListResponse]
    ],
    listDefinitions: js.Function1[
      gapiDotClientDotGamesLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[EventDefinitionListResponse]
    ],
    record: js.Function1[
      gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[EventUpdateResponse]
    ]
  ): EventsResource = {
    val __obj = js.Dynamic.literal(listByPlayer = listByPlayer, listDefinitions = listDefinitions, record = record)
  
    __obj.asInstanceOf[EventsResource]
  }
}

