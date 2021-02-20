package typings.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Charts {
  
  /**
    * An enumeration of how hidden dimensions in a source are expressed in a chart.
    */
  @JSGlobal("GoogleAppsScript.Charts.ChartHiddenDimensionStrategy")
  @js.native
  object ChartHiddenDimensionStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy with Double
      ] = js.native
    
    /* 0 */ val IGNORE_BOTH: typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.IGNORE_BOTH with Double = js.native
    
    /* 2 */ val IGNORE_COLUMNS: typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.IGNORE_COLUMNS with Double = js.native
    
    /* 1 */ val IGNORE_ROWS: typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.IGNORE_ROWS with Double = js.native
    
    /* 3 */ val SHOW_BOTH: typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.SHOW_BOTH with Double = js.native
  }
  
  /**
    * An enumeration of how multiple ranges in the source are expressed in a chart.
    */
  @JSGlobal("GoogleAppsScript.Charts.ChartMergeStrategy")
  @js.native
  object ChartMergeStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy with Double] = js.native
    
    /* 0 */ val MERGE_COLUMNS: typings.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy.MERGE_COLUMNS with Double = js.native
    
    /* 1 */ val MERGE_ROWS: typings.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy.MERGE_ROWS with Double = js.native
  }
  
  /**
    * Chart types supported by the Charts service.
    */
  @JSGlobal("GoogleAppsScript.Charts.ChartType")
  @js.native
  object ChartType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.ChartType with Double] = js.native
    
    /* 1 */ val AREA: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.AREA with Double = js.native
    
    /* 2 */ val BAR: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.BAR with Double = js.native
    
    /* 3 */ val BUBBLE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.BUBBLE with Double = js.native
    
    /* 4 */ val CANDLESTICK: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.CANDLESTICK with Double = js.native
    
    /* 5 */ val COLUMN: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.COLUMN with Double = js.native
    
    /* 6 */ val COMBO: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.COMBO with Double = js.native
    
    /* 7 */ val GAUGE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.GAUGE with Double = js.native
    
    /* 8 */ val GEO: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.GEO with Double = js.native
    
    /* 9 */ val HISTOGRAM: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.HISTOGRAM with Double = js.native
    
    /* 11 */ val LINE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.LINE with Double = js.native
    
    /* 12 */ val ORG: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.ORG with Double = js.native
    
    /* 13 */ val PIE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.PIE with Double = js.native
    
    /* 10 */ val RADAR: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.RADAR with Double = js.native
    
    /* 14 */ val SCATTER: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.SCATTER with Double = js.native
    
    /* 15 */ val SPARKLINE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.SPARKLINE with Double = js.native
    
    /* 16 */ val STEPPED_AREA: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.STEPPED_AREA with Double = js.native
    
    /* 17 */ val TABLE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.TABLE with Double = js.native
    
    /* 0 */ val TIMELINE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.TIMELINE with Double = js.native
    
    /* 18 */ val TREEMAP: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.TREEMAP with Double = js.native
    
    /* 19 */ val WATERFALL: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.WATERFALL with Double = js.native
  }
  
  /**
    * An enumeration of the valid data types for columns in a DataTable.
    */
  @JSGlobal("GoogleAppsScript.Charts.ColumnType")
  @js.native
  object ColumnType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.ColumnType with Double] = js.native
    
    /* 0 */ val DATE: typings.googleAppsScript.GoogleAppsScript.Charts.ColumnType.DATE with Double = js.native
    
    /* 1 */ val NUMBER: typings.googleAppsScript.GoogleAppsScript.Charts.ColumnType.NUMBER with Double = js.native
    
    /* 2 */ val STRING: typings.googleAppsScript.GoogleAppsScript.Charts.ColumnType.STRING with Double = js.native
  }
  
  /**
    * An enumeration of the styles for curves in a chart.
    */
  @JSGlobal("GoogleAppsScript.Charts.CurveStyle")
  @js.native
  object CurveStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.CurveStyle with Double] = js.native
    
    /* 0 */ val NORMAL: typings.googleAppsScript.GoogleAppsScript.Charts.CurveStyle.NORMAL with Double = js.native
    
    /* 1 */ val SMOOTH: typings.googleAppsScript.GoogleAppsScript.Charts.CurveStyle.SMOOTH with Double = js.native
  }
  
  /**
    * An enumeration of how a string value should be matched. Matching a string is a boolean operation.
    * Given a string, a match term (string), and a match type, the operation outputs true in
    * the following cases:
    *
    * If the match type equals EXACT and the match term equals the string.
    *
    * If the match type equals PREFIX and the match term is a prefix of the string.
    *
    * If the match type equals ANY and the match term is a substring of the string.
    *
    * This enumeration can be used in by a string filter control to decide which rows to filter out
    * of the data table. Given a column to filter on, leave only the rows that match the value entered
    * in the filter input box, using one of the above matching types.
    */
  @JSGlobal("GoogleAppsScript.Charts.MatchType")
  @js.native
  object MatchType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.MatchType with Double] = js.native
    
    /* 2 */ val ANY: typings.googleAppsScript.GoogleAppsScript.Charts.MatchType.ANY with Double = js.native
    
    /* 0 */ val EXACT: typings.googleAppsScript.GoogleAppsScript.Charts.MatchType.EXACT with Double = js.native
    
    /* 1 */ val PREFIX: typings.googleAppsScript.GoogleAppsScript.Charts.MatchType.PREFIX with Double = js.native
  }
  
  /**
    * An enumeration of the orientation of an object.
    */
  @JSGlobal("GoogleAppsScript.Charts.Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.Orientation with Double] = js.native
    
    /* 0 */ val HORIZONTAL: typings.googleAppsScript.GoogleAppsScript.Charts.Orientation.HORIZONTAL with Double = js.native
    
    /* 1 */ val VERTICAL: typings.googleAppsScript.GoogleAppsScript.Charts.Orientation.VERTICAL with Double = js.native
  }
  
  /**
    * An enumeration of how to display selected values in picker widget.
    */
  @JSGlobal("GoogleAppsScript.Charts.PickerValuesLayout")
  @js.native
  object PickerValuesLayout extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout with Double] = js.native
    
    /* 0 */ val ASIDE: typings.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.ASIDE with Double = js.native
    
    /* 1 */ val BELOW: typings.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW with Double = js.native
    
    /* 3 */ val BELOW_STACKED: typings.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW_STACKED with Double = js.native
    
    /* 2 */ val BELOW_WRAPPING: typings.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW_WRAPPING with Double = js.native
  }
  
  /**
    * An enumeration of the styles of points in a line.
    */
  @JSGlobal("GoogleAppsScript.Charts.PointStyle")
  @js.native
  object PointStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle with Double] = js.native
    
    /* 4 */ val HUGE: typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle.HUGE with Double = js.native
    
    /* 3 */ val LARGE: typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle.LARGE with Double = js.native
    
    /* 2 */ val MEDIUM: typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle.MEDIUM with Double = js.native
    
    /* 0 */ val NONE: typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle.NONE with Double = js.native
    
    /* 1 */ val TINY: typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle.TINY with Double = js.native
  }
  
  /**
    * An enumeration of legend positions within a chart.
    */
  @JSGlobal("GoogleAppsScript.Charts.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.Position with Double] = js.native
    
    /* 2 */ val BOTTOM: typings.googleAppsScript.GoogleAppsScript.Charts.Position.BOTTOM with Double = js.native
    
    /* 3 */ val NONE: typings.googleAppsScript.GoogleAppsScript.Charts.Position.NONE with Double = js.native
    
    /* 1 */ val RIGHT: typings.googleAppsScript.GoogleAppsScript.Charts.Position.RIGHT with Double = js.native
    
    /* 0 */ val TOP: typings.googleAppsScript.GoogleAppsScript.Charts.Position.TOP with Double = js.native
  }
}
