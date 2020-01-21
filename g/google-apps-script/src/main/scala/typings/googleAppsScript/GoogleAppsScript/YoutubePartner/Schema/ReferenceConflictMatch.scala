package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceConflictMatch extends js.Object {
  var conflicting_reference_offset_ms: js.UndefOr[String] = js.undefined
  var length_ms: js.UndefOr[String] = js.undefined
  var original_reference_offset_ms: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ReferenceConflictMatch {
  @scala.inline
  def apply(
    conflicting_reference_offset_ms: String = null,
    length_ms: String = null,
    original_reference_offset_ms: String = null,
    `type`: String = null
  ): ReferenceConflictMatch = {
    val __obj = js.Dynamic.literal()
    if (conflicting_reference_offset_ms != null) __obj.updateDynamic("conflicting_reference_offset_ms")(conflicting_reference_offset_ms.asInstanceOf[js.Any])
    if (length_ms != null) __obj.updateDynamic("length_ms")(length_ms.asInstanceOf[js.Any])
    if (original_reference_offset_ms != null) __obj.updateDynamic("original_reference_offset_ms")(original_reference_offset_ms.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceConflictMatch]
  }
}

