package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Grid dashboard item is exported.
  */
trait GridExportOptions extends js.Object {
  /**
    * Gets or sets whether the size of the Grid dashboard item is changed according to the width of the exported page.
    * Value: true, to change the size of the Grid dashboard item according to the width of the exported page; otherwise, false.
    */
  var FitToPageWidth: scala.Boolean
  /**
    * Gets or sets whether to print column headers of the Grid dashboard item on every page.
    * Value: true, to print column headers on every page; otherwise, false.
    */
  var PrintHeadersOnEveryPage: scala.Boolean
}

object GridExportOptions {
  @scala.inline
  def apply(FitToPageWidth: scala.Boolean, PrintHeadersOnEveryPage: scala.Boolean): GridExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FitToPageWidth")(FitToPageWidth)
    __obj.updateDynamic("PrintHeadersOnEveryPage")(PrintHeadersOnEveryPage)
    __obj.asInstanceOf[GridExportOptions]
  }
}

