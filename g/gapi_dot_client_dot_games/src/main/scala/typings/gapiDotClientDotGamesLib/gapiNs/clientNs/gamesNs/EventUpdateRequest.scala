package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventUpdateRequest extends js.Object {
  /** The ID of the event being modified in this update. */
  var definitionId: js.UndefOr[java.lang.String] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventUpdateRequest. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The number of times this event occurred in this time period. */
  var updateCount: js.UndefOr[java.lang.String] = js.undefined
}

