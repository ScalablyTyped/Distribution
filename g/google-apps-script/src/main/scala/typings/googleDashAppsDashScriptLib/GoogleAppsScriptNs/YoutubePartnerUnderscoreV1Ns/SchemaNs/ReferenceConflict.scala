package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceConflict extends js.Object {
  var conflictingReferenceId: js.UndefOr[java.lang.String] = js.undefined
  var expiryTime: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var matches: js.UndefOr[js.Array[ReferenceConflictMatch]] = js.undefined
  var originalReferenceId: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object ReferenceConflict {
  @scala.inline
  def apply(
    conflictingReferenceId: java.lang.String = null,
    expiryTime: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    matches: js.Array[ReferenceConflictMatch] = null,
    originalReferenceId: java.lang.String = null,
    status: java.lang.String = null
  ): ReferenceConflict = {
    val __obj = js.Dynamic.literal()
    if (conflictingReferenceId != null) __obj.updateDynamic("conflictingReferenceId")(conflictingReferenceId)
    if (expiryTime != null) __obj.updateDynamic("expiryTime")(expiryTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (matches != null) __obj.updateDynamic("matches")(matches)
    if (originalReferenceId != null) __obj.updateDynamic("originalReferenceId")(originalReferenceId)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ReferenceConflict]
  }
}

