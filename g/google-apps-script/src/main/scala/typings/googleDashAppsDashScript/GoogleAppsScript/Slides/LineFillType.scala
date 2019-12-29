package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineFillType extends js.Object

/**
  * The kinds of line fill.
  */
@JSGlobal("GoogleAppsScript.Slides.LineFillType")
@js.native
object LineFillType extends js.Object {
  @js.native
  sealed trait NONE extends LineFillType
  
  @js.native
  sealed trait SOLID extends LineFillType
  
  @js.native
  sealed trait UNSUPPORTED extends LineFillType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineFillType with Double] = js.native
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 2 */ @js.native
  object SOLID extends TopLevel[SOLID with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

