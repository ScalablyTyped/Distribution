package typings
package gapiDotClientDotPlaymoviespartnerLib.gapiNs.clientNs.playmoviespartnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListOrdersResponse extends js.Object {
  /** See _List methods rules_ for info about this field. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** List of Orders that match the request criteria. */
  var orders: js.UndefOr[js.Array[Order]] = js.undefined
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[scala.Double] = js.undefined
}

