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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.visualization.data")
@js.native
class data ()
  extends typings.googleVisualization.google.visualization.data
/* static members */
object data {
  
  @JSGlobal("google.visualization.data.avg")
  @js.native
  def avg(values: js.Array[Date | Double | String]): Double = js.native
  
  @JSGlobal("google.visualization.data.count")
  @js.native
  def count(values: js.Array[_]): Double = js.native
  
  @JSGlobal("google.visualization.data.group")
  @js.native
  def group(
    data: typings.googleVisualization.google.visualization.DataTable,
    keys: js.Array[Double | GroupKeyOptions]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.group")
  @js.native
  def group(
    data: typings.googleVisualization.google.visualization.DataTable,
    keys: js.Array[Double | GroupKeyOptions],
    columns: js.Array[GroupColumnOptions]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.group")
  @js.native
  def group(
    data: typings.googleVisualization.google.visualization.DataView,
    keys: js.Array[Double | GroupKeyOptions]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.group")
  @js.native
  def group(
    data: typings.googleVisualization.google.visualization.DataView,
    keys: js.Array[Double | GroupKeyOptions],
    columns: js.Array[GroupColumnOptions]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  
  // https://developers.google.com/chart/interactive/docs/reference#join
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_full(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_full(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_full(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_full(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_left(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_left(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_left(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_left(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_right(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_right(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_right(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSGlobal("google.visualization.data.join")
  @js.native
  def join_right(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  
  @JSGlobal("google.visualization.data.max")
  @js.native
  def max(values: js.Array[Date | Double | String]): Double | String | Date = js.native
  
  @JSGlobal("google.visualization.data.min")
  @js.native
  def min(values: js.Array[Date | Double | String]): Double | String | Date = js.native
  
  // https://developers.google.com/chart/interactive/docs/reference#data_modifier_functions
  @JSGlobal("google.visualization.data.month")
  @js.native
  def month(value: Date): Double = js.native
  
  // https://developers.google.com/chart/interactive/docs/reference#group
  @JSGlobal("google.visualization.data.sum")
  @js.native
  def sum(values: js.Array[Date | Double | String]): Double = js.native
}
