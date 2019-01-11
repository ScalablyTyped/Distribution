package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyPatch(oldStr: java.lang.String, uniDiff: diffLib.diffMod.JsDiffNs.IUniDiff): java.lang.String = js.native
  def applyPatch(oldStr: java.lang.String, uniDiff: java.lang.String): java.lang.String = js.native
  def applyPatch(oldStr: java.lang.String, uniDiff: js.Array[diffLib.diffMod.JsDiffNs.IUniDiff]): java.lang.String = js.native
  def applyPatches(uniDiff: js.Array[diffLib.diffMod.JsDiffNs.IUniDiff], options: diffLib.Anon_Callback): scala.Unit = js.native
  def canonicalize(obj: js.Any, stack: js.Array[_], replacementStack: js.Array[_]): js.Any = js.native
  def convertChangesToDMP(changes: js.Array[diffLib.diffMod.JsDiffNs.IDiffResult]): js.Array[diffLib.Anon_0] = js.native
  def convertChangesToXML(changes: js.Array[diffLib.diffMod.JsDiffNs.IDiffResult]): java.lang.String = js.native
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
    options: diffLib.Anon_Context
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
    options: diffLib.Anon_Context
  ): java.lang.String = js.native
  def diffArrays[T](oldArr: js.Array[T], newArr: js.Array[T]): js.Array[diffLib.diffMod.JsDiffNs.IDiffArraysResult[T]] = js.native
  def diffArrays[T](oldArr: js.Array[T], newArr: js.Array[T], options: diffLib.diffMod.JsDiffNs.IArrayOptions): js.Array[diffLib.diffMod.JsDiffNs.IDiffArraysResult[T]] = js.native
  def diffChars(oldStr: java.lang.String, newStr: java.lang.String): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffChars(oldStr: java.lang.String, newStr: java.lang.String, options: diffLib.diffMod.JsDiffNs.IOptions): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffCss(oldStr: java.lang.String, newStr: java.lang.String): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffCss(oldStr: java.lang.String, newStr: java.lang.String, options: diffLib.diffMod.JsDiffNs.IOptions): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffJson(oldObj: js.Object, newObj: js.Object): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffJson(oldObj: js.Object, newObj: js.Object, options: diffLib.diffMod.JsDiffNs.IOptions): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffLines(oldStr: java.lang.String, newStr: java.lang.String): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffLines(
    oldStr: java.lang.String,
    newStr: java.lang.String,
    options: diffLib.diffMod.JsDiffNs.ILinesOptions
  ): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffSentences(oldStr: java.lang.String, newStr: java.lang.String): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffSentences(oldStr: java.lang.String, newStr: java.lang.String, options: diffLib.diffMod.JsDiffNs.IOptions): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffTrimmedLines(oldStr: java.lang.String, newStr: java.lang.String): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffTrimmedLines(
    oldStr: java.lang.String,
    newStr: java.lang.String,
    options: diffLib.diffMod.JsDiffNs.ILinesOptions
  ): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffWords(oldStr: java.lang.String, newStr: java.lang.String): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffWords(oldStr: java.lang.String, newStr: java.lang.String, options: diffLib.diffMod.JsDiffNs.IOptions): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffWordsWithSpace(oldStr: java.lang.String, newStr: java.lang.String): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def diffWordsWithSpace(oldStr: java.lang.String, newStr: java.lang.String, options: diffLib.diffMod.JsDiffNs.IOptions): js.Array[diffLib.diffMod.JsDiffNs.IDiffResult] = js.native
  def merge(mine: java.lang.String, theirs: java.lang.String, base: java.lang.String): diffLib.diffMod.JsDiffNs.IUniDiff = js.native
  def parsePatch(diffStr: java.lang.String): js.Array[diffLib.diffMod.JsDiffNs.IUniDiff] = js.native
  def parsePatch(diffStr: java.lang.String, options: diffLib.Anon_Strict): js.Array[diffLib.diffMod.JsDiffNs.IUniDiff] = js.native
  def structuredPatch(
    oldFileName: java.lang.String,
    newFileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String,
    oldHeader: java.lang.String,
    newHeader: java.lang.String
  ): diffLib.diffMod.JsDiffNs.IUniDiff = js.native
  def structuredPatch(
    oldFileName: java.lang.String,
    newFileName: java.lang.String,
    oldStr: java.lang.String,
    newStr: java.lang.String,
    oldHeader: java.lang.String,
    newHeader: java.lang.String,
    options: diffLib.Anon_Context
  ): diffLib.diffMod.JsDiffNs.IUniDiff = js.native
}

