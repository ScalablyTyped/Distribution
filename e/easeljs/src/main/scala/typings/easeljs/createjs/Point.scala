package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  // properties
  var x: Double = js.native
  var y: Double = js.native
  def copy(point: Point): Point = js.native
  def setValues(): Point = js.native
  def setValues(x: Double): Point = js.native
  def setValues(x: Double, y: Double): Point = js.native
}

