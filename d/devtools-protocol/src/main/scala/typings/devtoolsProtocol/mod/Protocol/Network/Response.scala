package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Security.SecurityState
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
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
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
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
    def setConnectionId(value: Double): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionReused(value: Boolean): Self = this.set("connectionReused", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncodedDataLength(value: Double): Self = this.set("encodedDataLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityState(value: SecurityState): Self = this.set("securityState", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: integer): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheStorageCacheName(value: String): Self = this.set("cacheStorageCacheName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheStorageCacheName: Self = this.set("cacheStorageCacheName", js.undefined)
    @scala.inline
    def setFromDiskCache(value: Boolean): Self = this.set("fromDiskCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromDiskCache: Self = this.set("fromDiskCache", js.undefined)
    @scala.inline
    def setFromPrefetchCache(value: Boolean): Self = this.set("fromPrefetchCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromPrefetchCache: Self = this.set("fromPrefetchCache", js.undefined)
    @scala.inline
    def setFromServiceWorker(value: Boolean): Self = this.set("fromServiceWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromServiceWorker: Self = this.set("fromServiceWorker", js.undefined)
    @scala.inline
    def setHeadersText(value: String): Self = this.set("headersText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadersText: Self = this.set("headersText", js.undefined)
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setRemoteIPAddress(value: String): Self = this.set("remoteIPAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteIPAddress: Self = this.set("remoteIPAddress", js.undefined)
    @scala.inline
    def setRemotePort(value: integer): Self = this.set("remotePort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemotePort: Self = this.set("remotePort", js.undefined)
    @scala.inline
    def setRequestHeaders(value: Headers): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    @scala.inline
    def setRequestHeadersText(value: String): Self = this.set("requestHeadersText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestHeadersText: Self = this.set("requestHeadersText", js.undefined)
    @scala.inline
    def setResponseTime(value: TimeSinceEpoch): Self = this.set("responseTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTime: Self = this.set("responseTime", js.undefined)
    @scala.inline
    def setSecurityDetails(value: SecurityDetails): Self = this.set("securityDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityDetails: Self = this.set("securityDetails", js.undefined)
    @scala.inline
    def setServiceWorkerResponseSource(value: ServiceWorkerResponseSource): Self = this.set("serviceWorkerResponseSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceWorkerResponseSource: Self = this.set("serviceWorkerResponseSource", js.undefined)
    @scala.inline
    def setTiming(value: ResourceTiming): Self = this.set("timing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiming: Self = this.set("timing", js.undefined)
  }
  
}

