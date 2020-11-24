package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdWordsReportColumnHeader extends js.Object {
  
  def getBulkUploadColumnName(): String = js.native
  
  def getReportColumnName(): String = js.native
}
object AdWordsReportColumnHeader {
  
  @scala.inline
  def apply(getBulkUploadColumnName: () => String, getReportColumnName: () => String): AdWordsReportColumnHeader = {
    val __obj = js.Dynamic.literal(getBulkUploadColumnName = js.Any.fromFunction0(getBulkUploadColumnName), getReportColumnName = js.Any.fromFunction0(getReportColumnName))
    __obj.asInstanceOf[AdWordsReportColumnHeader]
  }
  
  @scala.inline
  implicit class AdWordsReportColumnHeaderOps[Self <: AdWordsReportColumnHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetBulkUploadColumnName(value: () => String): Self = this.set("getBulkUploadColumnName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReportColumnName(value: () => String): Self = this.set("getReportColumnName", js.Any.fromFunction0(value))
  }
}
