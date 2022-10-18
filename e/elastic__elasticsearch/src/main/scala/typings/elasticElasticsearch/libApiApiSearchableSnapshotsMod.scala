package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.SearchableSnapshotsCacheStatsRequest
import typings.elasticElasticsearch.libApiTypesMod.SearchableSnapshotsCacheStatsResponse
import typings.elasticElasticsearch.libApiTypesMod.SearchableSnapshotsClearCacheRequest
import typings.elasticElasticsearch.libApiTypesMod.SearchableSnapshotsClearCacheResponse
import typings.elasticElasticsearch.libApiTypesMod.SearchableSnapshotsMountRequest
import typings.elasticElasticsearch.libApiTypesMod.SearchableSnapshotsMountResponse
import typings.elasticElasticsearch.libApiTypesMod.SearchableSnapshotsStatsRequest
import typings.elasticElasticsearch.libApiTypesMod.SearchableSnapshotsStatsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiSearchableSnapshotsMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/searchable_snapshots", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with SearchableSnapshots {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait SearchableSnapshots extends StObject {
    
    def cacheStats(): js.Promise[SearchableSnapshotsCacheStatsResponse] = js.native
    def cacheStats(params: Unit, options: TransportRequestOptions): js.Promise[SearchableSnapshotsCacheStatsResponse] = js.native
    def cacheStats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchableSnapshotsCacheStatsResponse, Any]] = js.native
    def cacheStats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchableSnapshotsCacheStatsResponse] = js.native
    def cacheStats(params: SearchableSnapshotsCacheStatsRequest): js.Promise[SearchableSnapshotsCacheStatsResponse] = js.native
    def cacheStats(params: SearchableSnapshotsCacheStatsRequest, options: TransportRequestOptions): js.Promise[SearchableSnapshotsCacheStatsResponse] = js.native
    def cacheStats(params: SearchableSnapshotsCacheStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchableSnapshotsCacheStatsResponse, Any]] = js.native
    def cacheStats(params: SearchableSnapshotsCacheStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchableSnapshotsCacheStatsResponse] = js.native
    def cacheStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsCacheStatsRequest
    ): js.Promise[SearchableSnapshotsCacheStatsResponse] = js.native
    def cacheStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsCacheStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[SearchableSnapshotsCacheStatsResponse] = js.native
    def cacheStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsCacheStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SearchableSnapshotsCacheStatsResponse, Any]] = js.native
    def cacheStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsCacheStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SearchableSnapshotsCacheStatsResponse] = js.native
    
    def clearCache(): js.Promise[SearchableSnapshotsClearCacheResponse] = js.native
    def clearCache(params: Unit, options: TransportRequestOptions): js.Promise[SearchableSnapshotsClearCacheResponse] = js.native
    def clearCache(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchableSnapshotsClearCacheResponse, Any]] = js.native
    def clearCache(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchableSnapshotsClearCacheResponse] = js.native
    def clearCache(params: SearchableSnapshotsClearCacheRequest): js.Promise[SearchableSnapshotsClearCacheResponse] = js.native
    def clearCache(params: SearchableSnapshotsClearCacheRequest, options: TransportRequestOptions): js.Promise[SearchableSnapshotsClearCacheResponse] = js.native
    def clearCache(params: SearchableSnapshotsClearCacheRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchableSnapshotsClearCacheResponse, Any]] = js.native
    def clearCache(params: SearchableSnapshotsClearCacheRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchableSnapshotsClearCacheResponse] = js.native
    def clearCache(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsClearCacheRequest
    ): js.Promise[SearchableSnapshotsClearCacheResponse] = js.native
    def clearCache(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsClearCacheRequest,
      options: TransportRequestOptions
    ): js.Promise[SearchableSnapshotsClearCacheResponse] = js.native
    def clearCache(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsClearCacheRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SearchableSnapshotsClearCacheResponse, Any]] = js.native
    def clearCache(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsClearCacheRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SearchableSnapshotsClearCacheResponse] = js.native
    
    def mount(params: SearchableSnapshotsMountRequest): js.Promise[SearchableSnapshotsMountResponse] = js.native
    def mount(params: SearchableSnapshotsMountRequest, options: TransportRequestOptions): js.Promise[SearchableSnapshotsMountResponse] = js.native
    def mount(params: SearchableSnapshotsMountRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchableSnapshotsMountResponse, Any]] = js.native
    def mount(params: SearchableSnapshotsMountRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchableSnapshotsMountResponse] = js.native
    def mount(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsMountRequest): js.Promise[SearchableSnapshotsMountResponse] = js.native
    def mount(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsMountRequest,
      options: TransportRequestOptions
    ): js.Promise[SearchableSnapshotsMountResponse] = js.native
    def mount(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsMountRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SearchableSnapshotsMountResponse, Any]] = js.native
    def mount(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsMountRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SearchableSnapshotsMountResponse] = js.native
    
    def stats(): js.Promise[SearchableSnapshotsStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptions): js.Promise[SearchableSnapshotsStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchableSnapshotsStatsResponse, Any]] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchableSnapshotsStatsResponse] = js.native
    def stats(params: SearchableSnapshotsStatsRequest): js.Promise[SearchableSnapshotsStatsResponse] = js.native
    def stats(params: SearchableSnapshotsStatsRequest, options: TransportRequestOptions): js.Promise[SearchableSnapshotsStatsResponse] = js.native
    def stats(params: SearchableSnapshotsStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchableSnapshotsStatsResponse, Any]] = js.native
    def stats(params: SearchableSnapshotsStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchableSnapshotsStatsResponse] = js.native
    def stats(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsStatsRequest): js.Promise[SearchableSnapshotsStatsResponse] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[SearchableSnapshotsStatsResponse] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SearchableSnapshotsStatsResponse, Any]] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchableSnapshotsStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SearchableSnapshotsStatsResponse] = js.native
    
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
    
    extension [Self <: That](x: Self) {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
