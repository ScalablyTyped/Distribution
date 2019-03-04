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
  def apply(
    getBulkUploadColumnName: js.Function0[java.lang.String],
    getReportColumnName: js.Function0[java.lang.String]
  ): AdWordsReportColumnHeader = {
    val __obj = js.Dynamic.literal(getBulkUploadColumnName = getBulkUploadColumnName, getReportColumnName = getReportColumnName)
  
    __obj.asInstanceOf[AdWordsReportColumnHeader]
  }
}

