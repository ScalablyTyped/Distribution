package typings.diff.diffMod

import typings.diff.Anon_Strict
import typings.diff.diffNumbers.`-1`
import typings.diff.diffNumbers.`0`
import typings.diff.diffNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyPatch(source: String, patch: String): String = js.native
  def applyPatch(source: String, patch: String, options: ApplyPatchOptions): String = js.native
  def applyPatch(source: String, patch: js.Array[ParsedDiff]): String = js.native
  def applyPatch(source: String, patch: js.Array[ParsedDiff], options: ApplyPatchOptions): String = js.native
  def applyPatch(source: String, patch: ParsedDiff): String = js.native
  def applyPatch(source: String, patch: ParsedDiff, options: ApplyPatchOptions): String = js.native
  def applyPatches(patch: String, options: ApplyPatchesOptions): Unit = js.native
  def applyPatches(patch: js.Array[ParsedDiff], options: ApplyPatchesOptions): Unit = js.native
  def canonicalize(obj: js.Any, stack: js.Array[_], replacementStack: js.Array[_]): js.Any = js.native
  def convertChangesToDMP(changes: js.Array[Change]): js.Array[js.Tuple2[`1` | `0` | `-1`, String]] = js.native
  def convertChangesToXML(changes: js.Array[Change]): String = js.native
  def createPatch(fileName: String, oldStr: String, newStr: String): String = js.native
  def createPatch(fileName: String, oldStr: String, newStr: String, oldHeader: String): String = js.native
  def createPatch(fileName: String, oldStr: String, newStr: String, oldHeader: String, newHeader: String): String = js.native
  def createPatch(
    fileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: String,
    options: PatchOptions
  ): String = js.native
  def createTwoFilesPatch(oldFileName: String, newFileName: String, oldStr: String, newStr: String): String = js.native
  def createTwoFilesPatch(oldFileName: String, newFileName: String, oldStr: String, newStr: String, oldHeader: String): String = js.native
  def createTwoFilesPatch(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: String
  ): String = js.native
  def createTwoFilesPatch(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: String,
    options: PatchOptions
  ): String = js.native
  def diffArrays[TOld, TNew](oldArr: js.Array[TOld], newArr: js.Array[TNew]): js.Array[ArrayChange[TOld | TNew]] = js.native
  def diffArrays[TOld, TNew](oldArr: js.Array[TOld], newArr: js.Array[TNew], options: ArrayOptions[TOld, TNew]): js.Array[ArrayChange[TOld | TNew]] = js.native
  def diffChars(oldStr: String, newStr: String): js.Array[Change] = js.native
  def diffChars(oldStr: String, newStr: String, options: BaseOptions): js.Array[Change] = js.native
  def diffChars(oldStr: String, newStr: String, options: Callback): Unit = js.native
  @JSName("diffChars")
  def diffChars_Unit(oldStr: String, newStr: String, options: BaseOptions with CallbackOptions): Unit = js.native
  def diffCss(oldStr: String, newStr: String): js.Array[Change] = js.native
  def diffCss(oldStr: String, newStr: String, options: BaseOptions): js.Array[Change] = js.native
  def diffCss(oldStr: String, newStr: String, options: Callback): Unit = js.native
  @JSName("diffCss")
  def diffCss_Unit(oldStr: String, newStr: String, options: BaseOptions with CallbackOptions): Unit = js.native
  def diffJson(oldObj: String, newObj: String): js.Array[Change] = js.native
  def diffJson(oldObj: String, newObj: String, options: Callback): Unit = js.native
  def diffJson(oldObj: String, newObj: String, options: JsonOptions): js.Array[Change] = js.native
  def diffJson(oldObj: String, newObj: js.Object): js.Array[Change] = js.native
  def diffJson(oldObj: String, newObj: js.Object, options: Callback): Unit = js.native
  def diffJson(oldObj: String, newObj: js.Object, options: JsonOptions): js.Array[Change] = js.native
  def diffJson(oldObj: js.Object, newObj: String): js.Array[Change] = js.native
  def diffJson(oldObj: js.Object, newObj: String, options: Callback): Unit = js.native
  def diffJson(oldObj: js.Object, newObj: String, options: JsonOptions): js.Array[Change] = js.native
  def diffJson(oldObj: js.Object, newObj: js.Object): js.Array[Change] = js.native
  def diffJson(oldObj: js.Object, newObj: js.Object, options: Callback): Unit = js.native
  def diffJson(oldObj: js.Object, newObj: js.Object, options: JsonOptions): js.Array[Change] = js.native
  @JSName("diffJson")
  def diffJson_Unit(oldObj: String, newObj: String, options: JsonOptions with CallbackOptions): Unit = js.native
  @JSName("diffJson")
  def diffJson_Unit(oldObj: String, newObj: js.Object, options: JsonOptions with CallbackOptions): Unit = js.native
  @JSName("diffJson")
  def diffJson_Unit(oldObj: js.Object, newObj: String, options: JsonOptions with CallbackOptions): Unit = js.native
  @JSName("diffJson")
  def diffJson_Unit(oldObj: js.Object, newObj: js.Object, options: JsonOptions with CallbackOptions): Unit = js.native
  def diffLines(oldStr: String, newStr: String): js.Array[Change] = js.native
  def diffLines(oldStr: String, newStr: String, options: Callback): Unit = js.native
  def diffLines(oldStr: String, newStr: String, options: LinesOptions): js.Array[Change] = js.native
  @JSName("diffLines")
  def diffLines_Unit(oldStr: String, newStr: String, options: LinesOptions with CallbackOptions): Unit = js.native
  def diffSentences(oldStr: String, newStr: String): js.Array[Change] = js.native
  def diffSentences(oldStr: String, newStr: String, options: BaseOptions): js.Array[Change] = js.native
  def diffSentences(oldStr: String, newStr: String, options: Callback): Unit = js.native
  @JSName("diffSentences")
  def diffSentences_Unit(oldStr: String, newStr: String, options: BaseOptions with CallbackOptions): Unit = js.native
  def diffTrimmedLines(oldStr: String, newStr: String): js.Array[Change] = js.native
  def diffTrimmedLines(oldStr: String, newStr: String, options: Callback): Unit = js.native
  def diffTrimmedLines(oldStr: String, newStr: String, options: LinesOptions): js.Array[Change] = js.native
  @JSName("diffTrimmedLines")
  def diffTrimmedLines_Unit(oldStr: String, newStr: String, options: LinesOptions with CallbackOptions): Unit = js.native
  def diffWords(oldStr: String, newStr: String): js.Array[Change] = js.native
  def diffWords(oldStr: String, newStr: String, options: Callback): Unit = js.native
  def diffWords(oldStr: String, newStr: String, options: WordsOptions): js.Array[Change] = js.native
  def diffWordsWithSpace(oldStr: String, newStr: String): js.Array[Change] = js.native
  def diffWordsWithSpace(oldStr: String, newStr: String, options: Callback): Unit = js.native
  def diffWordsWithSpace(oldStr: String, newStr: String, options: WordsOptions): js.Array[Change] = js.native
  @JSName("diffWordsWithSpace")
  def diffWordsWithSpace_Unit(oldStr: String, newStr: String, options: WordsOptions with CallbackOptions): Unit = js.native
  @JSName("diffWords")
  def diffWords_Unit(oldStr: String, newStr: String, options: WordsOptions with CallbackOptions): Unit = js.native
  def merge(mine: String, theirs: String, base: String): ParsedDiff = js.native
  def parsePatch(diffStr: String): js.Array[ParsedDiff] = js.native
  def parsePatch(diffStr: String, options: Anon_Strict): js.Array[ParsedDiff] = js.native
  def structuredPatch(oldFileName: String, newFileName: String, oldStr: String, newStr: String): ParsedDiff = js.native
  def structuredPatch(oldFileName: String, newFileName: String, oldStr: String, newStr: String, oldHeader: String): ParsedDiff = js.native
  def structuredPatch(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: String
  ): ParsedDiff = js.native
  def structuredPatch(
    oldFileName: String,
    newFileName: String,
    oldStr: String,
    newStr: String,
    oldHeader: String,
    newHeader: String,
    options: PatchOptions
  ): ParsedDiff = js.native
}

