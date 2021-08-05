package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQueryResultsResponse extends StObject {
  
  var cacheHit: js.UndefOr[Boolean] = js.undefined
  
  var errors: js.UndefOr[js.Array[ErrorProto]] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  var jobComplete: js.UndefOr[Boolean] = js.undefined
  
  var jobReference: js.UndefOr[JobReference] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var numDmlAffectedRows: js.UndefOr[String] = js.undefined
  
  var pageToken: js.UndefOr[String] = js.undefined
  
  var rows: js.UndefOr[js.Array[TableRow]] = js.undefined
  
  var schema: js.UndefOr[TableSchema] = js.undefined
  
  var totalBytesProcessed: js.UndefOr[String] = js.undefined
  
  var totalRows: js.UndefOr[String] = js.undefined
}
object GetQueryResultsResponse {
  
  inline def apply(): GetQueryResultsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQueryResultsResponse]
  }
  
  extension [Self <: GetQueryResultsResponse](x: Self) {
    
    inline def setCacheHit(value: Boolean): Self = StObject.set(x, "cacheHit", value.asInstanceOf[js.Any])
    
    inline def setCacheHitUndefined: Self = StObject.set(x, "cacheHit", js.undefined)
    
    inline def setErrors(value: js.Array[ErrorProto]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: ErrorProto*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setJobComplete(value: Boolean): Self = StObject.set(x, "jobComplete", value.asInstanceOf[js.Any])
    
    inline def setJobCompleteUndefined: Self = StObject.set(x, "jobComplete", js.undefined)
    
    inline def setJobReference(value: JobReference): Self = StObject.set(x, "jobReference", value.asInstanceOf[js.Any])
    
    inline def setJobReferenceUndefined: Self = StObject.set(x, "jobReference", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNumDmlAffectedRows(value: String): Self = StObject.set(x, "numDmlAffectedRows", value.asInstanceOf[js.Any])
    
    inline def setNumDmlAffectedRowsUndefined: Self = StObject.set(x, "numDmlAffectedRows", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setRows(value: js.Array[TableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: TableRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    inline def setSchema(value: TableSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTotalBytesProcessed(value: String): Self = StObject.set(x, "totalBytesProcessed", value.asInstanceOf[js.Any])
    
    inline def setTotalBytesProcessedUndefined: Self = StObject.set(x, "totalBytesProcessed", js.undefined)
    
    inline def setTotalRows(value: String): Self = StObject.set(x, "totalRows", value.asInstanceOf[js.Any])
    
    inline def setTotalRowsUndefined: Self = StObject.set(x, "totalRows", js.undefined)
  }
}
