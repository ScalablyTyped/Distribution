package typings.fluentuiDomUtilities

import typings.fluentuiDomUtilities.ivirtualelementMod.IVirtualElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/dom-utilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@fluentui/dom-utilities", "DATA_PORTAL_ATTRIBUTE")
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
  
  inline def getParent(child: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(child.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  inline def getParent(child: HTMLElement, allowVirtualParents: Boolean): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getParent")(child.asInstanceOf[js.Any], allowVirtualParents.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  inline def getVirtualParent(child: HTMLElement): js.UndefOr[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVirtualParent")(child.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLElement]]
  
  inline def isVirtualElement(element: IVirtualElement): /* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVirtualElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean]
  inline def isVirtualElement(element: HTMLElement): /* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVirtualElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean]
  
  inline def portalContainsElement(target: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("portalContainsElement")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def portalContainsElement(target: HTMLElement, parent: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("portalContainsElement")(target.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setPortalAttribute(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPortalAttribute")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setVirtualParent(child: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVirtualParent")(child.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setVirtualParent(child: HTMLElement, parent: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setVirtualParent")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
