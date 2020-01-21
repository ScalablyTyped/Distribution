package typings.googleAppsScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextBaselineOffset extends js.Object

/**
  * The text vertical offset from its normal position.
  */
@JSGlobal("GoogleAppsScript.Slides.TextBaselineOffset")
@js.native
object TextBaselineOffset extends js.Object {
  @js.native
  sealed trait NONE extends TextBaselineOffset
  
  @js.native
  sealed trait SUBSCRIPT extends TextBaselineOffset
  
  @js.native
  sealed trait SUPERSCRIPT extends TextBaselineOffset
  
  @js.native
  sealed trait UNSUPPORTED extends TextBaselineOffset
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextBaselineOffset with Double] = js.native
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 3 */ @js.native
  object SUBSCRIPT extends TopLevel[SUBSCRIPT with Double]
  
  /* 2 */ @js.native
  object SUPERSCRIPT extends TopLevel[SUPERSCRIPT with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

