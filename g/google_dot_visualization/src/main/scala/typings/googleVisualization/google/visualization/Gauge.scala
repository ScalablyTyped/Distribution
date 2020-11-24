package typings.googleVisualization.google.visualization

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gauge extends js.Object {
  
  def clearChart(): Unit = js.native
  
  def draw(data: DataTable, options: GaugeChartOptions): Unit = js.native
  def draw(data: DataView, options: GaugeChartOptions): Unit = js.native
  
  def getContainer(): Element = js.native
}
