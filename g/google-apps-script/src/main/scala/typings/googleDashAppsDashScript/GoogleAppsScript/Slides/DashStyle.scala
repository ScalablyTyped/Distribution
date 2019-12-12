package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.DashStyle.DASH
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.DashStyle.DASH_DOT
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.DashStyle.DOT
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.DashStyle.LONG_DASH
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.DashStyle.LONG_DASH_DOT
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.DashStyle.SOLID
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.DashStyle.UNSUPPORTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DashStyle extends js.Object

/**
  * The kinds of dashes with which linear geometry can be rendered. These values are based on the
  * "ST_PresetLineDashVal" simple type described in section 20.1.10.48 of "Office Open XML File
  * Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
  * edition.
  */
@JSGlobal("GoogleAppsScript.Slides.DashStyle")
@js.native
object DashStyle extends js.Object {
  @js.native
  sealed trait DASH extends DashStyle
  
  @js.native
  sealed trait DASH_DOT extends DashStyle
  
  @js.native
  sealed trait DOT extends DashStyle
  
  @js.native
  sealed trait LONG_DASH extends DashStyle
  
  @js.native
  sealed trait LONG_DASH_DOT extends DashStyle
  
  @js.native
  sealed trait SOLID extends DashStyle
  
  @js.native
  sealed trait UNSUPPORTED extends DashStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DashStyle with Double] = js.native
  /* 3 */ @js.native
  object DASH extends TopLevel[DASH with Double]
  
  /* 4 */ @js.native
  object DASH_DOT extends TopLevel[DASH_DOT with Double]
  
  /* 2 */ @js.native
  object DOT extends TopLevel[DOT with Double]
  
  /* 5 */ @js.native
  object LONG_DASH extends TopLevel[LONG_DASH with Double]
  
  /* 6 */ @js.native
  object LONG_DASH_DOT extends TopLevel[LONG_DASH_DOT with Double]
  
  /* 1 */ @js.native
  object SOLID extends TopLevel[SOLID with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

