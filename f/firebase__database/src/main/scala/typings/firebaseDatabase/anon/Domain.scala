package typings.firebaseDatabase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  var domain: String
  
  var host: String
  
  var namespace: String
  
  var pathString: String
  
  var port: Double
  
  var scheme: String
  
  var secure: Boolean
  
  var subdomain: String
}
object Domain {
  
  @scala.inline
  def apply(
    domain: String,
    host: String,
    namespace: String,
    pathString: String,
    port: Double,
    scheme: String,
    secure: Boolean,
    subdomain: String
  ): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], pathString = pathString.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathString(value: String): Self = StObject.set(x, "pathString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
  }
}
