package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSGlobal("GoogleAppsScript.Slides.PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait LAYOUT extends PageType
  
  @js.native
  sealed trait MASTER extends PageType
  
  @js.native
  sealed trait SLIDE extends PageType
  
  @js.native
  sealed trait UNSUPPORTED extends PageType
  
  /* 2 */ val LAYOUT: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageType.LAYOUT with Double = js.native
  /* 3 */ val MASTER: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageType.MASTER with Double = js.native
  /* 1 */ val SLIDE: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageType.SLIDE with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.PageType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
}

