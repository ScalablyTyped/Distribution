package typings.egg.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpClientConfig
  extends StObject
     with HttpClientBaseConfig {
  
  /** DNS cache lookup interval */
  var dnsCacheLookupInterval: js.UndefOr[Double] = js.undefined
  
  /** DNS cache max age */
  var dnsCacheMaxLength: js.UndefOr[Double] = js.undefined
  
  /** Whether enable dns cache */
  var enableDNSCache: js.UndefOr[Boolean] = js.undefined
  
  /** Enable proxy request, default is false. */
  var enableProxy: js.UndefOr[Boolean] = js.undefined
  
  /** http.Agent */
  var httpAgent: js.UndefOr[HttpClientBaseConfig] = js.undefined
  
  /** https.Agent */
  var httpsAgent: js.UndefOr[HttpClientBaseConfig] = js.undefined
  
  /** proxy agent uri or options, default is null. */
  var proxy: js.UndefOr[String | StringDictionary[Any]] = js.undefined
  
  /** Default request args for httpclient */
  var request: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestOptions */ Any
  ] = js.undefined
  
  /** use urllib@3 HttpClient */
  var useHttpClientNext: js.UndefOr[Boolean] = js.undefined
}
object HttpClientConfig {
  
  inline def apply(): HttpClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpClientConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpClientConfig] (val x: Self) extends AnyVal {
    
    inline def setDnsCacheLookupInterval(value: Double): Self = StObject.set(x, "dnsCacheLookupInterval", value.asInstanceOf[js.Any])
    
    inline def setDnsCacheLookupIntervalUndefined: Self = StObject.set(x, "dnsCacheLookupInterval", js.undefined)
    
    inline def setDnsCacheMaxLength(value: Double): Self = StObject.set(x, "dnsCacheMaxLength", value.asInstanceOf[js.Any])
    
    inline def setDnsCacheMaxLengthUndefined: Self = StObject.set(x, "dnsCacheMaxLength", js.undefined)
    
    inline def setEnableDNSCache(value: Boolean): Self = StObject.set(x, "enableDNSCache", value.asInstanceOf[js.Any])
    
    inline def setEnableDNSCacheUndefined: Self = StObject.set(x, "enableDNSCache", js.undefined)
    
    inline def setEnableProxy(value: Boolean): Self = StObject.set(x, "enableProxy", value.asInstanceOf[js.Any])
    
    inline def setEnableProxyUndefined: Self = StObject.set(x, "enableProxy", js.undefined)
    
    inline def setHttpAgent(value: HttpClientBaseConfig): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
    
    inline def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
    
    inline def setHttpsAgent(value: HttpClientBaseConfig): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
    
    inline def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
    
    inline def setProxy(value: String | StringDictionary[Any]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setRequest(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestOptions */ Any
    ): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setUseHttpClientNext(value: Boolean): Self = StObject.set(x, "useHttpClientNext", value.asInstanceOf[js.Any])
    
    inline def setUseHttpClientNextUndefined: Self = StObject.set(x, "useHttpClientNext", js.undefined)
  }
}
