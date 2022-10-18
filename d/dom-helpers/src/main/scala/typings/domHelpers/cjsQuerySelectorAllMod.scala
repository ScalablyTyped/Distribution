package typings.domHelpers

import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsQuerySelectorAllMod {
  
  @JSImport("dom-helpers/cjs/querySelectorAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Document, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  inline def default(element: HTMLElement, selector: String): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
}
