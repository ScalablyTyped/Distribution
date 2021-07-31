package typings.followRedirects

import typings.node.httpMod.Agent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Http extends StObject {
    
    var http: js.UndefOr[Agent] = js.undefined
    
    var https: js.UndefOr[typings.node.httpsMod.Agent] = js.undefined
  }
  object Http {
    
    @scala.inline
    def apply(): Http = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Http]
    }
    
    @scala.inline
    implicit class HttpMutableBuilder[Self <: Http] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttp(value: Agent): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      @scala.inline
      def setHttps(value: typings.node.httpsMod.Agent): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    }
  }
  
  trait Location extends StObject {
    
    var location: js.UndefOr[String] = js.undefined
  }
  object Location {
    
    @scala.inline
    def apply(): Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
}
