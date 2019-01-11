package typings
package elementtreeLib.elementtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elementtree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def CData(): elementtreeLib.elementtreeMod.Element = js.native
  def CData(text: elementtreeLib.elementtreeMod.ElementText): elementtreeLib.elementtreeMod.Element = js.native
  def Comment(): elementtreeLib.elementtreeMod.Element = js.native
  def Comment(text: elementtreeLib.elementtreeMod.ElementText): elementtreeLib.elementtreeMod.Element = js.native
  def Element(ElementTag: java.lang.String): elementtreeLib.elementtreeMod.Element = js.native
  def Element(ElementTag: java.lang.String, attrib: elementtreeLib.elementtreeMod.Attributes): elementtreeLib.elementtreeMod.Element = js.native
  def ProcessingInstruction(target: elementtreeLib.elementtreeMod.ElementText): elementtreeLib.elementtreeMod.Element = js.native
  def ProcessingInstruction(target: elementtreeLib.elementtreeMod.ElementText, text: elementtreeLib.elementtreeMod.ElementText): elementtreeLib.elementtreeMod.Element = js.native
  def SubElement(parent: elementtreeLib.elementtreeMod.Element, ElementTag: java.lang.String): elementtreeLib.elementtreeMod.Element = js.native
  def SubElement(
    parent: elementtreeLib.elementtreeMod.Element,
    ElementTag: java.lang.String,
    attrib: elementtreeLib.elementtreeMod.Attributes
  ): elementtreeLib.elementtreeMod.Element = js.native
  def XML(data: java.lang.String): elementtreeLib.elementtreeMod.Element = js.native
  def parse(source: java.lang.String): elementtreeLib.elementtreeMod.ElementTree = js.native
  def register_namespace(prefix: java.lang.String, uri: java.lang.String): scala.Unit = js.native
  def tostring(
    element: elementtreeLib.elementtreeMod.Element,
    options: elementtreeLib.elementtreeMod.ElementTreeWriteOptions
  ): java.lang.String = js.native
}

