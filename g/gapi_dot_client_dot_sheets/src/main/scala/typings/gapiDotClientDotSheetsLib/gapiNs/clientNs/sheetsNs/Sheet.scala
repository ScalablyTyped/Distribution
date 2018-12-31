package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet extends js.Object {
  /** The banded (i.e. alternating colors) ranges on this sheet. */
  var bandedRanges: js.UndefOr[js.Array[BandedRange]] = js.undefined
  /** The filter on this sheet, if any. */
  var basicFilter: js.UndefOr[BasicFilter] = js.undefined
  /** The specifications of every chart on this sheet. */
  var charts: js.UndefOr[js.Array[EmbeddedChart]] = js.undefined
  /** The conditional format rules in this sheet. */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatRule]] = js.undefined
  /**
    * Data in the grid, if this is a grid sheet.
    * The number of GridData objects returned is dependent on the number of
    * ranges requested on this sheet. For example, if this is representing
    * `Sheet1`, and the spreadsheet was requested with ranges
    * `Sheet1!A1:C10` and `Sheet1!D15:E20`, then the first GridData will have a
    * startRow/startColumn of `0`,
    * while the second one will have `startRow 14` (zero-based row 15),
    * and `startColumn 3` (zero-based column D).
    */
  var data: js.UndefOr[js.Array[GridData]] = js.undefined
  /** The developer metadata associated with a sheet. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  /** The filter views in this sheet. */
  var filterViews: js.UndefOr[js.Array[FilterView]] = js.undefined
  /** The ranges that are merged together. */
  var merges: js.UndefOr[js.Array[GridRange]] = js.undefined
  /** The properties of the sheet. */
  var properties: js.UndefOr[SheetProperties] = js.undefined
  /** The protected ranges in this sheet. */
  var protectedRanges: js.UndefOr[js.Array[ProtectedRange]] = js.undefined
}

