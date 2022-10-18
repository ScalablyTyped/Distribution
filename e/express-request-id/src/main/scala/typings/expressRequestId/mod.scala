package typings.expressRequestId

import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.RequestHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): RequestHandler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[RequestHandler]
  inline def apply(options: Options): RequestHandler = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[RequestHandler]
  
  @JSImport("express-request-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var generator: js.UndefOr[js.Function1[/* request */ Request, String]] = js.undefined
    
    var headerName: js.UndefOr[String] = js.undefined
    
    var setHeader: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGenerator(value: /* request */ Request => String): Self = StObject.set(x, "generator", js.Any.fromFunction1(value))
      
      inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
      
      inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
      
      inline def setSetHeader(value: Boolean): Self = StObject.set(x, "setHeader", value.asInstanceOf[js.Any])
      
      inline def setSetHeaderUndefined: Self = StObject.set(x, "setHeader", js.undefined)
    }
  }
  
  object global {
    
    object Express {
      
      // Inject additional properties on express.Request
      trait Request extends StObject {
        
        var id: String
      }
      object Request {
        
        inline def apply(id: String): typings.expressRequestId.mod.global.Express.Request = {
          val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.expressRequestId.mod.global.Express.Request]
        }
        
        extension [Self <: typings.expressRequestId.mod.global.Express.Request](x: Self) {
          
          inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
