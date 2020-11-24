package typings.googleAppsScript.GoogleAppsScript.Charts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
