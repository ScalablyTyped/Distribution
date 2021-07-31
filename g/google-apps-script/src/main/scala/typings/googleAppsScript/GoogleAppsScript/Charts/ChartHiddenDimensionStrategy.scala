package typings.googleAppsScript.GoogleAppsScript.Charts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChartHiddenDimensionStrategy extends StObject
/**
  * An enumeration of how hidden dimensions in a source are expressed in a chart.
  */
@JSGlobal("GoogleAppsScript.Charts.ChartHiddenDimensionStrategy")
@js.native
object ChartHiddenDimensionStrategy extends StObject {
  
  @js.native
  sealed trait IGNORE_BOTH
    extends StObject
       with ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait IGNORE_COLUMNS
    extends StObject
       with ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait IGNORE_ROWS
    extends StObject
       with ChartHiddenDimensionStrategy
  
  @js.native
  sealed trait SHOW_BOTH
    extends StObject
       with ChartHiddenDimensionStrategy
}
