package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait chartSeriesObject extends baseSeriesObject {
  /** @name chartSeriesObject.axis */
  var axis: js.UndefOr[String] = js.native
  /** @name chartSeriesObject.barOverlapGroup */
  var barOverlapGroup: js.UndefOr[String] = js.native
  /** @name chartSeriesObject.pane */
  var pane: js.UndefOr[String] = js.native
  /** @name chartSeriesObject.stack */
  var stack: js.UndefOr[String] = js.native
  /** @name chartSeriesObject.getArgumentAxis() */
  def getArgumentAxis(): chartAxisObject = js.native
  /** @name chartSeriesObject.getValueAxis() */
  def getValueAxis(): chartAxisObject = js.native
}

