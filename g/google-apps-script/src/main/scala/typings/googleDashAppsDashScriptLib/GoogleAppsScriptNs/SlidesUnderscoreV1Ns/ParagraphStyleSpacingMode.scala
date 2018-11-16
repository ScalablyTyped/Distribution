package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphStyleSpacingMode extends js.Object

// The different modes for paragraph spacing.
@JSGlobal("GoogleAppsScript.Slides_v1.ParagraphStyleSpacingMode")
@js.native
object ParagraphStyleSpacingMode extends js.Object {
  // Paragraph spacing is skipped between list elements.
  @js.native
  sealed trait COLLAPSE_LISTS
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleSpacingMode
  
  // Paragraph spacing is always rendered.
  @js.native
  sealed trait NEVER_COLLAPSE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleSpacingMode
  
  // The spacing mode is inherited from the parent.
  @js.native
  sealed trait SPACING_MODE_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleSpacingMode
  
  val COLLAPSE_LISTS: COLLAPSE_LISTS with java.lang.String = js.native
  val NEVER_COLLAPSE: NEVER_COLLAPSE with java.lang.String = js.native
  val SPACING_MODE_UNSPECIFIED: SPACING_MODE_UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleSpacingMode with java.lang.String
  ] = js.native
}

