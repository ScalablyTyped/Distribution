package typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelPlacement extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.LabelPlacement")
@js.native
object LabelPlacement extends js.Object {
  //string
  @js.native
  sealed trait Inside extends LabelPlacement
  
  //string
  @js.native
  sealed trait Outside extends LabelPlacement
  
  /* 0 */ val Inside: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.LabelPlacement.Inside with Double = js.native
  /* 1 */ val Outside: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.LabelPlacement.Outside with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LabelPlacement with Double] = js.native
}

