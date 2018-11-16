package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineCategory extends js.Object

@JSGlobal("GoogleAppsScript.Slides_v1.LineCategory")
@js.native
object LineCategory extends js.Object {
  // Bent connectors, including bent connector 2 to 5.
  @js.native
  sealed trait BENT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineCategory
  
  // Curved connectors, including curved connector 2 to 5.
  @js.native
  sealed trait CURVED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineCategory
  
  // Unspecified line category.
  @js.native
  sealed trait LINE_CATEGORY_UNSPECIFIED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineCategory
  
  // Straight connectors, including straight connector 1.
  @js.native
  sealed trait STRAIGHT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineCategory
  
  val BENT: BENT with java.lang.String = js.native
  val CURVED: CURVED with java.lang.String = js.native
  val LINE_CATEGORY_UNSPECIFIED: LINE_CATEGORY_UNSPECIFIED with java.lang.String = js.native
  val STRAIGHT: STRAIGHT with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.LineCategory with java.lang.String
  ] = js.native
}

