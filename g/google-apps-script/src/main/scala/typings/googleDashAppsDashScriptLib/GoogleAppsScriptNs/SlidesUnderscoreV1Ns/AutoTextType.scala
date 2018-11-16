package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoTextType extends js.Object

// The types of auto text
@JSGlobal("GoogleAppsScript.Slides_v1.AutoTextType")
@js.native
object AutoTextType extends js.Object {
  // Type for autotext that represents the current slide number.
  @js.native
  sealed trait SLIDE_NUMBER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.AutoTextType
  
  // An unspecified autotext type.
  @js.native
  sealed trait TYPE_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.AutoTextType
  
  val SLIDE_NUMBER: SLIDE_NUMBER with java.lang.String = js.native
  val TYPE_UNSPECIFIED: TYPE_UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.AutoTextType with java.lang.String
  ] = js.native
}

