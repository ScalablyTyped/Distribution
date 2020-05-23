package typings.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorType extends js.Object

/**
  * The types of Colors
  */
@JSGlobal("GoogleAppsScript.Base.ColorType")
@js.native
object ColorType extends js.Object {
  @js.native
  sealed trait RGB extends ColorType
  
  @js.native
  sealed trait THEME extends ColorType
  
  @js.native
  sealed trait UNSUPPORTED extends ColorType
  
}

