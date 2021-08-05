package typings.devtools

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptsGetElementAttributeMod {
  
  @JSImport("devtools/build/scripts/getElementAttribute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(_underscore: HTMLElement, elem: HTMLElement, attr: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_underscore.asInstanceOf[js.Any], elem.asInstanceOf[js.Any], attr.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
