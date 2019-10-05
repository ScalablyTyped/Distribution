package typings.ejDotWebDotAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintSettings extends js.Object {
  /** Gets or sets a value that indicates whether to enable or disable page setup support for printing in Spreadsheet.
    * @Default {true}
    */
  var allowPageSetup: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable page size support for printing in Spreadsheet.
    * @Default {false}
    */
  var allowPageSize: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable print feature in the Spreadsheet.
    * @Default {true}
    */
  var allowPrinting: js.UndefOr[Boolean] = js.undefined
}

object PrintSettings {
  @scala.inline
  def apply(
    allowPageSetup: js.UndefOr[Boolean] = js.undefined,
    allowPageSize: js.UndefOr[Boolean] = js.undefined,
    allowPrinting: js.UndefOr[Boolean] = js.undefined
  ): PrintSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPageSetup)) __obj.updateDynamic("allowPageSetup")(allowPageSetup)
    if (!js.isUndefined(allowPageSize)) __obj.updateDynamic("allowPageSize")(allowPageSize)
    if (!js.isUndefined(allowPrinting)) __obj.updateDynamic("allowPrinting")(allowPrinting)
    __obj.asInstanceOf[PrintSettings]
  }
}

