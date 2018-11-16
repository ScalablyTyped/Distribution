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

