package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rectangle extends js.Object {
  // properties
  var height: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def contains(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Boolean = js.native
  def contains(x: Double, y: Double, width: Double): Boolean = js.native
  def contains(x: Double, y: Double, width: Double, height: Double): Boolean = js.native
  def copy(rectangle: Rectangle): Rectangle = js.native
  def extend(x: Double, y: Double): Rectangle = js.native
  def extend(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Rectangle = js.native
  def extend(x: Double, y: Double, width: Double): Rectangle = js.native
  def extend(x: Double, y: Double, width: Double, height: Double): Rectangle = js.native
  def intersection(rect: Rectangle): Rectangle = js.native
  def intersects(rect: Rectangle): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def pad(top: Double, left: Double, bottom: Double, right: Double): Rectangle = js.native
  def setValues(): Rectangle = js.native
  def setValues(
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    width: js.UndefOr[scala.Nothing],
    height: Double
  ): Rectangle = js.native
  def setValues(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double): Rectangle = js.native
  def setValues(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double): Rectangle = js.native
  def setValues(x: js.UndefOr[scala.Nothing], y: Double): Rectangle = js.native
  def setValues(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double): Rectangle = js.native
  def setValues(x: js.UndefOr[scala.Nothing], y: Double, width: Double): Rectangle = js.native
  def setValues(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double): Rectangle = js.native
  def setValues(x: Double): Rectangle = js.native
  def setValues(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double): Rectangle = js.native
  def setValues(x: Double, y: js.UndefOr[scala.Nothing], width: Double): Rectangle = js.native
  def setValues(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double): Rectangle = js.native
  def setValues(x: Double, y: Double): Rectangle = js.native
  def setValues(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double): Rectangle = js.native
  def setValues(x: Double, y: Double, width: Double): Rectangle = js.native
  def setValues(x: Double, y: Double, width: Double, height: Double): Rectangle = js.native
  def union(rect: Rectangle): Rectangle = js.native
}

