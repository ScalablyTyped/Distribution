package typings
package fuzzysetDotJsLib.fuzzysetDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fuzzyset.js", JSImport.Namespace)
@js.native
object fuzzysetDotJsModMembers extends js.Object {
  def apply(): FuzzySet = js.native
  def apply(source: js.Array[java.lang.String]): FuzzySet = js.native
  def apply(source: js.Array[java.lang.String], useLevenshtein: scala.Boolean): FuzzySet = js.native
  def apply(source: js.Array[java.lang.String], useLevenshtein: scala.Boolean, gramSizeLower: scala.Double): FuzzySet = js.native
  def apply(
    source: js.Array[java.lang.String],
    useLevenshtein: scala.Boolean,
    gramSizeLower: scala.Double,
    gramSizeUpper: scala.Double
  ): FuzzySet = js.native
}

