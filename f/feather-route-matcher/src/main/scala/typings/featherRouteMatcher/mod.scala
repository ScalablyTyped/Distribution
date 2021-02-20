package typings.featherRouteMatcher

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("feather-route-matcher", JSImport.Default)
  @js.native
  def default[T](config: RouteConfig[T]): Matcher[T] = js.native
  
  @js.native
  trait Match[T] extends StObject {
    
    var page: T = js.native
    
    var params: StringDictionary[String] | Null = js.native
    
    var url: String = js.native
  }
  object Match {
    
    @scala.inline
    def apply[T](page: T, url: String): Match[T] = {
      val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Match[T]]
    }
    
    @scala.inline
    implicit class MatchMutableBuilder[Self <: Match[_], T] (val x: Self with Match[T]) extends AnyVal {
      
      @scala.inline
      def setPage(value: T): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsNull: Self = StObject.set(x, "params", null)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Matcher[T] = js.Function1[/* path */ String, Match[T]]
  
  type RouteConfig[T] = StringDictionary[T]
}
