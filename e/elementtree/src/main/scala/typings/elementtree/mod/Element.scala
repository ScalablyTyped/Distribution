package typings.elementtree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends js.Object {
  
  def append(element: Element): Unit = js.native
  
  var attrib: Attributes = js.native
  
  def clear(): Unit = js.native
  
  def delItem(index: Double): Unit = js.native
  
  def delSlice(start: Double, stop: Double): Unit = js.native
  
  def extend(elements: js.Array[Element]): Unit = js.native
  
  def find(path: String): Element | Null = js.native
  
  def findall(path: String): js.Array[Element] = js.native
  
  def findtext(path: String): js.UndefOr[ElementText] = js.native
  
  def get(k: String): js.UndefOr[String] = js.native
  
  def getItem(index: Double): js.UndefOr[Element] = js.native
  
  def getSlice(start: Double, stop: Double): js.Array[Element] = js.native
  
  def getchildren(): js.Array[Element] = js.native
  
  def insert(index: Double, element: Element): Unit = js.native
  
  def items(): js.Array[js.Tuple2[String, String]] = js.native
  
  def keys(): js.Array[String] = js.native
  
  def len(): Double = js.native
  
  def makeelement(tag: ElementTag): Element = js.native
  def makeelement(tag: ElementTag, attrib: Attributes): Element = js.native
  
  def remove(element: Element): Unit = js.native
  
  def set(k: String): String = js.native
  def set(k: String, v: String): String = js.native
  
  def setItem(index: Double, element: Element): Unit = js.native
  
  def setSlice(start: Double, stop: Double, elements: js.Array[Element]): Unit = js.native
  
  var tag: ElementTag = js.native
  
  var tail: String | Null = js.native
  
  var text: ElementText | Null = js.native
}
@JSImport("elementtree", "Element")
@js.native
object Element extends js.Object {
  
  def apply(ElementTag: String): Element = js.native
  def apply(ElementTag: String, attrib: Attributes): Element = js.native
}
