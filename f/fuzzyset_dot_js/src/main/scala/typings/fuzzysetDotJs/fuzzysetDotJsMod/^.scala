package typings.fuzzysetDotJs.fuzzysetDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fuzzyset.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): FuzzySet = js.native
  def apply(source: js.Array[String]): FuzzySet = js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean): FuzzySet = js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean, gramSizeLower: Double): FuzzySet = js.native
  def apply(source: js.Array[String], useLevenshtein: Boolean, gramSizeLower: Double, gramSizeUpper: Double): FuzzySet = js.native
}

