package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Schema {
  
  trait Domain extends StObject {
    
    /**
      * Domain name.
      */
    var name: String
    
    /**
      * Domain version.
      */
    var version: String
  }
  object Domain {
    
    inline def apply(name: String, version: String): Domain = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    extension [Self <: Domain](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDomainsResponse extends StObject {
    
    /**
      * List of supported domains.
      */
    var domains: js.Array[Domain]
  }
  object GetDomainsResponse {
    
    inline def apply(domains: js.Array[Domain]): GetDomainsResponse = {
      val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDomainsResponse]
    }
    
    extension [Self <: GetDomainsResponse](x: Self) {
      
      inline def setDomains(value: js.Array[Domain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "domains", js.Array(value*))
    }
  }
}
