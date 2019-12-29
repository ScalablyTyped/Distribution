package typings.ejDotWebDotAll.ej.Sunburst

import org.scalablytyped.runtime.TopLevel
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
  sealed trait FadeIn extends Animation
  
  //string
  @js.native
  sealed trait Rotation extends Animation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Animation with Double] = js.native
  /* 1 */ @js.native
  object FadeIn extends TopLevel[FadeIn with Double]
  
  /* 0 */ @js.native
  object Rotation extends TopLevel[Rotation with Double]
  
}

