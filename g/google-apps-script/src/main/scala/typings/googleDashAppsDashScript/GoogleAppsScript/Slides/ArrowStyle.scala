package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.FILL_ARROW
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.FILL_CIRCLE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.FILL_DIAMOND
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.FILL_SQUARE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.NONE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_ARROW
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_CIRCLE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_DIAMOND
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_SQUARE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.STEALTH_ARROW
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.UNSUPPORTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowStyle extends js.Object

/**
  * The kinds of start and end forms with which linear geometry can be rendered.
  *
  * Some values are based on the "ST_LineEndType" simple type described in section 20.1.10.33 of
  * of "Office Open XML File Formats - Fundamentals and Markup Language Reference", part 1 of ECMA-376 4th
  * edition.
  */
@JSGlobal("GoogleAppsScript.Slides.ArrowStyle")
@js.native
object ArrowStyle extends js.Object {
  @js.native
  sealed trait FILL_ARROW extends ArrowStyle
  
  @js.native
  sealed trait FILL_CIRCLE extends ArrowStyle
  
  @js.native
  sealed trait FILL_DIAMOND extends ArrowStyle
  
  @js.native
  sealed trait FILL_SQUARE extends ArrowStyle
  
  @js.native
  sealed trait NONE extends ArrowStyle
  
  @js.native
  sealed trait OPEN_ARROW extends ArrowStyle
  
  @js.native
  sealed trait OPEN_CIRCLE extends ArrowStyle
  
  @js.native
  sealed trait OPEN_DIAMOND extends ArrowStyle
  
  @js.native
  sealed trait OPEN_SQUARE extends ArrowStyle
  
  @js.native
  sealed trait STEALTH_ARROW extends ArrowStyle
  
  @js.native
  sealed trait UNSUPPORTED extends ArrowStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArrowStyle with Double] = js.native
  /* 3 */ @js.native
  object FILL_ARROW extends TopLevel[FILL_ARROW with Double]
  
  /* 4 */ @js.native
  object FILL_CIRCLE extends TopLevel[FILL_CIRCLE with Double]
  
  /* 6 */ @js.native
  object FILL_DIAMOND extends TopLevel[FILL_DIAMOND with Double]
  
  /* 5 */ @js.native
  object FILL_SQUARE extends TopLevel[FILL_SQUARE with Double]
  
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 7 */ @js.native
  object OPEN_ARROW extends TopLevel[OPEN_ARROW with Double]
  
  /* 8 */ @js.native
  object OPEN_CIRCLE extends TopLevel[OPEN_CIRCLE with Double]
  
  /* 10 */ @js.native
  object OPEN_DIAMOND extends TopLevel[OPEN_DIAMOND with Double]
  
  /* 9 */ @js.native
  object OPEN_SQUARE extends TopLevel[OPEN_SQUARE with Double]
  
  /* 2 */ @js.native
  object STEALTH_ARROW extends TopLevel[STEALTH_ARROW with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

