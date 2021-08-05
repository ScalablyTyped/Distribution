package typings.glaze

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssMod {
  
  @JSImport("glaze/dist-types/ponyfills/CSS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escape(ident: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(ident.asInstanceOf[js.Any]).asInstanceOf[String]
}
