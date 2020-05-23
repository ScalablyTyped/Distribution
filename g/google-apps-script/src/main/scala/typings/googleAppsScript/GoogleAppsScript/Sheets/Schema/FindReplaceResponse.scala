package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindReplaceResponse extends js.Object {
  var formulasChanged: js.UndefOr[Double] = js.undefined
  var occurrencesChanged: js.UndefOr[Double] = js.undefined
  var rowsChanged: js.UndefOr[Double] = js.undefined
  var sheetsChanged: js.UndefOr[Double] = js.undefined
  var valuesChanged: js.UndefOr[Double] = js.undefined
}

object FindReplaceResponse {
  @scala.inline
  def apply(
    formulasChanged: js.UndefOr[Double] = js.undefined,
    occurrencesChanged: js.UndefOr[Double] = js.undefined,
    rowsChanged: js.UndefOr[Double] = js.undefined,
    sheetsChanged: js.UndefOr[Double] = js.undefined,
    valuesChanged: js.UndefOr[Double] = js.undefined
  ): FindReplaceResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(formulasChanged)) __obj.updateDynamic("formulasChanged")(formulasChanged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(occurrencesChanged)) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowsChanged)) __obj.updateDynamic("rowsChanged")(rowsChanged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetsChanged)) __obj.updateDynamic("sheetsChanged")(sheetsChanged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(valuesChanged)) __obj.updateDynamic("valuesChanged")(valuesChanged.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindReplaceResponse]
  }
}

