package typings.fastDashGlob

import typings.fastDashGlob.packageOutTypesPatternsMod.Pattern
import typings.fastDashGlob.packageOutTypesPatternsMod.PatternRe
import typings.micromatch.micromatchMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/utils/pattern", JSImport.Namespace)
@js.native
object packageOutUtilsPatternMod extends js.Object {
  def convertPatternsToRe(patterns: js.Array[Pattern], options: Options): js.Array[PatternRe] = js.native
  def convertToNegativePattern(pattern: Pattern): Pattern = js.native
  def convertToPositivePattern(pattern: Pattern): Pattern = js.native
  def endsWithSlashGlobStar(pattern: Pattern): Boolean = js.native
  def getBaseDirectory(pattern: Pattern): String = js.native
  def getMaxNaivePatternsDepth(patterns: js.Array[Pattern]): Double = js.native
  def getNaiveDepth(pattern: Pattern): Double = js.native
  def getNegativePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
  def getPositivePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = js.native
  def hasGlobStar(pattern: Pattern): Boolean = js.native
  def isAffectDepthOfReadingPattern(pattern: Pattern): Boolean = js.native
  def isDynamicPattern(pattern: Pattern): Boolean = js.native
  def isNegativePattern(pattern: Pattern): Boolean = js.native
  def isPositivePattern(pattern: Pattern): Boolean = js.native
  def isStaticPattern(pattern: Pattern): Boolean = js.native
  def makeRe(pattern: Pattern, options: Options): PatternRe = js.native
  def matchAny(entry: String, patternsRe: js.Array[PatternRe]): Boolean = js.native
  def unixifyPattern(pattern: Pattern): Pattern = js.native
}

