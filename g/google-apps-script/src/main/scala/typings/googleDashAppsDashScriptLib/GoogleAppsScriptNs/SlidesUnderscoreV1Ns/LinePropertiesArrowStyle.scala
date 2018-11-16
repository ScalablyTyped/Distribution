package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinePropertiesArrowStyle extends js.Object

@JSGlobal("GoogleAppsScript.Slides_v1.LinePropertiesArrowStyle")
@js.native
object LinePropertiesArrowStyle extends js.Object {
  // An unspecified arrow style.
  @js.native
  sealed trait ARROW_STYLE_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle
  
  // Filled arrow. Corresponds to ECMA-376 ST_LineEndType value 'triangle'.
  @js.native
  sealed trait FILL_ARROW
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle
  
  // Filled circle. Corresponds to ECMA-376 ST_LineEndType value 'oval'.
  @js.native
  sealed trait FILL_CIRCLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle
  
  // Filled diamond. Corresponds to ECMA-376 ST_LineEndType value 'diamond'.
  @js.native
  sealed trait FILL_DIAMOND
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle
  
  // Filled square.
  @js.native
  sealed trait FILL_SQUARE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle
  
  // No arrow.
  @js.native
  sealed trait NONE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle
  
  // Hollow arrow.
  @js.native
  sealed trait OPEN_ARROW
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle
  
  // Hollow circle.
  @js.native
  sealed trait OPEN_CIRCLE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle
  
  // Hollow diamond.
  @js.native
  sealed trait OPEN_DIAMOND
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle
  
  // Hollow square.
  @js.native
  sealed trait OPEN_SQUARE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle
  
  // Arrow with notched back. Corresponds to ECMA-376 ST_LineEndType value
  // 'stealth'.
  @js.native
  sealed trait STEALTH_ARROW
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle
  
  val ARROW_STYLE_UNSPECIFIED: ARROW_STYLE_UNSPECIFIED with java.lang.String = js.native
  val FILL_ARROW: FILL_ARROW with java.lang.String = js.native
  val FILL_CIRCLE: FILL_CIRCLE with java.lang.String = js.native
  val FILL_DIAMOND: FILL_DIAMOND with java.lang.String = js.native
  val FILL_SQUARE: FILL_SQUARE with java.lang.String = js.native
  val NONE: NONE with java.lang.String = js.native
  val OPEN_ARROW: OPEN_ARROW with java.lang.String = js.native
  val OPEN_CIRCLE: OPEN_CIRCLE with java.lang.String = js.native
  val OPEN_DIAMOND: OPEN_DIAMOND with java.lang.String = js.native
  val OPEN_SQUARE: OPEN_SQUARE with java.lang.String = js.native
  val STEALTH_ARROW: STEALTH_ARROW with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LinePropertiesArrowStyle with java.lang.String
  ] = js.native
}

