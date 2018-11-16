package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PivotValue extends js.Object {
  /**
               * A custom formula to calculate the value.  The formula must start
               * with an `=` character.
               */
  var formula: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A name to use for the value. This is only used if formula was set.
               * Otherwise, the column name is used.
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The column offset of the source range that this value reads from.
               *
               * For example, if the source was `C10:E15`, a `sourceColumnOffset` of `0`
               * means this value refers to column `C`, whereas the offset `1` would
               * refer to column `D`.
               */
  var sourceColumnOffset: js.UndefOr[scala.Double] = js.undefined
  /**
               * A function to summarize the value.
               * If formula is set, the only supported values are
               * SUM and
               * CUSTOM.
               * If sourceColumnOffset is set, then `CUSTOM`
               * is not supported.
               */
  var summarizeFunction: js.UndefOr[java.lang.String] = js.undefined
}

