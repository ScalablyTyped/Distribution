package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProxyInfo extends StObject {
  
  /**
    * For a direct proxy, the hosts for which the proxy is bypassed. The host names may contain wildcards such as *.example.com.
    */
  var excludedHosts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The host of the direct proxy.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI of the PAC script used to configure the proxy.
    */
  var pacUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The port of the direct proxy.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
}
object SchemaProxyInfo {
  
  inline def apply(): SchemaProxyInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProxyInfo]
  }
  
  extension [Self <: SchemaProxyInfo](x: Self) {
    
    inline def setExcludedHosts(value: js.Array[String]): Self = StObject.set(x, "excludedHosts", value.asInstanceOf[js.Any])
    
    inline def setExcludedHostsNull: Self = StObject.set(x, "excludedHosts", null)
    
    inline def setExcludedHostsUndefined: Self = StObject.set(x, "excludedHosts", js.undefined)
    
    inline def setExcludedHostsVarargs(value: String*): Self = StObject.set(x, "excludedHosts", js.Array(value*))
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPacUri(value: String): Self = StObject.set(x, "pacUri", value.asInstanceOf[js.Any])
    
    inline def setPacUriNull: Self = StObject.set(x, "pacUri", null)
    
    inline def setPacUriUndefined: Self = StObject.set(x, "pacUri", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
