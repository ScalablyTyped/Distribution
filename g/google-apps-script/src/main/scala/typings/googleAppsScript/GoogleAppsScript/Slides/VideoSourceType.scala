package typings.googleAppsScript.GoogleAppsScript.Slides

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VideoSourceType extends js.Object

/**
  * The video source types.
  */
@JSGlobal("GoogleAppsScript.Slides.VideoSourceType")
@js.native
object VideoSourceType extends js.Object {
  @js.native
  sealed trait UNSUPPORTED extends VideoSourceType
  
  @js.native
  sealed trait YOUTUBE extends VideoSourceType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VideoSourceType with Double] = js.native
  /* 0 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
  /* 1 */ @js.native
  object YOUTUBE extends TopLevel[YOUTUBE with Double]
  
}

