package typings.fastifyFavicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastify-favicon", JSImport.Namespace)
  @js.native
  def apply(): Unit = js.native
  
  @js.native
  trait FastifyFaviconOptions extends StObject {
    
    var path: js.UndefOr[String] = js.native
  }
  object FastifyFaviconOptions {
    
    @scala.inline
    def apply(): FastifyFaviconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyFaviconOptions]
    }
    
    @scala.inline
    implicit class FastifyFaviconOptionsMutableBuilder[Self <: FastifyFaviconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
