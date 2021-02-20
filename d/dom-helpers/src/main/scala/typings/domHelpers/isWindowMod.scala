package typings.domHelpers

import typings.domHelpers.domHelpersBooleans.`false`
import typings.std.Document
import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isWindowMod {
  
  @JSImport("dom-helpers/cjs/isWindow", JSImport.Default)
  @js.native
  def default(node: Document): Window | `false` = js.native
  @JSImport("dom-helpers/cjs/isWindow", JSImport.Default)
  @js.native
  def default(node: Element): Window | `false` = js.native
  @JSImport("dom-helpers/cjs/isWindow", JSImport.Default)
  @js.native
  def default(node: Window): Window | `false` = js.native
}
