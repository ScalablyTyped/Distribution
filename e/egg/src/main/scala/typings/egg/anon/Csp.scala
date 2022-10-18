package typings.egg.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Csp extends StObject {
  
  var csp: Any
  
  var csrf: Any
  
  var defaultMiddleware: String
  
  var domainWhiteList: js.Array[String]
  
  var hsts: Any
  
  var methodnoallow: EnableBoolean
  
  var noopen: EnableBoolean
  
  var protocolWhiteList: js.Array[String]
  
  var ssrf: CheckAddress
  
  var xframe: Value
  
  var xssProtection: Any
}
object Csp {
  
  inline def apply(
    csp: Any,
    csrf: Any,
    defaultMiddleware: String,
    domainWhiteList: js.Array[String],
    hsts: Any,
    methodnoallow: EnableBoolean,
    noopen: EnableBoolean,
    protocolWhiteList: js.Array[String],
    ssrf: CheckAddress,
    xframe: Value,
    xssProtection: Any
  ): Csp = {
    val __obj = js.Dynamic.literal(csp = csp.asInstanceOf[js.Any], csrf = csrf.asInstanceOf[js.Any], defaultMiddleware = defaultMiddleware.asInstanceOf[js.Any], domainWhiteList = domainWhiteList.asInstanceOf[js.Any], hsts = hsts.asInstanceOf[js.Any], methodnoallow = methodnoallow.asInstanceOf[js.Any], noopen = noopen.asInstanceOf[js.Any], protocolWhiteList = protocolWhiteList.asInstanceOf[js.Any], ssrf = ssrf.asInstanceOf[js.Any], xframe = xframe.asInstanceOf[js.Any], xssProtection = xssProtection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Csp]
  }
  
  extension [Self <: Csp](x: Self) {
    
    inline def setCsp(value: Any): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
    
    inline def setCsrf(value: Any): Self = StObject.set(x, "csrf", value.asInstanceOf[js.Any])
    
    inline def setDefaultMiddleware(value: String): Self = StObject.set(x, "defaultMiddleware", value.asInstanceOf[js.Any])
    
    inline def setDomainWhiteList(value: js.Array[String]): Self = StObject.set(x, "domainWhiteList", value.asInstanceOf[js.Any])
    
    inline def setDomainWhiteListVarargs(value: String*): Self = StObject.set(x, "domainWhiteList", js.Array(value*))
    
    inline def setHsts(value: Any): Self = StObject.set(x, "hsts", value.asInstanceOf[js.Any])
    
    inline def setMethodnoallow(value: EnableBoolean): Self = StObject.set(x, "methodnoallow", value.asInstanceOf[js.Any])
    
    inline def setNoopen(value: EnableBoolean): Self = StObject.set(x, "noopen", value.asInstanceOf[js.Any])
    
    inline def setProtocolWhiteList(value: js.Array[String]): Self = StObject.set(x, "protocolWhiteList", value.asInstanceOf[js.Any])
    
    inline def setProtocolWhiteListVarargs(value: String*): Self = StObject.set(x, "protocolWhiteList", js.Array(value*))
    
    inline def setSsrf(value: CheckAddress): Self = StObject.set(x, "ssrf", value.asInstanceOf[js.Any])
    
    inline def setXframe(value: Value): Self = StObject.set(x, "xframe", value.asInstanceOf[js.Any])
    
    inline def setXssProtection(value: Any): Self = StObject.set(x, "xssProtection", value.asInstanceOf[js.Any])
  }
}
