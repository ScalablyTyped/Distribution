package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShadowType extends js.Object

@JSGlobal("GoogleAppsScript.Slides_v1.ShadowType")
@js.native
object ShadowType extends js.Object {
  // Outer shadow.
  @js.native
  sealed trait OUTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ShadowType
  
  // Unspecified shadow type.
  @js.native
  sealed trait SHADOW_TYPE_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ShadowType
  
  val OUTER: OUTER with java.lang.String = js.native
  val SHADOW_TYPE_UNSPECIFIED: SHADOW_TYPE_UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.ShadowType with java.lang.String
  ] = js.native
}

