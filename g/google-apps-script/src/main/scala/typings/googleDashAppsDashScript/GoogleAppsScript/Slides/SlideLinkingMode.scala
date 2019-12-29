package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SlideLinkingMode with Double] = js.native
  /* 1 */ @js.native
  object LINKED extends TopLevel[LINKED with Double]
  
  /* 2 */ @js.native
  object NOT_LINKED extends TopLevel[NOT_LINKED with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

