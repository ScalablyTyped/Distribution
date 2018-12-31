package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeldGroupsQuery extends js.Object {
  /**
    * The end date range for the search query. These timestamps are in GMT and
    * rounded down to the start of the given date.
    */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The start date range for the search query. These timestamps are in GMT and
    * rounded down to the start of the given date.
    */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** The search terms for the hold. */
  var terms: js.UndefOr[java.lang.String] = js.undefined
}

