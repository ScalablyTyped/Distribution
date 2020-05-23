package typings.googleAppsScript.GoogleAppsScript.Slides

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
  
}

