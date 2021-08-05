package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCookiesRequest extends StObject {
  
  /**
    * If specified, deletes only cookies with the exact domain.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the cookies to remove.
    */
  var name: String
  
  /**
    * If specified, deletes only cookies with the exact path.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * If specified, deletes all the cookies with the given name where domain and path match
    * provided URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object DeleteCookiesRequest {
  
  inline def apply(name: String): DeleteCookiesRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCookiesRequest]
  }
  
  extension [Self <: DeleteCookiesRequest](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
