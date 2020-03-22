package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChart extends BaseChart {
  /** Gets the argument axis. */
  def getArgumentAxis(): chartAxisObject = js.native
  /** Gets a value axis. */
  def getValueAxis(): chartAxisObject = js.native
  /** Gets a value axis with the specified name. */
  def getValueAxis(name: String): chartAxisObject = js.native
  /** Resets the visual ranges of both axes to the data range or to the whole range if it is within the data range. */
  def resetVisualRange(): Unit = js.native
  def zoomArgument(startValue: String, endValue: String): Unit = js.native
  def zoomArgument(startValue: String, endValue: Double): Unit = js.native
  def zoomArgument(startValue: String, endValue: Date): Unit = js.native
  def zoomArgument(startValue: Double, endValue: String): Unit = js.native
  /** Sets the argument axis' start and end values. */
  def zoomArgument(startValue: Double, endValue: Double): Unit = js.native
  def zoomArgument(startValue: Double, endValue: Date): Unit = js.native
  def zoomArgument(startValue: Date, endValue: String): Unit = js.native
  def zoomArgument(startValue: Date, endValue: Double): Unit = js.native
  def zoomArgument(startValue: Date, endValue: Date): Unit = js.native
}

