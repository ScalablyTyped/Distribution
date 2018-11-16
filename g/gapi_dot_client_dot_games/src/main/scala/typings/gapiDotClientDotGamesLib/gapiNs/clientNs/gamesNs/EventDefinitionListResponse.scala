package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EventDefinitionListResponse extends js.Object {
  /** The event definitions. */
  var items: js.UndefOr[js.Array[EventDefinition]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventDefinitionListResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

