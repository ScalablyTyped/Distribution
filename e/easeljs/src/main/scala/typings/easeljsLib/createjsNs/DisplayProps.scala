package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.DisplayProps")
@js.native
class DisplayProps () extends js.Object {
  def this(visible: scala.Double) = this()
  def this(visible: scala.Double, alpha: scala.Double) = this()
  def this(visible: scala.Double, alpha: scala.Double, shadow: scala.Double) = this()
  def this(visible: scala.Double, alpha: scala.Double, shadow: scala.Double, compositeOperation: scala.Double) = this()
  def this(visible: scala.Double, alpha: scala.Double, shadow: scala.Double, compositeOperation: scala.Double, matrix: scala.Double) = this()
  // properties
  var alpha: scala.Double = js.native
  var compositeOperation: java.lang.String = js.native
  var matrix: Matrix2D = js.native
  var shadow: Shadow = js.native
  var visible: scala.Boolean = js.native
  // methods
  def append(visible: scala.Boolean, alpha: scala.Double, shadow: Shadow, compositeOperation: java.lang.String): DisplayProps = js.native
  // methods
  def append(
    visible: scala.Boolean,
    alpha: scala.Double,
    shadow: Shadow,
    compositeOperation: java.lang.String,
    matrix: Matrix2D
  ): DisplayProps = js.native
  def identity(): DisplayProps = js.native
  def prepend(visible: scala.Boolean, alpha: scala.Double, shadow: Shadow, compositeOperation: java.lang.String): DisplayProps = js.native
  def prepend(
    visible: scala.Boolean,
    alpha: scala.Double,
    shadow: Shadow,
    compositeOperation: java.lang.String,
    matrix: Matrix2D
  ): DisplayProps = js.native
  def setValues(): DisplayProps = js.native
  def setValues(visible: scala.Boolean): DisplayProps = js.native
  def setValues(visible: scala.Boolean, alpha: scala.Double): DisplayProps = js.native
  def setValues(visible: scala.Boolean, alpha: scala.Double, shadow: scala.Double): DisplayProps = js.native
  def setValues(
    visible: scala.Boolean,
    alpha: scala.Double,
    shadow: scala.Double,
    compositeOperation: scala.Double
  ): DisplayProps = js.native
  def setValues(
    visible: scala.Boolean,
    alpha: scala.Double,
    shadow: scala.Double,
    compositeOperation: scala.Double,
    matrix: scala.Double
  ): DisplayProps = js.native
}

