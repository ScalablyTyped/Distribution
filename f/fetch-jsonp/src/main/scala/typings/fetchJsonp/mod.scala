package typings.fetchJsonp

import typings.std.RequestInfo
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(url: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  @scala.inline
  def apply(url: RequestInfo, options: Options): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  @JSImport("fetch-jsonp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var jsonpCallback: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
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
