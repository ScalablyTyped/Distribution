package typings.domAccessibilityApi

import typings.std.Node
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dom-accessibility-api/dist/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def isElement(): /* is std.Element */ Boolean = js.native
  def isElement(node: Node): /* is std.Element */ Boolean = js.native
  def isHTMLFieldSetElement(): /* is std.HTMLFieldSetElement */ Boolean = js.native
  def isHTMLFieldSetElement(node: Node): /* is std.HTMLFieldSetElement */ Boolean = js.native
  def isHTMLInputElement(): /* is std.HTMLInputElement */ Boolean = js.native
  def isHTMLInputElement(node: Node): /* is std.HTMLInputElement */ Boolean = js.native
  def isHTMLLegendElement(): /* is std.HTMLLegendElement */ Boolean = js.native
  def isHTMLLegendElement(node: Node): /* is std.HTMLLegendElement */ Boolean = js.native
  def isHTMLSelectElement(): /* is std.HTMLSelectElement */ Boolean = js.native
  def isHTMLSelectElement(node: Node): /* is std.HTMLSelectElement */ Boolean = js.native
  def isHTMLTableCaptionElement(): /* is std.HTMLTableCaptionElement */ Boolean = js.native
  def isHTMLTableCaptionElement(node: Node): /* is std.HTMLTableCaptionElement */ Boolean = js.native
  def isHTMLTableElement(): /* is std.HTMLTableElement */ Boolean = js.native
  def isHTMLTableElement(node: Node): /* is std.HTMLTableElement */ Boolean = js.native
  def isHTMLTextAreaElement(): /* is std.HTMLTextAreaElement */ Boolean = js.native
  def isHTMLTextAreaElement(node: Node): /* is std.HTMLTextAreaElement */ Boolean = js.native
  def safeWindow(node: Node): Window = js.native
}

