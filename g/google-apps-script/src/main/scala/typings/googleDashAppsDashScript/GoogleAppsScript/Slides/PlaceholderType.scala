package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.BODY
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.CENTERED_TITLE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.CHART
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.CLIP_ART
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.DATE_AND_TIME
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.DIAGRAM
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.FOOTER
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.HEADER
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.MEDIA
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.NONE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.OBJECT
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.PICTURE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.SLIDE_IMAGE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.SLIDE_NUMBER
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.SUBTITLE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.TABLE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.TITLE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PlaceholderType.UNSUPPORTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlaceholderType extends js.Object

/**
  * The placeholder types. Many of these placeholder types correspond to placeholder IDs from the
  * ECMA-376 standard. More information on those shapes can be found in the description of the
  * "ST_PlaceholderType" type in section 19.7.10 of "Office Open XML File Formats - Fundamentals and
  * Markup Language Reference", part 1 of ECMA-376 5th
  * edition.
  */
@JSGlobal("GoogleAppsScript.Slides.PlaceholderType")
@js.native
object PlaceholderType extends js.Object {
  @js.native
  sealed trait BODY extends PlaceholderType
  
  @js.native
  sealed trait CENTERED_TITLE extends PlaceholderType
  
  @js.native
  sealed trait CHART extends PlaceholderType
  
  @js.native
  sealed trait CLIP_ART extends PlaceholderType
  
  @js.native
  sealed trait DATE_AND_TIME extends PlaceholderType
  
  @js.native
  sealed trait DIAGRAM extends PlaceholderType
  
  @js.native
  sealed trait FOOTER extends PlaceholderType
  
  @js.native
  sealed trait HEADER extends PlaceholderType
  
  @js.native
  sealed trait MEDIA extends PlaceholderType
  
  @js.native
  sealed trait NONE extends PlaceholderType
  
  @js.native
  sealed trait OBJECT extends PlaceholderType
  
  @js.native
  sealed trait PICTURE extends PlaceholderType
  
  @js.native
  sealed trait SLIDE_IMAGE extends PlaceholderType
  
  @js.native
  sealed trait SLIDE_NUMBER extends PlaceholderType
  
  @js.native
  sealed trait SUBTITLE extends PlaceholderType
  
  @js.native
  sealed trait TABLE extends PlaceholderType
  
  @js.native
  sealed trait TITLE extends PlaceholderType
  
  @js.native
  sealed trait UNSUPPORTED extends PlaceholderType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PlaceholderType with Double] = js.native
  /* 2 */ @js.native
  object BODY extends TopLevel[BODY with Double]
  
  /* 5 */ @js.native
  object CENTERED_TITLE extends TopLevel[CENTERED_TITLE with Double]
  
  /* 3 */ @js.native
  object CHART extends TopLevel[CHART with Double]
  
  /* 4 */ @js.native
  object CLIP_ART extends TopLevel[CLIP_ART with Double]
  
  /* 7 */ @js.native
  object DATE_AND_TIME extends TopLevel[DATE_AND_TIME with Double]
  
  /* 6 */ @js.native
  object DIAGRAM extends TopLevel[DIAGRAM with Double]
  
  /* 8 */ @js.native
  object FOOTER extends TopLevel[FOOTER with Double]
  
  /* 9 */ @js.native
  object HEADER extends TopLevel[HEADER with Double]
  
  /* 10 */ @js.native
  object MEDIA extends TopLevel[MEDIA with Double]
  
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 11 */ @js.native
  object OBJECT extends TopLevel[OBJECT with Double]
  
  /* 12 */ @js.native
  object PICTURE extends TopLevel[PICTURE with Double]
  
  /* 17 */ @js.native
  object SLIDE_IMAGE extends TopLevel[SLIDE_IMAGE with Double]
  
  /* 13 */ @js.native
  object SLIDE_NUMBER extends TopLevel[SLIDE_NUMBER with Double]
  
  /* 14 */ @js.native
  object SUBTITLE extends TopLevel[SUBTITLE with Double]
  
  /* 15 */ @js.native
  object TABLE extends TopLevel[TABLE with Double]
  
  /* 16 */ @js.native
  object TITLE extends TopLevel[TITLE with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

