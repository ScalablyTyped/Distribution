package typings.fetchJsonp

import typings.std.RequestInfo
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fetch-jsonp", JSImport.Namespace)
  @js.native
  def apply(url: RequestInfo): js.Promise[Response] = js.native
  @JSImport("fetch-jsonp", JSImport.Namespace)
  @js.native
  def apply(url: RequestInfo, options: Options): js.Promise[Response] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var jsonpCallback: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJsonpCallback(value: String): Self = StObject.set(x, "jsonpCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonpCallbackUndefined: Self = StObject.set(x, "jsonpCallback", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
