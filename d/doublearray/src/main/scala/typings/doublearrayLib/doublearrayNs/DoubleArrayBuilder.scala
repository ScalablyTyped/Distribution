package typings
package doublearrayLib.doublearrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoubleArrayBuilder extends js.Object {
  var bc: BaseAndCheck = js.native
  var keys: js.Array[KeyValue] = js.native
  def append(key: java.lang.String, record: scala.Double): DoubleArrayBuilder = js.native
  def build(): DoubleArray = js.native
  def build(keys: js.Array[KeyValue]): DoubleArray = js.native
  def build(keys: js.Array[KeyValue], sorted: scala.Boolean): DoubleArray = js.native
  def findAllocatableBase(children_info: stdLib.Int32Array): scala.Double = js.native
  def getChildrenInfo(position: scala.Double, start: scala.Double, length: scala.Double): stdLib.Int32Array = js.native
  def isUnusedNode(index: scala.Double): scala.Boolean = js.native
  def setBC(parent_id: scala.Double, children_info: stdLib.Int32Array, _base: scala.Double): scala.Unit = js.native
}

