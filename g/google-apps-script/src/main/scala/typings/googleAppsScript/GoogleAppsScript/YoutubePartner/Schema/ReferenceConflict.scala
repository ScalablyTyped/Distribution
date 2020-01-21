package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceConflict extends js.Object {
  var conflictingReferenceId: js.UndefOr[String] = js.undefined
  var expiryTime: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var matches: js.UndefOr[js.Array[ReferenceConflictMatch]] = js.undefined
  var originalReferenceId: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object ReferenceConflict {
  @scala.inline
  def apply(
    conflictingReferenceId: String = null,
    expiryTime: String = null,
    id: String = null,
    kind: String = null,
    matches: js.Array[ReferenceConflictMatch] = null,
    originalReferenceId: String = null,
    status: String = null
  ): ReferenceConflict = {
    val __obj = js.Dynamic.literal()
    if (conflictingReferenceId != null) __obj.updateDynamic("conflictingReferenceId")(conflictingReferenceId.asInstanceOf[js.Any])
    if (expiryTime != null) __obj.updateDynamic("expiryTime")(expiryTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (matches != null) __obj.updateDynamic("matches")(matches.asInstanceOf[js.Any])
    if (originalReferenceId != null) __obj.updateDynamic("originalReferenceId")(originalReferenceId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceConflict]
  }
}

