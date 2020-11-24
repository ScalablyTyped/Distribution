package typings.diffMatchPatch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.diffMatchPatch.anon.Chars1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff-match-patch", "diff_match_patch")
@js.native
class diffMatchPatch () extends js.Object {
  
  var Diff_EditCost: Double = js.native
  
  var Diff_Timeout: Double = js.native
  
  var Match_Distance: Double = js.native
  
  var Match_MaxBits: Double = js.native
  
  var Match_Threshold: Double = js.native
  
  var Patch_DeleteThreshold: Double = js.native
  
  var Patch_Margin: Double = js.native
  
  def diff_bisect_(text1: String, text2: String, deadline: Double): js.Array[Diff] = js.native
  
  def diff_charsToLines_(diffs: js.Array[Diff], lineArray: js.Array[String]): Unit = js.native
  
  def diff_cleanupEfficiency(diffs: js.Array[Diff]): Unit = js.native
  
  def diff_cleanupMerge(diffs: js.Array[Diff]): Unit = js.native
  
  def diff_cleanupSemantic(diffs: js.Array[Diff]): Unit = js.native
  
  def diff_cleanupSemanticLossless(diffs: js.Array[Diff]): Unit = js.native
  
  def diff_commonOverlap_(text1: String, text2: String): Double = js.native
  
  def diff_commonPrefix(text1: String, text2: String): Double = js.native
  
  def diff_commonSuffix(text1: String, text2: String): Double = js.native
  
  def diff_fromDelta(text1: String, delta: String): js.Array[Diff] = js.native
  
  def diff_halfMatch_(text1: String, text2: String): js.Array[String] = js.native
  
  def diff_levenshtein(diffs: js.Array[Diff]): Double = js.native
  
  def diff_linesToChars_(text1: String, text2: String): Chars1 = js.native
  
  def diff_main(text1: String, text2: String): js.Array[Diff] = js.native
  def diff_main(text1: String, text2: String, opt_checklines: js.UndefOr[scala.Nothing], opt_deadline: Double): js.Array[Diff] = js.native
  def diff_main(text1: String, text2: String, opt_checklines: Boolean): js.Array[Diff] = js.native
  def diff_main(text1: String, text2: String, opt_checklines: Boolean, opt_deadline: Double): js.Array[Diff] = js.native
  
  def diff_prettyHtml(diffs: js.Array[Diff]): String = js.native
  
  def diff_text1(diffs: js.Array[Diff]): String = js.native
  
  def diff_text2(diffs: js.Array[Diff]): String = js.native
  
  def diff_toDelta(diffs: js.Array[Diff]): String = js.native
  
  def diff_xIndex(diffs: js.Array[Diff], loc: Double): Double = js.native
  
  def match_alphabet_(pattern: String): StringDictionary[Double] = js.native
  
  def match_bitap_(text: String, pattern: String, loc: Double): Double = js.native
  
  def match_main(text: String, pattern: String, loc: Double): Double = js.native
  
  def patch_addContext_(patch: patchObj, text: String): Unit = js.native
  
  def patch_addPadding(patches: js.Array[patchObj]): String = js.native
  
  def patch_apply(patches: js.Array[patchObj], text: String): js.Tuple2[String, js.Array[Boolean]] = js.native
  
  def patch_deepCopy(patches: js.Array[patchObj]): js.Array[patchObj] = js.native
  
  def patch_fromText(text: String): js.Array[patchObj] = js.native
  
  def patch_make(a: String, opt_b: String): js.Array[patchObj] = js.native
  def patch_make(a: String, opt_b: String, opt_c: js.Array[Diff]): js.Array[patchObj] = js.native
  def patch_make(a: String, opt_b: js.Array[Diff]): js.Array[patchObj] = js.native
  def patch_make(a: js.Array[Diff]): js.Array[patchObj] = js.native
  
  def patch_splitMax(patches: js.Array[patchObj]): Unit = js.native
  
  def patch_toText(patches: js.Array[patchObj]): String = js.native
}
