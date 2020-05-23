package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InterpolationType extends js.Object

/**
  * An enumeration representing the interpolation options for calculating a value to be used in a
  * GradientCondition in a ConditionalFormatRule.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.InterpolationType")
@js.native
object InterpolationType extends js.Object {
  @js.native
  sealed trait MAX extends InterpolationType
  
  @js.native
  sealed trait MIN extends InterpolationType
  
  @js.native
  sealed trait NUMBER extends InterpolationType
  
  @js.native
  sealed trait PERCENT extends InterpolationType
  
  @js.native
  sealed trait PERCENTILE extends InterpolationType
  
}

