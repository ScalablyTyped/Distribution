package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Timeline extends StObject {
  
  def clearChart(): Unit = js.native
  
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: TimelineOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: TimelineOptions): Unit = js.native
  
  def getSelection(): js.Array[ChartSelection] = js.native
}
