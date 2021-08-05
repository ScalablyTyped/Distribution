package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.DeleteCacheRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.DeleteEntryRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesResponse
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCachedResponseRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCachedResponseResponse
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestEntriesRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestEntriesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheStorageApi extends StObject {
  
  /**
    * Deletes a cache.
    */
  def deleteCache(params: DeleteCacheRequest): js.Promise[Unit]
  
  /**
    * Deletes a cache entry.
    */
  def deleteEntry(params: DeleteEntryRequest): js.Promise[Unit]
  
  /**
    * Requests cache names.
    */
  def requestCacheNames(params: RequestCacheNamesRequest): js.Promise[RequestCacheNamesResponse]
  
  /**
    * Fetches cache entry.
    */
  def requestCachedResponse(params: RequestCachedResponseRequest): js.Promise[RequestCachedResponseResponse]
  
  /**
    * Requests data from cache.
    */
  def requestEntries(params: RequestEntriesRequest): js.Promise[RequestEntriesResponse]
}
object CacheStorageApi {
  
  inline def apply(
    deleteCache: DeleteCacheRequest => js.Promise[Unit],
    deleteEntry: DeleteEntryRequest => js.Promise[Unit],
    requestCacheNames: RequestCacheNamesRequest => js.Promise[RequestCacheNamesResponse],
    requestCachedResponse: RequestCachedResponseRequest => js.Promise[RequestCachedResponseResponse],
    requestEntries: RequestEntriesRequest => js.Promise[RequestEntriesResponse]
  ): CacheStorageApi = {
    val __obj = js.Dynamic.literal(deleteCache = js.Any.fromFunction1(deleteCache), deleteEntry = js.Any.fromFunction1(deleteEntry), requestCacheNames = js.Any.fromFunction1(requestCacheNames), requestCachedResponse = js.Any.fromFunction1(requestCachedResponse), requestEntries = js.Any.fromFunction1(requestEntries))
    __obj.asInstanceOf[CacheStorageApi]
  }
  
  extension [Self <: CacheStorageApi](x: Self) {
    
    inline def setDeleteCache(value: DeleteCacheRequest => js.Promise[Unit]): Self = StObject.set(x, "deleteCache", js.Any.fromFunction1(value))
    
    inline def setDeleteEntry(value: DeleteEntryRequest => js.Promise[Unit]): Self = StObject.set(x, "deleteEntry", js.Any.fromFunction1(value))
    
    inline def setRequestCacheNames(value: RequestCacheNamesRequest => js.Promise[RequestCacheNamesResponse]): Self = StObject.set(x, "requestCacheNames", js.Any.fromFunction1(value))
    
    inline def setRequestCachedResponse(value: RequestCachedResponseRequest => js.Promise[RequestCachedResponseResponse]): Self = StObject.set(x, "requestCachedResponse", js.Any.fromFunction1(value))
    
    inline def setRequestEntries(value: RequestEntriesRequest => js.Promise[RequestEntriesResponse]): Self = StObject.set(x, "requestEntries", js.Any.fromFunction1(value))
  }
}
