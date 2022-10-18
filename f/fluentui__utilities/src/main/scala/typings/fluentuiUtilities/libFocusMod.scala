package typings.fluentuiUtilities

import typings.fluentuiUtilities.anon.Focus
import typings.fluentuiUtilities.fluentuiUtilitiesStrings.`data-no-horizontal-wrap`
import typings.fluentuiUtilities.fluentuiUtilitiesStrings.`data-no-vertical-wrap`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFocusMod {
  
  @JSImport("@fluentui/utilities/lib/focus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def doesElementContainFocus(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doesElementContainFocus")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def focusAsync(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusAsync")().asInstanceOf[Unit]
  inline def focusAsync(element: Focus): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusAsync")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def focusAsync(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("focusAsync")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def focusFirstChild(rootElement: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusFirstChild")(rootElement.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def focusFirstChild(rootElement: HTMLElement, bypassHiddenElements: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("focusFirstChild")(rootElement.asInstanceOf[js.Any], bypassHiddenElements.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getElementIndexPath(fromElement: HTMLElement, toElement: HTMLElement): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementIndexPath")(fromElement.asInstanceOf[js.Any], toElement.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstFocusable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstFocusable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  inline def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def getFirstTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def getFirstTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Unit,
    checkNode: Boolean
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  inline def getFocusableByIndexPath(parent: HTMLElement, path: js.Array[Double]): js.UndefOr[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusableByIndexPath")(parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLElement]]
  
  inline def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocusable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastFocusable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  inline def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def getLastTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  inline def getLastTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Unit,
    checkNode: Boolean
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLastTabbable")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  inline def getNextElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement | Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    suppressChildTraversal: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean],
    bypassHiddenElements: js.UndefOr[Boolean]
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextElement")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any], suppressParentTraversal.asInstanceOf[js.Any], suppressChildTraversal.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], allowFocusRoot.asInstanceOf[js.Any], tabbable.asInstanceOf[js.Any], bypassHiddenElements.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  inline def getPreviousElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement | Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    traverseChildren: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousElement")(rootElement.asInstanceOf[js.Any], currentElement.asInstanceOf[js.Any], checkNode.asInstanceOf[js.Any], suppressParentTraversal.asInstanceOf[js.Any], traverseChildren.asInstanceOf[js.Any], includeElementsInFocusZones.asInstanceOf[js.Any], allowFocusRoot.asInstanceOf[js.Any], tabbable.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
  
  inline def isElementFocusSubZone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementFocusSubZone")().asInstanceOf[Boolean]
  inline def isElementFocusSubZone(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementFocusSubZone")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElementFocusZone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementFocusZone")().asInstanceOf[Boolean]
  inline def isElementFocusZone(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementFocusZone")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElementTabbable(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementTabbable")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isElementTabbable(element: HTMLElement, checkTabIndex: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isElementTabbable")(element.asInstanceOf[js.Any], checkTabIndex.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isElementVisible(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementVisible")().asInstanceOf[Boolean]
  inline def isElementVisible(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementVisible")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isElementVisibleAndNotHidden(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementVisibleAndNotHidden")().asInstanceOf[Boolean]
  inline def isElementVisibleAndNotHidden(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementVisibleAndNotHidden")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def shouldWrapFocus(element: HTMLElement, noWrapDataAttribute: `data-no-vertical-wrap` | `data-no-horizontal-wrap`): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldWrapFocus")(element.asInstanceOf[js.Any], noWrapDataAttribute.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
