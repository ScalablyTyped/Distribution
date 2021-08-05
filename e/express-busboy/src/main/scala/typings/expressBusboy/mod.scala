package typings.expressBusboy

import typings.connectBusboy.mod.ConnectBusboyOptions
import typings.express.mod.Application_
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-busboy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extend(app: Application_): Application_ = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(app.asInstanceOf[js.Any]).asInstanceOf[Application_]
  inline def extend(app: Application_, options: ExpressBusboyOptions): Application_ = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Application_]
  
  trait ExpressBusboyOptions
    extends StObject
       with ConnectBusboyOptions {
    
    var allowedPath: js.UndefOr[String | RegExp | (js.Function1[/* url */ String, Boolean])] = js.undefined
    
    var mimeTypeLimit: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var restrictMultiple: js.UndefOr[Boolean] = js.undefined
    
    var upload: js.UndefOr[Boolean] = js.undefined
  }
  object ExpressBusboyOptions {
    
    inline def apply(): ExpressBusboyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressBusboyOptions]
    }
    
    extension [Self <: ExpressBusboyOptions](x: Self) {
      
      inline def setAllowedPath(value: String | RegExp | (js.Function1[/* url */ String, Boolean])): Self = StObject.set(x, "allowedPath", value.asInstanceOf[js.Any])
      
      inline def setAllowedPathFunction1(value: /* url */ String => Boolean): Self = StObject.set(x, "allowedPath", js.Any.fromFunction1(value))
      
      inline def setAllowedPathUndefined: Self = StObject.set(x, "allowedPath", js.undefined)
      
      inline def setMimeTypeLimit(value: String | js.Array[String]): Self = StObject.set(x, "mimeTypeLimit", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeLimitUndefined: Self = StObject.set(x, "mimeTypeLimit", js.undefined)
      
      inline def setMimeTypeLimitVarargs(value: String*): Self = StObject.set(x, "mimeTypeLimit", js.Array(value :_*))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRestrictMultiple(value: Boolean): Self = StObject.set(x, "restrictMultiple", value.asInstanceOf[js.Any])
      
      inline def setRestrictMultipleUndefined: Self = StObject.set(x, "restrictMultiple", js.undefined)
      
      inline def setUpload(value: Boolean): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    }
  }
}
