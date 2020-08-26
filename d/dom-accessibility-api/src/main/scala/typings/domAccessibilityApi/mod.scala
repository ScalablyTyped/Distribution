package typings.domAccessibilityApi

import typings.domAccessibilityApi.accessibleNameAndDescriptionMod.ComputeTextAlternativeOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-accessibility-api/dist", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def computeAccessibleDescription(root: Element): String = js.native
  def computeAccessibleDescription(root: Element, options: ComputeTextAlternativeOptions): String = js.native
  def computeAccessibleName(root: Element): String = js.native
  def computeAccessibleName(root: Element, options: ComputeTextAlternativeOptions): String = js.native
  def getRole(element: Element): String | Null = js.native
}

