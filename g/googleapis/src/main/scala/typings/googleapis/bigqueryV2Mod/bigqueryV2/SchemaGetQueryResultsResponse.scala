package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGetQueryResultsResponse extends StObject {
  
  /**
    * Whether the query result was fetched from the query cache.
    */
  var cacheHit: js.UndefOr[Boolean] = js.native
  
  /**
    * [Output-only] The first errors or warnings encountered during the running
    * of the job. The final message includes the number of errors that caused
    * the process to stop. Errors here do not necessarily mean that the job has
    * completed or was unsuccessful.
    */
  var errors: js.UndefOr[js.Array[SchemaErrorProto]] = js.native
  
  /**
    * A hash of this response.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Whether the query has completed or not. If rows or totalRows are present,
    * this will always be true. If this is false, totalRows will not be
    * available.
    */
  var jobComplete: js.UndefOr[Boolean] = js.native
  
  /**
    * Reference to the BigQuery Job that was created to run the query. This
    * field will be present even if the original request timed out, in which
    * case GetQueryResults can be used to read the results once the query has
    * completed. Since this API only returns the first page of results,
    * subsequent pages can be fetched via the same mechanism (GetQueryResults).
    */
  var jobReference: js.UndefOr[SchemaJobReference] = js.native
  
  /**
    * The resource type of the response.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * [Output-only] The number of rows affected by a DML statement. Present
    * only for DML statements INSERT, UPDATE or DELETE.
    */
  var numDmlAffectedRows: js.UndefOr[String] = js.native
  
  /**
    * A token used for paging results.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * An object with as many results as can be contained within the maximum
    * permitted reply size. To get any additional rows, you can call
    * GetQueryResults and specify the jobReference returned above. Present only
    * when the query completes successfully.
    */
  var rows: js.UndefOr[js.Array[SchemaTableRow]] = js.native
  
  /**
    * The schema of the results. Present only when the query completes
    * successfully.
    */
  var schema: js.UndefOr[SchemaTableSchema] = js.native
  
  /**
    * The total number of bytes processed for this query.
    */
  var totalBytesProcessed: js.UndefOr[String] = js.native
  
  /**
    * The total number of rows in the complete query result set, which can be
    * more than the number of rows in this single page of results. Present only
    * when the query completes successfully.
    */
  var totalRows: js.UndefOr[String] = js.native
}
object SchemaGetQueryResultsResponse {
  
  @scala.inline
  def apply(): SchemaGetQueryResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetQueryResultsResponse]
  }
  
  @scala.inline
  implicit class SchemaGetQueryResultsResponseMutableBuilder[Self <: SchemaGetQueryResultsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[SchemaErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaErrorProto*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setJobComplete(value: Boolean): Self = StObject.set(x, "jobComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobCompleteUndefined: Self = StObject.set(x, "jobComplete", js.undefined)
    
    @scala.inline
    def setJobReference(value: SchemaJobReference): Self = StObject.set(x, "jobReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobReferenceUndefined: Self = StObject.set(x, "jobReference", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNumDmlAffectedRows(value: String): Self = StObject.set(x, "numDmlAffectedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumDmlAffectedRowsUndefined: Self = StObject.set(x, "numDmlAffectedRows", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[SchemaTableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SchemaTableRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: SchemaTableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
    
    @scala.inline
    def setTotalRows(value: String): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
  }
}
