package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectedRange extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var editors: js.UndefOr[Editors] = js.undefined
  var namedRangeId: js.UndefOr[java.lang.String] = js.undefined
  var protectedRangeId: js.UndefOr[scala.Double] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
  var requestingUserCanEdit: js.UndefOr[scala.Boolean] = js.undefined
  var unprotectedRanges: js.UndefOr[js.Array[GridRange]] = js.undefined
  var warningOnly: js.UndefOr[scala.Boolean] = js.undefined
}

object ProtectedRange {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    editors: Editors = null,
    namedRangeId: java.lang.String = null,
    protectedRangeId: scala.Int | scala.Double = null,
    range: GridRange = null,
    requestingUserCanEdit: js.UndefOr[scala.Boolean] = js.undefined,
    unprotectedRanges: js.Array[GridRange] = null,
    warningOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): ProtectedRange = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (editors != null) __obj.updateDynamic("editors")(editors)
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId)
    if (protectedRangeId != null) __obj.updateDynamic("protectedRangeId")(protectedRangeId.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(requestingUserCanEdit)) __obj.updateDynamic("requestingUserCanEdit")(requestingUserCanEdit)
    if (unprotectedRanges != null) __obj.updateDynamic("unprotectedRanges")(unprotectedRanges)
    if (!js.isUndefined(warningOnly)) __obj.updateDynamic("warningOnly")(warningOnly)
    __obj.asInstanceOf[ProtectedRange]
  }
}

