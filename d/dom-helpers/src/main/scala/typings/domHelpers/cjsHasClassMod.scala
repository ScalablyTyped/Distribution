package typings.domHelpers

import typings.std.Element
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsHasClassMod {
  
  @JSImport("dom-helpers/cjs/hasClass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: Element, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(element: SVGElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
