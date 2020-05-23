package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpacingMode extends js.Object

/**
  * The different modes for paragraph spacing.
  */
@JSGlobal("GoogleAppsScript.Slides.SpacingMode")
@js.native
object SpacingMode extends js.Object {
  @js.native
  sealed trait COLLAPSE_LISTS extends SpacingMode
  
  @js.native
  sealed trait NEVER_COLLAPSE extends SpacingMode
  
  @js.native
  sealed trait UNSUPPORTED extends SpacingMode
  
}

