package typings.ejDotWebDotAll.ej.Tooltip

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Tooltip.effect.Fade
import typings.ejDotWebDotAll.ej.Tooltip.effect.None
import typings.ejDotWebDotAll.ej.Tooltip.effect.Slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait effect extends js.Object

@JSGlobal("ej.Tooltip.effect")
@js.native
object effect extends js.Object {
  ///Fade the Tooltip in and out of visibility.
  @js.native
  sealed trait Fade extends effect
  
  ///No animation takes place when showing/hiding the Tooltip
  @js.native
  sealed trait None extends effect
  
  ///Sliding effect takes place when showing/hiding the Tooltip
  @js.native
  sealed trait Slide extends effect
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[effect with Double] = js.native
  /* 2 */ @js.native
  object Fade extends TopLevel[Fade with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object Slide extends TopLevel[Slide with Double]
  
}

