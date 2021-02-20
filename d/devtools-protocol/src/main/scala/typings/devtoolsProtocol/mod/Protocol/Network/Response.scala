package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Security.SecurityState
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends StObject {
  
  /**
    * Cache Storage Cache Name.
    */
  var cacheStorageCacheName: js.UndefOr[String] = js.native
  
  /**
    * Physical connection id that was actually used for this request.
    */
  var connectionId: Double = js.native
  
  /**
    * Specifies whether physical connection was actually reused for this request.
    */
  var connectionReused: Boolean = js.native
  
  /**
    * Total number of bytes received for this request so far.
    */
  var encodedDataLength: Double = js.native
  
  /**
    * Specifies that the request was served from the disk cache.
    */
  var fromDiskCache: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies that the request was served from the prefetch cache.
    */
  var fromPrefetchCache: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies that the request was served from the ServiceWorker.
    */
  var fromServiceWorker: js.UndefOr[Boolean] = js.native
  
  /**
    * HTTP response headers.
    */
  var headers: Headers = js.native
  
  /**
    * HTTP response headers text.
    */
  var headersText: js.UndefOr[String] = js.native
  
  /**
    * Resource mimeType as determined by the browser.
    */
  var mimeType: String = js.native
  
  /**
    * Protocol used to fetch this request.
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * Remote IP address.
    */
  var remoteIPAddress: js.UndefOr[String] = js.native
  
  /**
    * Remote port.
    */
  var remotePort: js.UndefOr[integer] = js.native
  
  /**
    * Refined HTTP request headers that were actually transmitted over the network.
    */
  var requestHeaders: js.UndefOr[Headers] = js.native
  
  /**
    * HTTP request headers text.
    */
  var requestHeadersText: js.UndefOr[String] = js.native
  
  /**
    * The time at which the returned response was generated.
    */
  var responseTime: js.UndefOr[TimeSinceEpoch] = js.native
  
  /**
    * Security details for the request.
    */
  var securityDetails: js.UndefOr[SecurityDetails] = js.native
  
  /**
    * Security state of the request resource.
    */
  var securityState: SecurityState = js.native
  
  /**
    * Response source of response from ServiceWorker.
    */
  var serviceWorkerResponseSource: js.UndefOr[ServiceWorkerResponseSource] = js.native
  
  /**
    * HTTP response status code.
    */
  var status: integer = js.native
  
  /**
    * HTTP response status text.
    */
  var statusText: String = js.native
  
  /**
    * Timing information for the given request.
    */
  var timing: js.UndefOr[ResourceTiming] = js.native
  
  /**
    * Response URL. This URL can be different from CachedResource.url in case of redirect.
    */
  var url: String = js.native
}
object Response {
  
  @scala.inline
  def apply(
    connectionId: Double,
    connectionReused: Boolean,
    encodedDataLength: Double,
    headers: Headers,
    mimeType: String,
    securityState: SecurityState,
    status: integer,
    statusText: String,
    url: String
  ): Response = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], connectionReused = connectionReused.asInstanceOf[js.Any], encodedDataLength = encodedDataLength.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], securityState = securityState.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheStorageCacheName(value: String): Self = StObject.set(x, "cacheStorageCacheName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheStorageCacheNameUndefined: Self = StObject.set(x, "cacheStorageCacheName", js.undefined)
    
    @scala.inline
    def setConnectionId(value: Double): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionReused(value: Boolean): Self = StObject.set(x, "connectionReused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedDataLength(value: Double): Self = StObject.set(x, "encodedDataLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDiskCache(value: Boolean): Self = StObject.set(x, "fromDiskCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromDiskCacheUndefined: Self = StObject.set(x, "fromDiskCache", js.undefined)
    
    @scala.inline
    def setFromPrefetchCache(value: Boolean): Self = StObject.set(x, "fromPrefetchCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromPrefetchCacheUndefined: Self = StObject.set(x, "fromPrefetchCache", js.undefined)
    
    @scala.inline
    def setFromServiceWorker(value: Boolean): Self = StObject.set(x, "fromServiceWorker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromServiceWorkerUndefined: Self = StObject.set(x, "fromServiceWorker", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersText(value: String): Self = StObject.set(x, "headersText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersTextUndefined: Self = StObject.set(x, "headersText", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setRemoteIPAddress(value: String): Self = StObject.set(x, "remoteIPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIPAddressUndefined: Self = StObject.set(x, "remoteIPAddress", js.undefined)
    
    @scala.inline
    def setRemotePort(value: integer): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemotePortUndefined: Self = StObject.set(x, "remotePort", js.undefined)
    
    @scala.inline
    def setRequestHeaders(value: Headers): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersText(value: String): Self = StObject.set(x, "requestHeadersText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestHeadersTextUndefined: Self = StObject.set(x, "requestHeadersText", js.undefined)
    
    @scala.inline
    def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
    
    @scala.inline
    def setResponseTime(value: TimeSinceEpoch): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTimeUndefined: Self = StObject.set(x, "responseTime", js.undefined)
    
    @scala.inline
    def setSecurityDetails(value: SecurityDetails): Self = StObject.set(x, "securityDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityDetailsUndefined: Self = StObject.set(x, "securityDetails", js.undefined)
    
    @scala.inline
    def setSecurityState(value: SecurityState): Self = StObject.set(x, "securityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerResponseSource(value: ServiceWorkerResponseSource): Self = StObject.set(x, "serviceWorkerResponseSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceWorkerResponseSourceUndefined: Self = StObject.set(x, "serviceWorkerResponseSource", js.undefined)
    
    @scala.inline
    def setStatus(value: integer): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiming(value: ResourceTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
