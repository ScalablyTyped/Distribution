package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxChart extends BaseChart {
  
  /**
    * [descr:dxChart.getArgumentAxis()]
    */
  def getArgumentAxis(): chartAxisObject = js.native
  
  /**
    * [descr:dxChart.getValueAxis()]
    */
  def getValueAxis(): chartAxisObject = js.native
  /**
    * [descr:dxChart.getValueAxis(name)]
    */
  def getValueAxis(name: String): chartAxisObject = js.native
  
  /**
    * [descr:dxChart.resetVisualRange()]
    */
  def resetVisualRange(): Unit = js.native
  
  def zoomArgument(startValue: String, endValue: String): Unit = js.native
  def zoomArgument(startValue: String, endValue: Double): Unit = js.native
  def zoomArgument(startValue: String, endValue: Date): Unit = js.native
  def zoomArgument(startValue: Double, endValue: String): Unit = js.native
  /**
    * [descr:dxChart.zoomArgument(startValue,endValue)]
    */
  def zoomArgument(startValue: Double, endValue: Double): Unit = js.native
  def zoomArgument(startValue: Double, endValue: Date): Unit = js.native
  def zoomArgument(startValue: Date, endValue: String): Unit = js.native
  def zoomArgument(startValue: Date, endValue: Double): Unit = js.native
  def zoomArgument(startValue: Date, endValue: Date): Unit = js.native
}
