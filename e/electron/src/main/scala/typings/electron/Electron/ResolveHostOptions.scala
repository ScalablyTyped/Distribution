package typings.electron.Electron

import typings.electron.electronStrings.A
import typings.electron.electronStrings.AAAA
import typings.electron.electronStrings.allow
import typings.electron.electronStrings.allowed
import typings.electron.electronStrings.any
import typings.electron.electronStrings.disable
import typings.electron.electronStrings.disallowed
import typings.electron.electronStrings.dns
import typings.electron.electronStrings.localOnly
import typings.electron.electronStrings.mdns
import typings.electron.electronStrings.staleAllowed
import typings.electron.electronStrings.system
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveHostOptions extends StObject {
  
  /**
    * Indicates what DNS cache entries, if any, can be used to provide a response. One
    * of the following values:
    */
  var cacheUsage: js.UndefOr[allowed | staleAllowed | disallowed] = js.undefined
  
  /**
    * Requested DNS query type. If unspecified, resolver will pick A or AAAA (or both)
    * based on IPv4/IPv6 settings:
    */
  var queryType: js.UndefOr[A | AAAA] = js.undefined
  
  /**
    * Controls the resolver's Secure DNS behavior for this request. One of the
    * following values:
    */
  var secureDnsPolicy: js.UndefOr[allow | disable] = js.undefined
  
  /**
    * The source to use for resolved addresses. Default allows the resolver to pick an
    * appropriate source. Only affects use of big external sources (e.g. calling the
    * system for resolution or using DNS). Even if a source is specified, results can
    * still come from cache, resolving "localhost" or IP literals, etc. One of the
    * following values:
    */
  var source: js.UndefOr[any | system | dns | mdns | localOnly] = js.undefined
}
object ResolveHostOptions {
  
  inline def apply(): ResolveHostOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveHostOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolveHostOptions] (val x: Self) extends AnyVal {
    
    inline def setCacheUsage(value: allowed | staleAllowed | disallowed): Self = StObject.set(x, "cacheUsage", value.asInstanceOf[js.Any])
    
    inline def setCacheUsageUndefined: Self = StObject.set(x, "cacheUsage", js.undefined)
    
    inline def setQueryType(value: A | AAAA): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    inline def setQueryTypeUndefined: Self = StObject.set(x, "queryType", js.undefined)
    
    inline def setSecureDnsPolicy(value: allow | disable): Self = StObject.set(x, "secureDnsPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecureDnsPolicyUndefined: Self = StObject.set(x, "secureDnsPolicy", js.undefined)
    
    inline def setSource(value: any | system | dns | mdns | localOnly): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
