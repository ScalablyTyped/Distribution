package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
