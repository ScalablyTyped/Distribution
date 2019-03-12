package typings
package elementtreeLib.elementtreeMod

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
  def Element(ElementTag: java.lang.String): elementtreeLib.elementtreeMod.Element = js.native
  def Element(ElementTag: java.lang.String, attrib: Attributes): elementtreeLib.elementtreeMod.Element = js.native
  def ProcessingInstruction(target: ElementText): Element = js.native
  def ProcessingInstruction(target: ElementText, text: ElementText): Element = js.native
  def SubElement(parent: Element, ElementTag: java.lang.String): Element = js.native
  def SubElement(parent: Element, ElementTag: java.lang.String, attrib: Attributes): Element = js.native
  def XML(data: java.lang.String): Element = js.native
  def parse(source: java.lang.String): ElementTree = js.native
  def register_namespace(prefix: java.lang.String, uri: java.lang.String): scala.Unit = js.native
  def tostring(element: Element, options: ElementTreeWriteOptions): java.lang.String = js.native
}

