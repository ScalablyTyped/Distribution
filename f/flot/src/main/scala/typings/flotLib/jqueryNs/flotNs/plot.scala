package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait plot extends js.Object {
  def draw(): scala.Unit = js.native
  def getAxes(): axes = js.native
  def getCanvas(): stdLib.HTMLCanvasElement = js.native
  def getData(): js.Array[dataSeries] = js.native
  def getOptions(): plotOptions = js.native
  def getPlaceholder(): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def getPlotOffset(): canvasPoint = js.native
  def getXAxes(): js.Array[axis] = js.native
  def getYAxes(): js.Array[axis] = js.native
  def height(): scala.Double = js.native
  def highlight(series: dataSeries, datapoint: item): scala.Unit = js.native
  def offset(): jqueryLib.JQueryCoordinates = js.native
  def pointOffset(point: point): offset = js.native
  def resize(): scala.Unit = js.native
  def setData(data: js.Any): scala.Unit = js.native
  def setupGrid(): scala.Unit = js.native
  def shutdown(): scala.Unit = js.native
  def triggerRedrawOverlay(): scala.Unit = js.native
  def unhighlight(): scala.Unit = js.native
  def unhighlight(series: dataSeries, datapoint: item): scala.Unit = js.native
  def width(): scala.Double = js.native
}

