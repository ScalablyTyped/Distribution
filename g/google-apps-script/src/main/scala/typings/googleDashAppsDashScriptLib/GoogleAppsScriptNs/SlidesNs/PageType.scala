package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait LAYOUT
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageType
  
  @js.native
  sealed trait MASTER
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageType
  
  @js.native
  sealed trait SLIDE
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageType
  
  @js.native
  sealed trait UNSUPPORTED
    extends googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageType
  
  val LAYOUT: LAYOUT with java.lang.String = js.native
  val MASTER: MASTER with java.lang.String = js.native
  val SLIDE: SLIDE with java.lang.String = js.native
  val UNSUPPORTED: UNSUPPORTED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.PageType with java.lang.String
  ] = js.native
}

