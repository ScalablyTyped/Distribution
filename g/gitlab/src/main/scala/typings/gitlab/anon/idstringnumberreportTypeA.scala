package typings.gitlab.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  id :string | number,   reportType :std.Array<string>,   scope :string,   severity :std.Array<string>,   confidence :std.Array<string>,   pipelineId :string | number} & gitlab.gitlab/dist/types/core/infrastructure.PaginatedRequestOptions */
@js.native
trait idstringnumberreportTypeA
  extends /* key */ StringDictionary[js.Any] {
  
  var confidence: js.Array[String] = js.native
  
  var id: String | Double = js.native
  
  var maxPages: js.UndefOr[Double] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var perPage: js.UndefOr[Double] = js.native
  
  var pipelineId: String | Double = js.native
  
  var reportType: js.Array[String] = js.native
  
  var scope: String = js.native
  
  var severity: js.Array[String] = js.native
  
  var showPagination: js.UndefOr[Boolean] = js.native
  
  var sudo: js.UndefOr[String | Double] = js.native
}
object idstringnumberreportTypeA {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class idstringnumberreportTypeAOps[Self <: idstringnumberreportTypeA] (val x: Self) extends AnyVal {
    
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
    def setConfidenceVarargs(value: String*): Self = this.set("confidence", js.Array(value :_*))
    
    @scala.inline
    def setConfidence(value: js.Array[String]): Self = this.set("confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineId(value: String | Double): Self = this.set("pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportTypeVarargs(value: String*): Self = this.set("reportType", js.Array(value :_*))
    
    @scala.inline
    def setReportType(value: js.Array[String]): Self = this.set("reportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityVarargs(value: String*): Self = this.set("severity", js.Array(value :_*))
    
    @scala.inline
    def setSeverity(value: js.Array[String]): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPages(value: Double): Self = this.set("maxPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPages: Self = this.set("maxPages", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPerPage(value: Double): Self = this.set("perPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerPage: Self = this.set("perPage", js.undefined)
    
    @scala.inline
    def setShowPagination(value: Boolean): Self = this.set("showPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPagination: Self = this.set("showPagination", js.undefined)
    
    @scala.inline
    def setSudo(value: String | Double): Self = this.set("sudo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSudo: Self = this.set("sudo", js.undefined)
  }
}
