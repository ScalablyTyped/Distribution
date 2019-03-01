package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /** Action that the filter performs. */
  var action: js.UndefOr[FilterAction] = js.undefined
  /** Matching criteria for the filter. */
  var criteria: js.UndefOr[FilterCriteria] = js.undefined
  /** The server assigned ID of the filter. */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object Filter {
  @scala.inline
  def apply(action: FilterAction = null, criteria: FilterCriteria = null, id: java.lang.String = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Filter]
  }
}

