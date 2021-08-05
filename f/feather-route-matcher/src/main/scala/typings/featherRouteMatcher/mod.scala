package typings.featherRouteMatcher

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("feather-route-matcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](config: RouteConfig[T]): Matcher[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Matcher[T]]
  
  trait Match[T] extends StObject {
    
    var page: T
    
    var params: StringDictionary[String] | Null
    
    var url: String
  }
  object Match {
    
    inline def apply[T](page: T, url: String): Match[T] = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], params = null)
      __obj.asInstanceOf[Match[T]]
    }
    
    extension [Self <: Match[?], T](x: Self & Match[T]) {
      
      inline def setPage(value: T): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsNull: Self = StObject.set(x, "params", null)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Matcher[T] = js.Function1[/* path */ String, Match[T]]
  
  type RouteConfig[T] = StringDictionary[T]
}
