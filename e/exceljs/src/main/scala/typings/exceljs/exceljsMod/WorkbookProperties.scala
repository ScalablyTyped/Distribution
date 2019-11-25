package typings.exceljs.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookProperties extends js.Object {
  /**
  	 * Set workbook dates to 1904 date system
  	 */
  var date1904: Boolean
}

object WorkbookProperties {
  @scala.inline
  def apply(date1904: Boolean): WorkbookProperties = {
    val __obj = js.Dynamic.literal(date1904 = date1904.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkbookProperties]
  }
}

