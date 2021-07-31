package typings.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
        typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy & Double
      ] = js.native
    
    /* 0 */ val IGNORE_BOTH: typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.IGNORE_BOTH & Double = js.native
    
    /* 2 */ val IGNORE_COLUMNS: typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.IGNORE_COLUMNS & Double = js.native
    
    /* 1 */ val IGNORE_ROWS: typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.IGNORE_ROWS & Double = js.native
    
    /* 3 */ val SHOW_BOTH: typings.googleAppsScript.GoogleAppsScript.Charts.ChartHiddenDimensionStrategy.SHOW_BOTH & Double = js.native
  }
  
  /**
    * An enumeration of how multiple ranges in the source are expressed in a chart.
    */
  @JSGlobal("GoogleAppsScript.Charts.ChartMergeStrategy")
  @js.native
  object ChartMergeStrategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy & Double] = js.native
    
    /* 0 */ val MERGE_COLUMNS: typings.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy.MERGE_COLUMNS & Double = js.native
    
    /* 1 */ val MERGE_ROWS: typings.googleAppsScript.GoogleAppsScript.Charts.ChartMergeStrategy.MERGE_ROWS & Double = js.native
  }
  
  /**
    * Chart types supported by the Charts service.
    */
  @JSGlobal("GoogleAppsScript.Charts.ChartType")
  @js.native
  object ChartType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.ChartType & Double] = js.native
    
    /* 1 */ val AREA: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.AREA & Double = js.native
    
    /* 2 */ val BAR: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.BAR & Double = js.native
    
    /* 3 */ val BUBBLE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.BUBBLE & Double = js.native
    
    /* 4 */ val CANDLESTICK: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.CANDLESTICK & Double = js.native
    
    /* 5 */ val COLUMN: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.COLUMN & Double = js.native
    
    /* 6 */ val COMBO: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.COMBO & Double = js.native
    
    /* 7 */ val GAUGE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.GAUGE & Double = js.native
    
    /* 8 */ val GEO: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.GEO & Double = js.native
    
    /* 9 */ val HISTOGRAM: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.HISTOGRAM & Double = js.native
    
    /* 11 */ val LINE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.LINE & Double = js.native
    
    /* 12 */ val ORG: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.ORG & Double = js.native
    
    /* 13 */ val PIE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.PIE & Double = js.native
    
    /* 10 */ val RADAR: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.RADAR & Double = js.native
    
    /* 14 */ val SCATTER: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.SCATTER & Double = js.native
    
    /* 15 */ val SPARKLINE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.SPARKLINE & Double = js.native
    
    /* 16 */ val STEPPED_AREA: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.STEPPED_AREA & Double = js.native
    
    /* 17 */ val TABLE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.TABLE & Double = js.native
    
    /* 0 */ val TIMELINE: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.TIMELINE & Double = js.native
    
    /* 18 */ val TREEMAP: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.TREEMAP & Double = js.native
    
    /* 19 */ val WATERFALL: typings.googleAppsScript.GoogleAppsScript.Charts.ChartType.WATERFALL & Double = js.native
  }
  
  /**
    * An enumeration of the valid data types for columns in a DataTable.
    */
  @JSGlobal("GoogleAppsScript.Charts.ColumnType")
  @js.native
  object ColumnType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.ColumnType & Double] = js.native
    
    /* 0 */ val DATE: typings.googleAppsScript.GoogleAppsScript.Charts.ColumnType.DATE & Double = js.native
    
    /* 1 */ val NUMBER: typings.googleAppsScript.GoogleAppsScript.Charts.ColumnType.NUMBER & Double = js.native
    
    /* 2 */ val STRING: typings.googleAppsScript.GoogleAppsScript.Charts.ColumnType.STRING & Double = js.native
  }
  
  /**
    * An enumeration of the styles for curves in a chart.
    */
  @JSGlobal("GoogleAppsScript.Charts.CurveStyle")
  @js.native
  object CurveStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.CurveStyle & Double] = js.native
    
    /* 0 */ val NORMAL: typings.googleAppsScript.GoogleAppsScript.Charts.CurveStyle.NORMAL & Double = js.native
    
    /* 1 */ val SMOOTH: typings.googleAppsScript.GoogleAppsScript.Charts.CurveStyle.SMOOTH & Double = js.native
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
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.MatchType & Double] = js.native
    
    /* 2 */ val ANY: typings.googleAppsScript.GoogleAppsScript.Charts.MatchType.ANY & Double = js.native
    
    /* 0 */ val EXACT: typings.googleAppsScript.GoogleAppsScript.Charts.MatchType.EXACT & Double = js.native
    
    /* 1 */ val PREFIX: typings.googleAppsScript.GoogleAppsScript.Charts.MatchType.PREFIX & Double = js.native
  }
  
  /**
    * An enumeration of the orientation of an object.
    */
  @JSGlobal("GoogleAppsScript.Charts.Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.Orientation & Double] = js.native
    
    /* 0 */ val HORIZONTAL: typings.googleAppsScript.GoogleAppsScript.Charts.Orientation.HORIZONTAL & Double = js.native
    
    /* 1 */ val VERTICAL: typings.googleAppsScript.GoogleAppsScript.Charts.Orientation.VERTICAL & Double = js.native
  }
  
  /**
    * An enumeration of how to display selected values in picker widget.
    */
  @JSGlobal("GoogleAppsScript.Charts.PickerValuesLayout")
  @js.native
  object PickerValuesLayout extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout & Double] = js.native
    
    /* 0 */ val ASIDE: typings.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.ASIDE & Double = js.native
    
    /* 1 */ val BELOW: typings.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW & Double = js.native
    
    /* 3 */ val BELOW_STACKED: typings.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW_STACKED & Double = js.native
    
    /* 2 */ val BELOW_WRAPPING: typings.googleAppsScript.GoogleAppsScript.Charts.PickerValuesLayout.BELOW_WRAPPING & Double = js.native
  }
  
  /**
    * An enumeration of the styles of points in a line.
    */
  @JSGlobal("GoogleAppsScript.Charts.PointStyle")
  @js.native
  object PointStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle & Double] = js.native
    
    /* 4 */ val HUGE: typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle.HUGE & Double = js.native
    
    /* 3 */ val LARGE: typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle.LARGE & Double = js.native
    
    /* 2 */ val MEDIUM: typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle.MEDIUM & Double = js.native
    
    /* 0 */ val NONE: typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle.NONE & Double = js.native
    
    /* 1 */ val TINY: typings.googleAppsScript.GoogleAppsScript.Charts.PointStyle.TINY & Double = js.native
  }
  
  /**
    * An enumeration of legend positions within a chart.
    */
  @JSGlobal("GoogleAppsScript.Charts.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Charts.Position & Double] = js.native
    
    /* 2 */ val BOTTOM: typings.googleAppsScript.GoogleAppsScript.Charts.Position.BOTTOM & Double = js.native
    
    /* 3 */ val NONE: typings.googleAppsScript.GoogleAppsScript.Charts.Position.NONE & Double = js.native
    
    /* 1 */ val RIGHT: typings.googleAppsScript.GoogleAppsScript.Charts.Position.RIGHT & Double = js.native
    
    /* 0 */ val TOP: typings.googleAppsScript.GoogleAppsScript.Charts.Position.TOP & Double = js.native
  }
}
