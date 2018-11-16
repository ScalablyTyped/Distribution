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

