package typings.fluentuiUtilities

import typings.fluentuiUtilities.libEventGroupMod.EventGroup
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScrollMod {
  
  @JSImport("@fluentui/utilities/lib/scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/utilities/lib/scroll", "DATA_IS_SCROLLABLE_ATTRIBUTE")
  @js.native
  val DATA_IS_SCROLLABLE_ATTRIBUTE: /* "data-is-scrollable" */ String = js.native
  
  inline def allowOverscrollOnElement(element: Null, events: EventGroup): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allowOverscrollOnElement")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def allowOverscrollOnElement(element: HTMLElement, events: EventGroup): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allowOverscrollOnElement")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def allowScrollOnElement(element: Null, events: EventGroup): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allowScrollOnElement")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def allowScrollOnElement(element: HTMLElement, events: EventGroup): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("allowScrollOnElement")(element.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def disableBodyScroll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableBodyScroll")().asInstanceOf[Unit]
  
  inline def enableBodyScroll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBodyScroll")().asInstanceOf[Unit]
  
  inline def findScrollableParent(): js.UndefOr[HTMLElement | Window | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findScrollableParent")().asInstanceOf[js.UndefOr[HTMLElement | Window | Null]]
  inline def findScrollableParent(startingElement: HTMLElement): js.UndefOr[HTMLElement | Window | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findScrollableParent")(startingElement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLElement | Window | Null]]
  
  inline def getScrollbarWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollbarWidth")().asInstanceOf[Double]
}
