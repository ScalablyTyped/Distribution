package typings.domHelpers

import typings.domHelpers.domHelpersBooleans.`false`
import typings.std.Document
import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isWindowMod {
  
  @JSImport("dom-helpers/cjs/isWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Document): Window | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Window | `false`]
  inline def default(node: Element): Window | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Window | `false`]
  inline def default(node: Window): Window | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Window | `false`]
}
