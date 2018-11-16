package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateConditionalFormatRuleRequest extends js.Object {
  /** The zero-based index of the rule that should be replaced or moved. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** The zero-based new index the rule should end up at. */
  var newIndex: js.UndefOr[scala.Double] = js.undefined
  /** The rule that should replace the rule at the given index. */
  var rule: js.UndefOr[ConditionalFormatRule] = js.undefined
  /**
               * The sheet of the rule to move.  Required if new_index is set,
               * unused otherwise.
               */
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

