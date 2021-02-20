package typings.devtoolsProtocol.mod.Protocol.Audits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AffectedCookie extends StObject {
  
  var domain: String = js.native
  
  /**
    * The following three properties uniquely identify a cookie
    */
  var name: String = js.native
  
  var path: String = js.native
}
object AffectedCookie {
  
  @scala.inline
  def apply(domain: String, name: String, path: String): AffectedCookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffectedCookie]
  }
  
  @scala.inline
  implicit class AffectedCookieMutableBuilder[Self <: AffectedCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
