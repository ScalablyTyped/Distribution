package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

/**
  * The page types.
  */
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
  /* 2 */ @js.native
  object LAYOUT extends TopLevel[LAYOUT with Double]
  
  /* 3 */ @js.native
  object MASTER extends TopLevel[MASTER with Double]
  
  /* 1 */ @js.native
  object SLIDE extends TopLevel[SLIDE with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

