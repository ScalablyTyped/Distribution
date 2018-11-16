package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DashStyle extends js.Object

@JSGlobal("GoogleAppsScript.Slides_v1.DashStyle")
@js.native
object DashStyle extends js.Object {
  // Dashed line. Corresponds to ECMA-376 ST_PresetLineDashVal value 'dash'.
  @js.native
  sealed trait DASH
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.DashStyle
  
  // Alternating dashes and dots. Corresponds to ECMA-376 ST_PresetLineDashVal
  // value 'dashDot'.
  @js.native
  sealed trait DASH_DOT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.DashStyle
  
  // Unspecified dash style.
  @js.native
  sealed trait DASH_STYLE_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.DashStyle
  
  // Dotted line. Corresponds to ECMA-376 ST_PresetLineDashVal value 'dot'.
  @js.native
  sealed trait DOT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.DashStyle
  
  // Line with large dashes. Corresponds to ECMA-376 ST_PresetLineDashVal
  // value 'lgDash'.
  @js.native
  sealed trait LONG_DASH
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.DashStyle
  
  // Alternating large dashes and dots. Corresponds to ECMA-376
  // ST_PresetLineDashVal value 'lgDashDot'.
  @js.native
  sealed trait LONG_DASH_DOT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.DashStyle
  
  // Solid line. Corresponds to ECMA-376 ST_PresetLineDashVal value 'solid'.
  // This is the default dash style.
  @js.native
  sealed trait SOLID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.DashStyle
  
  val DASH: DASH with java.lang.String = js.native
  val DASH_DOT: DASH_DOT with java.lang.String = js.native
  val DASH_STYLE_UNSPECIFIED: DASH_STYLE_UNSPECIFIED with java.lang.String = js.native
  val DOT: DOT with java.lang.String = js.native
  val LONG_DASH: LONG_DASH with java.lang.String = js.native
  val LONG_DASH_DOT: LONG_DASH_DOT with java.lang.String = js.native
  val SOLID: SOLID with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.DashStyle with java.lang.String
  ] = js.native
}

