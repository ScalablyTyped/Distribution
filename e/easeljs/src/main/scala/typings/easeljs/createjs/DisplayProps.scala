package typings.easeljs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.DisplayProps")
@js.native
class DisplayProps () extends js.Object {
  def this(visible: Double) = this()
  def this(visible: Double, alpha: Double) = this()
  def this(visible: Double, alpha: Double, shadow: Double) = this()
  def this(visible: Double, alpha: Double, shadow: Double, compositeOperation: Double) = this()
  def this(visible: Double, alpha: Double, shadow: Double, compositeOperation: Double, matrix: Double) = this()
  // properties
  var alpha: Double = js.native
  var compositeOperation: String = js.native
  var matrix: Matrix2D = js.native
  var shadow: Shadow = js.native
  var visible: Boolean = js.native
  // methods
  def append(visible: Boolean, alpha: Double, shadow: Shadow, compositeOperation: String): DisplayProps = js.native
  def append(visible: Boolean, alpha: Double, shadow: Shadow, compositeOperation: String, matrix: Matrix2D): DisplayProps = js.native
  def identity(): DisplayProps = js.native
  def prepend(visible: Boolean, alpha: Double, shadow: Shadow, compositeOperation: String): DisplayProps = js.native
  def prepend(visible: Boolean, alpha: Double, shadow: Shadow, compositeOperation: String, matrix: Matrix2D): DisplayProps = js.native
  def setValues(): DisplayProps = js.native
  def setValues(visible: Boolean): DisplayProps = js.native
  def setValues(visible: Boolean, alpha: Double): DisplayProps = js.native
  def setValues(visible: Boolean, alpha: Double, shadow: Double): DisplayProps = js.native
  def setValues(visible: Boolean, alpha: Double, shadow: Double, compositeOperation: Double): DisplayProps = js.native
  def setValues(visible: Boolean, alpha: Double, shadow: Double, compositeOperation: Double, matrix: Double): DisplayProps = js.native
}

