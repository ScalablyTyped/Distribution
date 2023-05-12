package typings.domAccessibilityApi

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIsDisabledMod {
  
  @JSImport("dom-accessibility-api/dist/is-disabled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDisabled(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDisabled")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
