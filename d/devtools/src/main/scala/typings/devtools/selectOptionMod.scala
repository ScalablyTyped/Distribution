package typings.devtools

import typings.std.HTMLElement
import typings.std.HTMLOptionElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectOptionMod {
  
  @JSImport("devtools/build/scripts/selectOption", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(html: HTMLElement, elem: HTMLOptionElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any], elem.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
