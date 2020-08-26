package typings.domutils

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("domutils/lib/manipulation", JSImport.Namespace)
@js.native
object manipulationMod extends js.Object {
  def append(elem: Node, next: Node): Unit = js.native
  def appendChild(elem: Element, child: Node): Unit = js.native
  def prepend(elem: Node, prev: Node): Unit = js.native
  def removeElement(elem: Node): Unit = js.native
  def replaceElement(elem: Node, replacement: Node): Unit = js.native
}

