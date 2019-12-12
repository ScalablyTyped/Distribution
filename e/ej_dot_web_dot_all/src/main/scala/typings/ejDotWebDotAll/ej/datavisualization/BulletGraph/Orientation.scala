package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.Orientation.Horizontal
import typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.Orientation.Vertical
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
    extends typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.Orientation
  
  //string
  @js.native
  sealed trait Vertical
    extends typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.Orientation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.datavisualization.BulletGraph.Orientation with Double] = js.native
  /* 0 */ @js.native
  object Horizontal extends TopLevel[Horizontal with Double]
  
  /* 1 */ @js.native
  object Vertical extends TopLevel[Vertical with Double]
  
}

