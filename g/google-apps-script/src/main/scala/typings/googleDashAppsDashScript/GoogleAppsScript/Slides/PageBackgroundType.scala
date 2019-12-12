package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PageBackgroundType.NONE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PageBackgroundType.PICTURE
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PageBackgroundType.SOLID
import typings.googleDashAppsDashScript.GoogleAppsScript.Slides.PageBackgroundType.UNSUPPORTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageBackgroundType extends js.Object

/**
  * The kinds of page backgrounds.
  */
@JSGlobal("GoogleAppsScript.Slides.PageBackgroundType")
@js.native
object PageBackgroundType extends js.Object {
  @js.native
  sealed trait NONE extends PageBackgroundType
  
  @js.native
  sealed trait PICTURE extends PageBackgroundType
  
  @js.native
  sealed trait SOLID extends PageBackgroundType
  
  @js.native
  sealed trait UNSUPPORTED extends PageBackgroundType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageBackgroundType with Double] = js.native
  /* 1 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 3 */ @js.native
  object PICTURE extends TopLevel[PICTURE with Double]
  
  /* 2 */ @js.native
  object SOLID extends TopLevel[SOLID with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

