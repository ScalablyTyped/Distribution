package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

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
  sealed trait Above
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.LabelPosition
  
  //string
  @js.native
  sealed trait Below
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.LabelPosition
  
  /* 0 */ val Above: Above with scala.Double = js.native
  /* 1 */ val Below: Below with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.LabelPosition with scala.Double
  ] = js.native
}

