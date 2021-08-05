package typings.download

import org.scalablytyped.runtime.StringDictionary
import typings.decompress.mod.DecompressOptions
import typings.got.mod.AgentOptions
import typings.got.mod.Cache
import typings.got.mod.GotBodyOptions
import typings.got.mod.Hooks
import typings.got.mod.RequestFunction
import typings.got.mod.RetryOptions
import typings.got.mod.TimeoutOptions
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.httpMod.Agent
import typings.node.httpsMod.RequestOptions
import typings.node.streamMod.Readable
import typings.node.urlMod.URLSearchParams
import typings.std.Record
import typings.toughCookie.mod.CookieJar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): js.Promise[Buffer] & WritableStream & ReadableStream = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer] & WritableStream & ReadableStream]
  inline def apply(url: String, destination: String): js.Promise[Buffer] & WritableStream & ReadableStream = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer] & WritableStream & ReadableStream]
  inline def apply(url: String, destination: String, options: DownloadOptions): js.Promise[Buffer] & WritableStream & ReadableStream = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer] & WritableStream & ReadableStream]
  inline def apply(url: String, destination: Unit, options: DownloadOptions): js.Promise[Buffer] & WritableStream & ReadableStream = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer] & WritableStream & ReadableStream]
  
  @JSImport("download", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - typings.got.mod.InternalRequestOptions because Inheritance from two classes. Inlined agent_InternalRequestOptions, timeout_InternalRequestOptions
  - typings.got.mod.GotOptions because Inheritance from two classes. Inlined request, decompress, followRedirect, retry, encoding, cache, cookieJar, agent_GotOptions, query, timeout_GotOptions, throwHttpErrors, baseUrl, useElectronNet
  - typings.got.mod.GotBodyOptions because Inheritance from two classes. Inlined body, hooks */ trait DownloadOptions
    extends StObject
       with DecompressOptions
       with RequestOptions {
    
    @JSName("agent")
    var agent_GotOptions: js.UndefOr[Agent | Boolean | AgentOptions] = js.undefined
    @JSName("agent")
    var agent_InternalRequestOptions: js.UndefOr[js.Any] = js.undefined
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var body: js.UndefOr[String | Buffer | Readable] = js.undefined
    
    var cache: js.UndefOr[Cache] = js.undefined
    
    var cookieJar: js.UndefOr[CookieJar] = js.undefined
    
    var decompress: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true, try extracting the file using decompress.
      */
    var extract: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the saved file.
      */
    var filename: js.UndefOr[String] = js.undefined
    
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Request Headers
      */
    @JSName("headers")
    var headers_DownloadOptions: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var hooks: js.UndefOr[Hooks[GotBodyOptions[String], String | Buffer | Readable]] = js.undefined
    
    /**
      * Proxy endpoint
      */
    var proxy: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[(Record[String, js.Any]) | URLSearchParams | String] = js.undefined
    
    var request: js.UndefOr[RequestFunction] = js.undefined
    
    var retry: js.UndefOr[Double | RetryOptions] = js.undefined
    
    var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
    
    @JSName("timeout")
    var timeout_GotOptions: js.UndefOr[Double | TimeoutOptions] = js.undefined
    // Redeclare options with `any` type for allow specify types incompatible with http.RequestOptions.
    @JSName("timeout")
    var timeout_InternalRequestOptions: js.UndefOr[js.Any] = js.undefined
    
    var useElectronNet: js.UndefOr[Boolean] = js.undefined
  }
  object DownloadOptions {
    
    inline def apply(): DownloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadOptions]
    }
    
    extension [Self <: DownloadOptions](x: Self) {
      
      inline def setAgent(value: Agent | AgentOptions | js.Any | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBody(value: String | Buffer | Readable): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCookieJar(value: CookieJar): Self = StObject.set(x, "cookieJar", value.asInstanceOf[js.Any])
      
      inline def setCookieJarUndefined: Self = StObject.set(x, "cookieJar", js.undefined)
      
      inline def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      inline def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setExtract(value: Boolean): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
      
      inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHooks(value: Hooks[GotBodyOptions[String], String | Buffer | Readable]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setQuery(value: (Record[String, js.Any]) | URLSearchParams | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRequest(value: RequestFunction): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setRetry(value: Double | RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      inline def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      inline def setTimeout(value: js.Any | Double | TimeoutOptions): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
      
      inline def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
    }
  }
  
  type RetryFunction = js.Function2[/* retry */ Double, /* error */ js.Any, Double]
}
