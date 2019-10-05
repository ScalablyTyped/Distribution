package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimEvent extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[ClaimEventSource] = js.undefined
  var time: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var typeDetails: js.UndefOr[ClaimEventTypeDetails] = js.undefined
}

object ClaimEvent {
  @scala.inline
  def apply(
    kind: String = null,
    reason: String = null,
    source: ClaimEventSource = null,
    time: String = null,
    `type`: String = null,
    typeDetails: ClaimEventTypeDetails = null
  ): ClaimEvent = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (source != null) __obj.updateDynamic("source")(source)
    if (time != null) __obj.updateDynamic("time")(time)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeDetails != null) __obj.updateDynamic("typeDetails")(typeDetails)
    __obj.asInstanceOf[ClaimEvent]
  }
}

