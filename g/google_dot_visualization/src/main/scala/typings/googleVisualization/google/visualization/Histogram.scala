package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Histogram
  extends StObject
     with CoreChartBase {
  
  def draw(data: DataTable, options: HistogramOptions): Unit = js.native
  def draw(data: DataView, options: HistogramOptions): Unit = js.native
}
