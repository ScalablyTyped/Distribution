package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPolarChart extends BaseChart {
  /** Gets a value axis. */
  def getValueAxis(): chartAxisObject = js.native
  /** Resets the value axis' visual range to the data range or to the whole range if it is within the data range. */
  def resetVisualRange(): Unit = js.native
}

