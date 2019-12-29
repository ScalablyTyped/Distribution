package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Horizontal extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.Horizontal")
@js.native
object Horizontal extends js.Object {
  //Used to display the tooltip horizontally on center side of rows/columns
  @js.native
  sealed trait Center extends Horizontal
  
  //Used to display the tooltip horizontally on left side of rows/columns
  @js.native
  sealed trait Left extends Horizontal
  
  //Used to display the tooltip horizontally on right side of rows/columns
  @js.native
  sealed trait Right extends Horizontal
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Horizontal with Double] = js.native
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

