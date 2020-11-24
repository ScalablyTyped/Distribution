package typings.focusTrap.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("focus-trap", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(element: String): FocusTrap = js.native
  def apply(element: String, userOptions: Options): FocusTrap = js.native
  def apply(element: HTMLElement): FocusTrap = js.native
  def apply(element: HTMLElement, userOptions: Options): FocusTrap = js.native
}
