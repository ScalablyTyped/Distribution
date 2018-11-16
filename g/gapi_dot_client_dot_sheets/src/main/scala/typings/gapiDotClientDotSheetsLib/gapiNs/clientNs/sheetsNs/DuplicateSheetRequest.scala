package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DuplicateSheetRequest extends js.Object {
  /**
               * The zero-based index where the new sheet should be inserted.
               * The index of all sheets after this are incremented.
               */
  var insertSheetIndex: js.UndefOr[scala.Double] = js.undefined
  /**
               * If set, the ID of the new sheet. If not set, an ID is chosen.
               * If set, the ID must not conflict with any existing sheet ID.
               * If set, it must be non-negative.
               */
  var newSheetId: js.UndefOr[scala.Double] = js.undefined
  /** The name of the new sheet.  If empty, a new name is chosen for you. */
  var newSheetName: js.UndefOr[java.lang.String] = js.undefined
  /** The sheet to duplicate. */
  var sourceSheetId: js.UndefOr[scala.Double] = js.undefined
}

