package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphStyleAlignment extends js.Object

// The types of text alignment for a paragraph.
@JSGlobal("GoogleAppsScript.Slides_v1.ParagraphStyleAlignment")
@js.native
object ParagraphStyleAlignment extends js.Object {
  // The paragraph alignment is inherited from the parent.
  @js.native
  sealed trait ALIGNMENT_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleAlignment
  
  // The paragraph is centered.
  @js.native
  sealed trait CENTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleAlignment
  
  // The paragraph is aligned to the end of the line. Right-aligned for
  // LTR text, left-aligned otherwise.
  @js.native
  sealed trait END
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleAlignment
  
  // The paragraph is justified.
  @js.native
  sealed trait JUSTIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleAlignment
  
  // The paragraph is aligned to the start of the line. Left-aligned for
  // LTR text, right-aligned otherwise.
  @js.native
  sealed trait START
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleAlignment
  
  val ALIGNMENT_UNSPECIFIED: ALIGNMENT_UNSPECIFIED with java.lang.String = js.native
  val CENTER: CENTER with java.lang.String = js.native
  val END: END with java.lang.String = js.native
  val JUSTIFIED: JUSTIFIED with java.lang.String = js.native
  val START: START with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleAlignment with java.lang.String
  ] = js.native
}

