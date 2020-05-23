package typings.googleVisualization.global.google.visualization

import typings.googleVisualization.google.visualization.GroupColumnOptions
import typings.googleVisualization.google.visualization.GroupKeyOptions
import typings.googleVisualization.googleVisualizationStrings.full
import typings.googleVisualization.googleVisualizationStrings.inner
import typings.googleVisualization.googleVisualizationStrings.left
import typings.googleVisualization.googleVisualizationStrings.right
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.data")
@js.native
class data ()
  extends typings.googleVisualization.google.visualization.data

/* static members */
@JSGlobal("google.visualization.data")
@js.native
object data extends js.Object {
  def avg(values: js.Array[Date | Double | String]): Double = js.native
  def count(values: js.Array[_]): Double = js.native
  def group(
    data: typings.googleVisualization.google.visualization.DataTable,
    keys: js.Array[Double | GroupKeyOptions]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  def group(
    data: typings.googleVisualization.google.visualization.DataTable,
    keys: js.Array[Double | GroupKeyOptions],
    columns: js.Array[GroupColumnOptions]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  def group(
    data: typings.googleVisualization.google.visualization.DataView,
    keys: js.Array[Double | GroupKeyOptions]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  def group(
    data: typings.googleVisualization.google.visualization.DataView,
    keys: js.Array[Double | GroupKeyOptions],
    columns: js.Array[GroupColumnOptions]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  // https://developers.google.com/chart/interactive/docs/reference#join
  @JSName("join")
  def join_full(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_full(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_full(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_full(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: typings.googleVisualization.google.visualization.DataTable,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataTable,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: typings.googleVisualization.google.visualization.DataView,
    dataB: typings.googleVisualization.google.visualization.DataView,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): typings.googleVisualization.google.visualization.DataTable = js.native
  def max(values: js.Array[Date | Double | String]): Double | String | Date = js.native
  def min(values: js.Array[Date | Double | String]): Double | String | Date = js.native
  // https://developers.google.com/chart/interactive/docs/reference#data_modifier_functions
  def month(value: Date): Double = js.native
  // https://developers.google.com/chart/interactive/docs/reference#group
  def sum(values: js.Array[Date | Double | String]): Double = js.native
}

