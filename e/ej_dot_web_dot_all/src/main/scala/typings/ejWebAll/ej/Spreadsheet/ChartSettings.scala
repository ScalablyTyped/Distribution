package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSettings extends js.Object {
  /** Gets or sets a value that defines the chart height in Spreadsheet.
    * @Default {220}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Gets or sets a value that defines the chart width in the Spreadsheet.
    * @Default {440}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ChartSettings {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): ChartSettings = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSettings]
  }
}

