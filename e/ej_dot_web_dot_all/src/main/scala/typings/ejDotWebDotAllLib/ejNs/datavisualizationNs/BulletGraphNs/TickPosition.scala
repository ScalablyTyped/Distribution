package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TickPosition extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TickPosition")
@js.native
object TickPosition extends js.Object {
  //string
  @js.native
  sealed trait Above
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TickPosition
  
  //string
  @js.native
  sealed trait Below
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TickPosition
  
  //string
  @js.native
  sealed trait Cross
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TickPosition
  
  /* 1 */ val Above: Above with scala.Double = js.native
  /* 0 */ val Below: Below with scala.Double = js.native
  /* 2 */ val Cross: Cross with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TickPosition with scala.Double
  ] = js.native
}

