package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Unit extends js.Object

@JSGlobal("GoogleAppsScript.Slides_v1.Unit")
@js.native
object Unit extends js.Object {
  // An English Metric Unit (EMU) is defined as 1/360,000 of a centimeter
  // and thus there are 914,400 EMUs per inch, and 12,700 EMUs per point.
  @js.native
  sealed trait EMU
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.Unit
  
  // A point, 1/72 of an inch.
  @js.native
  sealed trait PT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.Unit
  
  // The units are unknown.
  @js.native
  sealed trait UNIT_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.Unit
  
  val EMU: EMU with java.lang.String = js.native
  val PT: PT with java.lang.String = js.native
  val UNIT_UNSPECIFIED: UNIT_UNSPECIFIED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.Unit with java.lang.String
  ] = js.native
}

