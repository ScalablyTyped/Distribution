package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceConflictMatch extends js.Object {
  var conflicting_reference_offset_ms: js.UndefOr[java.lang.String] = js.undefined
  var length_ms: js.UndefOr[java.lang.String] = js.undefined
  var original_reference_offset_ms: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ReferenceConflictMatch {
  @scala.inline
  def apply(
    conflicting_reference_offset_ms: java.lang.String = null,
    length_ms: java.lang.String = null,
    original_reference_offset_ms: java.lang.String = null,
    `type`: java.lang.String = null
  ): ReferenceConflictMatch = {
    val __obj = js.Dynamic.literal()
    if (conflicting_reference_offset_ms != null) __obj.updateDynamic("conflicting_reference_offset_ms")(conflicting_reference_offset_ms)
    if (length_ms != null) __obj.updateDynamic("length_ms")(length_ms)
    if (original_reference_offset_ms != null) __obj.updateDynamic("original_reference_offset_ms")(original_reference_offset_ms)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReferenceConflictMatch]
  }
}

