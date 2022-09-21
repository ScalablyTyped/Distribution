package typings.expressListEndpoints

import typings.express.mod.Express
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(app: Express): js.Array[Endpoint] = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[js.Array[Endpoint]]
  
  @JSImport("express-list-endpoints", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Endpoint extends StObject {
    
    var methods: js.Array[String]
    
    var middlewares: js.Array[String]
    
    var path: String
  }
  object Endpoint {
    
    inline def apply(methods: js.Array[String], middlewares: js.Array[String], path: String): Endpoint = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], middlewares = middlewares.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Endpoint]
    }
    
    extension [Self <: Endpoint](x: Self) {
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setMiddlewares(value: js.Array[String]): Self = StObject.set(x, "middlewares", value.asInstanceOf[js.Any])
      
      inline def setMiddlewaresVarargs(value: String*): Self = StObject.set(x, "middlewares", js.Array(value*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
