package typings.glidejsGlide

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.glidejsGlide.mod.Options
import typings.glidejsGlide.mod.Static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Glide extends Shortcut {
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Glide")
    @js.native
    open class ^ protected ()
      extends StObject
         with Static {
      def this(selector: String) = this()
      def this(selector: String, options: Options) = this()
    }
    
    @JSGlobal("Glide")
    @js.native
    val ^ : js.Object & (Instantiable2[/* selector */ String, /* options */ js.UndefOr[Options], Static]) = js.native
    
    type _To = js.Object & (Instantiable2[/* selector */ String, /* options */ js.UndefOr[Options], Static])
    
    /* This means you don't have to write `^`, but can instead just say `Glide.foo` */
    override def _to: js.Object & (Instantiable2[/* selector */ String, /* options */ js.UndefOr[Options], Static]) = ^
  }
}
