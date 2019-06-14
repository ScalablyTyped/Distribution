package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GlyphType extends js.Object

@JSGlobal("GoogleAppsScript.Document.GlyphType")
@js.native
object GlyphType extends js.Object {
  @js.native
  sealed trait BULLET
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.GlyphType
  
  @js.native
  sealed trait HOLLOW_BULLET
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.GlyphType
  
  @js.native
  sealed trait LATIN_LOWER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.GlyphType
  
  @js.native
  sealed trait LATIN_UPPER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.GlyphType
  
  @js.native
  sealed trait NUMBER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.GlyphType
  
  @js.native
  sealed trait ROMAN_LOWER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.GlyphType
  
  @js.native
  sealed trait ROMAN_UPPER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.GlyphType
  
  @js.native
  sealed trait SQUARE_BULLET
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.GlyphType
  
  /* 0 */ val BULLET: BULLET with scala.Double = js.native
  /* 1 */ val HOLLOW_BULLET: HOLLOW_BULLET with scala.Double = js.native
  /* 5 */ val LATIN_LOWER: LATIN_LOWER with scala.Double = js.native
  /* 4 */ val LATIN_UPPER: LATIN_UPPER with scala.Double = js.native
  /* 3 */ val NUMBER: NUMBER with scala.Double = js.native
  /* 7 */ val ROMAN_LOWER: ROMAN_LOWER with scala.Double = js.native
  /* 6 */ val ROMAN_UPPER: ROMAN_UPPER with scala.Double = js.native
  /* 2 */ val SQUARE_BULLET: SQUARE_BULLET with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs.GlyphType with scala.Double
  ] = js.native
}

