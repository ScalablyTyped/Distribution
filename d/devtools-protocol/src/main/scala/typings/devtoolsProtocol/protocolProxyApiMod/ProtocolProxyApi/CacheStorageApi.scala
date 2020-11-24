package typings.devtoolsProtocol.protocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.DeleteCacheRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.DeleteEntryRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCacheNamesResponse
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCachedResponseRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestCachedResponseResponse
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestEntriesRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestEntriesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheStorageApi extends js.Object {
  
  /**
    * Deletes a cache.
    */
  def deleteCache(params: DeleteCacheRequest): js.Promise[Unit] = js.native
  
  /**
    * Deletes a cache entry.
    */
  def deleteEntry(params: DeleteEntryRequest): js.Promise[Unit] = js.native
  
  /**
    * Requests cache names.
    */
  def requestCacheNames(params: RequestCacheNamesRequest): js.Promise[RequestCacheNamesResponse] = js.native
  
  /**
    * Fetches cache entry.
    */
  def requestCachedResponse(params: RequestCachedResponseRequest): js.Promise[RequestCachedResponseResponse] = js.native
  
  /**
    * Requests data from cache.
    */
  def requestEntries(params: RequestEntriesRequest): js.Promise[RequestEntriesResponse] = js.native
}
object CacheStorageApi {
  
  @scala.inline
  def apply(
    deleteCache: DeleteCacheRequest => js.Promise[Unit],
    deleteEntry: DeleteEntryRequest => js.Promise[Unit],
    requestCacheNames: RequestCacheNamesRequest => js.Promise[RequestCacheNamesResponse],
    requestCachedResponse: RequestCachedResponseRequest => js.Promise[RequestCachedResponseResponse],
    requestEntries: RequestEntriesRequest => js.Promise[RequestEntriesResponse]
  ): CacheStorageApi = {
    val __obj = js.Dynamic.literal(deleteCache = js.Any.fromFunction1(deleteCache), deleteEntry = js.Any.fromFunction1(deleteEntry), requestCacheNames = js.Any.fromFunction1(requestCacheNames), requestCachedResponse = js.Any.fromFunction1(requestCachedResponse), requestEntries = js.Any.fromFunction1(requestEntries))
    __obj.asInstanceOf[CacheStorageApi]
  }
  
  @scala.inline
  implicit class CacheStorageApiOps[Self <: CacheStorageApi] (val x: Self) extends AnyVal {
    
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
    def setDeleteCache(value: DeleteCacheRequest => js.Promise[Unit]): Self = this.set("deleteCache", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteEntry(value: DeleteEntryRequest => js.Promise[Unit]): Self = this.set("deleteEntry", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestCacheNames(value: RequestCacheNamesRequest => js.Promise[RequestCacheNamesResponse]): Self = this.set("requestCacheNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestCachedResponse(value: RequestCachedResponseRequest => js.Promise[RequestCachedResponseResponse]): Self = this.set("requestCachedResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestEntries(value: RequestEntriesRequest => js.Promise[RequestEntriesResponse]): Self = this.set("requestEntries", js.Any.fromFunction1(value))
  }
}
