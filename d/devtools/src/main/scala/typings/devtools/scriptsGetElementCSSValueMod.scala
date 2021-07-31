package typings.devtools

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptsGetElementCSSValueMod {
  
  @JSImport("devtools/build/scripts/getElementCSSValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(_underscore: HTMLElement, elem: HTMLElement, propertyName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(_underscore.asInstanceOf[js.Any], elem.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[String]
}
