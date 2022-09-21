package typings.googleVisualization.global.google.visualization

import typings.googleVisualization.google.visualization.GroupColumnOptions
import typings.googleVisualization.google.visualization.GroupKeyOptions
import typings.googleVisualization.googleVisualizationStrings.full
import typings.googleVisualization.googleVisualizationStrings.inner
import typings.googleVisualization.googleVisualizationStrings.left
import typings.googleVisualization.googleVisualizationStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @JSGlobal("google.visualization.data")
  @js.native
  val ^ : js.Any = js.native
  
  inline def avg(values: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("avg")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def count(values: js.Array[Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def group(
    data: typings.googleVisualization.google.visualization.DataTable,
    keys: js.Array[Double | GroupKeyOptions]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def group(
    data: typings.googleVisualization.google.visualization.DataTable,
    keys: js.Array[Double | GroupKeyOptions],
    columns: js.Array[GroupColumnOptions]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def group(
    data: typings.googleVisualization.google.visualization.DataView,
    keys: js.Array[Double | GroupKeyOptions]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def group(
    data: typings.googleVisualization.google.visualization.DataView,
    keys: js.Array[Double | GroupKeyOptions],
    columns: js.Array[GroupColumnOptions]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("group")(data.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  
  // https://developers.google.com/chart/interactive/docs/reference#join
  inline def join(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: full | inner | left | right,
    keys: js.Array[js.Tuple2[Double | String, Double | String]],
    columnsA: js.Array[Double | String],
    columnsB: js.Array[Double | String]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: full | inner | left | right,
    keys: js.Array[js.Tuple2[Double | String, Double | String]],
    columnsA: js.Array[Double | String],
    columnsB: js.Array[Double | String]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: full | inner | left | right,
    keys: js.Array[js.Tuple2[Double | String, Double | String]],
    columnsA: js.Array[Double | String],
    columnsB: js.Array[Double | String]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: full | inner | left | right,
    keys: js.Array[js.Tuple2[Double | String, Double | String]],
    columnsA: js.Array[Double | String],
    columnsB: js.Array[Double | String]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  
  inline def max(values: js.Array[js.Date | Double | String]): Double | String | js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(values.asInstanceOf[js.Any]).asInstanceOf[Double | String | js.Date | Null]
  
  inline def min(values: js.Array[js.Date | Double | String]): Double | String | js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(values.asInstanceOf[js.Any]).asInstanceOf[Double | String | js.Date | Null]
  
  // https://developers.google.com/chart/interactive/docs/reference#data_modifier_functions
  inline def month(value: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("month")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  // https://developers.google.com/chart/interactive/docs/reference#group
  inline def sum(values: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
}
