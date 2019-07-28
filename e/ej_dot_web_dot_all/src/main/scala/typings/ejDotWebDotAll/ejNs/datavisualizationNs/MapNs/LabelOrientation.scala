package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelOrientation extends js.Object

@JSGlobal("ej.datavisualization.Map.LabelOrientation")
@js.native
object LabelOrientation extends js.Object {
  //specifies the horizontal position
  @js.native
  sealed trait Horizontal extends LabelOrientation
  
  //specifies the vertical position
  @js.native
  sealed trait Vertical extends LabelOrientation
  
  /* 0 */ val Horizontal: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.LabelOrientation.Horizontal with Double = js.native
  /* 1 */ val Vertical: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.LabelOrientation.Vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelOrientation with Double] = js.native
}

