package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Animation.Fade
import typings.ejDotWebDotAll.ej.Animation.None
import typings.ejDotWebDotAll.ej.Animation.Slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("ej.Animation")
@js.native
object Animation extends js.Object {
  @js.native
  sealed trait Fade extends Animation
  
  @js.native
  sealed trait None extends Animation
  
  @js.native
  sealed trait Slide extends Animation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Animation with Double] = js.native
  /* 0 */ @js.native
  object Fade extends TopLevel[Fade with Double]
  
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Slide extends TopLevel[Slide with Double]
  
}

