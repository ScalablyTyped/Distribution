package typings
package elementtreeLib.elementtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var attrib: Attributes = js.native
  var tag: ElementTag = js.native
  var tail: java.lang.String | scala.Null = js.native
  var text: ElementText | scala.Null = js.native
  def append(element: Element): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def delItem(index: scala.Double): scala.Unit = js.native
  def delSlice(start: scala.Double, stop: scala.Double): scala.Unit = js.native
  def extend(elements: js.Array[Element]): scala.Unit = js.native
  def find(path: java.lang.String): Element | scala.Null = js.native
  def findall(path: java.lang.String): js.Array[Element] = js.native
  def findtext(path: java.lang.String): js.UndefOr[ElementText] = js.native
  def get(k: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getItem(index: scala.Double): js.UndefOr[Element] = js.native
  def getSlice(start: scala.Double, stop: scala.Double): js.Array[Element] = js.native
  def getchildren(): js.Array[Element] = js.native
  def insert(index: scala.Double, element: Element): scala.Unit = js.native
  def items(): js.Array[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def len(): scala.Double = js.native
  def makeelement(tag: ElementTag): Element = js.native
  def makeelement(tag: ElementTag, attrib: Attributes): Element = js.native
  def remove(element: Element): scala.Unit = js.native
  def set(k: java.lang.String): java.lang.String = js.native
  def set(k: java.lang.String, v: java.lang.String): java.lang.String = js.native
  def setItem(index: scala.Double, element: Element): scala.Unit = js.native
  def setSlice(start: scala.Double, stop: scala.Double, elements: js.Array[Element]): scala.Unit = js.native
}

