package typings.domHelpers

import typings.std.Document
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollParentMod {
  
  @JSImport("dom-helpers/cjs/scrollParent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLElement): Document | HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Document | HTMLElement]
  inline def default(element: HTMLElement, firstPossible: Boolean): Document | HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], firstPossible.asInstanceOf[js.Any])).asInstanceOf[Document | HTMLElement]
}
