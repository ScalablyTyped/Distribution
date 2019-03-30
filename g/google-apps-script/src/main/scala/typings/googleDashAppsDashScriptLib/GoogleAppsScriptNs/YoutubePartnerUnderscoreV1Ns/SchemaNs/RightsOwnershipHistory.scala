package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightsOwnershipHistory extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var origination: js.UndefOr[Origination] = js.undefined
  var ownership: js.UndefOr[RightsOwnership] = js.undefined
  var timeProvided: js.UndefOr[java.lang.String] = js.undefined
}

object RightsOwnershipHistory {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    origination: Origination = null,
    ownership: RightsOwnership = null,
    timeProvided: java.lang.String = null
  ): RightsOwnershipHistory = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (origination != null) __obj.updateDynamic("origination")(origination)
    if (ownership != null) __obj.updateDynamic("ownership")(ownership)
    if (timeProvided != null) __obj.updateDynamic("timeProvided")(timeProvided)
    __obj.asInstanceOf[RightsOwnershipHistory]
  }
}

