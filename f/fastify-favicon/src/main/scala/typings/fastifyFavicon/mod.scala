package typings.fastifyFavicon

import org.scalablytyped.runtime.Shortcut
import typings.fastify.pluginMod.FastifyPluginCallback
import typings.fastify.typeProviderMod.FastifyTypeProviderDefault
import typings.fastify.utilsMod.RawServerDefault
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fastify-favicon", JSImport.Default)
  @js.native
  val default: FastifyPluginCallback[FastifyFaviconOptions, RawServerDefault, FastifyTypeProviderDefault] = js.native
  
  trait FastifyFaviconOptions extends StObject {
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object FastifyFaviconOptions {
    
    inline def apply(): FastifyFaviconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FastifyFaviconOptions]
    }
    
    extension [Self <: FastifyFaviconOptions](x: Self) {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  type _To = FastifyPluginCallback[FastifyFaviconOptions, RawServerDefault, FastifyTypeProviderDefault]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FastifyPluginCallback[FastifyFaviconOptions, RawServerDefault, FastifyTypeProviderDefault] = default
}
