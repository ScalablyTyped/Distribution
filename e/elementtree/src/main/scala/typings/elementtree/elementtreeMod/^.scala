package typings.elementtree.elementtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elementtree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def CData(): Element = js.native
  def CData(text: ElementText): Element = js.native
  def Comment(): Element = js.native
  def Comment(text: ElementText): Element = js.native
  def Element(ElementTag: String): typings.elementtree.elementtreeMod.Element = js.native
  def Element(ElementTag: String, attrib: Attributes): typings.elementtree.elementtreeMod.Element = js.native
  def ProcessingInstruction(target: ElementText): Element = js.native
  def ProcessingInstruction(target: ElementText, text: ElementText): Element = js.native
  def SubElement(parent: Element, ElementTag: String): Element = js.native
  def SubElement(parent: Element, ElementTag: String, attrib: Attributes): Element = js.native
  def XML(data: String): Element = js.native
  def parse(source: String): ElementTree = js.native
  def register_namespace(prefix: String, uri: String): Unit = js.native
  def tostring(element: Element, options: ElementTreeWriteOptions): String = js.native
}

