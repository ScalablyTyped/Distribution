package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetProperties extends js.Object {
  /** The amount of time to wait before volatile functions are recalculated. */
  var autoRecalc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The default format of all cells in the spreadsheet.
    * CellData.effectiveFormat will not be set if the
    * cell's format is equal to this default format.
    * This field is read-only.
    */
  var defaultFormat: js.UndefOr[CellFormat] = js.undefined
  /**
    * Determines whether and how circular references are resolved with iterative
    * calculation.  Absence of this field means that circular references will
    * result in calculation errors.
    */
  var iterativeCalculationSettings: js.UndefOr[IterativeCalculationSettings] = js.undefined
  /**
    * The locale of the spreadsheet in one of the following formats:
    *
    * &#42; an ISO 639-1 language code such as `en`
    *
    * &#42; an ISO 639-2 language code such as `fil`, if no 639-1 code exists
    *
    * &#42; a combination of the ISO language code and country code, such as `en_US`
    *
    * Note: when updating this field, not all locales/languages are supported.
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time zone of the spreadsheet, in CLDR format such as
    * `America/New_York`. If the time zone isn't recognized, this may
    * be a custom time zone such as `GMT-07:00`.
    */
  var timeZone: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the spreadsheet. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

