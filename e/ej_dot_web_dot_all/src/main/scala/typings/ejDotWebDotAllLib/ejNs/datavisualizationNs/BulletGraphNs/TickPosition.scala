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
  
  val Above: Above with java.lang.String = js.native
  val Below: Below with java.lang.String = js.native
  val Cross: Cross with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TickPosition with java.lang.String
  ] = js.native
}

