package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindReplaceRequest extends js.Object {
  var allSheets: js.UndefOr[scala.Boolean] = js.undefined
  var find: js.UndefOr[java.lang.String] = js.undefined
  var includeFormulas: js.UndefOr[scala.Boolean] = js.undefined
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
  var matchEntireCell: js.UndefOr[scala.Boolean] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
  var replacement: js.UndefOr[java.lang.String] = js.undefined
  var searchByRegex: js.UndefOr[scala.Boolean] = js.undefined
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

object FindReplaceRequest {
  @scala.inline
  def apply(
    allSheets: js.UndefOr[scala.Boolean] = js.undefined,
    find: java.lang.String = null,
    includeFormulas: js.UndefOr[scala.Boolean] = js.undefined,
    matchCase: js.UndefOr[scala.Boolean] = js.undefined,
    matchEntireCell: js.UndefOr[scala.Boolean] = js.undefined,
    range: GridRange = null,
    replacement: java.lang.String = null,
    searchByRegex: js.UndefOr[scala.Boolean] = js.undefined,
    sheetId: scala.Int | scala.Double = null
  ): FindReplaceRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allSheets)) __obj.updateDynamic("allSheets")(allSheets)
    if (find != null) __obj.updateDynamic("find")(find)
    if (!js.isUndefined(includeFormulas)) __obj.updateDynamic("includeFormulas")(includeFormulas)
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase)
    if (!js.isUndefined(matchEntireCell)) __obj.updateDynamic("matchEntireCell")(matchEntireCell)
    if (range != null) __obj.updateDynamic("range")(range)
    if (replacement != null) __obj.updateDynamic("replacement")(replacement)
    if (!js.isUndefined(searchByRegex)) __obj.updateDynamic("searchByRegex")(searchByRegex)
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindReplaceRequest]
  }
}

