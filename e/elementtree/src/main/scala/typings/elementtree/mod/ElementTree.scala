package typings.elementtree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elementtree", "ElementTree")
@js.native
class ElementTree protected () extends js.Object {
  def this(element: Element) = this()
  def _setroot(element: Element): Unit = js.native
  def find(path: String): Element | Null = js.native
  def findall(path: String): js.Array[Element] = js.native
  def findtext(path: String): js.UndefOr[ElementText] = js.native
  def getroot(): Element = js.native
  def parse(source: String): Element = js.native
  def write(): String = js.native
  def write(options: ElementTreeWriteOptions): String = js.native
}

