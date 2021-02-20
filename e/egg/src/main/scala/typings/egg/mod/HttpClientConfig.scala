package typings.egg.mod

import org.scalablytyped.runtime.StringDictionary
import typings.urllib.mod.RequestOptions2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpClientConfig extends HttpClientBaseConfig {
  
  /** DNS cache lookup interval */
  var dnsCacheLookupInterval: js.UndefOr[Double] = js.native
  
  /** DNS cache max age */
  var dnsCacheMaxLength: js.UndefOr[Double] = js.native
  
  /** Whether enable dns cache */
  var enableDNSCache: js.UndefOr[Boolean] = js.native
  
  /** Enable proxy request, default is false. */
  var enableProxy: js.UndefOr[Boolean] = js.native
  
  /** http.Agent */
  var httpAgent: js.UndefOr[HttpClientBaseConfig] = js.native
  
  /** https.Agent */
  var httpsAgent: js.UndefOr[HttpClientBaseConfig] = js.native
  
  /** proxy agent uri or options, default is null. */
  var proxy: js.UndefOr[String | StringDictionary[js.Any]] = js.native
  
  /** Default request args for httpclient */
  var request: js.UndefOr[RequestOptions2] = js.native
}
object HttpClientConfig {
  
  @scala.inline
  def apply(): HttpClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpClientConfig]
  }
  
  @scala.inline
  implicit class HttpClientConfigMutableBuilder[Self <: HttpClientConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsCacheLookupInterval(value: Double): Self = StObject.set(x, "dnsCacheLookupInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsCacheLookupIntervalUndefined: Self = StObject.set(x, "dnsCacheLookupInterval", js.undefined)
    
    @scala.inline
    def setDnsCacheMaxLength(value: Double): Self = StObject.set(x, "dnsCacheMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsCacheMaxLengthUndefined: Self = StObject.set(x, "dnsCacheMaxLength", js.undefined)
    
    @scala.inline
    def setEnableDNSCache(value: Boolean): Self = StObject.set(x, "enableDNSCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDNSCacheUndefined: Self = StObject.set(x, "enableDNSCache", js.undefined)
    
    @scala.inline
    def setEnableProxy(value: Boolean): Self = StObject.set(x, "enableProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableProxyUndefined: Self = StObject.set(x, "enableProxy", js.undefined)
    
    @scala.inline
    def setHttpAgent(value: HttpClientBaseConfig): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
    
    @scala.inline
    def setHttpsAgent(value: HttpClientBaseConfig): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
    
    @scala.inline
    def setProxy(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setRequest(value: RequestOptions2): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
