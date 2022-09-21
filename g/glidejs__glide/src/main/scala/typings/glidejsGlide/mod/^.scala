package typings.glidejsGlide.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@glidejs/glide", JSImport.Namespace)
@js.native
open class ^ protected ()
  extends StObject
     with Static {
  def this(selector: String) = this()
  def this(selector: String, options: Options) = this()
}
@JSImport("@glidejs/glide", JSImport.Namespace)
@js.native
object ^
  extends StObject
     with TopLevel[
      js.Object & (Instantiable2[/* selector */ String, /* options */ js.UndefOr[Options], Static])
    ]
