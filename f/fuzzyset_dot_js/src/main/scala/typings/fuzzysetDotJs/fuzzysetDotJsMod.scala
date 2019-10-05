package typings.fuzzysetDotJs

import typings.fuzzysetDotJs.fuzzysetDotJsMod.FuzzySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fuzzyset.js", JSImport.Namespace)
@js.native
object fuzzysetDotJsMod extends js.Object {
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
  
  def apply(): FuzzySet = js.native
  def apply(source: js.Array[String]): FuzzySet = js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean): FuzzySet = js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean, gramSizeLower: Double): FuzzySet = js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean, gramSizeLower: Double, gramSizeUpper: Double): FuzzySet = js.native
}

