package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlayerListResponse extends js.Object {
  /** The players. */
  var items: js.UndefOr[js.Array[Player]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerListResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

