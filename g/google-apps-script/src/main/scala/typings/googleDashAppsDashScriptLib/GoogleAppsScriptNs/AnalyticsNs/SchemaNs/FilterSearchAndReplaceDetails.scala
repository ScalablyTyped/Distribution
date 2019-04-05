package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSearchAndReplaceDetails extends js.Object {
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var fieldIndex: js.UndefOr[scala.Double] = js.undefined
  var replaceString: js.UndefOr[java.lang.String] = js.undefined
  var searchString: js.UndefOr[java.lang.String] = js.undefined
}

object FilterSearchAndReplaceDetails {
  @scala.inline
  def apply(
    caseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    fieldIndex: scala.Int | scala.Double = null,
    replaceString: java.lang.String = null,
    searchString: java.lang.String = null
  ): FilterSearchAndReplaceDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive)
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldIndex != null) __obj.updateDynamic("fieldIndex")(fieldIndex.asInstanceOf[js.Any])
    if (replaceString != null) __obj.updateDynamic("replaceString")(replaceString)
    if (searchString != null) __obj.updateDynamic("searchString")(searchString)
    __obj.asInstanceOf[FilterSearchAndReplaceDetails]
  }
}

