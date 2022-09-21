package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  id :string | number,   reportType :std.Array<string>,   scope :string,   severity :std.Array<string>,   confidence :std.Array<string>,   pipelineId :string | number} & gitlab.gitlab/dist/types/core/infrastructure.PaginatedRequestOptions */
trait idstringnumberreportTypeA
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var confidence: js.Array[String]
  
  var id: String | Double
  
  var maxPages: js.UndefOr[Double] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var perPage: js.UndefOr[Double] = js.undefined
  
  var pipelineId: String | Double
  
  var reportType: js.Array[String]
  
  var scope: String
  
  var severity: js.Array[String]
  
  var showPagination: js.UndefOr[Boolean] = js.undefined
  
  var sudo: js.UndefOr[String | Double] = js.undefined
}
object idstringnumberreportTypeA {
  
  inline def apply(
    confidence: js.Array[String],
    id: String | Double,
    pipelineId: String | Double,
    reportType: js.Array[String],
    scope: String,
    severity: js.Array[String]
  ): idstringnumberreportTypeA = {
    val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], pipelineId = pipelineId.asInstanceOf[js.Any], reportType = reportType.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[idstringnumberreportTypeA]
  }
  
  extension [Self <: idstringnumberreportTypeA](x: Self) {
    
    inline def setConfidence(value: js.Array[String]): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceVarargs(value: String*): Self = StObject.set(x, "confidence", js.Array(value*))
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMaxPages(value: Double): Self = StObject.set(x, "maxPages", value.asInstanceOf[js.Any])
    
    inline def setMaxPagesUndefined: Self = StObject.set(x, "maxPages", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPerPage(value: Double): Self = StObject.set(x, "perPage", value.asInstanceOf[js.Any])
    
    inline def setPerPageUndefined: Self = StObject.set(x, "perPage", js.undefined)
    
    inline def setPipelineId(value: String | Double): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    inline def setReportType(value: js.Array[String]): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    inline def setReportTypeVarargs(value: String*): Self = StObject.set(x, "reportType", js.Array(value*))
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: js.Array[String]): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityVarargs(value: String*): Self = StObject.set(x, "severity", js.Array(value*))
    
    inline def setShowPagination(value: Boolean): Self = StObject.set(x, "showPagination", value.asInstanceOf[js.Any])
    
    inline def setShowPaginationUndefined: Self = StObject.set(x, "showPagination", js.undefined)
    
    inline def setSudo(value: String | Double): Self = StObject.set(x, "sudo", value.asInstanceOf[js.Any])
    
    inline def setSudoUndefined: Self = StObject.set(x, "sudo", js.undefined)
  }
}
