package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calendar extends ChartBaseClearable {
  
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: CalendarOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: CalendarOptions): Unit = js.native
  
  def getBoundingBox(id: String): js.Object = js.native
}
