package typings.fuzzyset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuzzySet extends js.Object {
  def add(value: String): Boolean
  def get(candidate: String): js.Array[js.Tuple2[Double, String]]
  def isEmpty(): Boolean
  def length(): Double
  def values(): js.Array[String]
}

object FuzzySet {
  @scala.inline
  def apply(
    add: String => Boolean,
    get: String => js.Array[js.Tuple2[Double, String]],
    isEmpty: () => Boolean,
    length: () => Double,
    values: () => js.Array[String]
  ): FuzzySet = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), get = js.Any.fromFunction1(get), isEmpty = js.Any.fromFunction0(isEmpty), length = js.Any.fromFunction0(length), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[FuzzySet]
  }
}

