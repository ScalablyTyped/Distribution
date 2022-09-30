package typings.firemonkeyBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.firemonkeyBrowser.anon.Mimetype
import typings.firemonkeyBrowser.firemonkeyBrowserInts.`1`
import typings.firemonkeyBrowser.firemonkeyBrowserInts.`2`
import typings.firemonkeyBrowser.firemonkeyBrowserInts.`3`
import typings.firemonkeyBrowser.firemonkeyBrowserInts.`4`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.Firefox
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.Mozilla
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.OK
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.`no-referrer`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.`x86-32`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.`x86-64`
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.android
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.arm
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.basic
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.client
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.cros
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.document_end
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.document_idle
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.document_start
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.fuchsia
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.linux
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.mac
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.openbsd
import typings.firemonkeyBrowser.firemonkeyBrowserStrings.win
import typings.std.AbortSignal
import typings.std.Blob
import typings.std.Document
import typings.std.FormData
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.URL
import typings.std.XMLHttpRequestBodyInit
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GM {
  
  trait BrowserInfo extends StObject {
    
    var buildID: String
    
    var name: Firefox
    
    var vendor: Mozilla
    
    var version: String
  }
  object BrowserInfo {
    
    inline def apply(buildID: String, version: String): BrowserInfo = {
      val __obj = js.Dynamic.literal(buildID = buildID.asInstanceOf[js.Any], name = "Firefox", vendor = "Mozilla", version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserInfo]
    }
    
    extension [Self <: BrowserInfo](x: Self) {
      
      inline def setBuildID(value: String): Self = StObject.set(x, "buildID", value.asInstanceOf[js.Any])
      
      inline def setName(value: Firefox): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: Mozilla): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait FetchRequest extends StObject {
    
    /**  If true, no cookie will be sent with the request. */
    var anonymous: js.UndefOr[Boolean] = js.undefined
    
    /** Any body that you want to add to your request */
    var body: js.UndefOr[XMLHttpRequestBodyInit] = js.undefined
    
    /** The cache mode you want to use for the request */
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    /** The request credentials you want to use for the request */
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    /** A set of headers to include in the request */
    var headers: js.UndefOr[Headers] = js.undefined
    
    /** Contains the subresource integrity value of the request */
    var integrity: js.UndefOr[String] = js.undefined
    
    /** The keepalive option can be used to allow the request to outlive the page. Fetch with the keepalive flag is a replacement for the Navigator.sendBeacon() API. */
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    /** The request method */
    var method: js.UndefOr[RequestMethod] = js.undefined
    
    /** The mode you want to use for the request */
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    /** The redirect mode */
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    /** A USVString */
    var referrer: js.UndefOr[`no-referrer` | client | URL] = js.undefined
    
    /** Specifies the value of the referer HTTP header */
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    /** Any headers you want to add to your request */
    var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.undefined
    
    /** An AbortSignal object instance; allows you to communicate with a fetch request and abort it if desired via an AbortController */
    var signal: js.UndefOr[AbortSignal | String] = js.undefined
  }
  object FetchRequest {
    
    inline def apply(): FetchRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchRequest]
    }
    
    extension [Self <: FetchRequest](x: Self) {
      
      inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      inline def setBody(value: XMLHttpRequestBodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: `no-referrer` | client | URL): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setResponseType(value: XMLHttpRequestResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setSignal(value: AbortSignal | String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  trait FetchResponse extends StObject {
    
    val arrayBuffer: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
    
    val blob: js.UndefOr[Blob] = js.undefined
    
    val bodyUsed: Boolean
    
    val formData: js.UndefOr[FormData] = js.undefined
    
    val headers: String
    
    val json: js.UndefOr[Any] = js.undefined
    
    val ok: Boolean
    
    val redirected: Boolean
    
    val status: Double
    
    val statusText: OK
    
    // plus one of the following properties based on responseType, if method is not HEAD
    val text: js.UndefOr[String] = js.undefined
    
    val `type`: basic
    
    val url: URL
  }
  object FetchResponse {
    
    inline def apply(bodyUsed: Boolean, headers: String, ok: Boolean, redirected: Boolean, status: Double, url: URL): FetchResponse = {
      val __obj = js.Dynamic.literal(bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = "OK", url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("basic")
      __obj.asInstanceOf[FetchResponse]
    }
    
    extension [Self <: FetchResponse](x: Self) {
      
      inline def setArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "arrayBuffer", value.asInstanceOf[js.Any])
      
      inline def setArrayBufferUndefined: Self = StObject.set(x, "arrayBuffer", js.undefined)
      
      inline def setBlob(value: Blob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      inline def setBlobUndefined: Self = StObject.set(x, "blob", js.undefined)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: FormData): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
      
      inline def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: OK): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: basic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[String]
  
  trait PlatformInfo extends StObject {
    
    var arch: arm | `x86-32` | `x86-64`
    
    var os: mac | win | android | cros | linux | openbsd | fuchsia
  }
  object PlatformInfo {
    
    inline def apply(arch: arm | `x86-32` | `x86-64`, os: mac | win | android | cros | linux | openbsd | fuchsia): PlatformInfo = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlatformInfo]
    }
    
    extension [Self <: PlatformInfo](x: Self) {
      
      inline def setArch(value: arm | `x86-32` | `x86-64`): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setOs(value: mac | win | android | cros | linux | openbsd | fuchsia): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firemonkeyBrowser.firemonkeyBrowserStrings.GET
    - typings.firemonkeyBrowser.firemonkeyBrowserStrings.POST
    - typings.firemonkeyBrowser.firemonkeyBrowserStrings.PUT
    - typings.firemonkeyBrowser.firemonkeyBrowserStrings.DELETE
    - typings.firemonkeyBrowser.firemonkeyBrowserStrings.PATCH
    - typings.firemonkeyBrowser.firemonkeyBrowserStrings.HEAD
    - typings.firemonkeyBrowser.firemonkeyBrowserStrings.TRACE
    - typings.firemonkeyBrowser.firemonkeyBrowserStrings.OPTIONS
    - typings.firemonkeyBrowser.firemonkeyBrowserStrings.CONNECT
  */
  trait RequestMethod extends StObject
  object RequestMethod {
    
    inline def CONNECT: typings.firemonkeyBrowser.firemonkeyBrowserStrings.CONNECT = "CONNECT".asInstanceOf[typings.firemonkeyBrowser.firemonkeyBrowserStrings.CONNECT]
    
    inline def DELETE: typings.firemonkeyBrowser.firemonkeyBrowserStrings.DELETE = "DELETE".asInstanceOf[typings.firemonkeyBrowser.firemonkeyBrowserStrings.DELETE]
    
    inline def GET: typings.firemonkeyBrowser.firemonkeyBrowserStrings.GET = "GET".asInstanceOf[typings.firemonkeyBrowser.firemonkeyBrowserStrings.GET]
    
    inline def HEAD: typings.firemonkeyBrowser.firemonkeyBrowserStrings.HEAD = "HEAD".asInstanceOf[typings.firemonkeyBrowser.firemonkeyBrowserStrings.HEAD]
    
    inline def OPTIONS: typings.firemonkeyBrowser.firemonkeyBrowserStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.firemonkeyBrowser.firemonkeyBrowserStrings.OPTIONS]
    
    inline def PATCH: typings.firemonkeyBrowser.firemonkeyBrowserStrings.PATCH = "PATCH".asInstanceOf[typings.firemonkeyBrowser.firemonkeyBrowserStrings.PATCH]
    
    inline def POST: typings.firemonkeyBrowser.firemonkeyBrowserStrings.POST = "POST".asInstanceOf[typings.firemonkeyBrowser.firemonkeyBrowserStrings.POST]
    
    inline def PUT: typings.firemonkeyBrowser.firemonkeyBrowserStrings.PUT = "PUT".asInstanceOf[typings.firemonkeyBrowser.firemonkeyBrowserStrings.PUT]
    
    inline def TRACE: typings.firemonkeyBrowser.firemonkeyBrowserStrings.TRACE = "TRACE".asInstanceOf[typings.firemonkeyBrowser.firemonkeyBrowserStrings.TRACE]
  }
  
  trait ScriptInfo extends StObject {
    
    var description: String
    
    var excludeGlobs: js.Array[String]
    
    var excludeMatches: js.Array[String]
    
    var excludes: js.Array[String]
    
    var includeGlobs: js.Array[String]
    
    var includes: js.Array[String]
    
    var matches: js.Array[String]
    
    var name: String
    
    var namespace: String | Null
    
    /**
      * An object keyed by resource name.
      * Each value is an object with keys `name` and `mimetype` and `url`
      *  with string values.
      */
    var resources: StringDictionary[Mimetype]
    
    var `run-at`: document_start | document_end | document_idle
    
    var version: String
  }
  object ScriptInfo {
    
    inline def apply(
      description: String,
      excludeGlobs: js.Array[String],
      excludeMatches: js.Array[String],
      excludes: js.Array[String],
      includeGlobs: js.Array[String],
      includes: js.Array[String],
      matches: js.Array[String],
      name: String,
      resources: StringDictionary[Mimetype],
      `run-at`: document_start | document_end | document_idle,
      version: String
    ): ScriptInfo = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], excludeGlobs = excludeGlobs.asInstanceOf[js.Any], excludeMatches = excludeMatches.asInstanceOf[js.Any], excludes = excludes.asInstanceOf[js.Any], includeGlobs = includeGlobs.asInstanceOf[js.Any], includes = includes.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], namespace = null)
      __obj.updateDynamic("run-at")(`run-at`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScriptInfo]
    }
    
    extension [Self <: ScriptInfo](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExcludeGlobs(value: js.Array[String]): Self = StObject.set(x, "excludeGlobs", value.asInstanceOf[js.Any])
      
      inline def setExcludeGlobsVarargs(value: String*): Self = StObject.set(x, "excludeGlobs", js.Array(value*))
      
      inline def setExcludeMatches(value: js.Array[String]): Self = StObject.set(x, "excludeMatches", value.asInstanceOf[js.Any])
      
      inline def setExcludeMatchesVarargs(value: String*): Self = StObject.set(x, "excludeMatches", js.Array(value*))
      
      inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
      
      inline def setIncludeGlobs(value: js.Array[String]): Self = StObject.set(x, "includeGlobs", value.asInstanceOf[js.Any])
      
      inline def setIncludeGlobsVarargs(value: String*): Self = StObject.set(x, "includeGlobs", js.Array(value*))
      
      inline def setIncludes(value: js.Array[String]): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesVarargs(value: String*): Self = StObject.set(x, "includes", js.Array(value*))
      
      inline def setMatches(value: js.Array[String]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesVarargs(value: String*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceNull: Self = StObject.set(x, "namespace", null)
      
      inline def setResources(value: StringDictionary[Mimetype]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def `setRun-at`(value: document_start | document_end | document_idle): Self = StObject.set(x, "run-at", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type Value = String | Boolean | Double | js.Object
  
  trait XMLRequest[TContext] extends StObject {
    
    var anonymous: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Data to send in the request body. Usually for POST method requests.
      * If the data field contains form-encoded data, you usually must also
      * set the header `'Content-Type': 'application/x-www-form-urlencoded'`
      * in the `headers` field.
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** A set of headers to include in the request */
    var headers: js.UndefOr[Headers] = js.undefined
    
    /** String type of HTTP request to make (E.G. "GET", "POST") */
    var method: js.UndefOr[RequestMethod] = js.undefined
    
    /** Will be called when the request is aborted */
    var onabort: js.UndefOr[js.Function1[/* response */ XMLResponse[TContext], Unit]] = js.undefined
    
    /** Will be called if an error occurs while processing the request */
    var onerror: js.UndefOr[js.Function1[/* response */ XMLResponse[TContext], Unit]] = js.undefined
    
    /** Callback Functions */
    /** Will be called when the request has completed successfully */
    var onload: js.UndefOr[js.Function1[/* response */ XMLResponse[TContext], Unit]] = js.undefined
    
    /** Will be called if/when the request times out */
    var ontimeout: js.UndefOr[js.Function1[/* response */ XMLResponse[TContext], Unit]] = js.undefined
    
    /**
      * A MIME type to specify with the request (e.g.
      * "text/html; charset=ISO-8859-1")
      */
    var overrideMimeType: js.UndefOr[String] = js.undefined
    
    /** Password to use for authentication purposes */
    var password: js.UndefOr[String] = js.undefined
    
    var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.undefined
    
    /**
      * The number of milliseconds to wait before terminating the call. Zero
      * (the default) means wait forever.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The URL to make the request to. Must be an absolute URL, beginning
      * with the scheme. May be relative to the current page.
      */
    var url: String
    
    /** User name to use for authentication purposes. */
    var user: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object XMLRequest {
    
    inline def apply[TContext](url: String): XMLRequest[TContext] = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[XMLRequest[TContext]]
    }
    
    extension [Self <: XMLRequest[?], TContext](x: Self & XMLRequest[TContext]) {
      
      inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
      
      inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: RequestMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOnabort(value: /* response */ XMLResponse[TContext] => Unit): Self = StObject.set(x, "onabort", js.Any.fromFunction1(value))
      
      inline def setOnabortUndefined: Self = StObject.set(x, "onabort", js.undefined)
      
      inline def setOnerror(value: /* response */ XMLResponse[TContext] => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction1(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      inline def setOnload(value: /* response */ XMLResponse[TContext] => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction1(value))
      
      inline def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      inline def setOntimeout(value: /* response */ XMLResponse[TContext] => Unit): Self = StObject.set(x, "ontimeout", js.Any.fromFunction1(value))
      
      inline def setOntimeoutUndefined: Self = StObject.set(x, "ontimeout", js.undefined)
      
      inline def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
      
      inline def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setResponseType(value: XMLHttpRequestResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  trait XMLResponse[TContext] extends StObject {
    
    val finalUrl: String
    
    val readyState: `1` | `2` | `3` | `4`
    
    val response: Any
    
    val responseHeaders: String
    
    val responseText: String
    
    val responseType: js.UndefOr[String] = js.undefined
    
    val responseURL: js.UndefOr[String] = js.undefined
    
    val responseXML: js.UndefOr[Document] = js.undefined
    
    val status: Double
    
    val statusText: String
  }
  object XMLResponse {
    
    inline def apply[TContext](
      finalUrl: String,
      readyState: `1` | `2` | `3` | `4`,
      response: Any,
      responseHeaders: String,
      responseText: String,
      status: Double,
      statusText: String
    ): XMLResponse[TContext] = {
      val __obj = js.Dynamic.literal(finalUrl = finalUrl.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[XMLResponse[TContext]]
    }
    
    extension [Self <: XMLResponse[?], TContext](x: Self & XMLResponse[TContext]) {
      
      inline def setFinalUrl(value: String): Self = StObject.set(x, "finalUrl", value.asInstanceOf[js.Any])
      
      inline def setReadyState(value: `1` | `2` | `3` | `4`): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseHeaders(value: String): Self = StObject.set(x, "responseHeaders", value.asInstanceOf[js.Any])
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setResponseURL(value: String): Self = StObject.set(x, "responseURL", value.asInstanceOf[js.Any])
      
      inline def setResponseURLUndefined: Self = StObject.set(x, "responseURL", js.undefined)
      
      inline def setResponseXML(value: Document): Self = StObject.set(x, "responseXML", value.asInstanceOf[js.Any])
      
      inline def setResponseXMLUndefined: Self = StObject.set(x, "responseXML", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
}
