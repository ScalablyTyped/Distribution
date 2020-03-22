package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait chartSeriesObject extends baseSeriesObject {
  /** Returns the name of the value axis of the series. */
  var axis: String = js.native
  /** The name of the series' barOverlapGroup. */
  var barOverlapGroup: String = js.native
  /** Returns the name of the series pane. */
  var pane: String = js.native
  /** The name of the series' stack. */
  var stack: String = js.native
  /** Gets the argument axis to which the series belongs. */
  def getArgumentAxis(): chartAxisObject = js.native
  /** Gets the value axis to which the series belongs. */
  def getValueAxis(): chartAxisObject = js.native
}

