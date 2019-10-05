package typings.ejDotWebDotAll.ej.datavisualization.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.Animation")
@js.native
object Animation extends js.Object {
  //string
  @js.native
  sealed trait FadeIn
    extends typings.ejDotWebDotAll.ej.datavisualization.Sunburst.Animation
  
  //string
  @js.native
  sealed trait Rotation
    extends typings.ejDotWebDotAll.ej.datavisualization.Sunburst.Animation
  
  /* 1 */ val FadeIn: typings.ejDotWebDotAll.ej.datavisualization.Sunburst.Animation.FadeIn with Double = js.native
  /* 0 */ val Rotation: typings.ejDotWebDotAll.ej.datavisualization.Sunburst.Animation.Rotation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.datavisualization.Sunburst.Animation with Double] = js.native
}

