package typings.domHelpers

import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ownerWindowMod {
  
  @JSImport("dom-helpers/cjs/ownerWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Window]
  @scala.inline
  def default(node: Element): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Window]
}
