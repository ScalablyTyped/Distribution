package typings.ejWebAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Vertical extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.Vertical")
@js.native
object Vertical extends js.Object {
  //Used to display the tooltip horizontally on right side of rows/columns
  @js.native
  sealed trait Bottom extends Vertical
  
  //Used to display the tooltip horizontally on center side of rows/columns
  @js.native
  sealed trait Center extends Vertical
  
  //Used to display the tooltip horizontally on left side of rows/columns
  @js.native
  sealed trait Top extends Vertical
  
}

