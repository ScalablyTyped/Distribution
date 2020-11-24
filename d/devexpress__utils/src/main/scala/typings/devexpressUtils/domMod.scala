package typings.devexpressUtils

import typings.devexpressUtils.interfacesMod.IPoint
import typings.devexpressUtils.interfacesMod.IRectangle
import typings.devexpressUtils.interfacesMod.ISize
import typings.std.CSSStyleDeclaration
import typings.std.ChildNode
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/utils/dom", JSImport.Namespace)
@js.native
object domMod extends js.Object {
  
  @js.native
  class DomUtils () extends js.Object
  /* static members */
  @js.native
  object DomUtils extends js.Object {
    
    def addClassName(element: Element, className: String): Unit = js.native
    
    def clearInnerHtml(element: HTMLElement): Unit = js.native
    
    def getAbsolutePositionX(element: HTMLElement): Double = js.native
    
    def getAbsolutePositionY(element: HTMLElement): Double = js.native
    
    def getChildNodes(parent: Element, predicate: js.Function1[/* e */ ChildNode, Boolean]): js.Array[ChildNode] = js.native
    
    def getChildNodesByClassName(parent: Element, className: String): js.Array[Element] = js.native
    
    def getClearClientHeight(element: HTMLElement): Double = js.native
    
    def getCurrentStyle(element: HTMLElement): CSSStyleDeclaration = js.native
    
    def getDocumentScrollLeft(): Double = js.native
    
    def getDocumentScrollTop(): Double = js.native
    
    def getFontFamiliesFromCssString(cssString: String): js.Array[String] = js.native
    
    def getHorizontalBordersWidth(element: HTMLElement): Double = js.native
    def getHorizontalBordersWidth(element: HTMLElement, style: CSSStyleDeclaration): Double = js.native
    
    def getInnerText(container: HTMLElement): String | Null = js.native
    
    def getNodes(parent: Element, predicate: js.Function1[/* e */ Element, Boolean]): js.Array[Element] = js.native
    
    def getNodesByClassName(parent: Element, className: String): js.Array[Element] = js.native
    
    def getParentByTagName(element: HTMLElement, tagName: String): HTMLElement | Null = js.native
    
    def getTopBottomPaddings(element: HTMLElement): Double = js.native
    def getTopBottomPaddings(element: HTMLElement, style: CSSStyleDeclaration): Double = js.native
    
    def getVerticalBordersWidth(element: HTMLElement): Double = js.native
    def getVerticalBordersWidth(element: HTMLElement, style: CSSStyleDeclaration): Double = js.native
    
    def getVerticalScrollBarWidth(): Double = js.native
    
    def hasClassName(element: Element, className: String): Boolean = js.native
    
    def hideNode(): Unit = js.native
    def hideNode(node: Node): Unit = js.native
    
    var html2PlainTextFilter: js.Any = js.native
    
    def isElementNode(node: Node): /* is std.Element */ Boolean = js.native
    
    def isHTMLElementNode(node: Node): /* is std.HTMLElement */ Boolean = js.native
    
    def isHTMLTableRowElement(element: Element): /* is std.HTMLTableRowElement */ Boolean = js.native
    
    def isInteractiveControl(element: HTMLElement): Boolean = js.native
    
    def isItParent(parentElement: Node, element: HTMLElement): Boolean = js.native
    
    def isTextNode(node: Node): Boolean = js.native
    
    def pxToFloat(px: String): Double = js.native
    
    def pxToInt(px: String): Double = js.native
    
    def removeClassName(element: Element, className: String): Unit = js.native
    
    def setFocus(element: HTMLElement): Unit = js.native
    
    def setStylePosition(style: CSSStyleDeclaration, point: IPoint): Unit = js.native
    
    def setStyleSize(style: CSSStyleDeclaration, size: ISize): Unit = js.native
    
    def setStyleSizeAndPosition(style: CSSStyleDeclaration, rectangle: IRectangle): Unit = js.native
    
    def toggleClassName(element: Element, className: String): Unit = js.native
    def toggleClassName(element: Element, className: String, toggle: Boolean): Unit = js.native
    
    var verticalScrollBarWidth: js.Any = js.native
  }
}
