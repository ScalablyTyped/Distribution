package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The information about the HTTP Cookie on which the hash function is based
  * for load balancing policies that use a consistent hash.
  */
trait SchemaConsistentHashLoadBalancerSettingsHttpCookie extends StObject {
  
  /**
    * Name of the cookie.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Path to set for the cookie.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Lifetime of the cookie.
    */
  var ttl: js.UndefOr[SchemaDuration] = js.undefined
}
object SchemaConsistentHashLoadBalancerSettingsHttpCookie {
  
  inline def apply(): SchemaConsistentHashLoadBalancerSettingsHttpCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsistentHashLoadBalancerSettingsHttpCookie]
  }
  
  extension [Self <: SchemaConsistentHashLoadBalancerSettingsHttpCookie](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setTtl(value: SchemaDuration): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
