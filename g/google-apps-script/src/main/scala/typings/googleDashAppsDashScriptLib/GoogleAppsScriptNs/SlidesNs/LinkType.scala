package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.LinkType")
@js.native
object LinkType extends js.Object {
  @js.native
  sealed trait SLIDE_ID
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LinkType
  
  @js.native
  sealed trait SLIDE_INDEX
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LinkType
  
  @js.native
  sealed trait SLIDE_POSITION
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LinkType
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LinkType
  
  @js.native
  sealed trait URL
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LinkType
  
  val SLIDE_ID: SLIDE_ID with java.lang.String = js.native
  val SLIDE_INDEX: SLIDE_INDEX with java.lang.String = js.native
  val SLIDE_POSITION: SLIDE_POSITION with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  val URL: URL with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LinkType with java.lang.String
  ] = js.native
}

