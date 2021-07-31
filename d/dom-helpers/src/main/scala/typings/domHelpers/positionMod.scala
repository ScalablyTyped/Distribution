package typings.domHelpers

import typings.domHelpers.anon.Height
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positionMod {
  
  @JSImport("dom-helpers/cjs/position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(node: HTMLElement): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Height]
  @scala.inline
  def default(node: HTMLElement, offsetParent: HTMLElement): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], offsetParent.asInstanceOf[js.Any])).asInstanceOf[Height]
}
