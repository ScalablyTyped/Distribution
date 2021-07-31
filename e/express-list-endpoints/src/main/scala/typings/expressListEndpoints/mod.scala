package typings.expressListEndpoints

import typings.express.mod.Express
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(app: Express): js.Array[Endpoint] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[js.Array[Endpoint]]
  
  @JSImport("express-list-endpoints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Endpoint extends StObject {
    
    var methods: js.Array[String]
    
    var path: String
  }
  object Endpoint {
    
    @scala.inline
    def apply(methods: js.Array[String], path: String): Endpoint = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    @scala.inline
    implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
