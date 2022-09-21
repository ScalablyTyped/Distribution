package typings.detectTouch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("detect-touch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def detectTouch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("detectTouch")().asInstanceOf[Boolean]
  
  @JSImport("detect-touch", "hasTouch")
  @js.native
  val hasTouch: Boolean = js.native
}
