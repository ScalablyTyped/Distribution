package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SheetsNs.SchemaNs

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
    formulasChanged: Int | Double = null,
    occurrencesChanged: Int | Double = null,
    rowsChanged: Int | Double = null,
    sheetsChanged: Int | Double = null,
    valuesChanged: Int | Double = null
  ): FindReplaceResponse = {
    val __obj = js.Dynamic.literal()
    if (formulasChanged != null) __obj.updateDynamic("formulasChanged")(formulasChanged.asInstanceOf[js.Any])
    if (occurrencesChanged != null) __obj.updateDynamic("occurrencesChanged")(occurrencesChanged.asInstanceOf[js.Any])
    if (rowsChanged != null) __obj.updateDynamic("rowsChanged")(rowsChanged.asInstanceOf[js.Any])
    if (sheetsChanged != null) __obj.updateDynamic("sheetsChanged")(sheetsChanged.asInstanceOf[js.Any])
    if (valuesChanged != null) __obj.updateDynamic("valuesChanged")(valuesChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindReplaceResponse]
  }
}

