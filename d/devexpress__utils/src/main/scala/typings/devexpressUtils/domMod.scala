package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import typings.devexpressUtils.interfacesMod.IRectangle
import typings.devexpressUtils.interfacesMod.ISize
import typings.std.CSSStyleDeclaration
import typings.std.ChildNode
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils")
  @js.native
  class DomUtils () extends StObject
  /* static members */
  object DomUtils {
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.addClassName")
    @js.native
    def addClassName(element: Element, className: String): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.clearInnerHtml")
    @js.native
    def clearInnerHtml(element: HTMLElement): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getAbsolutePositionX")
    @js.native
    def getAbsolutePositionX(element: HTMLElement): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getAbsolutePositionY")
    @js.native
    def getAbsolutePositionY(element: HTMLElement): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getChildNodes")
    @js.native
    def getChildNodes(parent: Element, predicate: js.Function1[/* e */ ChildNode, Boolean]): js.Array[ChildNode] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getChildNodesByClassName")
    @js.native
    def getChildNodesByClassName(parent: Element, className: String): js.Array[Element] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getClearClientHeight")
    @js.native
    def getClearClientHeight(element: HTMLElement): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getCurrentStyle")
    @js.native
    def getCurrentStyle(element: HTMLElement): CSSStyleDeclaration = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getDocumentScrollLeft")
    @js.native
    def getDocumentScrollLeft(): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getDocumentScrollTop")
    @js.native
    def getDocumentScrollTop(): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getFontFamiliesFromCssString")
    @js.native
    def getFontFamiliesFromCssString(cssString: String): js.Array[String] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getHorizontalBordersWidth")
    @js.native
    def getHorizontalBordersWidth(element: HTMLElement): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getHorizontalBordersWidth")
    @js.native
    def getHorizontalBordersWidth(element: HTMLElement, style: CSSStyleDeclaration): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getInnerText")
    @js.native
    def getInnerText(container: HTMLElement): String | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getNodes")
    @js.native
    def getNodes(parent: Element, predicate: js.Function1[/* e */ Element, Boolean]): js.Array[Element] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getNodesByClassName")
    @js.native
    def getNodesByClassName(parent: Element, className: String): js.Array[Element] = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getParentByTagName")
    @js.native
    def getParentByTagName(element: HTMLElement, tagName: String): HTMLElement | Null = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getTopBottomPaddings")
    @js.native
    def getTopBottomPaddings(element: HTMLElement): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getTopBottomPaddings")
    @js.native
    def getTopBottomPaddings(element: HTMLElement, style: CSSStyleDeclaration): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getVerticalBordersWidth")
    @js.native
    def getVerticalBordersWidth(element: HTMLElement): Double = js.native
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getVerticalBordersWidth")
    @js.native
    def getVerticalBordersWidth(element: HTMLElement, style: CSSStyleDeclaration): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.getVerticalScrollBarWidth")
    @js.native
    def getVerticalScrollBarWidth(): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.hasClassName")
    @js.native
    def hasClassName(element: Element, className: String): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.hideNode")
    @js.native
    def hideNode(): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.hideNode")
    @js.native
    def hideNode(node: Node): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.html2PlainTextFilter")
    @js.native
    def html2PlainTextFilter: js.Any = js.native
    @scala.inline
    def html2PlainTextFilter_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html2PlainTextFilter")(x.asInstanceOf[js.Any])
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.isElementNode")
    @js.native
    def isElementNode(node: Node): /* is std.Element */ Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.isHTMLElementNode")
    @js.native
    def isHTMLElementNode(node: Node): /* is std.HTMLElement */ Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.isHTMLTableRowElement")
    @js.native
    def isHTMLTableRowElement(element: Element): /* is std.HTMLTableRowElement */ Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.isInteractiveControl")
    @js.native
    def isInteractiveControl(element: HTMLElement): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.isItParent")
    @js.native
    def isItParent(parentElement: Node, element: HTMLElement): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.isTextNode")
    @js.native
    def isTextNode(node: Node): Boolean = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.pxToFloat")
    @js.native
    def pxToFloat(px: String): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.pxToInt")
    @js.native
    def pxToInt(px: String): Double = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.removeClassName")
    @js.native
    def removeClassName(element: Element, className: String): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.setFocus")
    @js.native
    def setFocus(element: HTMLElement): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.setStylePosition")
    @js.native
    def setStylePosition(style: CSSStyleDeclaration, point: IPoint): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.setStyleSize")
    @js.native
    def setStyleSize(style: CSSStyleDeclaration, size: ISize): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.setStyleSizeAndPosition")
    @js.native
    def setStyleSizeAndPosition(style: CSSStyleDeclaration, rectangle: IRectangle): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.toggleClassName")
    @js.native
    def toggleClassName(element: Element, className: String): Unit = js.native
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.toggleClassName")
    @js.native
    def toggleClassName(element: Element, className: String, toggle: Boolean): Unit = js.native
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.verticalScrollBarWidth")
    @js.native
    def verticalScrollBarWidth: js.Any = js.native
    @scala.inline
    def verticalScrollBarWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verticalScrollBarWidth")(x.asInstanceOf[js.Any])
  }
}
