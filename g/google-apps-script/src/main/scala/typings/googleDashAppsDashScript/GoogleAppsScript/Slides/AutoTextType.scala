package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.AutoTextType.SLIDE_NUMBER
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.AutoTextType.UNSUPPORTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AutoTextType extends js.Object

/**
  * The types of auto text.
  */
@JSGlobal("GoogleAppsScript.Slides.AutoTextType")
@js.native
object AutoTextType extends js.Object {
  @js.native
  sealed trait SLIDE_NUMBER extends AutoTextType
  
  @js.native
  sealed trait UNSUPPORTED extends AutoTextType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AutoTextType with Double] = js.native
  /* 1 */ @js.native
  object SLIDE_NUMBER extends TopLevel[SLIDE_NUMBER with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

