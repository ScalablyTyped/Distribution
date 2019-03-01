package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindReplaceResponse extends js.Object {
  /** The number of formula cells changed. */
  var formulasChanged: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of occurrences (possibly multiple within a cell) changed.
    * For example, if replacing `"e"` with `"o"` in `"Google Sheets"`, this would
    * be `"3"` because `"Google Sheets"` -> `"Googlo Shoots"`.
    */
  var occurrencesChanged: js.UndefOr[scala.Double] = js.undefined
  /** The number of rows changed. */
  var rowsChanged: js.UndefOr[scala.Double] = js.undefined
  /** The number of sheets changed. */
  var sheetsChanged: js.UndefOr[scala.Double] = js.undefined
  /** The number of non-formula cells changed. */
  var valuesChanged: js.UndefOr[scala.Double] = js.undefined
}

object FindReplaceResponse {
  @scala.inline
  def apply(
    formulasChanged: scala.Int | scala.Double = null,
    occurrencesChanged: scala.Int | scala.Double = null,
    rowsChanged: scala.Int | scala.Double = null,
    sheetsChanged: scala.Int | scala.Double = null,
    valuesChanged: scala.Int | scala.Double = null
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

