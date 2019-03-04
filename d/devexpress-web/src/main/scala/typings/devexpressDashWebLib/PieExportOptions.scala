package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the Pie dashboard item is exported.
  */
trait PieExportOptions extends js.Object {
  /**
    * Gets or sets whether dashboard item elements are arranged automatically on the exported page.
    * Value: true, to arrange dashboard item elements automatically on the exported page; otherwise, false.
    */
  var AutoArrangeContent: scala.Boolean
}

object PieExportOptions {
  @scala.inline
  def apply(AutoArrangeContent: scala.Boolean): PieExportOptions = {
    val __obj = js.Dynamic.literal(AutoArrangeContent = AutoArrangeContent)
  
    __obj.asInstanceOf[PieExportOptions]
  }
}

