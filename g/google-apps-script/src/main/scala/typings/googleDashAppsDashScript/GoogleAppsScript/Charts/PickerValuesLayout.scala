package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PickerValuesLayout extends js.Object

/**
  * An enumeration of how to display selected values in picker widget.
  */
@JSGlobal("GoogleAppsScript.Charts.PickerValuesLayout")
@js.native
object PickerValuesLayout extends js.Object {
  @js.native
  sealed trait ASIDE extends PickerValuesLayout
  
  @js.native
  sealed trait BELOW extends PickerValuesLayout
  
  @js.native
  sealed trait BELOW_STACKED extends PickerValuesLayout
  
  @js.native
  sealed trait BELOW_WRAPPING extends PickerValuesLayout
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickerValuesLayout with Double] = js.native
  /* 0 */ @js.native
  object ASIDE extends TopLevel[ASIDE with Double]
  
  /* 1 */ @js.native
  object BELOW extends TopLevel[BELOW with Double]
  
  /* 3 */ @js.native
  object BELOW_STACKED extends TopLevel[BELOW_STACKED with Double]
  
  /* 2 */ @js.native
  object BELOW_WRAPPING extends TopLevel[BELOW_WRAPPING with Double]
  
}

