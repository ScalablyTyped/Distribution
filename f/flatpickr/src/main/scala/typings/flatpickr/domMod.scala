package typings.flatpickr

import typings.flatpickr.globalsMod.global.HTMLElement
import typings.std.Element
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLDivElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("flatpickr/dist/utils/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearNode(node: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createElement[T /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ Any,
    className: String
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def createElement[T /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ Any,
    className: String,
    content: String
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(tag.asInstanceOf[js.Any], className.asInstanceOf[js.Any], content.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def createNumberInput(inputClassName: String): HTMLDivElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createNumberInput")(inputClassName.asInstanceOf[js.Any]).asInstanceOf[HTMLDivElement]
  inline def createNumberInput(inputClassName: String, opts: Record[String, Any]): HTMLDivElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createNumberInput")(inputClassName.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[HTMLDivElement]
  
  inline def findParent(node: Element, condition: js.Function1[/* n */ Element, Boolean]): js.UndefOr[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("findParent")(node.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Element]]
  
  inline def getEventTarget(event: Event): EventTarget | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventTarget")(event.asInstanceOf[js.Any]).asInstanceOf[EventTarget | Null]
  
  inline def toggleClass(elem: HTMLElement, className: String, bool: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleClass")(elem.asInstanceOf[js.Any], className.asInstanceOf[js.Any], bool.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
