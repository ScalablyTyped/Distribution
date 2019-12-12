package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.HeatMap.Vertical.Bottom
import typings.ejDotWebDotAll.ej.datavisualization.HeatMap.Vertical.Center
import typings.ejDotWebDotAll.ej.datavisualization.HeatMap.Vertical.Top
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Vertical with Double] = js.native
  /* 2 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

