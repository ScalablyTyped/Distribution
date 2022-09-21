package typings.fluentuiUtilities

import typings.fluentuiDomUtilities.ivirtualelementMod.IVirtualElement
import typings.fluentuiUtilities.irectangleMod.IRectangle
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("@fluentui/utilities/lib/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/utilities/lib/dom", "DATA_PORTAL_ATTRIBUTE")
  @js.native
  val DATA_PORTAL_ATTRIBUTE: /* "data-portal-element" */ String = js.native
  
  inline def elementContains(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")().asInstanceOf[Boolean]
  inline def elementContains(parent: Null, child: Null, allowVirtualParents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], allowVirtualParents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def elementContains(parent: Null, child: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def elementContains(parent: Null, child: HTMLElement, allowVirtualParents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], allowVirtualParents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def elementContains(parent: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def elementContains(parent: HTMLElement, child: Null, allowVirtualParents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], allowVirtualParents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def elementContains(parent: HTMLElement, child: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def elementContains(parent: HTMLElement, child: HTMLElement, allowVirtualParents: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContains")(parent.asInstanceOf[js.Any], child.asInstanceOf[js.Any], allowVirtualParents.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def elementContainsAttribute(element: HTMLElement, attribute: String): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("elementContainsAttribute")(element.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def findElementRecursive(element: Null, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findElementRecursive")(element.asInstanceOf[js.Any], matchFunction.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def findElementRecursive(element: HTMLElement, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findElementRecursive")(element.asInstanceOf[js.Any], matchFunction.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  inline def getChildren(parent: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(parent.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getChildren(parent: HTMLElement, allowVirtualChildren: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(parent.asInstanceOf[js.Any], allowVirtualChildren.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def getDocument(): js.UndefOr[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")().asInstanceOf[js.UndefOr[Document]]
  inline def getDocument(rootElement: HTMLElement): js.UndefOr[Document] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(rootElement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Document]]
  
  inline def getFirstVisibleElementFromSelector(selector: String): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstVisibleElementFromSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element]]
  
  inline def getParent(child: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(child.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  inline def getParent(child: HTMLElement, allowVirtualParents: Boolean): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(child.asInstanceOf[js.Any], allowVirtualParents.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  inline def getRect(): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")().asInstanceOf[js.UndefOr[IRectangle]]
  inline def getRect(element: HTMLElement): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IRectangle]]
  inline def getRect(element: Window): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IRectangle]]
  
  inline def getVirtualParent(child: HTMLElement): js.UndefOr[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVirtualParent")(child.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLElement]]
  
  inline def getWindow(): js.UndefOr[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")().asInstanceOf[js.UndefOr[Window]]
  inline def getWindow(rootElement: Element): js.UndefOr[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWindow")(rootElement.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Window]]
  
  inline def isVirtualElement(element: IVirtualElement): /* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVirtualElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean]
  inline def isVirtualElement(element: HTMLElement): /* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVirtualElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean]
  
  inline def on(element: Document, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def on(
    element: Document,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def on(element: Element, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def on(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit], options: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def portalContainsElement(target: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("portalContainsElement")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def portalContainsElement(target: HTMLElement, parent: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("portalContainsElement")(target.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def raiseClick(target: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("raiseClick")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setPortalAttribute(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPortalAttribute")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setVirtualParent(child: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVirtualParent")(child.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setVirtualParent(child: HTMLElement, parent: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVirtualParent")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
