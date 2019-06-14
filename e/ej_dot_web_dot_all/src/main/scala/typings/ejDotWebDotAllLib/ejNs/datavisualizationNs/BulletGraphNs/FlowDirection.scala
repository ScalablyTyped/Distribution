package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FlowDirection extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.FlowDirection")
@js.native
object FlowDirection extends js.Object {
  //string
  @js.native
  sealed trait Backward
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FlowDirection
  
  //string
  @js.native
  sealed trait Forward
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FlowDirection
  
  /* 1 */ val Backward: Backward with scala.Double = js.native
  /* 0 */ val Forward: Forward with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FlowDirection with scala.Double
  ] = js.native
}

