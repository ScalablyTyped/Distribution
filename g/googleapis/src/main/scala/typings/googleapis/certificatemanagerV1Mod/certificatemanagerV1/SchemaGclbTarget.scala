package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGclbTarget extends StObject {
  
  /**
    * Output only. IP configurations for this Target Proxy where the Certificate Map is serving.
    */
  var ipConfigs: js.UndefOr[js.Array[SchemaIpConfig]] = js.undefined
  
  /**
    * Output only. This field returns the resource name in the following format: `//compute.googleapis.com/projects/x/global/targetHttpsProxies/x`.
    */
  var targetHttpsProxy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. This field returns the resource name in the following format: `//compute.googleapis.com/projects/x/global/targetSslProxies/x`.
    */
  var targetSslProxy: js.UndefOr[String | Null] = js.undefined
}
object SchemaGclbTarget {
  
  inline def apply(): SchemaGclbTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGclbTarget]
  }
  
  extension [Self <: SchemaGclbTarget](x: Self) {
    
    inline def setIpConfigs(value: js.Array[SchemaIpConfig]): Self = StObject.set(x, "ipConfigs", value.asInstanceOf[js.Any])
    
    inline def setIpConfigsUndefined: Self = StObject.set(x, "ipConfigs", js.undefined)
    
    inline def setIpConfigsVarargs(value: SchemaIpConfig*): Self = StObject.set(x, "ipConfigs", js.Array(value*))
    
    inline def setTargetHttpsProxy(value: String): Self = StObject.set(x, "targetHttpsProxy", value.asInstanceOf[js.Any])
    
    inline def setTargetHttpsProxyNull: Self = StObject.set(x, "targetHttpsProxy", null)
    
    inline def setTargetHttpsProxyUndefined: Self = StObject.set(x, "targetHttpsProxy", js.undefined)
    
    inline def setTargetSslProxy(value: String): Self = StObject.set(x, "targetSslProxy", value.asInstanceOf[js.Any])
    
    inline def setTargetSslProxyNull: Self = StObject.set(x, "targetSslProxy", null)
    
    inline def setTargetSslProxyUndefined: Self = StObject.set(x, "targetSslProxy", js.undefined)
  }
}
