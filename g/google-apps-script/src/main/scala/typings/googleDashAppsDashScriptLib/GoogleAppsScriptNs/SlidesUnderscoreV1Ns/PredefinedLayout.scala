package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PredefinedLayout extends js.Object

@JSGlobal("GoogleAppsScript.Slides_v1.PredefinedLayout")
@js.native
object PredefinedLayout extends js.Object {
  // Layout with a big number heading.
  @js.native
  sealed trait BIG_NUMBER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  // Blank layout, with no placeholders.
  @js.native
  sealed trait BLANK
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  // Layout with a caption at the bottom.
  @js.native
  sealed trait CAPTION_ONLY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  // Layout with a main point.
  @js.native
  sealed trait MAIN_POINT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  // Layout with one title and one body, arranged in a single column.
  @js.native
  sealed trait ONE_COLUMN_TEXT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  // Unspecified layout.
  @js.native
  sealed trait PREDEFINED_LAYOUT_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  // Layout with a section title.
  @js.native
  sealed trait SECTION_HEADER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  // Layout with a title and subtitle on one side and description on the other.
  @js.native
  sealed trait SECTION_TITLE_AND_DESCRIPTION
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  // Layout with a title and a subtitle.
  @js.native
  sealed trait TITLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  // Layout with a title and body.
  @js.native
  sealed trait TITLE_AND_BODY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  // Layout with a title and two columns.
  @js.native
  sealed trait TITLE_AND_TWO_COLUMNS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  // Layout with only a title.
  @js.native
  sealed trait TITLE_ONLY
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout
  
  val BIG_NUMBER: BIG_NUMBER with java.lang.String = js.native
  val BLANK: BLANK with java.lang.String = js.native
  val CAPTION_ONLY: CAPTION_ONLY with java.lang.String = js.native
  val MAIN_POINT: MAIN_POINT with java.lang.String = js.native
  val ONE_COLUMN_TEXT: ONE_COLUMN_TEXT with java.lang.String = js.native
  val PREDEFINED_LAYOUT_UNSPECIFIED: PREDEFINED_LAYOUT_UNSPECIFIED with java.lang.String = js.native
  val SECTION_HEADER: SECTION_HEADER with java.lang.String = js.native
  val SECTION_TITLE_AND_DESCRIPTION: SECTION_TITLE_AND_DESCRIPTION with java.lang.String = js.native
  val TITLE: TITLE with java.lang.String = js.native
  val TITLE_AND_BODY: TITLE_AND_BODY with java.lang.String = js.native
  val TITLE_AND_TWO_COLUMNS: TITLE_AND_TWO_COLUMNS with java.lang.String = js.native
  val TITLE_ONLY: TITLE_ONLY with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PredefinedLayout with java.lang.String
  ] = js.native
}

