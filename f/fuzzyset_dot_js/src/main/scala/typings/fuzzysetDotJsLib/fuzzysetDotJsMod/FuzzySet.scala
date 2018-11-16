package typings
package fuzzysetDotJsLib.fuzzysetDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuzzySet extends js.Object {
  def add(value: java.lang.String): scala.Boolean = js.native
  def get[T](candidate: java.lang.String): (js.Array[js.Tuple2[scala.Double, java.lang.String]]) | T | scala.Null = js.native
  def get[T](candidate: java.lang.String, defaultValue: T): (js.Array[js.Tuple2[scala.Double, java.lang.String]]) | T | scala.Null = js.native
  def get[T](candidate: java.lang.String, defaultValue: T, minScore: scala.Double): (js.Array[js.Tuple2[scala.Double, java.lang.String]]) | T | scala.Null = js.native
  def isEmpty(): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def values(): js.Array[java.lang.String] = js.native
}

