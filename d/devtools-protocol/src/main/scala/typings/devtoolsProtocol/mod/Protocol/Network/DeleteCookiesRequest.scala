package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCookiesRequest extends StObject {
  
  /**
    * If specified, deletes only cookies with the exact domain.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * Name of the cookies to remove.
    */
  var name: String = js.native
  
  /**
    * If specified, deletes only cookies with the exact path.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * If specified, deletes all the cookies with the given name where domain and path match
    * provided URL.
    */
  var url: js.UndefOr[String] = js.native
}
object DeleteCookiesRequest {
  
  @scala.inline
  def apply(name: String): DeleteCookiesRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCookiesRequest]
  }
  
  @scala.inline
  implicit class DeleteCookiesRequestMutableBuilder[Self <: DeleteCookiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
