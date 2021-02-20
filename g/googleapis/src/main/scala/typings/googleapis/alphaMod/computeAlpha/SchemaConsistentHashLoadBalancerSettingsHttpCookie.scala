package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The information about the HTTP Cookie on which the hash function is based
  * for load balancing policies that use a consistent hash.
  */
@js.native
trait SchemaConsistentHashLoadBalancerSettingsHttpCookie extends StObject {
  
  /**
    * Name of the cookie.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Path to set for the cookie.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Lifetime of the cookie.
    */
  var ttl: js.UndefOr[SchemaDuration] = js.native
}
object SchemaConsistentHashLoadBalancerSettingsHttpCookie {
  
  @scala.inline
  def apply(): SchemaConsistentHashLoadBalancerSettingsHttpCookie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsistentHashLoadBalancerSettingsHttpCookie]
  }
  
  @scala.inline
  implicit class SchemaConsistentHashLoadBalancerSettingsHttpCookieMutableBuilder[Self <: SchemaConsistentHashLoadBalancerSettingsHttpCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTtl(value: SchemaDuration): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
