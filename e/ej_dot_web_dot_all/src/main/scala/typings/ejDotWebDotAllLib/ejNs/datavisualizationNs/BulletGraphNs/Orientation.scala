package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.Orientation")
@js.native
object Orientation extends js.Object {
  //string
  @js.native
  sealed trait Horizontal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.Orientation
  
  //string
  @js.native
  sealed trait Vertical
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.Orientation
  
  val Horizontal: Horizontal with java.lang.String = js.native
  val Vertical: Vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs.Orientation with java.lang.String
  ] = js.native
}

