package typings.expressBusboy

import typings.connectBusboy.mod.ConnectBusboyOptions
import typings.express.mod.Application_
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-busboy", "extend")
  @js.native
  def extend(app: Application_): Application_ = js.native
  @JSImport("express-busboy", "extend")
  @js.native
  def extend(app: Application_, options: ExpressBusboyOptions): Application_ = js.native
  
  @js.native
  trait ExpressBusboyOptions extends ConnectBusboyOptions {
    
    var allowedPath: js.UndefOr[String | RegExp | (js.Function1[/* url */ String, Boolean])] = js.native
    
    var mimeTypeLimit: js.UndefOr[String | js.Array[String]] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var restrictMultiple: js.UndefOr[Boolean] = js.native
    
    var upload: js.UndefOr[Boolean] = js.native
  }
  object ExpressBusboyOptions {
    
    @scala.inline
    def apply(): ExpressBusboyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressBusboyOptions]
    }
    
    @scala.inline
    implicit class ExpressBusboyOptionsMutableBuilder[Self <: ExpressBusboyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedPath(value: String | RegExp | (js.Function1[/* url */ String, Boolean])): Self = StObject.set(x, "allowedPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedPathFunction1(value: /* url */ String => Boolean): Self = StObject.set(x, "allowedPath", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAllowedPathUndefined: Self = StObject.set(x, "allowedPath", js.undefined)
      
      @scala.inline
      def setMimeTypeLimit(value: String | js.Array[String]): Self = StObject.set(x, "mimeTypeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeLimitUndefined: Self = StObject.set(x, "mimeTypeLimit", js.undefined)
      
      @scala.inline
      def setMimeTypeLimitVarargs(value: String*): Self = StObject.set(x, "mimeTypeLimit", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setRestrictMultiple(value: Boolean): Self = StObject.set(x, "restrictMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictMultipleUndefined: Self = StObject.set(x, "restrictMultiple", js.undefined)
      
      @scala.inline
      def setUpload(value: Boolean): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    }
  }
}
