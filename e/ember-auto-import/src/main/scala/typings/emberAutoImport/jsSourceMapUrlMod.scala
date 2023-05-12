package typings.emberAutoImport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsSourceMapUrlMod {
  
  @JSImport("ember-auto-import/js/source-map-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def insertBefore(code: String, string: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(code.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[String]
}
