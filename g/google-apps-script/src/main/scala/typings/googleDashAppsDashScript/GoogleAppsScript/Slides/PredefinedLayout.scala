package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PredefinedLayout extends js.Object

/**
  * Predefined layouts. These are commonly found layouts in presentations. However, there is no
  * guarantee that these layouts are present in the current master as they could have been deleted or
  * not part of the used theme. Additionally, the placeholders on each layout may have been changed.
  */
@JSGlobal("GoogleAppsScript.Slides.PredefinedLayout")
@js.native
object PredefinedLayout extends js.Object {
  @js.native
  sealed trait BIG_NUMBER extends PredefinedLayout
  
  @js.native
  sealed trait BLANK extends PredefinedLayout
  
  @js.native
  sealed trait CAPTION_ONLY extends PredefinedLayout
  
  @js.native
  sealed trait MAIN_POINT extends PredefinedLayout
  
  @js.native
  sealed trait ONE_COLUMN_TEXT extends PredefinedLayout
  
  @js.native
  sealed trait SECTION_HEADER extends PredefinedLayout
  
  @js.native
  sealed trait SECTION_TITLE_AND_DESCRIPTION extends PredefinedLayout
  
  @js.native
  sealed trait TITLE extends PredefinedLayout
  
  @js.native
  sealed trait TITLE_AND_BODY extends PredefinedLayout
  
  @js.native
  sealed trait TITLE_AND_TWO_COLUMNS extends PredefinedLayout
  
  @js.native
  sealed trait TITLE_ONLY extends PredefinedLayout
  
  @js.native
  sealed trait UNSUPPORTED extends PredefinedLayout
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PredefinedLayout with Double] = js.native
  /* 11 */ @js.native
  object BIG_NUMBER extends TopLevel[BIG_NUMBER with Double]
  
  /* 1 */ @js.native
  object BLANK extends TopLevel[BLANK with Double]
  
  /* 2 */ @js.native
  object CAPTION_ONLY extends TopLevel[CAPTION_ONLY with Double]
  
  /* 10 */ @js.native
  object MAIN_POINT extends TopLevel[MAIN_POINT with Double]
  
  /* 9 */ @js.native
  object ONE_COLUMN_TEXT extends TopLevel[ONE_COLUMN_TEXT with Double]
  
  /* 7 */ @js.native
  object SECTION_HEADER extends TopLevel[SECTION_HEADER with Double]
  
  /* 8 */ @js.native
  object SECTION_TITLE_AND_DESCRIPTION extends TopLevel[SECTION_TITLE_AND_DESCRIPTION with Double]
  
  /* 3 */ @js.native
  object TITLE extends TopLevel[TITLE with Double]
  
  /* 4 */ @js.native
  object TITLE_AND_BODY extends TopLevel[TITLE_AND_BODY with Double]
  
  /* 5 */ @js.native
  object TITLE_AND_TWO_COLUMNS extends TopLevel[TITLE_AND_TWO_COLUMNS with Double]
  
  /* 6 */ @js.native
  object TITLE_ONLY extends TopLevel[TITLE_ONLY with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

