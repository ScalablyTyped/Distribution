package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsReportColumnHeader extends StObject {
  
  def getBulkUploadColumnName(): String
  
  def getReportColumnName(): String
}
object AdWordsReportColumnHeader {
  
  inline def apply(getBulkUploadColumnName: () => String, getReportColumnName: () => String): AdWordsReportColumnHeader = {
    val __obj = js.Dynamic.literal(getBulkUploadColumnName = js.Any.fromFunction0(getBulkUploadColumnName), getReportColumnName = js.Any.fromFunction0(getReportColumnName))
    __obj.asInstanceOf[AdWordsReportColumnHeader]
  }
  
  extension [Self <: AdWordsReportColumnHeader](x: Self) {
    
    inline def setGetBulkUploadColumnName(value: () => String): Self = StObject.set(x, "getBulkUploadColumnName", js.Any.fromFunction0(value))
    
    inline def setGetReportColumnName(value: () => String): Self = StObject.set(x, "getReportColumnName", js.Any.fromFunction0(value))
  }
}
