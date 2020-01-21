package typings.googleAppsScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AlignmentPosition extends js.Object

/**
  * The alignment position to apply.
  */
@JSGlobal("GoogleAppsScript.Slides.AlignmentPosition")
@js.native
object AlignmentPosition extends js.Object {
  @js.native
  sealed trait CENTER extends AlignmentPosition
  
  @js.native
  sealed trait HORIZONTAL_CENTER extends AlignmentPosition
  
  @js.native
  sealed trait VERTICAL_CENTER extends AlignmentPosition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AlignmentPosition with Double] = js.native
  /* 0 */ @js.native
  object CENTER extends TopLevel[CENTER with Double]
  
  /* 1 */ @js.native
  object HORIZONTAL_CENTER extends TopLevel[HORIZONTAL_CENTER with Double]
  
  /* 2 */ @js.native
  object VERTICAL_CENTER extends TopLevel[VERTICAL_CENTER with Double]
  
}

