package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PagePageType extends js.Object

// The type of a page.
@JSGlobal("GoogleAppsScript.Slides_v1.PagePageType")
@js.native
object PagePageType extends js.Object {
  // A layout page.
  @js.native
  sealed trait LAYOUT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PagePageType
  
  // A master slide page.
  @js.native
  sealed trait MASTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PagePageType
  
  // A notes page.
  @js.native
  sealed trait NOTES
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PagePageType
  
  // A notes master page.
  @js.native
  sealed trait NOTES_MASTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PagePageType
  
  // A slide page.
  @js.native
  sealed trait SLIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PagePageType
  
  val LAYOUT: LAYOUT with java.lang.String = js.native
  val MASTER: MASTER with java.lang.String = js.native
  val NOTES: NOTES with java.lang.String = js.native
  val NOTES_MASTER: NOTES_MASTER with java.lang.String = js.native
  val SLIDE: SLIDE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.PagePageType with java.lang.String
  ] = js.native
}

