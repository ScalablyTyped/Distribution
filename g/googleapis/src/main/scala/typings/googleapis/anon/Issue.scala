package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Issue extends StObject {
  
  var issue: js.UndefOr[js.Array[IssueDisplayNumber]] = js.undefined
  
  var orderNumber: js.UndefOr[Double] = js.undefined
  
  var seriesBookType: js.UndefOr[String] = js.undefined
  
  var seriesId: js.UndefOr[String] = js.undefined
}
object Issue {
  
  inline def apply(): Issue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Issue]
  }
  
  extension [Self <: Issue](x: Self) {
    
    inline def setIssue(value: js.Array[IssueDisplayNumber]): Self = StObject.set(x, "issue", value.asInstanceOf[js.Any])
    
    inline def setIssueUndefined: Self = StObject.set(x, "issue", js.undefined)
    
    inline def setIssueVarargs(value: IssueDisplayNumber*): Self = StObject.set(x, "issue", js.Array(value :_*))
    
    inline def setOrderNumber(value: Double): Self = StObject.set(x, "orderNumber", value.asInstanceOf[js.Any])
    
    inline def setOrderNumberUndefined: Self = StObject.set(x, "orderNumber", js.undefined)
    
    inline def setSeriesBookType(value: String): Self = StObject.set(x, "seriesBookType", value.asInstanceOf[js.Any])
    
    inline def setSeriesBookTypeUndefined: Self = StObject.set(x, "seriesBookType", js.undefined)
    
    inline def setSeriesId(value: String): Self = StObject.set(x, "seriesId", value.asInstanceOf[js.Any])
    
    inline def setSeriesIdUndefined: Self = StObject.set(x, "seriesId", js.undefined)
  }
}
