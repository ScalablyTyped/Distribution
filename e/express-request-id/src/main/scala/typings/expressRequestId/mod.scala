package typings.expressRequestId

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.qs.mod.ParsedQs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]]
  inline def apply(options: Options): RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]]
  
  @JSImport("express-request-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var attributeName: js.UndefOr[String] = js.undefined
    
    var headerName: js.UndefOr[String] = js.undefined
    
    var setHeader: js.UndefOr[Boolean] = js.undefined
    
    var uuidVersion: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setAttributeNameUndefined: Self = StObject.set(x, "attributeName", js.undefined)
      
      inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
      
      inline def setSetHeader(value: Boolean): Self = StObject.set(x, "setHeader", value.asInstanceOf[js.Any])
      
      inline def setSetHeaderUndefined: Self = StObject.set(x, "setHeader", js.undefined)
      
      inline def setUuidVersion(value: String): Self = StObject.set(x, "uuidVersion", value.asInstanceOf[js.Any])
      
      inline def setUuidVersionUndefined: Self = StObject.set(x, "uuidVersion", js.undefined)
    }
  }
}
