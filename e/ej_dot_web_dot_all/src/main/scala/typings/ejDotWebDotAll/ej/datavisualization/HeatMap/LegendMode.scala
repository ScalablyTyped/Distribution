package typings.ejDotWebDotAll.ej.datavisualization.HeatMap

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.HeatMap.LegendMode.Gradient
import typings.ejDotWebDotAll.ej.datavisualization.HeatMap.LegendMode.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendMode extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.LegendMode")
@js.native
object LegendMode extends js.Object {
  //Scales the graphic content non-uniformly to the width and height of the diagram area
  @js.native
  sealed trait Gradient extends LegendMode
  
  //Used to align the image at the top left of diagram area
  @js.native
  sealed trait List extends LegendMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendMode with Double] = js.native
  /* 0 */ @js.native
  object Gradient extends TopLevel[Gradient with Double]
  
  /* 1 */ @js.native
  object List extends TopLevel[List with Double]
  
}

