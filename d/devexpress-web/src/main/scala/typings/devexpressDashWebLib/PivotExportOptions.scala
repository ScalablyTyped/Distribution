package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Pivot dashboard item is exported.
  */
trait PivotExportOptions extends js.Object {
  /**
    * Gets or sets whether to print the column headers of the Pivot dashboard item on every page.
    * Value: true, to print column headers on every page; otherwise, false.
    */
  var PrintHeadersOnEveryPage: scala.Boolean
}

object PivotExportOptions {
  @scala.inline
  def apply(PrintHeadersOnEveryPage: scala.Boolean): PivotExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PrintHeadersOnEveryPage")(PrintHeadersOnEveryPage)
    __obj.asInstanceOf[PivotExportOptions]
  }
}

