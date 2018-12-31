package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHoldsResponse extends js.Object {
  /** The list of holds. */
  var holds: js.UndefOr[js.Array[Hold]] = js.undefined
  /**
    * Page token to retrieve the next page of results in the list.
    * If this is empty, then there are no more holds to list.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

