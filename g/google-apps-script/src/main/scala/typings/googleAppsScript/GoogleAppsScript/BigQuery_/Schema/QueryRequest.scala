package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryRequest extends js.Object {
  
  var defaultDataset: js.UndefOr[DatasetReference] = js.native
  
  var dryRun: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var maxResults: js.UndefOr[Double] = js.native
  
  var parameterMode: js.UndefOr[String] = js.native
  
  var preserveNulls: js.UndefOr[Boolean] = js.native
  
  var query: js.UndefOr[String] = js.native
  
  var queryParameters: js.UndefOr[js.Array[QueryParameter]] = js.native
  
  var timeoutMs: js.UndefOr[Double] = js.native
  
  var useLegacySql: js.UndefOr[Boolean] = js.native
  
  var useQueryCache: js.UndefOr[Boolean] = js.native
}
object QueryRequest {
  
  @scala.inline
  def apply(): QueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequest]
  }
  
  @scala.inline
  implicit class QueryRequestOps[Self <: QueryRequest] (val x: Self) extends AnyVal {
    
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
    def setDefaultDataset(value: DatasetReference): Self = this.set("defaultDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultDataset: Self = this.set("defaultDataset", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("dryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("dryRun", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setParameterMode(value: String): Self = this.set("parameterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterMode: Self = this.set("parameterMode", js.undefined)
    
    @scala.inline
    def setPreserveNulls(value: Boolean): Self = this.set("preserveNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveNulls: Self = this.set("preserveNulls", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQueryParametersVarargs(value: QueryParameter*): Self = this.set("queryParameters", js.Array(value :_*))
    
    @scala.inline
    def setQueryParameters(value: js.Array[QueryParameter]): Self = this.set("queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParameters: Self = this.set("queryParameters", js.undefined)
    
    @scala.inline
    def setTimeoutMs(value: Double): Self = this.set("timeoutMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutMs: Self = this.set("timeoutMs", js.undefined)
    
    @scala.inline
    def setUseLegacySql(value: Boolean): Self = this.set("useLegacySql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLegacySql: Self = this.set("useLegacySql", js.undefined)
    
    @scala.inline
    def setUseQueryCache(value: Boolean): Self = this.set("useQueryCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseQueryCache: Self = this.set("useQueryCache", js.undefined)
  }
}
