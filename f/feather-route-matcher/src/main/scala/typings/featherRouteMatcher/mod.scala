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
    
    var params: StringDictionary[String] | Null
    
    var url: String
    
    var value: T
  }
  object Match {
    
    inline def apply[T](url: String, value: T): Match[T] = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], params = null)
      __obj.asInstanceOf[Match[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Match[?], T] (val x: Self & Match[T]) extends AnyVal {
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsNull: Self = StObject.set(x, "params", null)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Matcher[T] = js.Function1[/* path */ String, Match[T]]
  
  type RouteConfig[T] = StringDictionary[T]
}
