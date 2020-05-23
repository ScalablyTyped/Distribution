package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindReplaceRequest extends js.Object {
  /** True to find/replace over all sheets. */
  var allSheets: js.UndefOr[Boolean] = js.undefined
  /** The value to search. */
  var find: js.UndefOr[String] = js.undefined
  /**
    * True if the search should include cells with formulas.
    * False to skip cells with formulas.
    */
  var includeFormulas: js.UndefOr[Boolean] = js.undefined
  /** True if the search is case sensitive. */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  /** True if the find value should match the entire cell. */
  var matchEntireCell: js.UndefOr[Boolean] = js.undefined
  /** The range to find/replace over. */
  var range: js.UndefOr[GridRange] = js.undefined
  /** The value to use as the replacement. */
  var replacement: js.UndefOr[String] = js.undefined
  /**
    * True if the find value is a regex.
    * The regular expression and replacement should follow Java regex rules
    * at https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html.
    * The replacement string is allowed to refer to capturing groups.
    * For example, if one cell has the contents `"Google Sheets"` and another
    * has `"Google Docs"`, then searching for `"o.&#42; (.&#42;)"` with a replacement of
    * `"$1 Rocks"` would change the contents of the cells to
    * `"GSheets Rocks"` and `"GDocs Rocks"` respectively.
    */
  var searchByRegex: js.UndefOr[Boolean] = js.undefined
  /** The sheet to find/replace over. */
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
    sheetId: js.UndefOr[Double] = js.undefined
  ): FindReplaceRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allSheets)) __obj.updateDynamic("allSheets")(allSheets.get.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(find.asInstanceOf[js.Any])
    if (!js.isUndefined(includeFormulas)) __obj.updateDynamic("includeFormulas")(includeFormulas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchCase)) __obj.updateDynamic("matchCase")(matchCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchEntireCell)) __obj.updateDynamic("matchEntireCell")(matchEntireCell.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (replacement != null) __obj.updateDynamic("replacement")(replacement.asInstanceOf[js.Any])
    if (!js.isUndefined(searchByRegex)) __obj.updateDynamic("searchByRegex")(searchByRegex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindReplaceRequest]
  }
}

