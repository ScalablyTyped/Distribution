package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeDetails != null) __obj.updateDynamic("typeDetails")(typeDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimEvent]
  }
}

