package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContentAlignment extends js.Object

@JSGlobal("GoogleAppsScript.Slides_v1.ContentAlignment")
@js.native
object ContentAlignment extends js.Object {
  // An alignment that aligns the content to the bottom of the content
  // holder. Corresponds to ECMA-376 ST_TextAnchoringType 'b'.
  @js.native
  sealed trait BOTTOM
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ContentAlignment
  
  // An unspecified content alignment. The content alignment is inherited from
  // the parent if it exists.
  @js.native
  sealed trait CONTENT_ALIGNMENT_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ContentAlignment
  
  // An unsupported content alignment.
  @js.native
  sealed trait CONTENT_ALIGNMENT_UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ContentAlignment
  
  // An alignment that aligns the content to the middle of the content
  // holder. Corresponds to ECMA-376 ST_TextAnchoringType 'ctr'.
  @js.native
  sealed trait MIDDLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ContentAlignment
  
  // An alignment that aligns the content to the top of the content holder.
  // Corresponds to ECMA-376 ST_TextAnchoringType 't'.
  @js.native
  sealed trait TOP
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ContentAlignment
  
  val BOTTOM: BOTTOM with java.lang.String = js.native
  val CONTENT_ALIGNMENT_UNSPECIFIED: CONTENT_ALIGNMENT_UNSPECIFIED with java.lang.String = js.native
  val CONTENT_ALIGNMENT_UNSUPPORTED: CONTENT_ALIGNMENT_UNSUPPORTED with java.lang.String = js.native
  val MIDDLE: MIDDLE with java.lang.String = js.native
  val TOP: TOP with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ContentAlignment with java.lang.String
  ] = js.native
}

