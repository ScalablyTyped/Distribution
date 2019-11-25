package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindReplaceRequest extends js.Object {
  var allSheets: js.UndefOr[Boolean] = js.undefined
  var find: js.UndefOr[String] = js.undefined
  var includeFormulas: js.UndefOr[Boolean] = js.undefined
  var matchCase: js.UndefOr[Boolean] = js.undefined
  var matchEntireCell: js.UndefOr[Boolean] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
  var replacement: js.UndefOr[String] = js.undefined
  var searchByRegex: js.UndefOr[Boolean] = js.undefined
  var sheetId: js.UndefOr[Double] = js.undefined
}

object FindReplaceRequest {
  @scala.inline
  def apply(
    allSheets: js.UndefOr[Boolean] = js.undefined,
    find: String = null,
    includeFormulas: js.UndefOr[Boolean] = js.undefined,
    matchCase: js.UndefOr[Boolean] = js.undefined,
    matchEntireCell: js.UndefOr[Boolean] = js.undefined,
    range: GridRange = null,
    replacement: String = null,
    searchByRegex: js.UndefOr[Boolean] = js.undefined,
    sheetId: Int | Double = null
  ): FindReplaceRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allSheets)) __obj.updateDynamic("allSheets")(allSheets.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(find.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFormulas)) __obj.updateDynamic("includeFormulas")(includeFormulas.asInstanceOf[js.Any])
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.asInstanceOf[js.Any])
    if (!js.isUndefined(matchEntireCell)) __obj.updateDynamic("matchEntireCell")(matchEntireCell.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    if (!js.isUndefined(searchByRegex)) __obj.updateDynamic("searchByRegex")(searchByRegex.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindReplaceRequest]
  }
}

