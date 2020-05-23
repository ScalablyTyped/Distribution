package typings.googleAppsScript.GoogleAppsScript.Slides

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
  
}

