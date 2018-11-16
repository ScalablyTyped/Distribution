package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextStyleBaselineOffset extends js.Object

// The ways in which text can be vertically offset from its normal position.
@JSGlobal("GoogleAppsScript.Slides_v1.TextStyleBaselineOffset")
@js.native
object TextStyleBaselineOffset extends js.Object {
  // The text's baseline offset is inherited from the parent.
  @js.native
  sealed trait BASELINE_OFFSET_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.TextStyleBaselineOffset
  
  // The text is not vertically offset.
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.TextStyleBaselineOffset
  
  // The text is vertically offset downwards (subscript).
  @js.native
  sealed trait SUBSCRIPT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.TextStyleBaselineOffset
  
  // The text is vertically offset upwards (superscript).
  @js.native
  sealed trait SUPERSCRIPT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.TextStyleBaselineOffset
  
  val BASELINE_OFFSET_UNSPECIFIED: BASELINE_OFFSET_UNSPECIFIED with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val SUBSCRIPT: SUBSCRIPT with java.lang.String = js.native
  val SUPERSCRIPT: SUPERSCRIPT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.TextStyleBaselineOffset with java.lang.String
  ] = js.native
}

