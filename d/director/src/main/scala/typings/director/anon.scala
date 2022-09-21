package typings.director

import typings.director.directorBooleans.`true`
import typings.director.directorStrings.applicationSlashjson
import typings.director.mod.RouteEntry
import typings.director.mod.http.HttpRouteHandlerOptions
import typings.director.mod.http.HttpRouterContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Allow extends StObject {
    
    /** Allowed HTTP methods */
    var allow: String
  }
  object Allow {
    
    inline def apply(allow: String): Allow = {
      val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Allow]
    }
    
    extension [Self <: Allow](x: Self) {
      
      inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    /** Error message (same as `this.message`) */
    var error: String
  }
  object Error {
    
    inline def apply(error: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: String, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
    def apply(path: String, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
    def apply(path: String, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
    def apply(path: String, route: RouteEntry[HttpRouterContext]): Unit = js.native
    def apply(path: js.RegExp, options: Null, route: RouteEntry[HttpRouterContext]): Unit = js.native
    def apply(path: js.RegExp, options: Unit, route: RouteEntry[HttpRouterContext]): Unit = js.native
    def apply(path: js.RegExp, options: HttpRouteHandlerOptions, route: RouteEntry[HttpRouterContext]): Unit = js.native
    def apply(path: js.RegExp, route: RouteEntry[HttpRouterContext]): Unit = js.native
    def apply(route: RouteEntry[HttpRouterContext]): Unit = js.native
  }
  
  trait Method extends StObject {
    
    var method: String
    
    var path: String
  }
  object Method {
    
    inline def apply(method: String, path: String): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    extension [Self <: Method](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Only extends StObject {
    
    /** Error message (same as `this.message`) */
    var error: String
    
    var only: applicationSlashjson
  }
  object Only {
    
    inline def apply(error: String): Only = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], only = "application/json")
      __obj.asInstanceOf[Only]
    }
    
    extension [Self <: Only](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setOnly(value: applicationSlashjson): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    }
  }
  
  trait RemoveContentHeaders extends StObject {
    
    var removeContentHeaders: `true`
  }
  object RemoveContentHeaders {
    
    inline def apply(): RemoveContentHeaders = {
      val __obj = js.Dynamic.literal(removeContentHeaders = true)
      __obj.asInstanceOf[RemoveContentHeaders]
    }
    
    extension [Self <: RemoveContentHeaders](x: Self) {
      
      inline def setRemoveContentHeaders(value: `true`): Self = StObject.set(x, "removeContentHeaders", value.asInstanceOf[js.Any])
    }
  }
}
