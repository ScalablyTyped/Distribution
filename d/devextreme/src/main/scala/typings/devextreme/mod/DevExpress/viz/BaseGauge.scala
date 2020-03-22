package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseGauge extends BaseWidget {
  /** Gets subvalues. */
  def subvalues(): js.Array[Double] = js.native
  /** Updates subvalues. */
  def subvalues(subvalues: js.Array[Double]): Unit = js.native
  /** Gets the main value. */
  def value(): Double = js.native
  /** Updates the main value. */
  def value(value: Double): Unit = js.native
}

