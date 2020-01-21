package typings.googleAppsScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FillType extends js.Object

/**
  * The kinds of fill.
  */
@JSGlobal("GoogleAppsScript.Slides.FillType")
@js.native
object FillType extends js.Object {
  @js.native
  sealed trait NONE extends FillType
  
  @js.native
  sealed trait SOLID extends FillType
  
  @js.native
  sealed trait UNSUPPORTED extends FillType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FillType with Double] = js.native
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 2 */ @js.native
  object SOLID extends TopLevel[SOLID with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

