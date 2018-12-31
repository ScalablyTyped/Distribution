package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFillSettings extends js.Object {
  /** This property is used to set fillType unit in Spreadsheet. It has five types which are CopyCells, FillSeries, FillFormattingOnly, FillWithoutFormatting and FlashFill.
    * @Default {ej.Spreadsheet.AutoFillOptions.FillSeries}
    */
  var fillType: js.UndefOr[AutoFillOptions | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to enable or disable auto fill options in the Spreadsheet.
    * @Default {true}
    */
  var showFillOptions: js.UndefOr[scala.Boolean] = js.undefined
}

