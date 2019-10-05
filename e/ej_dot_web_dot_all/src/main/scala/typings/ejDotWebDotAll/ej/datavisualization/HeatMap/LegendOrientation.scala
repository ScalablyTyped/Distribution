package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendOrientation extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.LegendOrientation")
@js.native
object LegendOrientation extends js.Object {
  //Scales the graphic content non-uniformly to the width and height of the diagram area
  @js.native
  sealed trait Horizontal extends LegendOrientation
  
  //Used to align the image at the top left of diagram area
  @js.native
  sealed trait Vertical extends LegendOrientation
  
  /* 0 */ val Horizontal: typings.ejDotWebDotAll.ej.datavisualization.HeatMap.LegendOrientation.Horizontal with Double = js.native
  /* 1 */ val Vertical: typings.ejDotWebDotAll.ej.datavisualization.HeatMap.LegendOrientation.Vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendOrientation with Double] = js.native
}

