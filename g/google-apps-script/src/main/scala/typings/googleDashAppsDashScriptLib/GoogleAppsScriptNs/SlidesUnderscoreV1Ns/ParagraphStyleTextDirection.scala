package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphStyleTextDirection extends js.Object

// The directions text can flow in.
@JSGlobal("GoogleAppsScript.Slides_v1.ParagraphStyleTextDirection")
@js.native
object ParagraphStyleTextDirection extends js.Object {
  // The text goes from left to right.
  @js.native
  sealed trait LEFT_TO_RIGHT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleTextDirection
  
  // The text goes from right to left.
  @js.native
  sealed trait RIGHT_TO_LEFT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleTextDirection
  
  // The text direction is inherited from the parent.
  @js.native
  sealed trait TEXT_DIRECTION_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleTextDirection
  
  val LEFT_TO_RIGHT: LEFT_TO_RIGHT with java.lang.String = js.native
  val RIGHT_TO_LEFT: RIGHT_TO_LEFT with java.lang.String = js.native
  val TEXT_DIRECTION_UNSPECIFIED: TEXT_DIRECTION_UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ParagraphStyleTextDirection with java.lang.String
  ] = js.native
}

