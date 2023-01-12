package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a column header of a report. */
trait ReportColumnHeader extends StObject {
  
  /** Returns the name of the column header to use in bulk uploads. */
  def getBulkUploadColumnName(): String
  
  /** Returns the name of the column header as used in report queries. */
  def getReportColumnName(): String
}
object ReportColumnHeader {
  
  inline def apply(getBulkUploadColumnName: () => String, getReportColumnName: () => String): ReportColumnHeader = {
    val __obj = js.Dynamic.literal(getBulkUploadColumnName = js.Any.fromFunction0(getBulkUploadColumnName), getReportColumnName = js.Any.fromFunction0(getReportColumnName))
    __obj.asInstanceOf[ReportColumnHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportColumnHeader] (val x: Self) extends AnyVal {
    
    inline def setGetBulkUploadColumnName(value: () => String): Self = StObject.set(x, "getBulkUploadColumnName", js.Any.fromFunction0(value))
    
    inline def setGetReportColumnName(value: () => String): Self = StObject.set(x, "getReportColumnName", js.Any.fromFunction0(value))
  }
}
