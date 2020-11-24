package typings.domAccessibilityApi

import typings.domAccessibilityApi.accessibleNameAndDescriptionMod.ComputeTextAlternativeOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dom-accessibility-api/dist/accessible-name", JSImport.Namespace)
@js.native
object accessibleNameMod extends js.Object {
  
  def computeAccessibleName(root: Element): String = js.native
  def computeAccessibleName(root: Element, options: ComputeTextAlternativeOptions): String = js.native
}
