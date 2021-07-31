package typings.domAccessibilityApi

import typings.domAccessibilityApi.accessibleNameAndDescriptionMod.ComputeTextAlternativeOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dom-accessibility-api/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def computeAccessibleDescription(root: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleDescription")(root.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def computeAccessibleDescription(root: Element, options: ComputeTextAlternativeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleDescription")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def computeAccessibleName(root: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleName")(root.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def computeAccessibleName(root: Element, options: ComputeTextAlternativeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("computeAccessibleName")(root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getRole(element: Element): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRole")(element.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
