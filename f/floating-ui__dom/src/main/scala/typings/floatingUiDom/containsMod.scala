package typings.floatingUiDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containsMod {
  
  @JSImport("@floating-ui/dom/src/utils/contains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contains(parent: Element, child: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
