package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureHostResolverOptions extends StObject {
  
  /**
    * Controls whether additional DNS query types, e.g. HTTPS (DNS type 65) will be
    * allowed besides the traditional A and AAAA queries when a request is being made
    * via insecure DNS. Has no effect on Secure DNS which always allows additional
    * types. Defaults to true.
    */
  var enableAdditionalDnsQueryTypes: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the built-in host resolver is used in preference to getaddrinfo. When
    * enabled, the built-in resolver will attempt to use the system's DNS settings to
    * do DNS lookups itself. Enabled by default on macOS, disabled by default on
    * Windows and Linux.
    */
  var enableBuiltInResolver: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Can be "off", "automatic" or "secure". Configures the DNS-over-HTTP mode. When
    * "off", no DoH lookups will be performed. When "automatic", DoH lookups will be
    * performed first if DoH is available, and insecure DNS lookups will be performed
    * as a fallback. When "secure", only DoH lookups will be performed. Defaults to
    * "automatic".
    */
  var secureDnsMode: js.UndefOr[String] = js.undefined
  
  /**
    * A list of DNS-over-HTTP server templates. See RFC8484 § 3 for details on the
    * template format. Most servers support the POST method; the template for such
    * servers is simply a URI. Note that for some DNS providers, the resolver will
    * automatically upgrade to DoH unless DoH is explicitly disabled, even if there
    * are no DoH servers provided in this list.
    */
  var secureDnsServers: js.UndefOr[js.Array[String]] = js.undefined
}
object ConfigureHostResolverOptions {
  
  inline def apply(): ConfigureHostResolverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureHostResolverOptions]
  }
  
  extension [Self <: ConfigureHostResolverOptions](x: Self) {
    
    inline def setEnableAdditionalDnsQueryTypes(value: Boolean): Self = StObject.set(x, "enableAdditionalDnsQueryTypes", value.asInstanceOf[js.Any])
    
    inline def setEnableAdditionalDnsQueryTypesUndefined: Self = StObject.set(x, "enableAdditionalDnsQueryTypes", js.undefined)
    
    inline def setEnableBuiltInResolver(value: Boolean): Self = StObject.set(x, "enableBuiltInResolver", value.asInstanceOf[js.Any])
    
    inline def setEnableBuiltInResolverUndefined: Self = StObject.set(x, "enableBuiltInResolver", js.undefined)
    
    inline def setSecureDnsMode(value: String): Self = StObject.set(x, "secureDnsMode", value.asInstanceOf[js.Any])
    
    inline def setSecureDnsModeUndefined: Self = StObject.set(x, "secureDnsMode", js.undefined)
    
    inline def setSecureDnsServers(value: js.Array[String]): Self = StObject.set(x, "secureDnsServers", value.asInstanceOf[js.Any])
    
    inline def setSecureDnsServersUndefined: Self = StObject.set(x, "secureDnsServers", js.undefined)
    
    inline def setSecureDnsServersVarargs(value: String*): Self = StObject.set(x, "secureDnsServers", js.Array(value*))
  }
}
