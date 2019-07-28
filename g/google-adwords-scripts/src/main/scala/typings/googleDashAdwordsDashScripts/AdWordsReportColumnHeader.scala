package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsReportColumnHeader extends js.Object {
  def getBulkUploadColumnName(): String
  def getReportColumnName(): String
}

object AdWordsReportColumnHeader {
  @scala.inline
  def apply(getBulkUploadColumnName: () => String, getReportColumnName: () => String): AdWordsReportColumnHeader = {
    val __obj = js.Dynamic.literal(getBulkUploadColumnName = js.Any.fromFunction0(getBulkUploadColumnName), getReportColumnName = js.Any.fromFunction0(getReportColumnName))
  
    __obj.asInstanceOf[AdWordsReportColumnHeader]
  }
}

