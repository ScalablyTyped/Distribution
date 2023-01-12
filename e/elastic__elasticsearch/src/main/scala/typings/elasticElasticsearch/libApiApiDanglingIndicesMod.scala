package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.DanglingIndicesDeleteDanglingIndexRequest
import typings.elasticElasticsearch.libApiTypesMod.DanglingIndicesDeleteDanglingIndexResponse
import typings.elasticElasticsearch.libApiTypesMod.DanglingIndicesImportDanglingIndexRequest
import typings.elasticElasticsearch.libApiTypesMod.DanglingIndicesImportDanglingIndexResponse
import typings.elasticElasticsearch.libApiTypesMod.DanglingIndicesListDanglingIndicesRequest
import typings.elasticElasticsearch.libApiTypesMod.DanglingIndicesListDanglingIndicesResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiDanglingIndicesMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/dangling_indices", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DanglingIndices {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait DanglingIndices extends StObject {
    
    def deleteDanglingIndex(params: DanglingIndicesDeleteDanglingIndexRequest): js.Promise[DanglingIndicesDeleteDanglingIndexResponse] = js.native
    def deleteDanglingIndex(params: DanglingIndicesDeleteDanglingIndexRequest, options: TransportRequestOptions): js.Promise[DanglingIndicesDeleteDanglingIndexResponse] = js.native
    def deleteDanglingIndex(params: DanglingIndicesDeleteDanglingIndexRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[DanglingIndicesDeleteDanglingIndexResponse, Any]] = js.native
    def deleteDanglingIndex(params: DanglingIndicesDeleteDanglingIndexRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[DanglingIndicesDeleteDanglingIndexResponse] = js.native
    def deleteDanglingIndex(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesDeleteDanglingIndexRequest
    ): js.Promise[DanglingIndicesDeleteDanglingIndexResponse] = js.native
    def deleteDanglingIndex(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesDeleteDanglingIndexRequest,
      options: TransportRequestOptions
    ): js.Promise[DanglingIndicesDeleteDanglingIndexResponse] = js.native
    def deleteDanglingIndex(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesDeleteDanglingIndexRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[DanglingIndicesDeleteDanglingIndexResponse, Any]] = js.native
    def deleteDanglingIndex(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesDeleteDanglingIndexRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[DanglingIndicesDeleteDanglingIndexResponse] = js.native
    
    def importDanglingIndex(params: DanglingIndicesImportDanglingIndexRequest): js.Promise[DanglingIndicesImportDanglingIndexResponse] = js.native
    def importDanglingIndex(params: DanglingIndicesImportDanglingIndexRequest, options: TransportRequestOptions): js.Promise[DanglingIndicesImportDanglingIndexResponse] = js.native
    def importDanglingIndex(params: DanglingIndicesImportDanglingIndexRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[DanglingIndicesImportDanglingIndexResponse, Any]] = js.native
    def importDanglingIndex(params: DanglingIndicesImportDanglingIndexRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[DanglingIndicesImportDanglingIndexResponse] = js.native
    def importDanglingIndex(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesImportDanglingIndexRequest
    ): js.Promise[DanglingIndicesImportDanglingIndexResponse] = js.native
    def importDanglingIndex(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesImportDanglingIndexRequest,
      options: TransportRequestOptions
    ): js.Promise[DanglingIndicesImportDanglingIndexResponse] = js.native
    def importDanglingIndex(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesImportDanglingIndexRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[DanglingIndicesImportDanglingIndexResponse, Any]] = js.native
    def importDanglingIndex(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesImportDanglingIndexRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[DanglingIndicesImportDanglingIndexResponse] = js.native
    
    def listDanglingIndices(): js.Promise[DanglingIndicesListDanglingIndicesResponse] = js.native
    def listDanglingIndices(params: Unit, options: TransportRequestOptions): js.Promise[DanglingIndicesListDanglingIndicesResponse] = js.native
    def listDanglingIndices(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[DanglingIndicesListDanglingIndicesResponse, Any]] = js.native
    def listDanglingIndices(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[DanglingIndicesListDanglingIndicesResponse] = js.native
    def listDanglingIndices(params: DanglingIndicesListDanglingIndicesRequest): js.Promise[DanglingIndicesListDanglingIndicesResponse] = js.native
    def listDanglingIndices(params: DanglingIndicesListDanglingIndicesRequest, options: TransportRequestOptions): js.Promise[DanglingIndicesListDanglingIndicesResponse] = js.native
    def listDanglingIndices(params: DanglingIndicesListDanglingIndicesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[DanglingIndicesListDanglingIndicesResponse, Any]] = js.native
    def listDanglingIndices(params: DanglingIndicesListDanglingIndicesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[DanglingIndicesListDanglingIndicesResponse] = js.native
    def listDanglingIndices(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesListDanglingIndicesRequest
    ): js.Promise[DanglingIndicesListDanglingIndicesResponse] = js.native
    def listDanglingIndices(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesListDanglingIndicesRequest,
      options: TransportRequestOptions
    ): js.Promise[DanglingIndicesListDanglingIndicesResponse] = js.native
    def listDanglingIndices(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesListDanglingIndicesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[DanglingIndicesListDanglingIndicesResponse, Any]] = js.native
    def listDanglingIndices(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DanglingIndicesListDanglingIndicesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[DanglingIndicesListDanglingIndicesResponse] = js.native
    
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
