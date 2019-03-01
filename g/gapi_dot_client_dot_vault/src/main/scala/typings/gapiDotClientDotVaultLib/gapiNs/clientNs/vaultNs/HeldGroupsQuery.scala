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

object HeldGroupsQuery {
  @scala.inline
  def apply(
    endTime: java.lang.String = null,
    startTime: java.lang.String = null,
    terms: java.lang.String = null
  ): HeldGroupsQuery = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (terms != null) __obj.updateDynamic("terms")(terms)
    __obj.asInstanceOf[HeldGroupsQuery]
  }
}

