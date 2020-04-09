package typings.devextreme.mod.DevExpress.data

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  /** @name Query.aggregate(seed, step, finalize) */
  def aggregate(seed: js.Any, step: js.Function, finalize: js.Function): Promise[_] with JQueryPromise[_] = js.native
  /** @name Query.aggregate(step) */
  def aggregate(step: js.Function): Promise[_] with JQueryPromise[_] = js.native
  /** @name Query.avg() */
  def avg(): Promise[Double] with JQueryPromise[Double] = js.native
  /** @name Query.avg(getter) */
  def avg(getter: js.Any): Promise[Double] with JQueryPromise[Double] = js.native
  /** @name Query.count() */
  def count(): Promise[Double] with JQueryPromise[Double] = js.native
  /** @name Query.enumerate() */
  def enumerate(): Promise[_] with JQueryPromise[_] = js.native
  /** @name Query.filter(criteria) */
  def filter(criteria: js.Array[_]): Query = js.native
  /** @name Query.filter(predicate) */
  def filter(predicate: js.Function): Query = js.native
  /** @name Query.groupBy(getter) */
  def groupBy(getter: js.Any): Query = js.native
  /** @name Query.max() */
  def max(): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  /** @name Query.max(getter) */
  def max(getter: js.Any): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  /** @name Query.min() */
  def min(): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  /** @name Query.min(getter) */
  def min(getter: js.Any): (Promise[Double | Date]) with (JQueryPromise[Double | Date]) = js.native
  /** @name Query.select(getter) */
  def select(getter: js.Any): Query = js.native
  /** @name Query.slice(skip, take) */
  def slice(skip: Double): Query = js.native
  def slice(skip: Double, take: Double): Query = js.native
  /** @name Query.sortBy(getter) */
  def sortBy(getter: js.Any): Query = js.native
  /** @name Query.sortBy(getter, desc) */
  def sortBy(getter: js.Any, desc: Boolean): Query = js.native
  /** @name Query.sum() */
  def sum(): Promise[Double] with JQueryPromise[Double] = js.native
  /** @name Query.sum(getter) */
  def sum(getter: js.Any): Promise[Double] with JQueryPromise[Double] = js.native
  /** @name Query.thenBy(getter) */
  def thenBy(getter: js.Any): Query = js.native
  /** @name Query.thenBy(getter, desc) */
  def thenBy(getter: js.Any, desc: Boolean): Query = js.native
  /** @name Query.toArray() */
  def toArray(): js.Array[_] = js.native
}

