package typings.domAccessibilityApi

import typings.domAccessibilityApi.accessibleNameAndDescriptionMod.ComputeTextAlternativeOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessibleNameMod {
  
  @JSImport("dom-accessibility-api/dist/accessible-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeAccessibleName(root: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleName")(root.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def computeAccessibleName(root: Element, options: ComputeTextAlternativeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleName")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
