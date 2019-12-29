package typings.googleDashAppsDashScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkType extends js.Object

/**
  * The types of a Link.
  */
@JSGlobal("GoogleAppsScript.Slides.LinkType")
@js.native
object LinkType extends js.Object {
  @js.native
  sealed trait SLIDE_ID extends LinkType
  
  @js.native
  sealed trait SLIDE_INDEX extends LinkType
  
  @js.native
  sealed trait SLIDE_POSITION extends LinkType
  
  @js.native
  sealed trait UNSUPPORTED extends LinkType
  
  @js.native
  sealed trait URL extends LinkType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkType with Double] = js.native
  /* 3 */ @js.native
  object SLIDE_ID extends TopLevel[SLIDE_ID with Double]
  
  /* 4 */ @js.native
  object SLIDE_INDEX extends TopLevel[SLIDE_INDEX with Double]
  
  /* 2 */ @js.native
  object SLIDE_POSITION extends TopLevel[SLIDE_POSITION with Double]
  
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
  /* 1 */ @js.native
  object URL extends TopLevel[URL with Double]
  
}

