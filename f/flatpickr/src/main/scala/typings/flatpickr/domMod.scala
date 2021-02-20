package typings.flatpickr

import typings.flatpickr.globalsMod.global.HTMLElement
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLDivElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("flatpickr/dist/utils/dom", "clearNode")
  @js.native
  def clearNode(node: HTMLElement): Unit = js.native
  
  @JSImport("flatpickr/dist/utils/dom", "createElement")
  @js.native
  def createElement[T /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
    className: String
  ): T = js.native
  @JSImport("flatpickr/dist/utils/dom", "createElement")
  @js.native
  def createElement[T /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
    className: String,
    content: String
  ): T = js.native
  
  @JSImport("flatpickr/dist/utils/dom", "createNumberInput")
  @js.native
  def createNumberInput(inputClassName: String): HTMLDivElement = js.native
  @JSImport("flatpickr/dist/utils/dom", "createNumberInput")
  @js.native
  def createNumberInput(inputClassName: String, opts: Record[String, _]): HTMLDivElement = js.native
  
  @JSImport("flatpickr/dist/utils/dom", "findParent")
  @js.native
  def findParent(node: Element, condition: js.Function1[/* n */ Element, Boolean]): js.UndefOr[Element] = js.native
  
  @JSImport("flatpickr/dist/utils/dom", "getEventTarget")
  @js.native
  def getEventTarget(event: Event): EventTarget | Null = js.native
  
  @JSImport("flatpickr/dist/utils/dom", "toggleClass")
  @js.native
  def toggleClass(elem: HTMLElement, className: String, bool: Boolean): Unit = js.native
}
