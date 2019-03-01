package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionSettings extends js.Object {
  /** Gets or sets a value that indicates to define active cell in spreadsheet.
    */
  var activeCell: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to define animation time while selection in the Spreadsheet.
    * @Default {0.001}
    */
  var animationTime: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates to enable or disable animation while selection.
    * @Default {false}
    */
  var enableAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to set selection type in Spreadsheet. It has three types which are Column, Row and Default.
    * @Default {ej.Spreadsheet.SelectionType.Default}
    */
  var selectionType: js.UndefOr[SelectionType | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to set selection unit in Spreadsheet. It has three types which are Single, Range and MultiRange.
    * @Default {ej.Spreadsheet.SelectionUnit.MultiRange}
    */
  var selectionUnit: js.UndefOr[SelectionUnit | java.lang.String] = js.undefined
}

object SelectionSettings {
  @scala.inline
  def apply(
    activeCell: java.lang.String = null,
    animationTime: scala.Int | scala.Double = null,
    enableAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    selectionType: SelectionType | java.lang.String = null,
    selectionUnit: SelectionUnit | java.lang.String = null
  ): SelectionSettings = {
    val __obj = js.Dynamic.literal()
    if (activeCell != null) __obj.updateDynamic("activeCell")(activeCell)
    if (animationTime != null) __obj.updateDynamic("animationTime")(animationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation)
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (selectionUnit != null) __obj.updateDynamic("selectionUnit")(selectionUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionSettings]
  }
}

