package typings
package diffDashMatchDashPatchLib.diffDashMatchDashPatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff-match-patch", "diff_match_patch")
@js.native
class diff_match_patch () extends js.Object {
  var Diff_EditCost: scala.Double = js.native
  var Diff_Timeout: scala.Double = js.native
  var Match_Distance: scala.Double = js.native
  var Match_MaxBits: scala.Double = js.native
  var Match_Threshold: scala.Double = js.native
  var Patch_DeleteThreshold: scala.Double = js.native
  var Patch_Margin: scala.Double = js.native
  def `diff_bisect_`(text1: java.lang.String, text2: java.lang.String, deadline: scala.Double): js.Array[Diff] = js.native
  def `diff_charsToLines_`(diffs: js.Array[Diff], lineArray: js.Array[java.lang.String]): scala.Unit = js.native
  def diff_cleanupEfficiency(diffs: js.Array[Diff]): scala.Unit = js.native
  def diff_cleanupMerge(diffs: js.Array[Diff]): scala.Unit = js.native
  def diff_cleanupSemantic(diffs: js.Array[Diff]): scala.Unit = js.native
  def diff_cleanupSemanticLossless(diffs: js.Array[Diff]): scala.Unit = js.native
  def `diff_commonOverlap_`(text1: java.lang.String, text2: java.lang.String): scala.Double = js.native
  def diff_commonPrefix(text1: java.lang.String, text2: java.lang.String): scala.Double = js.native
  def diff_commonSuffix(text1: java.lang.String, text2: java.lang.String): scala.Double = js.native
  def diff_fromDelta(text1: java.lang.String, delta: java.lang.String): js.Array[Diff] = js.native
  def `diff_halfMatch_`(text1: java.lang.String, text2: java.lang.String): js.Array[java.lang.String] = js.native
  def diff_levenshtein(diffs: js.Array[Diff]): scala.Double = js.native
  def `diff_linesToChars_`(text1: java.lang.String, text2: java.lang.String): diffDashMatchDashPatchLib.Anon_Chars1 = js.native
  def diff_main(text1: java.lang.String, text2: java.lang.String): js.Array[Diff] = js.native
  def diff_main(text1: java.lang.String, text2: java.lang.String, opt_checklines: scala.Boolean): js.Array[Diff] = js.native
  def diff_main(
    text1: java.lang.String,
    text2: java.lang.String,
    opt_checklines: scala.Boolean,
    opt_deadline: scala.Double
  ): js.Array[Diff] = js.native
  def diff_prettyHtml(diffs: js.Array[Diff]): java.lang.String = js.native
  def diff_text1(diffs: js.Array[Diff]): java.lang.String = js.native
  def diff_text2(diffs: js.Array[Diff]): java.lang.String = js.native
  def diff_toDelta(diffs: js.Array[Diff]): java.lang.String = js.native
  def diff_xIndex(diffs: js.Array[Diff], loc: scala.Double): scala.Double = js.native
  def `match_alphabet_`(pattern: java.lang.String): org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  def `match_bitap_`(text: java.lang.String, pattern: java.lang.String, loc: scala.Double): scala.Double = js.native
  def match_main(text: java.lang.String, pattern: java.lang.String, loc: scala.Double): scala.Double = js.native
  def `patch_addContext_`(patch: patch_obj, text: java.lang.String): scala.Unit = js.native
  def patch_addPadding(patches: js.Array[patch_obj]): java.lang.String = js.native
  def patch_apply(patches: js.Array[patch_obj], text: java.lang.String): js.Tuple2[java.lang.String, js.Array[scala.Boolean]] = js.native
  def patch_deepCopy(patches: js.Array[patch_obj]): js.Array[patch_obj] = js.native
  def patch_fromText(text: java.lang.String): js.Array[patch_obj] = js.native
  def patch_make(a: java.lang.String, opt_b: java.lang.String): js.Array[patch_obj] = js.native
  def patch_make(a: java.lang.String, opt_b: java.lang.String, opt_c: js.Array[Diff]): js.Array[patch_obj] = js.native
  def patch_make(a: java.lang.String, opt_b: js.Array[Diff]): js.Array[patch_obj] = js.native
  def patch_make(a: js.Array[Diff]): js.Array[patch_obj] = js.native
  def patch_splitMax(patches: js.Array[patch_obj]): scala.Unit = js.native
  def patch_toText(patches: js.Array[patch_obj]): java.lang.String = js.native
}

