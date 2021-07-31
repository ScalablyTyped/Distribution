package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsReportColumnHeader extends StObject {
  
  def getBulkUploadColumnName(): String
  
  def getReportColumnName(): String
}
object AdWordsReportColumnHeader {
  
  @scala.inline
  def apply(getBulkUploadColumnName: () => String, getReportColumnName: () => String): AdWordsReportColumnHeader = {
    val __obj = js.Dynamic.literal(getBulkUploadColumnName = js.Any.fromFunction0(getBulkUploadColumnName), getReportColumnName = js.Any.fromFunction0(getReportColumnName))
    __obj.asInstanceOf[AdWordsReportColumnHeader]
  }
  
  @scala.inline
  implicit class AdWordsReportColumnHeaderMutableBuilder[Self <: AdWordsReportColumnHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetBulkUploadColumnName(value: () => String): Self = StObject.set(x, "getBulkUploadColumnName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetReportColumnName(value: () => String): Self = StObject.set(x, "getReportColumnName", js.Any.fromFunction0(value))
  }
}
