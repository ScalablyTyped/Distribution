package typings
package fuzzysetLib.fuzzysetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fuzzyset", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): fuzzysetLib.fuzzysetMod.FuzzySet = js.native
  def apply(source: js.Array[java.lang.String]): fuzzysetLib.fuzzysetMod.FuzzySet = js.native
  def apply(source: js.Array[java.lang.String], useLevenshtein: scala.Boolean): fuzzysetLib.fuzzysetMod.FuzzySet = js.native
  def apply(source: js.Array[java.lang.String], useLevenshtein: scala.Boolean, gramSizeLower: scala.Double): fuzzysetLib.fuzzysetMod.FuzzySet = js.native
  def apply(
    source: js.Array[java.lang.String],
    useLevenshtein: scala.Boolean,
    gramSizeLower: scala.Double,
    gramSizeUpper: scala.Double
  ): fuzzysetLib.fuzzysetMod.FuzzySet = js.native
}

