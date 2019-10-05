package typings.diffDashMatchDashPatch

import org.scalablytyped.runtime.StringDictionary
import typings.diffDashMatchDashPatch.diffDashMatchDashPatchMod.Diff
import typings.diffDashMatchDashPatch.diffDashMatchDashPatchMod.patch_obj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff-match-patch", JSImport.Namespace)
@js.native
object diffDashMatchDashPatchMod extends js.Object {
  @js.native
  class diff_match_patch () extends js.Object {
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
    def diff_linesToChars_(text1: String, text2: String): Anon_Chars1 = js.native
    def diff_main(text1: String, text2: String): js.Array[Diff] = js.native
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
    def patch_addContext_(patch: patch_obj, text: String): Unit = js.native
    def patch_addPadding(patches: js.Array[patch_obj]): String = js.native
    def patch_apply(patches: js.Array[patch_obj], text: String): js.Tuple2[String, js.Array[Boolean]] = js.native
    def patch_deepCopy(patches: js.Array[patch_obj]): js.Array[patch_obj] = js.native
    def patch_fromText(text: String): js.Array[patch_obj] = js.native
    def patch_make(a: String, opt_b: String): js.Array[patch_obj] = js.native
    def patch_make(a: String, opt_b: String, opt_c: js.Array[Diff]): js.Array[patch_obj] = js.native
    def patch_make(a: String, opt_b: js.Array[Diff]): js.Array[patch_obj] = js.native
    def patch_make(a: js.Array[Diff]): js.Array[patch_obj] = js.native
    def patch_splitMax(patches: js.Array[patch_obj]): Unit = js.native
    def patch_toText(patches: js.Array[patch_obj]): String = js.native
  }
  
  @js.native
  class patch_obj () extends js.Object {
    var diffs: js.Array[Diff] = js.native
    var length1: Double = js.native
    var length2: Double = js.native
    var start1: Double | Null = js.native
    var start2: Double | Null = js.native
  }
  
  val DIFF_DELETE: Double = js.native
  val DIFF_EQUAL: Double = js.native
  val DIFF_INSERT: Double = js.native
  type Diff = js.Tuple2[Double, String]
}

