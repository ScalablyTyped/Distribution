package typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs

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
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.Orientation
  
  //string
  @js.native
  sealed trait Vertical
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.Orientation
  
  /* 0 */ val Horizontal: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.Orientation.Horizontal with Double = js.native
  /* 1 */ val Vertical: typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.Orientation.Vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.ejDotWebDotAll.ejNs.datavisualizationNs.BulletGraphNs.Orientation with Double
  ] = js.native
}

