package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

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
  
  /* 3 */ val FILL_ARROW: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.FILL_ARROW with Double = js.native
  /* 4 */ val FILL_CIRCLE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.FILL_CIRCLE with Double = js.native
  /* 6 */ val FILL_DIAMOND: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.FILL_DIAMOND with Double = js.native
  /* 5 */ val FILL_SQUARE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.FILL_SQUARE with Double = js.native
  /* 1 */ val NONE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.NONE with Double = js.native
  /* 7 */ val OPEN_ARROW: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_ARROW with Double = js.native
  /* 8 */ val OPEN_CIRCLE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_CIRCLE with Double = js.native
  /* 10 */ val OPEN_DIAMOND: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_DIAMOND with Double = js.native
  /* 9 */ val OPEN_SQUARE: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.OPEN_SQUARE with Double = js.native
  /* 2 */ val STEALTH_ARROW: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.STEALTH_ARROW with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.ArrowStyle.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArrowStyle with Double] = js.native
}

