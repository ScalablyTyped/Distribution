package typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelPosition extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.LabelPosition")
@js.native
object LabelPosition extends js.Object {
  //string
  @js.native
  sealed trait Above extends LabelPosition
  
  //string
  @js.native
  sealed trait Below extends LabelPosition
  
  /* 0 */ val Above: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.LabelPosition.Above with Double = js.native
  /* 1 */ val Below: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.LabelPosition.Below with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelPosition with Double] = js.native
}

