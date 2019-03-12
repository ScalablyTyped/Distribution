package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyPatch(source: java.lang.String, patch: ParsedDiff): java.lang.String = js.native
  def applyPatch(source: java.lang.String, patch: ParsedDiff, options: ApplyPatchOptions): java.lang.String = js.native
  def applyPatch(source: java.lang.String, patch: java.lang.String): java.lang.String = js.native
  def applyPatch(source: java.lang.String, patch: java.lang.String, options: ApplyPatchOptions): java.lang.String = js.native
  def applyPatch(source: java.lang.String, patch: js.Array[ParsedDiff]): java.lang.String = js.native
  def applyPatch(source: java.lang.String, patch: js.Array[ParsedDiff], options: ApplyPatchOptions): java.lang.String = js.native
  def applyPatches(patch: java.lang.String, options: ApplyPatchesOptions): scala.Unit = js.native
  def applyPatches(patch: js.Array[ParsedDiff], options: ApplyPatchesOptions): scala.Unit = js.native
  def canonicalize(obj: js.Any, stack: js.Array[_], replacementStack: js.Array[_]): js.Any = js.native
  def convertChangesToDMP(changes: js.Array[Change]): js.Array[
    js.Tuple2[
      diffLib.diffLibNumbers.`1` | diffLib.diffLibNumbers.`0` | diffLib.diffLibNumbers.`-1`, 
      java.lang.String
    ]
  ] = js.native
  def convertChangesToXML(changes: js.Array[Change]): java.lang.String = js.native
  def createPatch(fileName: java.lang.String, oldStr: java.lang.String, newStr: java.lang.String): java.lang.String = js.native
  def createPatch(
    fileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String,
    oldHeader: java.lang.String
  ): java.lang.String = js.native
  def createPatch(
    fileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String,
    oldHeader: java.lang.String,
    newHeader: java.lang.String
  ): java.lang.String = js.native
  def createPatch(
    fileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String,
    oldHeader: java.lang.String,
    newHeader: java.lang.String,
    options: PatchOptions
  ): java.lang.String = js.native
  def createTwoFilesPatch(
    oldFileName: java.lang.String,
    newFileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String
  ): java.lang.String = js.native
  def createTwoFilesPatch(
    oldFileName: java.lang.String,
    newFileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String,
    oldHeader: java.lang.String
  ): java.lang.String = js.native
  def createTwoFilesPatch(
    oldFileName: java.lang.String,
    newFileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String,
    oldHeader: java.lang.String,
    newHeader: java.lang.String
  ): java.lang.String = js.native
  def createTwoFilesPatch(
    oldFileName: java.lang.String,
    newFileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String,
    oldHeader: java.lang.String,
    newHeader: java.lang.String,
    options: PatchOptions
  ): java.lang.String = js.native
  def diffArrays[TOld, TNew](oldArr: js.Array[TOld], newArr: js.Array[TNew]): js.Array[ArrayChange[TOld | TNew]] = js.native
  def diffArrays[TOld, TNew](oldArr: js.Array[TOld], newArr: js.Array[TNew], options: ArrayOptions[TOld, TNew]): js.Array[ArrayChange[TOld | TNew]] = js.native
  def diffChars(oldStr: java.lang.String, newStr: java.lang.String): js.Array[Change] = js.native
  def diffChars(oldStr: java.lang.String, newStr: java.lang.String, options: BaseOptions): js.Array[Change] = js.native
  def diffChars(oldStr: java.lang.String, newStr: java.lang.String, options: Callback): scala.Unit = js.native
  @JSName("diffChars")
  def diffChars_Unit(oldStr: java.lang.String, newStr: java.lang.String, options: BaseOptions with CallbackOptions): scala.Unit = js.native
  def diffCss(oldStr: java.lang.String, newStr: java.lang.String): js.Array[Change] = js.native
  def diffCss(oldStr: java.lang.String, newStr: java.lang.String, options: BaseOptions): js.Array[Change] = js.native
  def diffCss(oldStr: java.lang.String, newStr: java.lang.String, options: Callback): scala.Unit = js.native
  @JSName("diffCss")
  def diffCss_Unit(oldStr: java.lang.String, newStr: java.lang.String, options: BaseOptions with CallbackOptions): scala.Unit = js.native
  def diffJson(oldObj: java.lang.String, newObj: java.lang.String): js.Array[Change] = js.native
  def diffJson(oldObj: java.lang.String, newObj: java.lang.String, options: Callback): scala.Unit = js.native
  def diffJson(oldObj: java.lang.String, newObj: java.lang.String, options: JsonOptions): js.Array[Change] = js.native
  def diffJson(oldObj: java.lang.String, newObj: js.Object): js.Array[Change] = js.native
  def diffJson(oldObj: java.lang.String, newObj: js.Object, options: Callback): scala.Unit = js.native
  def diffJson(oldObj: java.lang.String, newObj: js.Object, options: JsonOptions): js.Array[Change] = js.native
  def diffJson(oldObj: js.Object, newObj: java.lang.String): js.Array[Change] = js.native
  def diffJson(oldObj: js.Object, newObj: java.lang.String, options: Callback): scala.Unit = js.native
  def diffJson(oldObj: js.Object, newObj: java.lang.String, options: JsonOptions): js.Array[Change] = js.native
  def diffJson(oldObj: js.Object, newObj: js.Object): js.Array[Change] = js.native
  def diffJson(oldObj: js.Object, newObj: js.Object, options: Callback): scala.Unit = js.native
  def diffJson(oldObj: js.Object, newObj: js.Object, options: JsonOptions): js.Array[Change] = js.native
  @JSName("diffJson")
  def diffJson_Unit(oldObj: java.lang.String, newObj: java.lang.String, options: JsonOptions with CallbackOptions): scala.Unit = js.native
  @JSName("diffJson")
  def diffJson_Unit(oldObj: java.lang.String, newObj: js.Object, options: JsonOptions with CallbackOptions): scala.Unit = js.native
  @JSName("diffJson")
  def diffJson_Unit(oldObj: js.Object, newObj: java.lang.String, options: JsonOptions with CallbackOptions): scala.Unit = js.native
  @JSName("diffJson")
  def diffJson_Unit(oldObj: js.Object, newObj: js.Object, options: JsonOptions with CallbackOptions): scala.Unit = js.native
  def diffLines(oldStr: java.lang.String, newStr: java.lang.String): js.Array[Change] = js.native
  def diffLines(oldStr: java.lang.String, newStr: java.lang.String, options: Callback): scala.Unit = js.native
  def diffLines(oldStr: java.lang.String, newStr: java.lang.String, options: LinesOptions): js.Array[Change] = js.native
  @JSName("diffLines")
  def diffLines_Unit(oldStr: java.lang.String, newStr: java.lang.String, options: LinesOptions with CallbackOptions): scala.Unit = js.native
  def diffSentences(oldStr: java.lang.String, newStr: java.lang.String): js.Array[Change] = js.native
  def diffSentences(oldStr: java.lang.String, newStr: java.lang.String, options: BaseOptions): js.Array[Change] = js.native
  def diffSentences(oldStr: java.lang.String, newStr: java.lang.String, options: Callback): scala.Unit = js.native
  @JSName("diffSentences")
  def diffSentences_Unit(oldStr: java.lang.String, newStr: java.lang.String, options: BaseOptions with CallbackOptions): scala.Unit = js.native
  def diffTrimmedLines(oldStr: java.lang.String, newStr: java.lang.String): js.Array[Change] = js.native
  def diffTrimmedLines(oldStr: java.lang.String, newStr: java.lang.String, options: Callback): scala.Unit = js.native
  def diffTrimmedLines(oldStr: java.lang.String, newStr: java.lang.String, options: LinesOptions): js.Array[Change] = js.native
  @JSName("diffTrimmedLines")
  def diffTrimmedLines_Unit(oldStr: java.lang.String, newStr: java.lang.String, options: LinesOptions with CallbackOptions): scala.Unit = js.native
  def diffWords(oldStr: java.lang.String, newStr: java.lang.String): js.Array[Change] = js.native
  def diffWords(oldStr: java.lang.String, newStr: java.lang.String, options: Callback): scala.Unit = js.native
  def diffWords(oldStr: java.lang.String, newStr: java.lang.String, options: WordsOptions): js.Array[Change] = js.native
  def diffWordsWithSpace(oldStr: java.lang.String, newStr: java.lang.String): js.Array[Change] = js.native
  def diffWordsWithSpace(oldStr: java.lang.String, newStr: java.lang.String, options: Callback): scala.Unit = js.native
  def diffWordsWithSpace(oldStr: java.lang.String, newStr: java.lang.String, options: WordsOptions): js.Array[Change] = js.native
  @JSName("diffWordsWithSpace")
  def diffWordsWithSpace_Unit(oldStr: java.lang.String, newStr: java.lang.String, options: WordsOptions with CallbackOptions): scala.Unit = js.native
  @JSName("diffWords")
  def diffWords_Unit(oldStr: java.lang.String, newStr: java.lang.String, options: WordsOptions with CallbackOptions): scala.Unit = js.native
  def merge(mine: java.lang.String, theirs: java.lang.String, base: java.lang.String): ParsedDiff = js.native
  def parsePatch(diffStr: java.lang.String): js.Array[ParsedDiff] = js.native
  def parsePatch(diffStr: java.lang.String, options: diffLib.Anon_Strict): js.Array[ParsedDiff] = js.native
  def structuredPatch(
    oldFileName: java.lang.String,
    newFileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String
  ): ParsedDiff = js.native
  def structuredPatch(
    oldFileName: java.lang.String,
    newFileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String,
    oldHeader: java.lang.String
  ): ParsedDiff = js.native
  def structuredPatch(
    oldFileName: java.lang.String,
    newFileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String,
    oldHeader: java.lang.String,
    newHeader: java.lang.String
  ): ParsedDiff = js.native
  def structuredPatch(
    oldFileName: java.lang.String,
    newFileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String,
    oldHeader: java.lang.String,
    newHeader: java.lang.String,
    options: PatchOptions
  ): ParsedDiff = js.native
}

