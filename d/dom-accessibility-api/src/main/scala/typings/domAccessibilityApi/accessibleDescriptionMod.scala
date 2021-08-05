package typings.domAccessibilityApi

import typings.domAccessibilityApi.accessibleNameAndDescriptionMod.ComputeTextAlternativeOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessibleDescriptionMod {
  
  @JSImport("dom-accessibility-api/dist/accessible-description", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeAccessibleDescription(root: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleDescription")(root.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def computeAccessibleDescription(root: Element, options: ComputeTextAlternativeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleDescription")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
