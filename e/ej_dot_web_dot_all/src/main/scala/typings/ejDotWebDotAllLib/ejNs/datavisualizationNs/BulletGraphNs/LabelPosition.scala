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
  
  val Above: Above with java.lang.String = js.native
  val Below: Below with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.LabelPosition with java.lang.String
  ] = js.native
}

