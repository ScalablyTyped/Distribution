package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

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
  sealed trait Inside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.LabelPlacement
  
  //string
  @js.native
  sealed trait Outside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.LabelPlacement
  
  val Inside: Inside with java.lang.String = js.native
  val Outside: Outside with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.LabelPlacement with java.lang.String
  ] = js.native
}

