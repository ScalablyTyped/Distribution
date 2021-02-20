package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends ChartBaseClearable {
  
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: TableOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: TableOptions): Unit = js.native
  
  def getSortInfo(): TableSortInfo = js.native
}
