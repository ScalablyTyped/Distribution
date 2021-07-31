package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeMap
  extends StObject
     with ChartBaseClearable {
  
  def draw(data: DataTable): Unit = js.native
  def draw(data: DataTable, options: TreeMapOptions): Unit = js.native
  def draw(data: DataView): Unit = js.native
  def draw(data: DataView, options: TreeMapOptions): Unit = js.native
  
  def getMaxPossibleDepth(): Double = js.native
  
  def goUpAndDraw(): Unit = js.native
}
