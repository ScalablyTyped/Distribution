package typings.googleAppsScript.GoogleAppsScript.Slides

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
  
}

