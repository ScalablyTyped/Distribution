package typings
package fuzzysetLib.fuzzysetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FuzzySet extends js.Object {
  def add(value: java.lang.String): scala.Boolean
  def get(candidate: java.lang.String): js.Array[js.Tuple2[scala.Double, java.lang.String]]
  def isEmpty(): scala.Boolean
  def length(): scala.Double
  def values(): js.Array[java.lang.String]
}

object FuzzySet {
  @scala.inline
  def apply(
    add: java.lang.String => scala.Boolean,
    get: java.lang.String => js.Array[js.Tuple2[scala.Double, java.lang.String]],
    isEmpty: () => scala.Boolean,
    length: () => scala.Double,
    values: () => js.Array[java.lang.String]
  ): FuzzySet = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), get = js.Any.fromFunction1(get), isEmpty = js.Any.fromFunction0(isEmpty), length = js.Any.fromFunction0(length), values = js.Any.fromFunction0(values))
  
    __obj.asInstanceOf[FuzzySet]
  }
}

