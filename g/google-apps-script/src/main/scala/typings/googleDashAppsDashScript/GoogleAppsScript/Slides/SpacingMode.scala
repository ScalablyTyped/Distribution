package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpacingMode extends js.Object

/**
  * The different modes for paragraph spacing.
  */
@JSGlobal("GoogleAppsScript.Slides.SpacingMode")
@js.native
object SpacingMode extends js.Object {
  @js.native
  sealed trait COLLAPSE_LISTS extends SpacingMode
  
  @js.native
  sealed trait NEVER_COLLAPSE extends SpacingMode
  
  @js.native
  sealed trait UNSUPPORTED extends SpacingMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpacingMode with Double] = js.native
  /* 2 */ @js.native
  object COLLAPSE_LISTS extends TopLevel[COLLAPSE_LISTS with Double]
  
  /* 1 */ @js.native
  object NEVER_COLLAPSE extends TopLevel[NEVER_COLLAPSE with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

