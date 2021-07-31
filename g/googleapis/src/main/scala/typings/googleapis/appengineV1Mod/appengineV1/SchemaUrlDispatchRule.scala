package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rules to match an HTTP request and dispatch that request to a service.
  */
trait SchemaUrlDispatchRule extends StObject {
  
  /**
    * Domain name to match against. The wildcard &quot;*&quot; is supported if
    * specified before a period: &quot;*.&quot;.Defaults to matching all
    * domains: &quot;*&quot;.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Pathname within the host. Must start with a &quot;/&quot;. A single
    * &quot;*&quot; can be included at the end of the path.The sum of the
    * lengths of the domain and path may not exceed 100 characters.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Resource ID of a service in this application that should serve the
    * matched request. The service must already exist. Example: default.
    */
  var service: js.UndefOr[String] = js.undefined
}
object SchemaUrlDispatchRule {
  
  @scala.inline
  def apply(): SchemaUrlDispatchRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlDispatchRule]
  }
  
  @scala.inline
  implicit class SchemaUrlDispatchRuleMutableBuilder[Self <: SchemaUrlDispatchRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
