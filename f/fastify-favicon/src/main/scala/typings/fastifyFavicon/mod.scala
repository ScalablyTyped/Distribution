package typings.fastifyFavicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("fastify-favicon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FastifyFaviconOptions extends StObject {
    
    var path: js.UndefOr[String] = js.undefined
  }
  object FastifyFaviconOptions {
    
    inline def apply(): FastifyFaviconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyFaviconOptions]
    }
    
    extension [Self <: FastifyFaviconOptions](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
