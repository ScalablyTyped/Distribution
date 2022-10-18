package typings.devexpressUtils

import typings.devexpressUtils.libGeometryInterfacesMod.IPoint
import typings.devexpressUtils.libGeometryInterfacesMod.IRectangle
import typings.devexpressUtils.libGeometryInterfacesMod.ISize
import typings.std.CSSStyleDeclaration
import typings.std.ChildNode
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDomMod {
  
  @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils")
  @js.native
  open class DomUtils () extends StObject
  /* static members */
  object DomUtils {
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addClassName(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clearInnerHtml(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInnerHtml")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getAbsolutePositionX(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbsolutePositionX")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getAbsolutePositionY(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbsolutePositionY")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getChildNodes(parent: Element, predicate: js.Function1[/* e */ ChildNode, Boolean]): js.Array[ChildNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildNodes")(parent.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[ChildNode]]
    
    inline def getChildNodesByClassName(parent: Element, className: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildNodesByClassName")(parent.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    
    inline def getClearClientHeight(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getClearClientHeight")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getCurrentStyle(element: HTMLElement): CSSStyleDeclaration = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentStyle")(element.asInstanceOf[js.Any]).asInstanceOf[CSSStyleDeclaration]
    
    inline def getDocumentScrollLeft(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentScrollLeft")().asInstanceOf[Double]
    
    inline def getDocumentScrollTop(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocumentScrollTop")().asInstanceOf[Double]
    
    inline def getFontFamiliesFromCssString(cssString: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontFamiliesFromCssString")(cssString.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getHorizontalBordersWidth(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getHorizontalBordersWidth")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def getHorizontalBordersWidth(element: HTMLElement, style: CSSStyleDeclaration): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getHorizontalBordersWidth")(element.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getInnerText(container: HTMLElement): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInnerText")(container.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def getNodes(parent: Element, predicate: js.Function1[/* e */ Element, Boolean]): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodes")(parent.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    
    inline def getNodesByClassName(parent: Element, className: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodesByClassName")(parent.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
    
    inline def getParentByTagName(element: HTMLElement, tagName: String): HTMLElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getParentByTagName")(element.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[HTMLElement | Null]
    
    inline def getTopBottomPaddings(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopBottomPaddings")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def getTopBottomPaddings(element: HTMLElement, style: CSSStyleDeclaration): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopBottomPaddings")(element.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getVerticalBordersWidth(element: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVerticalBordersWidth")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def getVerticalBordersWidth(element: HTMLElement, style: CSSStyleDeclaration): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getVerticalBordersWidth")(element.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def getVerticalScrollBarWidth(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVerticalScrollBarWidth")().asInstanceOf[Double]
    
    inline def hasClassName(element: Element, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def hideNode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideNode")().asInstanceOf[Unit]
    inline def hideNode(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.html2PlainTextFilter")
    @js.native
    def html2PlainTextFilter: Any = js.native
    inline def html2PlainTextFilter_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html2PlainTextFilter")(x.asInstanceOf[js.Any])
    
    inline def isElementNode(node: Node): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElementNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
    
    inline def isHTMLElementNode(node: Node): /* is std.HTMLElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLElementNode")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLElement */ Boolean]
    
    inline def isHTMLTableRowElement(element: Element): /* is std.HTMLTableRowElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLTableRowElement")(element.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLTableRowElement */ Boolean]
    
    inline def isInteractiveControl(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInteractiveControl")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isItParent(parentElement: Node, element: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isItParent")(parentElement.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTextNode(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def pxToFloat(px: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pxToFloat")(px.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def pxToInt(px: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pxToInt")(px.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def removeClassName(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setFocus(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFocus")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setStylePosition(style: CSSStyleDeclaration, point: IPoint): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStylePosition")(style.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setStyleSize(style: CSSStyleDeclaration, size: ISize): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyleSize")(style.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setStyleSizeAndPosition(style: CSSStyleDeclaration, rectangle: IRectangle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setStyleSizeAndPosition")(style.asInstanceOf[js.Any], rectangle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toggleClassName(element: Element, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def toggleClassName(element: Element, className: String, toggle: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleClassName")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any], toggle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("@devexpress/utils/lib/utils/dom", "DomUtils.verticalScrollBarWidth")
    @js.native
    def verticalScrollBarWidth: Any = js.native
    inline def verticalScrollBarWidth_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verticalScrollBarWidth")(x.asInstanceOf[js.Any])
  }
}
