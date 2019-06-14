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
  
  /* 3 */ val SLIDE_ID: SLIDE_ID with scala.Double = js.native
  /* 4 */ val SLIDE_INDEX: SLIDE_INDEX with scala.Double = js.native
  /* 2 */ val SLIDE_POSITION: SLIDE_POSITION with scala.Double = js.native
  /* 0 */ val UNSUPPORTED: UNSUPPORTED with scala.Double = js.native
  /* 1 */ val URL: URL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.LinkType with scala.Double
  ] = js.native
}

