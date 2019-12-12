package typings.ejDotWebDotAll.ej.datavisualization.Sunburst

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.Animation.FadeIn
import typings.ejDotWebDotAll.ej.datavisualization.Sunburst.Animation.Rotation
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.datavisualization.Sunburst.Animation with Double] = js.native
  /* 1 */ @js.native
  object FadeIn extends TopLevel[FadeIn with Double]
  
  /* 0 */ @js.native
  object Rotation extends TopLevel[Rotation with Double]
  
}

