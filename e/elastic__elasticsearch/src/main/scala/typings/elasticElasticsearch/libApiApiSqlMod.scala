package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.SqlClearCursorRequest
import typings.elasticElasticsearch.libApiTypesMod.SqlClearCursorResponse
import typings.elasticElasticsearch.libApiTypesMod.SqlDeleteAsyncRequest
import typings.elasticElasticsearch.libApiTypesMod.SqlDeleteAsyncResponse
import typings.elasticElasticsearch.libApiTypesMod.SqlGetAsyncRequest
import typings.elasticElasticsearch.libApiTypesMod.SqlGetAsyncResponse
import typings.elasticElasticsearch.libApiTypesMod.SqlGetAsyncStatusRequest
import typings.elasticElasticsearch.libApiTypesMod.SqlGetAsyncStatusResponse
import typings.elasticElasticsearch.libApiTypesMod.SqlQueryRequest
import typings.elasticElasticsearch.libApiTypesMod.SqlQueryResponse
import typings.elasticElasticsearch.libApiTypesMod.SqlTranslateRequest
import typings.elasticElasticsearch.libApiTypesMod.SqlTranslateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiSqlMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/sql", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Sql {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Sql extends StObject {
    
    def clearCursor(params: SqlClearCursorRequest): js.Promise[SqlClearCursorResponse] = js.native
    def clearCursor(params: SqlClearCursorRequest, options: TransportRequestOptions): js.Promise[SqlClearCursorResponse] = js.native
    def clearCursor(params: SqlClearCursorRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlClearCursorResponse, Any]] = js.native
    def clearCursor(params: SqlClearCursorRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlClearCursorResponse] = js.native
    def clearCursor(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlClearCursorRequest): js.Promise[SqlClearCursorResponse] = js.native
    def clearCursor(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlClearCursorRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlClearCursorResponse] = js.native
    def clearCursor(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlClearCursorRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlClearCursorResponse, Any]] = js.native
    def clearCursor(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlClearCursorRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlClearCursorResponse] = js.native
    
    def deleteAsync(params: SqlDeleteAsyncRequest): js.Promise[SqlDeleteAsyncResponse] = js.native
    def deleteAsync(params: SqlDeleteAsyncRequest, options: TransportRequestOptions): js.Promise[SqlDeleteAsyncResponse] = js.native
    def deleteAsync(params: SqlDeleteAsyncRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlDeleteAsyncResponse, Any]] = js.native
    def deleteAsync(params: SqlDeleteAsyncRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlDeleteAsyncResponse] = js.native
    def deleteAsync(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlDeleteAsyncRequest): js.Promise[SqlDeleteAsyncResponse] = js.native
    def deleteAsync(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlDeleteAsyncRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlDeleteAsyncResponse] = js.native
    def deleteAsync(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlDeleteAsyncRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlDeleteAsyncResponse, Any]] = js.native
    def deleteAsync(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlDeleteAsyncRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlDeleteAsyncResponse] = js.native
    
    def getAsync(params: SqlGetAsyncRequest): js.Promise[SqlGetAsyncResponse] = js.native
    def getAsync(params: SqlGetAsyncRequest, options: TransportRequestOptions): js.Promise[SqlGetAsyncResponse] = js.native
    def getAsync(params: SqlGetAsyncRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlGetAsyncResponse, Any]] = js.native
    def getAsync(params: SqlGetAsyncRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlGetAsyncResponse] = js.native
    def getAsync(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncRequest): js.Promise[SqlGetAsyncResponse] = js.native
    def getAsync(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlGetAsyncResponse] = js.native
    def getAsync(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlGetAsyncResponse, Any]] = js.native
    def getAsync(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlGetAsyncResponse] = js.native
    
    def getAsyncStatus(params: SqlGetAsyncStatusRequest): js.Promise[SqlGetAsyncStatusResponse] = js.native
    def getAsyncStatus(params: SqlGetAsyncStatusRequest, options: TransportRequestOptions): js.Promise[SqlGetAsyncStatusResponse] = js.native
    def getAsyncStatus(params: SqlGetAsyncStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlGetAsyncStatusResponse, Any]] = js.native
    def getAsyncStatus(params: SqlGetAsyncStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlGetAsyncStatusResponse] = js.native
    def getAsyncStatus(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncStatusRequest): js.Promise[SqlGetAsyncStatusResponse] = js.native
    def getAsyncStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlGetAsyncStatusResponse] = js.native
    def getAsyncStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlGetAsyncStatusResponse, Any]] = js.native
    def getAsyncStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlGetAsyncStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlGetAsyncStatusResponse] = js.native
    
    def query(): js.Promise[SqlQueryResponse] = js.native
    def query(params: Unit, options: TransportRequestOptions): js.Promise[SqlQueryResponse] = js.native
    def query(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlQueryResponse, Any]] = js.native
    def query(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlQueryResponse] = js.native
    def query(params: SqlQueryRequest): js.Promise[SqlQueryResponse] = js.native
    def query(params: SqlQueryRequest, options: TransportRequestOptions): js.Promise[SqlQueryResponse] = js.native
    def query(params: SqlQueryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlQueryResponse, Any]] = js.native
    def query(params: SqlQueryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlQueryResponse] = js.native
    def query(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlQueryRequest): js.Promise[SqlQueryResponse] = js.native
    def query(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlQueryRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlQueryResponse] = js.native
    def query(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlQueryRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlQueryResponse, Any]] = js.native
    def query(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlQueryRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlQueryResponse] = js.native
    
    def translate(params: SqlTranslateRequest): js.Promise[SqlTranslateResponse] = js.native
    def translate(params: SqlTranslateRequest, options: TransportRequestOptions): js.Promise[SqlTranslateResponse] = js.native
    def translate(params: SqlTranslateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SqlTranslateResponse, Any]] = js.native
    def translate(params: SqlTranslateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SqlTranslateResponse] = js.native
    def translate(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlTranslateRequest): js.Promise[SqlTranslateResponse] = js.native
    def translate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlTranslateRequest,
      options: TransportRequestOptions
    ): js.Promise[SqlTranslateResponse] = js.native
    def translate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlTranslateRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SqlTranslateResponse, Any]] = js.native
    def translate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SqlTranslateRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SqlTranslateResponse] = js.native
    
    var transport: Transport = js.native
  }
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: That] (val x: Self) extends AnyVal {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
