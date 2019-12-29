package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SlidePosition extends js.Object

/**
  * The relative position of a Slide.
  */
@JSGlobal("GoogleAppsScript.Slides.SlidePosition")
@js.native
object SlidePosition extends js.Object {
  @js.native
  sealed trait FIRST_SLIDE extends SlidePosition
  
  @js.native
  sealed trait LAST_SLIDE extends SlidePosition
  
  @js.native
  sealed trait NEXT_SLIDE extends SlidePosition
  
  @js.native
  sealed trait PREVIOUS_SLIDE extends SlidePosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SlidePosition with Double] = js.native
  /* 2 */ @js.native
  object FIRST_SLIDE extends TopLevel[FIRST_SLIDE with Double]
  
  /* 3 */ @js.native
  object LAST_SLIDE extends TopLevel[LAST_SLIDE with Double]
  
  /* 0 */ @js.native
  object NEXT_SLIDE extends TopLevel[NEXT_SLIDE with Double]
  
  /* 1 */ @js.native
  object PREVIOUS_SLIDE extends TopLevel[PREVIOUS_SLIDE with Double]
  
}

