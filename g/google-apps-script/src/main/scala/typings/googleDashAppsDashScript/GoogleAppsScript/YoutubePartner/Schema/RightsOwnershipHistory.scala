package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightsOwnershipHistory extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var origination: js.UndefOr[Origination] = js.undefined
  var ownership: js.UndefOr[RightsOwnership] = js.undefined
  var timeProvided: js.UndefOr[String] = js.undefined
}

object RightsOwnershipHistory {
  @scala.inline
  def apply(
    kind: String = null,
    origination: Origination = null,
    ownership: RightsOwnership = null,
    timeProvided: String = null
  ): RightsOwnershipHistory = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (origination != null) __obj.updateDynamic("origination")(origination.asInstanceOf[js.Any])
    if (ownership != null) __obj.updateDynamic("ownership")(ownership.asInstanceOf[js.Any])
    if (timeProvided != null) __obj.updateDynamic("timeProvided")(timeProvided.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightsOwnershipHistory]
  }
}

