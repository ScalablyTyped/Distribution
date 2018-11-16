package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TickPlacement extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TickPlacement")
@js.native
object TickPlacement extends js.Object {
  //string
  @js.native
  sealed trait Inside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TickPlacement
  
  //string
  @js.native
  sealed trait Outside
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TickPlacement
  
  val Inside: Inside with java.lang.String = js.native
  val Outside: Outside with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.TickPlacement with java.lang.String
  ] = js.native
}

