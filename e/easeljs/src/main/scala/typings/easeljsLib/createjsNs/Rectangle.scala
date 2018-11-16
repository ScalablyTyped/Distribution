package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Rectangle")
@js.native
class Rectangle () extends js.Object {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  // properties
  var height: scala.Double = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def contains(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def contains(x: scala.Double, y: scala.Double, width: scala.Double): scala.Boolean = js.native
  def contains(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Boolean = js.native
  def copy(rectangle: Rectangle): Rectangle = js.native
  def extend(x: scala.Double, y: scala.Double): Rectangle = js.native
  def extend(x: scala.Double, y: scala.Double, width: scala.Double): Rectangle = js.native
  def extend(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Rectangle = js.native
  def intersection(rect: Rectangle): Rectangle = js.native
  def intersects(rect: Rectangle): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def pad(top: scala.Double, left: scala.Double, bottom: scala.Double, right: scala.Double): Rectangle = js.native
  def setValues(): Rectangle = js.native
  def setValues(x: scala.Double): Rectangle = js.native
  def setValues(x: scala.Double, y: scala.Double): Rectangle = js.native
  def setValues(x: scala.Double, y: scala.Double, width: scala.Double): Rectangle = js.native
  def setValues(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Rectangle = js.native
  def union(rect: Rectangle): Rectangle = js.native
}

