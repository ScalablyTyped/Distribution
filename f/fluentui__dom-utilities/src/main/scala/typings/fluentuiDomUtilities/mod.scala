package typings.fluentuiDomUtilities

import typings.fluentuiDomUtilities.ivirtualelementMod.IVirtualElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluentui/dom-utilities", "DATA_PORTAL_ATTRIBUTE")
  @js.native
  val DATA_PORTAL_ATTRIBUTE: /* "data-portal-element" */ String = js.native
  
  @JSImport("@fluentui/dom-utilities", "elementContains")
  @js.native
  def elementContains(): Boolean = js.native
  @JSImport("@fluentui/dom-utilities", "elementContains")
  @js.native
  def elementContains(parent: Null, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  @JSImport("@fluentui/dom-utilities", "elementContains")
  @js.native
  def elementContains(parent: Null, child: HTMLElement): Boolean = js.native
  @JSImport("@fluentui/dom-utilities", "elementContains")
  @js.native
  def elementContains(parent: Null, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  @JSImport("@fluentui/dom-utilities", "elementContains")
  @js.native
  def elementContains(parent: HTMLElement): Boolean = js.native
  @JSImport("@fluentui/dom-utilities", "elementContains")
  @js.native
  def elementContains(parent: HTMLElement, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  @JSImport("@fluentui/dom-utilities", "elementContains")
  @js.native
  def elementContains(parent: HTMLElement, child: HTMLElement): Boolean = js.native
  @JSImport("@fluentui/dom-utilities", "elementContains")
  @js.native
  def elementContains(parent: HTMLElement, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  
  @JSImport("@fluentui/dom-utilities", "elementContainsAttribute")
  @js.native
  def elementContainsAttribute(element: HTMLElement, attribute: String): String | Null = js.native
  
  @JSImport("@fluentui/dom-utilities", "findElementRecursive")
  @js.native
  def findElementRecursive(element: Null, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = js.native
  @JSImport("@fluentui/dom-utilities", "findElementRecursive")
  @js.native
  def findElementRecursive(element: HTMLElement, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = js.native
  
  @JSImport("@fluentui/dom-utilities", "getChildren")
  @js.native
  def getChildren(parent: HTMLElement): js.Array[HTMLElement] = js.native
  @JSImport("@fluentui/dom-utilities", "getChildren")
  @js.native
  def getChildren(parent: HTMLElement, allowVirtualChildren: Boolean): js.Array[HTMLElement] = js.native
  
  @JSImport("@fluentui/dom-utilities", "getParent")
  @js.native
  def getParent(child: HTMLElement): HTMLElement | Null = js.native
  @JSImport("@fluentui/dom-utilities", "getParent")
  @js.native
  def getParent(child: HTMLElement, allowVirtualParents: Boolean): HTMLElement | Null = js.native
  
  @JSImport("@fluentui/dom-utilities", "getVirtualParent")
  @js.native
  def getVirtualParent(child: HTMLElement): js.UndefOr[HTMLElement] = js.native
  
  @JSImport("@fluentui/dom-utilities", "isVirtualElement")
  @js.native
  def isVirtualElement(element: IVirtualElement): /* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean = js.native
  @JSImport("@fluentui/dom-utilities", "isVirtualElement")
  @js.native
  def isVirtualElement(element: HTMLElement): /* is @fluentui/dom-utilities.@fluentui/dom-utilities/lib/IVirtualElement.IVirtualElement */ Boolean = js.native
  
  @JSImport("@fluentui/dom-utilities", "portalContainsElement")
  @js.native
  def portalContainsElement(target: HTMLElement): Boolean = js.native
  @JSImport("@fluentui/dom-utilities", "portalContainsElement")
  @js.native
  def portalContainsElement(target: HTMLElement, parent: HTMLElement): Boolean = js.native
  
  @JSImport("@fluentui/dom-utilities", "setPortalAttribute")
  @js.native
  def setPortalAttribute(element: HTMLElement): Unit = js.native
  
  @JSImport("@fluentui/dom-utilities", "setVirtualParent")
  @js.native
  def setVirtualParent(child: HTMLElement): Unit = js.native
  @JSImport("@fluentui/dom-utilities", "setVirtualParent")
  @js.native
  def setVirtualParent(child: HTMLElement, parent: HTMLElement): Unit = js.native
}
