package typings.googleDotVisualization.google.visualization

import typings.googleDotVisualization.googleDotVisualizationStrings.full
import typings.googleDotVisualization.googleDotVisualizationStrings.inner
import typings.googleDotVisualization.googleDotVisualizationStrings.left
import typings.googleDotVisualization.googleDotVisualizationStrings.right
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.data")
@js.native
class data () extends js.Object

/* static members */
@JSGlobal("google.visualization.data")
@js.native
object data extends js.Object {
  def avg(values: js.Array[Date | Double | String]): Double = js.native
  def count(values: js.Array[_]): Double = js.native
  def group(data: DataTable, keys: js.Array[Double | GroupKeyOptions]): DataTable = js.native
  def group(data: DataTable, keys: js.Array[Double | GroupKeyOptions], columns: js.Array[GroupColumnOptions]): DataTable = js.native
  def group(data: DataView, keys: js.Array[Double | GroupKeyOptions]): DataTable = js.native
  def group(data: DataView, keys: js.Array[Double | GroupKeyOptions], columns: js.Array[GroupColumnOptions]): DataTable = js.native
  // https://developers.google.com/chart/interactive/docs/reference#join
  @JSName("join")
  def join_full(
    dataA: DataTable,
    dataB: DataTable,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_full(
    dataA: DataTable,
    dataB: DataView,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_full(
    dataA: DataView,
    dataB: DataTable,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_full(
    dataA: DataView,
    dataB: DataView,
    joinMethod: full,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: DataTable,
    dataB: DataTable,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: DataTable,
    dataB: DataView,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: DataView,
    dataB: DataTable,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_inner(
    dataA: DataView,
    dataB: DataView,
    joinMethod: inner,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: DataTable,
    dataB: DataTable,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: DataTable,
    dataB: DataView,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: DataView,
    dataB: DataTable,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_left(
    dataA: DataView,
    dataB: DataView,
    joinMethod: left,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: DataTable,
    dataB: DataTable,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: DataTable,
    dataB: DataView,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: DataView,
    dataB: DataTable,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  @JSName("join")
  def join_right(
    dataA: DataView,
    dataB: DataView,
    joinMethod: right,
    keys: js.Array[js.Array[Double]],
    columnsA: js.Array[Double],
    columnsB: js.Array[Double]
  ): DataTable = js.native
  def max(values: js.Array[Date | Double | String]): Double | String | Date = js.native
  def min(values: js.Array[Date | Double | String]): Double | String | Date = js.native
  // https://developers.google.com/chart/interactive/docs/reference#data_modifier_functions
  def month(value: Date): Double = js.native
  // https://developers.google.com/chart/interactive/docs/reference#group
  def sum(values: js.Array[Date | Double | String]): Double = js.native
}

