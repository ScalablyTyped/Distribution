package typings.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineFillType extends js.Object

/**
  * The kinds of line fill.
  */
@JSGlobal("GoogleAppsScript.Slides.LineFillType")
@js.native
object LineFillType extends js.Object {
  @js.native
  sealed trait NONE extends LineFillType
  
  @js.native
  sealed trait SOLID extends LineFillType
  
  @js.native
  sealed trait UNSUPPORTED extends LineFillType
  
}

