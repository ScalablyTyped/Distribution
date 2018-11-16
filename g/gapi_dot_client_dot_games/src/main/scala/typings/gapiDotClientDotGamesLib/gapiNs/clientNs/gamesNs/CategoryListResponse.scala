package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CategoryListResponse extends js.Object {
  /** The list of categories with usage data. */
  var items: js.UndefOr[js.Array[Category]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#categoryListResponse. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token corresponding to the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

