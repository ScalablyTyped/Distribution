package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectedRange extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var editors: js.UndefOr[Editors] = js.undefined
  var namedRangeId: js.UndefOr[String] = js.undefined
  var protectedRangeId: js.UndefOr[Double] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
  var requestingUserCanEdit: js.UndefOr[Boolean] = js.undefined
  var unprotectedRanges: js.UndefOr[js.Array[GridRange]] = js.undefined
  var warningOnly: js.UndefOr[Boolean] = js.undefined
}

object ProtectedRange {
  @scala.inline
  def apply(
    description: String = null,
    editors: Editors = null,
    namedRangeId: String = null,
    protectedRangeId: js.UndefOr[Double] = js.undefined,
    range: GridRange = null,
    requestingUserCanEdit: js.UndefOr[Boolean] = js.undefined,
    unprotectedRanges: js.Array[GridRange] = null,
    warningOnly: js.UndefOr[Boolean] = js.undefined
  ): ProtectedRange = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (editors != null) __obj.updateDynamic("editors")(editors.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    if (!js.isUndefined(protectedRangeId)) __obj.updateDynamic("protectedRangeId")(protectedRangeId.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(requestingUserCanEdit)) __obj.updateDynamic("requestingUserCanEdit")(requestingUserCanEdit.get.asInstanceOf[js.Any])
    if (unprotectedRanges != null) __obj.updateDynamic("unprotectedRanges")(unprotectedRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(warningOnly)) __obj.updateDynamic("warningOnly")(warningOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedRange]
  }
}

