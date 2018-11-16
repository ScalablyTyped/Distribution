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
  
  val Backward: Backward with java.lang.String = js.native
  val Forward: Forward with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.FlowDirection with java.lang.String
  ] = js.native
}

