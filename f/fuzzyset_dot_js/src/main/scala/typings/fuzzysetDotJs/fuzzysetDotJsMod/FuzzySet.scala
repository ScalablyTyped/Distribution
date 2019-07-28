package typings.fuzzysetDotJs.fuzzysetDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FuzzySet extends js.Object {
  def add(value: String): Boolean = js.native
  def get[T](candidate: String): (js.Array[js.Tuple2[Double, String]]) | T | Null = js.native
  def get[T](candidate: String, defaultValue: T): (js.Array[js.Tuple2[Double, String]]) | T | Null = js.native
  def get[T](candidate: String, defaultValue: T, minScore: Double): (js.Array[js.Tuple2[Double, String]]) | T | Null = js.native
  def isEmpty(): Boolean = js.native
  def length(): Double = js.native
  def values(): js.Array[String] = js.native
}

