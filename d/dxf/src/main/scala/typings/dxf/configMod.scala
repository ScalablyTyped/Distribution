package typings.dxf

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod extends Shortcut {
  
  @JSImport("dxf/config", JSImport.Default)
  @js.native
  val default: Config = js.native
  
  trait Config extends StObject {
    
    var verbose: Boolean
  }
  object Config {
    
    inline def apply(verbose: Boolean): Config = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Config
  
  /* This means you don't have to write `default`, but can instead just say `configMod.foo` */
  override def _to: Config = default
}
