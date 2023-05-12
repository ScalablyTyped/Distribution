package typings.devtoolsProtocol.mod.Protocol

import typings.devtoolsProtocol.devtoolsProtocolStrings.default_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CacheStorage {
  
  trait Cache extends StObject {
    
    /**
      * An opaque unique id of the cache.
      */
    var cacheId: CacheId
    
    /**
      * The name of the cache.
      */
    var cacheName: String
    
    /**
      * Security origin of the cache.
      */
    var securityOrigin: String
    
    /**
      * Storage key of the cache.
      */
    var storageKey: String
  }
  object Cache {
    
    inline def apply(cacheId: CacheId, cacheName: String, securityOrigin: String, storageKey: String): Cache = {
      val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any], cacheName = cacheName.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any], storageKey = storageKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      inline def setCacheId(value: CacheId): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      inline def setCacheName(value: String): Self = StObject.set(x, "cacheName", value.asInstanceOf[js.Any])
      
      inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
      
      inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
    }
  }
  
  type CacheId = String
  
  trait CachedResponse extends StObject {
    
    /**
      * Entry content, base64-encoded. (Encoded as a base64 string when passed over JSON)
      */
    var body: String
  }
  object CachedResponse {
    
    inline def apply(body: String): CachedResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CachedResponse] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.basic
    - typings.devtoolsProtocol.devtoolsProtocolStrings.cors
    - typings.devtoolsProtocol.devtoolsProtocolStrings.default_
    - typings.devtoolsProtocol.devtoolsProtocolStrings.error
    - typings.devtoolsProtocol.devtoolsProtocolStrings.opaqueResponse
    - typings.devtoolsProtocol.devtoolsProtocolStrings.opaqueRedirect
  */
  trait CachedResponseType extends StObject
  object CachedResponseType {
    
    inline def default: default_ = "default".asInstanceOf[default_]
    
    inline def basic: typings.devtoolsProtocol.devtoolsProtocolStrings.basic = "basic".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.basic]
    
    inline def cors: typings.devtoolsProtocol.devtoolsProtocolStrings.cors = "cors".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.cors]
    
    inline def error: typings.devtoolsProtocol.devtoolsProtocolStrings.error = "error".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.error]
    
    inline def opaqueRedirect: typings.devtoolsProtocol.devtoolsProtocolStrings.opaqueRedirect = "opaqueRedirect".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.opaqueRedirect]
    
    inline def opaqueResponse: typings.devtoolsProtocol.devtoolsProtocolStrings.opaqueResponse = "opaqueResponse".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.opaqueResponse]
  }
  
  trait DataEntry extends StObject {
    
    /**
      * Request headers
      */
    var requestHeaders: js.Array[Header]
    
    /**
      * Request method.
      */
    var requestMethod: String
    
    /**
      * Request URL.
      */
    var requestURL: String
    
    /**
      * Response headers
      */
    var responseHeaders: js.Array[Header]
    
    /**
      * HTTP response status code.
      */
    var responseStatus: integer
    
    /**
      * HTTP response status text.
      */
    var responseStatusText: String
    
    /**
      * Number of seconds since epoch.
      */
    var responseTime: Double
    
    /**
      * HTTP response type
      */
    var responseType: CachedResponseType
  }
  object DataEntry {
    
    inline def apply(
      requestHeaders: js.Array[Header],
      requestMethod: String,
      requestURL: String,
      responseHeaders: js.Array[Header],
      responseStatus: integer,
      responseStatusText: String,
      responseTime: Double,
      responseType: CachedResponseType
    ): DataEntry = {
      val __obj = js.Dynamic.literal(requestHeaders = requestHeaders.asInstanceOf[js.Any], requestMethod = requestMethod.asInstanceOf[js.Any], requestURL = requestURL.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], responseStatusText = responseStatusText.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataEntry] (val x: Self) extends AnyVal {
      
      inline def setRequestHeaders(value: js.Array[Header]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersVarargs(value: Header*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
      
      inline def setRequestMethod(value: String): Self = StObject.set(x, "requestMethod", value.asInstanceOf[js.Any])
      
      inline def setRequestURL(value: String): Self = StObject.set(x, "requestURL", value.asInstanceOf[js.Any])
      
      inline def setResponseHeaders(value: js.Array[Header]): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setResponseHeadersVarargs(value: Header*): Self = StObject.set(x, "responseHeaders", js.Array(value*))
      
      inline def setResponseStatus(value: integer): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
      
      inline def setResponseStatusText(value: String): Self = StObject.set(x, "responseStatusText", value.asInstanceOf[js.Any])
      
      inline def setResponseTime(value: Double): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
      
      inline def setResponseType(value: CachedResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteCacheRequest extends StObject {
    
    /**
      * Id of cache for deletion.
      */
    var cacheId: CacheId
  }
  object DeleteCacheRequest {
    
    inline def apply(cacheId: CacheId): DeleteCacheRequest = {
      val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteCacheRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteCacheRequest] (val x: Self) extends AnyVal {
      
      inline def setCacheId(value: CacheId): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteEntryRequest extends StObject {
    
    /**
      * Id of cache where the entry will be deleted.
      */
    var cacheId: CacheId
    
    /**
      * URL spec of the request.
      */
    var request: String
  }
  object DeleteEntryRequest {
    
    inline def apply(cacheId: CacheId, request: String): DeleteEntryRequest = {
      val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteEntryRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteEntryRequest] (val x: Self) extends AnyVal {
      
      inline def setCacheId(value: CacheId): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait Header extends StObject {
    
    var name: String
    
    var value: String
  }
  object Header {
    
    inline def apply(name: String, value: String): Header = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestCacheNamesRequest extends StObject {
    
    /**
      * At least and at most one of securityOrigin, storageKey must be specified.
      * Security origin.
      */
    var securityOrigin: js.UndefOr[String] = js.undefined
    
    /**
      * Storage key.
      */
    var storageKey: js.UndefOr[String] = js.undefined
  }
  object RequestCacheNamesRequest {
    
    inline def apply(): RequestCacheNamesRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestCacheNamesRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestCacheNamesRequest] (val x: Self) extends AnyVal {
      
      inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
      
      inline def setSecurityOriginUndefined: Self = StObject.set(x, "securityOrigin", js.undefined)
      
      inline def setStorageKey(value: String): Self = StObject.set(x, "storageKey", value.asInstanceOf[js.Any])
      
      inline def setStorageKeyUndefined: Self = StObject.set(x, "storageKey", js.undefined)
    }
  }
  
  trait RequestCacheNamesResponse extends StObject {
    
    /**
      * Caches for the security origin.
      */
    var caches: js.Array[Cache]
  }
  object RequestCacheNamesResponse {
    
    inline def apply(caches: js.Array[Cache]): RequestCacheNamesResponse = {
      val __obj = js.Dynamic.literal(caches = caches.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestCacheNamesResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestCacheNamesResponse] (val x: Self) extends AnyVal {
      
      inline def setCaches(value: js.Array[Cache]): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      inline def setCachesVarargs(value: Cache*): Self = StObject.set(x, "caches", js.Array(value*))
    }
  }
  
  trait RequestCachedResponseRequest extends StObject {
    
    /**
      * Id of cache that contains the entry.
      */
    var cacheId: CacheId
    
    /**
      * headers of the request.
      */
    var requestHeaders: js.Array[Header]
    
    /**
      * URL spec of the request.
      */
    var requestURL: String
  }
  object RequestCachedResponseRequest {
    
    inline def apply(cacheId: CacheId, requestHeaders: js.Array[Header], requestURL: String): RequestCachedResponseRequest = {
      val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], requestURL = requestURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestCachedResponseRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestCachedResponseRequest] (val x: Self) extends AnyVal {
      
      inline def setCacheId(value: CacheId): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      inline def setRequestHeaders(value: js.Array[Header]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersVarargs(value: Header*): Self = StObject.set(x, "requestHeaders", js.Array(value*))
      
      inline def setRequestURL(value: String): Self = StObject.set(x, "requestURL", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestCachedResponseResponse extends StObject {
    
    /**
      * Response read from the cache.
      */
    var response: CachedResponse
  }
  object RequestCachedResponseResponse {
    
    inline def apply(response: CachedResponse): RequestCachedResponseResponse = {
      val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestCachedResponseResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestCachedResponseResponse] (val x: Self) extends AnyVal {
      
      inline def setResponse(value: CachedResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestEntriesRequest extends StObject {
    
    /**
      * ID of cache to get entries from.
      */
    var cacheId: CacheId
    
    /**
      * Number of records to fetch.
      */
    var pageSize: js.UndefOr[integer] = js.undefined
    
    /**
      * If present, only return the entries containing this substring in the path
      */
    var pathFilter: js.UndefOr[String] = js.undefined
    
    /**
      * Number of records to skip.
      */
    var skipCount: js.UndefOr[integer] = js.undefined
  }
  object RequestEntriesRequest {
    
    inline def apply(cacheId: CacheId): RequestEntriesRequest = {
      val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestEntriesRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestEntriesRequest] (val x: Self) extends AnyVal {
      
      inline def setCacheId(value: CacheId): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      inline def setPageSize(value: integer): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPathFilter(value: String): Self = StObject.set(x, "pathFilter", value.asInstanceOf[js.Any])
      
      inline def setPathFilterUndefined: Self = StObject.set(x, "pathFilter", js.undefined)
      
      inline def setSkipCount(value: integer): Self = StObject.set(x, "skipCount", value.asInstanceOf[js.Any])
      
      inline def setSkipCountUndefined: Self = StObject.set(x, "skipCount", js.undefined)
    }
  }
  
  trait RequestEntriesResponse extends StObject {
    
    /**
      * Array of object store data entries.
      */
    var cacheDataEntries: js.Array[DataEntry]
    
    /**
      * Count of returned entries from this storage. If pathFilter is empty, it
      * is the count of all entries from this storage.
      */
    var returnCount: Double
  }
  object RequestEntriesResponse {
    
    inline def apply(cacheDataEntries: js.Array[DataEntry], returnCount: Double): RequestEntriesResponse = {
      val __obj = js.Dynamic.literal(cacheDataEntries = cacheDataEntries.asInstanceOf[js.Any], returnCount = returnCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestEntriesResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestEntriesResponse] (val x: Self) extends AnyVal {
      
      inline def setCacheDataEntries(value: js.Array[DataEntry]): Self = StObject.set(x, "cacheDataEntries", value.asInstanceOf[js.Any])
      
      inline def setCacheDataEntriesVarargs(value: DataEntry*): Self = StObject.set(x, "cacheDataEntries", js.Array(value*))
      
      inline def setReturnCount(value: Double): Self = StObject.set(x, "returnCount", value.asInstanceOf[js.Any])
    }
  }
}
