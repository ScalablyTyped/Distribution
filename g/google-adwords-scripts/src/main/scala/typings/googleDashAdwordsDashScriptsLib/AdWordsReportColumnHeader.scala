package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsReportColumnHeader extends js.Object {
  def getBulkUploadColumnName(): java.lang.String
  def getReportColumnName(): java.lang.String
}

object AdWordsReportColumnHeader {
  @scala.inline
  def apply(getBulkUploadColumnName: () => java.lang.String, getReportColumnName: () => java.lang.String): AdWordsReportColumnHeader = {
    val __obj = js.Dynamic.literal(getBulkUploadColumnName = js.Any.fromFunction0(getBulkUploadColumnName), getReportColumnName = js.Any.fromFunction0(getReportColumnName))
  
    __obj.asInstanceOf[AdWordsReportColumnHeader]
  }
}

