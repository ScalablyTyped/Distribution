package typings.googleVisualization.global.google.visualization

import typings.googleVisualization.google.visualization.GroupColumnOptions
import typings.googleVisualization.google.visualization.GroupKeyOptions
import typings.googleVisualization.googleVisualizationStrings.full
import typings.googleVisualization.googleVisualizationStrings.inner
import typings.googleVisualization.googleVisualizationStrings.left
import typings.googleVisualization.googleVisualizationStrings.right
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.visualization.data")
@js.native
class data ()
  extends StObject
     with typings.googleVisualization.google.visualization.data
/* static members */
object data {
  
  @JSGlobal("google.visualization.data")
  @js.native
  val ^ : js.Any = js.native
  
  inline def avg(values: js.Array[Date | Double | String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("avg")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def count(values: js.Array[js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  
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
  inline def join_full(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_full(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_full(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_full(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  
  inline def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  
  inline def join_left(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_left(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_left(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_left(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  
  inline def join_right(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_right(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_right(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  inline def join_right(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(dataA.asInstanceOf[js.Any], dataB.asInstanceOf[js.Any], joinMethod.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], columnsA.asInstanceOf[js.Any], columnsB.asInstanceOf[js.Any])).asInstanceOf[typings.googleVisualization.google.visualization.DataTable]
  
  inline def max(values: js.Array[Date | Double | String]): Double | String | Date = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(values.asInstanceOf[js.Any]).asInstanceOf[Double | String | Date]
  
  inline def min(values: js.Array[Date | Double | String]): Double | String | Date = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(values.asInstanceOf[js.Any]).asInstanceOf[Double | String | Date]
  
  // https://developers.google.com/chart/interactive/docs/reference#data_modifier_functions
  inline def month(value: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("month")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  // https://developers.google.com/chart/interactive/docs/reference#group
  inline def sum(values: js.Array[Date | Double | String]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
}
