package typings
package elementtreeLib.elementtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elementtree", "ElementTree")
@js.native
class ElementTree protected () extends js.Object {
  def this(element: Element) = this()
  def _setroot(element: Element): scala.Unit = js.native
  def find(path: java.lang.String): Element | scala.Null = js.native
  def findall(path: java.lang.String): js.Array[Element] = js.native
  def findtext(path: java.lang.String): js.UndefOr[ElementText] = js.native
  def getroot(): Element = js.native
  def parse(source: java.lang.String): Element = js.native
  def write(): java.lang.String = js.native
  def write(options: ElementTreeWriteOptions): java.lang.String = js.native
}

