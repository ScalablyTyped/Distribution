package typings.finalhandler

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(req: IncomingMessage, res: ServerResponse): js.Function1[/* err */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* err */ js.Any, Unit]]
  inline def apply(req: IncomingMessage, res: ServerResponse, options: Options): js.Function1[/* err */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].apply(req.asInstanceOf[js.Any], res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* err */ js.Any, Unit]]
  
  @JSImport("finalhandler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var env: js.UndefOr[String] = js.undefined
    
    var onerror: js.UndefOr[
        js.Function3[/* err */ js.Any, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setOnerror(value: (/* err */ js.Any, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction3(value))
      
      inline def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    }
  }
}
