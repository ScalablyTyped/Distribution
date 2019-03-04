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
    add: js.Function1[java.lang.String, scala.Boolean],
    get: js.Function1[java.lang.String, js.Array[js.Tuple2[scala.Double, java.lang.String]]],
    isEmpty: js.Function0[scala.Boolean],
    length: js.Function0[scala.Double],
    values: js.Function0[js.Array[java.lang.String]]
  ): FuzzySet = {
    val __obj = js.Dynamic.literal(add = add, get = get, isEmpty = isEmpty, length = length, values = values)
  
    __obj.asInstanceOf[FuzzySet]
  }
}

