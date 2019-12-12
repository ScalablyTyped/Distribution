package typings.ejDotWebDotAll.ej.Sunburst

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Sunburst.Animation.FadeIn
import typings.ejDotWebDotAll.ej.Sunburst.Animation.Rotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("ej.Sunburst.Animation")
@js.native
object Animation extends js.Object {
  //string
  @js.native
  sealed trait FadeIn
    extends typings.ejDotWebDotAll.ej.Sunburst.Animation
  
  //string
  @js.native
  sealed trait Rotation
    extends typings.ejDotWebDotAll.ej.Sunburst.Animation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ej.Sunburst.Animation with Double] = js.native
  /* 1 */ @js.native
  object FadeIn extends TopLevel[FadeIn with Double]
  
  /* 0 */ @js.native
  object Rotation extends TopLevel[Rotation with Double]
  
}

