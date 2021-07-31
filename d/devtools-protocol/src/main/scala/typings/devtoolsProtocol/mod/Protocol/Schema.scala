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
    
    @scala.inline
    def apply(name: String, version: String): Domain = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Domain]
    }
    
    @scala.inline
    implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDomainsResponse extends StObject {
    
    /**
      * List of supported domains.
      */
    var domains: js.Array[Domain]
  }
  object GetDomainsResponse {
    
    @scala.inline
    def apply(domains: js.Array[Domain]): GetDomainsResponse = {
      val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDomainsResponse]
    }
    
    @scala.inline
    implicit class GetDomainsResponseMutableBuilder[Self <: GetDomainsResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomains(value: js.Array[Domain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "domains", js.Array(value :_*))
    }
  }
}
