package typings.firefoxWebextBrowser.browser

import typings.firefoxWebextBrowser.browser.webRequest.HttpHeaders
import typings.firefoxWebextBrowser.browser.webRequest.RequestFilter
import typings.firefoxWebextBrowser.browser.webRequest.ResourceType
import typings.firefoxWebextBrowser.browser.webRequest.UrlClassification
import typings.firefoxWebextBrowser.browser.webRequest._HttpHeaders
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.requestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to global proxy settings for Firefox and proxy event listeners to handle dynamic proxy implementations.
  *
  * Permissions: `proxy`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object proxy {
  
  trait OnRequestDetails extends StObject {
    
    /** The cookie store ID of the contextual identity. */
    var cookieStoreId: js.UndefOr[String] = js.undefined
    
    /** URL of the page into which the requested resource will be loaded. */
    var documentUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a subframe in which the request happens. If the document of a (sub-)frame is loaded (`type` is `main_frame` or `sub_frame`), `frameId` indicates the ID of this frame, not the ID of the outer frame. Frame IDs are unique within a tab.
      */
    var frameId: Double
    
    /** Indicates if this response was fetched from disk cache. */
    var fromCache: Boolean
    
    /** True for private browsing requests. */
    var incognito: js.UndefOr[Boolean] = js.undefined
    
    /** Standard HTTP method. */
    var method: String
    
    /** URL of the resource that triggered this request. */
    var originUrl: js.UndefOr[String] = js.undefined
    
    /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
    var parentFrameId: Double
    
    /** The HTTP request headers that are going to be sent out with this request. */
    var requestHeaders: js.UndefOr[HttpHeaders] = js.undefined
    
    /**
      * The ID of the request. Request IDs are unique within a browser session. As a result, they could be used to relate different events of the same request.
      */
    var requestId: String
    
    /** The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab. */
    var tabId: Double
    
    /** Indicates if this request and its content window hierarchy is third party. */
    var thirdParty: Boolean
    
    /** The time when this signal is triggered, in milliseconds since the epoch. */
    var timeStamp: Double
    
    /** How the requested resource will be used. */
    var `type`: ResourceType
    
    var url: String
    
    /** Url classification if the request has been classified. */
    var urlClassification: UrlClassification
  }
  object OnRequestDetails {
    
    inline def apply(
      frameId: Double,
      fromCache: Boolean,
      method: String,
      parentFrameId: Double,
      requestId: String,
      tabId: Double,
      thirdParty: Boolean,
      timeStamp: Double,
      `type`: ResourceType,
      url: String,
      urlClassification: UrlClassification
    ): OnRequestDetails = {
      val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], thirdParty = thirdParty.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], urlClassification = urlClassification.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnRequestDetails]
    }
    
    extension [Self <: OnRequestDetails](x: Self) {
      
      inline def setCookieStoreId(value: String): Self = StObject.set(x, "cookieStoreId", value.asInstanceOf[js.Any])
      
      inline def setCookieStoreIdUndefined: Self = StObject.set(x, "cookieStoreId", js.undefined)
      
      inline def setDocumentUrl(value: String): Self = StObject.set(x, "documentUrl", value.asInstanceOf[js.Any])
      
      inline def setDocumentUrlUndefined: Self = StObject.set(x, "documentUrl", js.undefined)
      
      inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
      
      inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOriginUrl(value: String): Self = StObject.set(x, "originUrl", value.asInstanceOf[js.Any])
      
      inline def setOriginUrlUndefined: Self = StObject.set(x, "originUrl", js.undefined)
      
      inline def setParentFrameId(value: Double): Self = StObject.set(x, "parentFrameId", value.asInstanceOf[js.Any])
      
      inline def setRequestHeaders(value: HttpHeaders): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setRequestHeadersVarargs(value: _HttpHeaders*): Self = StObject.set(x, "requestHeaders", js.Array(value :_*))
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
      
      inline def setThirdParty(value: Boolean): Self = StObject.set(x, "thirdParty", value.asInstanceOf[js.Any])
      
      inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: ResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlClassification(value: UrlClassification): Self = StObject.set(x, "urlClassification", value.asInstanceOf[js.Any])
    }
  }
  
  /* proxy types */
  /** An object which describes proxy settings. */
  trait ProxyConfig extends StObject {
    
    /** A URL to use to configure the proxy. */
    var autoConfigUrl: js.UndefOr[String] = js.undefined
    
    /** Do not prompt for authentication if password is saved. */
    var autoLogin: js.UndefOr[Boolean] = js.undefined
    
    /** The address of the ftp proxy, can include a port. */
    var ftp: js.UndefOr[String] = js.undefined
    
    /** The address of the http proxy, can include a port. */
    var http: js.UndefOr[String] = js.undefined
    
    /** Use the http proxy server for all protocols. */
    var httpProxyAll: js.UndefOr[Boolean] = js.undefined
    
    /** A list of hosts which should not be proxied. */
    var passthrough: js.UndefOr[String] = js.undefined
    
    /** Proxy DNS when using SOCKS v5. */
    var proxyDNS: js.UndefOr[Boolean] = js.undefined
    
    /** The type of proxy to use. */
    var proxyType: js.UndefOr[ProxyConfigProxyType] = js.undefined
    
    /**
      * If true (the default value), do not use newer TLS protocol features that might have interoperability problems on the Internet. This is intended only for use with critical infrastructure like the updates, and is only available to privileged addons.
      */
    var respectBeConservative: js.UndefOr[Boolean] = js.undefined
    
    /** The address of the socks proxy, can include a port. */
    var socks: js.UndefOr[String] = js.undefined
    
    /** The version of the socks proxy. */
    var socksVersion: js.UndefOr[Double] = js.undefined
    
    /** The address of the ssl proxy, can include a port. */
    var ssl: js.UndefOr[String] = js.undefined
  }
  object ProxyConfig {
    
    inline def apply(): ProxyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyConfig]
    }
    
    extension [Self <: ProxyConfig](x: Self) {
      
      inline def setAutoConfigUrl(value: String): Self = StObject.set(x, "autoConfigUrl", value.asInstanceOf[js.Any])
      
      inline def setAutoConfigUrlUndefined: Self = StObject.set(x, "autoConfigUrl", js.undefined)
      
      inline def setAutoLogin(value: Boolean): Self = StObject.set(x, "autoLogin", value.asInstanceOf[js.Any])
      
      inline def setAutoLoginUndefined: Self = StObject.set(x, "autoLogin", js.undefined)
      
      inline def setFtp(value: String): Self = StObject.set(x, "ftp", value.asInstanceOf[js.Any])
      
      inline def setFtpUndefined: Self = StObject.set(x, "ftp", js.undefined)
      
      inline def setHttp(value: String): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpProxyAll(value: Boolean): Self = StObject.set(x, "httpProxyAll", value.asInstanceOf[js.Any])
      
      inline def setHttpProxyAllUndefined: Self = StObject.set(x, "httpProxyAll", js.undefined)
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setPassthrough(value: String): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      inline def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
      
      inline def setProxyDNS(value: Boolean): Self = StObject.set(x, "proxyDNS", value.asInstanceOf[js.Any])
      
      inline def setProxyDNSUndefined: Self = StObject.set(x, "proxyDNS", js.undefined)
      
      inline def setProxyType(value: ProxyConfigProxyType): Self = StObject.set(x, "proxyType", value.asInstanceOf[js.Any])
      
      inline def setProxyTypeUndefined: Self = StObject.set(x, "proxyType", js.undefined)
      
      inline def setRespectBeConservative(value: Boolean): Self = StObject.set(x, "respectBeConservative", value.asInstanceOf[js.Any])
      
      inline def setRespectBeConservativeUndefined: Self = StObject.set(x, "respectBeConservative", js.undefined)
      
      inline def setSocks(value: String): Self = StObject.set(x, "socks", value.asInstanceOf[js.Any])
      
      inline def setSocksUndefined: Self = StObject.set(x, "socks", js.undefined)
      
      inline def setSocksVersion(value: Double): Self = StObject.set(x, "socksVersion", value.asInstanceOf[js.Any])
      
      inline def setSocksVersionUndefined: Self = StObject.set(x, "socksVersion", js.undefined)
      
      inline def setSsl(value: String): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    }
  }
  
  /** The type of proxy to use. */
  /* Rewritten from type alias, can be one of: 
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.none
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoDetect
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.system
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual
    - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoConfig
  */
  trait ProxyConfigProxyType extends StObject
  object ProxyConfigProxyType {
    
    inline def autoConfig: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoConfig = "autoConfig".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoConfig]
    
    inline def autoDetect: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoDetect = "autoDetect".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.autoDetect]
    
    inline def manual: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual = "manual".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.manual]
    
    inline def none: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.none = "none".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.none]
    
    inline def system: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.system = "system".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.system]
  }
  
  @js.native
  trait ProxyOnRequestEvent[TCallback] extends StObject {
    
    def addListener(cb: TCallback, filter: RequestFilter): Unit = js.native
    @JSName("addListener")
    def addListener_requestHeaders(cb: TCallback, filter: RequestFilter, extraInfoSpec: js.Array[requestHeaders]): Unit = js.native
    
    def hasListener(cb: TCallback): Boolean = js.native
    
    def removeListener(cb: TCallback): Unit = js.native
  }
}
