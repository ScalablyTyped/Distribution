package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.InterpolationType.MAX
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.InterpolationType.MIN
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.InterpolationType.NUMBER
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.InterpolationType.PERCENT
import typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.InterpolationType.PERCENTILE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InterpolationType with Double] = js.native
  /* 4 */ @js.native
  object MAX extends TopLevel[MAX with Double]
  
  /* 3 */ @js.native
  object MIN extends TopLevel[MIN with Double]
  
  /* 0 */ @js.native
  object NUMBER extends TopLevel[NUMBER with Double]
  
  /* 1 */ @js.native
  object PERCENT extends TopLevel[PERCENT with Double]
  
  /* 2 */ @js.native
  object PERCENTILE extends TopLevel[PERCENTILE with Double]
  
}

