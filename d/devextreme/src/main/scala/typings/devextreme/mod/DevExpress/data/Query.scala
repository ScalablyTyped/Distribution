package typings.devextreme.mod.DevExpress.data

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  /** Calculates a custom summary for all data items. */
  def aggregate(seed: js.Any, step: js.Function, finalize: js.Function): Promise[_] with JQueryPromise[_] = js.native
  /** Calculates a custom summary for all data items. */
  def aggregate(step: js.Function): Promise[_] with JQueryPromise[_] = js.native
  /** Calculates the average of all values. Applies only to numeric arrays. */
  def avg(): Promise[Double] with JQueryPromise[Double] = js.native
  /** Calculates the average of all values found using a getter. */
  def avg(getter: js.Any): Promise[Double] with JQueryPromise[Double] = js.native
  /** Calculates the number of data items. */
  def count(): Promise[Double] with JQueryPromise[Double] = js.native
  /** Executes the Query. This is an asynchronous alternative to the toArray() method. */
  def enumerate(): Promise[_] with JQueryPromise[_] = js.native
  /** Filters data items using a filter expression. */
  def filter(criteria: js.Array[_]): Query = js.native
  /** Filters data items using a custom function. */
  def filter(predicate: js.Function): Query = js.native
  /** Groups data items by the specified getter. */
  def groupBy(getter: js.Any): Query = js.native
  /** Calculates the maximum value. Applies only to numeric arrays. */
  def max(): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  /** Calculates the maximum of all values found using a getter. */
  def max(getter: js.Any): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  /** Calculates the minimum value. Applies only to numeric arrays. */
  def min(): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  /** Calculates the minumum of all values found using a getter. */
  def min(getter: js.Any): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  /** Selects individual fields from data objects. */
  def select(getter: js.Any): Query = js.native
  /** Gets a specified number of data items starting from a given index. */
  def slice(skip: Double): Query = js.native
  def slice(skip: Double, take: Double): Query = js.native
  /** Sorts data items by the specified getter in ascending order. */
  def sortBy(getter: js.Any): Query = js.native
  /** Sorts data items by the specified getter in the specified sorting order. */
  def sortBy(getter: js.Any, desc: Boolean): Query = js.native
  /** Calculates the sum of all values. */
  def sum(): Promise[Double] with JQueryPromise[Double] = js.native
  /** Calculates the sum of all values found using a getter. */
  def sum(getter: js.Any): Promise[Double] with JQueryPromise[Double] = js.native
  /** Sorts data items by one more getter in ascending order. */
  def thenBy(getter: js.Any): Query = js.native
  /** Sorts data items by one more getter in the specified sorting order. */
  def thenBy(getter: js.Any, desc: Boolean): Query = js.native
  /** Gets data items associated with the Query. This is a synchronous alternative to the enumerate() method. */
  def toArray(): js.Array[_] = js.native
}

