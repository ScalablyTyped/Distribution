package typings.googleAppsScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChartHiddenDimensionStrategy extends js.Object

/**
  * An enumeration of how hidden dimensions in a source are expressed in a chart.
  */
@JSGlobal("GoogleAppsScript.Charts.ChartHiddenDimensionStrategy")
@js.native
object ChartHiddenDimensionStrategy extends js.Object {
  @js.native
  sealed trait IGNORE_BOTH extends ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait IGNORE_COLUMNS extends ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait IGNORE_ROWS extends ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait SHOW_BOTH extends ChartHiddenDimensionStrategy
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ChartHiddenDimensionStrategy with Double] = js.native
  /* 0 */ @js.native
  object IGNORE_BOTH extends TopLevel[IGNORE_BOTH with Double]
  
  /* 2 */ @js.native
  object IGNORE_COLUMNS extends TopLevel[IGNORE_COLUMNS with Double]
  
  /* 1 */ @js.native
  object IGNORE_ROWS extends TopLevel[IGNORE_ROWS with Double]
  
  /* 3 */ @js.native
  object SHOW_BOTH extends TopLevel[SHOW_BOTH with Double]
  
}

