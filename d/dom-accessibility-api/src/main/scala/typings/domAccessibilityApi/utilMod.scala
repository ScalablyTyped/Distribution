package typings.domAccessibilityApi

import typings.std.Element
import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("dom-accessibility-api/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLocalName(element: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalName")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasAnyConcreteRoles(node: Node, roles: js.Array[String | Null]): /* is std.Element */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasAnyConcreteRoles")(node.asInstanceOf[js.Any], roles.asInstanceOf[js.Any])).asInstanceOf[/* is std.Element */ Boolean]
  
  inline def isElement(): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")().asInstanceOf[/* is std.Element */ Boolean]
  inline def isElement(node: Node): /* is std.Element */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.Element */ Boolean]
  
  inline def isHTMLFieldSetElement(): /* is std.HTMLFieldSetElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLFieldSetElement")().asInstanceOf[/* is std.HTMLFieldSetElement */ Boolean]
  inline def isHTMLFieldSetElement(node: Node): /* is std.HTMLFieldSetElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLFieldSetElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLFieldSetElement */ Boolean]
  
  inline def isHTMLInputElement(): /* is std.HTMLInputElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLInputElement")().asInstanceOf[/* is std.HTMLInputElement */ Boolean]
  inline def isHTMLInputElement(node: Node): /* is std.HTMLInputElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLInputElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLInputElement */ Boolean]
  
  inline def isHTMLLegendElement(): /* is std.HTMLLegendElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLLegendElement")().asInstanceOf[/* is std.HTMLLegendElement */ Boolean]
  inline def isHTMLLegendElement(node: Node): /* is std.HTMLLegendElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLLegendElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLLegendElement */ Boolean]
  
  inline def isHTMLSelectElement(): /* is std.HTMLSelectElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLSelectElement")().asInstanceOf[/* is std.HTMLSelectElement */ Boolean]
  inline def isHTMLSelectElement(node: Node): /* is std.HTMLSelectElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLSelectElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLSelectElement */ Boolean]
  
  inline def isHTMLSlotElement(): /* is std.HTMLSlotElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLSlotElement")().asInstanceOf[/* is std.HTMLSlotElement */ Boolean]
  inline def isHTMLSlotElement(node: Node): /* is std.HTMLSlotElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLSlotElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLSlotElement */ Boolean]
  
  inline def isHTMLTableCaptionElement(): /* is std.HTMLTableCaptionElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLTableCaptionElement")().asInstanceOf[/* is std.HTMLTableCaptionElement */ Boolean]
  inline def isHTMLTableCaptionElement(node: Node): /* is std.HTMLTableCaptionElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLTableCaptionElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLTableCaptionElement */ Boolean]
  
  inline def isHTMLTableElement(): /* is std.HTMLTableElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLTableElement")().asInstanceOf[/* is std.HTMLTableElement */ Boolean]
  inline def isHTMLTableElement(node: Node): /* is std.HTMLTableElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLTableElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLTableElement */ Boolean]
  
  inline def isHTMLTextAreaElement(): /* is std.HTMLTextAreaElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLTextAreaElement")().asInstanceOf[/* is std.HTMLTextAreaElement */ Boolean]
  inline def isHTMLTextAreaElement(node: Node): /* is std.HTMLTextAreaElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHTMLTextAreaElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.HTMLTextAreaElement */ Boolean]
  
  inline def isSVGElement(): /* is std.SVGElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSVGElement")().asInstanceOf[/* is std.SVGElement */ Boolean]
  inline def isSVGElement(node: Node): /* is std.SVGElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSVGElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.SVGElement */ Boolean]
  
  inline def isSVGSVGElement(): /* is std.SVGSVGElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSVGSVGElement")().asInstanceOf[/* is std.SVGSVGElement */ Boolean]
  inline def isSVGSVGElement(node: Node): /* is std.SVGSVGElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSVGSVGElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.SVGSVGElement */ Boolean]
  
  inline def isSVGTitleElement(): /* is std.SVGTitleElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSVGTitleElement")().asInstanceOf[/* is std.SVGTitleElement */ Boolean]
  inline def isSVGTitleElement(node: Node): /* is std.SVGTitleElement */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSVGTitleElement")(node.asInstanceOf[js.Any]).asInstanceOf[/* is std.SVGTitleElement */ Boolean]
  
  inline def queryIdRefs(node: Node, attributeName: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("queryIdRefs")(node.asInstanceOf[js.Any], attributeName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def safeWindow(node: Node): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("safeWindow")(node.asInstanceOf[js.Any]).asInstanceOf[Window]
}
