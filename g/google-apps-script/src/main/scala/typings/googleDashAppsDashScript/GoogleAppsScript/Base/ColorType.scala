package typings.googleDashAppsDashScript.GoogleAppsScript.Base

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.ColorType.RGB
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.ColorType.THEME
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.ColorType.UNSUPPORTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorType extends js.Object

/**
  * The types of Colors
  */
@JSGlobal("GoogleAppsScript.Base.ColorType")
@js.native
object ColorType extends js.Object {
  @js.native
  sealed trait RGB extends ColorType
  
  @js.native
  sealed trait THEME extends ColorType
  
  @js.native
  sealed trait UNSUPPORTED extends ColorType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorType with Double] = js.native
  /* 1 */ @js.native
  object RGB extends TopLevel[RGB with Double]
  
  /* 2 */ @js.native
  object THEME extends TopLevel[THEME with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

