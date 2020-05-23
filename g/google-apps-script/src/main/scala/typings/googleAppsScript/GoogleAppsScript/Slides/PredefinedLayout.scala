package typings.googleAppsScript.GoogleAppsScript.Slides

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
  
}

