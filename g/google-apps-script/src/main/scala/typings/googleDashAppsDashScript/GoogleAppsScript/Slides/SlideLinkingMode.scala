package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SlideLinkingMode extends js.Object

/**
  * The mode of links between slides.
  */
@JSGlobal("GoogleAppsScript.Slides.SlideLinkingMode")
@js.native
object SlideLinkingMode extends js.Object {
  @js.native
  sealed trait LINKED extends SlideLinkingMode
  
  @js.native
  sealed trait NOT_LINKED extends SlideLinkingMode
  
  @js.native
  sealed trait UNSUPPORTED extends SlideLinkingMode
  
  /* 1 */ val LINKED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SlideLinkingMode.LINKED with Double = js.native
  /* 2 */ val NOT_LINKED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SlideLinkingMode.NOT_LINKED with Double = js.native
  /* 0 */ val UNSUPPORTED: typings.googleDashAppsDashScript.GoogleAppsScript.Slides.SlideLinkingMode.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SlideLinkingMode with Double] = js.native
}

