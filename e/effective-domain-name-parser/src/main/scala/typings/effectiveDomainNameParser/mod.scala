package typings.effectiveDomainNameParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("effective-domain-name-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(name: String): ParsedDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(name.asInstanceOf[js.Any]).asInstanceOf[ParsedDomain]
  
  trait ParsedDomain extends StObject {
    
    var sld: String
    
    var subdomain: String
    
    var tld: String
  }
  object ParsedDomain {
    
    inline def apply(sld: String, subdomain: String, tld: String): ParsedDomain = {
      val __obj = js.Dynamic.literal(sld = sld.asInstanceOf[js.Any], subdomain = subdomain.asInstanceOf[js.Any], tld = tld.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedDomain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParsedDomain] (val x: Self) extends AnyVal {
      
      inline def setSld(value: String): Self = StObject.set(x, "sld", value.asInstanceOf[js.Any])
      
      inline def setSubdomain(value: String): Self = StObject.set(x, "subdomain", value.asInstanceOf[js.Any])
      
      inline def setTld(value: String): Self = StObject.set(x, "tld", value.asInstanceOf[js.Any])
    }
  }
}
