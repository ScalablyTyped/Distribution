package typings.diff

import typings.diff.anon.Strict
import typings.diff.diffNumbers.`-1`
import typings.diff.diffNumbers.`0`
import typings.diff.diffNumbers.`1`
import typings.diff.mod.ApplyPatchOptions
import typings.diff.mod.ApplyPatchesOptions
import typings.diff.mod.ArrayChange
import typings.diff.mod.ArrayOptions
import typings.diff.mod.BaseOptions
import typings.diff.mod.Callback
import typings.diff.mod.CallbackOptions
import typings.diff.mod.Change
import typings.diff.mod.JsonOptions
import typings.diff.mod.LinesOptions
import typings.diff.mod.ParsedDiff
import typings.diff.mod.PatchOptions
import typings.diff.mod.WordsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Diff {
    
    @JSGlobal("Diff")
    @js.native
    val ^ : js.Any = js.native
    @JSGlobal("Diff.Diff")
    @js.native
    open class Diff ()
      extends typings.diff.mod.Diff
    
    inline def applyPatch(source: String, patch: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def applyPatch(source: String, patch: String, options: ApplyPatchOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def applyPatch(source: String, patch: js.Array[ParsedDiff]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def applyPatch(source: String, patch: js.Array[ParsedDiff], options: ApplyPatchOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def applyPatch(source: String, patch: ParsedDiff): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def applyPatch(source: String, patch: ParsedDiff, options: ApplyPatchOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def applyPatches(patch: String, options: ApplyPatchesOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatches")(patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def applyPatches(patch: js.Array[ParsedDiff], options: ApplyPatchesOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatches")(patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def canonicalize(obj: Any, stack: js.Array[Any], replacementStack: js.Array[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("canonicalize")(obj.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], replacementStack.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def convertChangesToDMP(changes: js.Array[Change]): js.Array[js.Tuple2[`1` | `0` | `-1`, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertChangesToDMP")(changes.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[`1` | `0` | `-1`, String]]]
    
    inline def convertChangesToXML(changes: js.Array[Change]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertChangesToXML")(changes.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def createPatch(fileName: String, oldStr: String, newStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createPatch(fileName: String, oldStr: String, newStr: String, oldHeader: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createPatch(fileName: String, oldStr: String, newStr: String, oldHeader: String, newHeader: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createPatch(
      fileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: String,
      newHeader: String,
      options: PatchOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createPatch(
      fileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: String,
      newHeader: Unit,
      options: PatchOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createPatch(fileName: String, oldStr: String, newStr: String, oldHeader: Unit, newHeader: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createPatch(
      fileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: Unit,
      newHeader: String,
      options: PatchOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createPatch(
      fileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: Unit,
      newHeader: Unit,
      options: PatchOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def createTwoFilesPatch(oldFileName: String, newFileName: String, oldStr: String, newStr: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createTwoFilesPatch(oldFileName: String, newFileName: String, oldStr: String, newStr: String, oldHeader: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createTwoFilesPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: String,
      newHeader: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createTwoFilesPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: String,
      newHeader: String,
      options: PatchOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createTwoFilesPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: String,
      newHeader: Unit,
      options: PatchOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createTwoFilesPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: Unit,
      newHeader: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createTwoFilesPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: Unit,
      newHeader: String,
      options: PatchOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def createTwoFilesPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: Unit,
      newHeader: Unit,
      options: PatchOptions
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def diffArrays[TOld, TNew](oldArr: js.Array[TOld], newArr: js.Array[TNew]): js.Array[ArrayChange[TOld | TNew]] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffArrays")(oldArr.asInstanceOf[js.Any], newArr.asInstanceOf[js.Any])).asInstanceOf[js.Array[ArrayChange[TOld | TNew]]]
    inline def diffArrays[TOld, TNew](oldArr: js.Array[TOld], newArr: js.Array[TNew], options: ArrayOptions[TOld, TNew]): js.Array[ArrayChange[TOld | TNew]] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffArrays")(oldArr.asInstanceOf[js.Any], newArr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ArrayChange[TOld | TNew]]]
    
    inline def diffChars(oldStr: String, newStr: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffChars")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffChars(oldStr: String, newStr: String, options: BaseOptions & CallbackOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffChars")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffChars(oldStr: String, newStr: String, options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffChars")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def diffChars_Array(oldStr: String, newStr: String, options: BaseOptions): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffChars")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    
    inline def diffCss(oldStr: String, newStr: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffCss")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffCss(oldStr: String, newStr: String, options: BaseOptions & CallbackOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffCss")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffCss(oldStr: String, newStr: String, options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffCss")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def diffCss_Array(oldStr: String, newStr: String, options: BaseOptions): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffCss")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    
    inline def diffJson(oldObj: String, newObj: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffJson(oldObj: String, newObj: String, options: JsonOptions & CallbackOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffJson(oldObj: String, newObj: String, options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffJson(oldObj: String, newObj: String, options: JsonOptions): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffJson(oldObj: String, newObj: js.Object): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffJson(oldObj: String, newObj: js.Object, options: JsonOptions & CallbackOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffJson(oldObj: String, newObj: js.Object, options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffJson(oldObj: String, newObj: js.Object, options: JsonOptions): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffJson(oldObj: js.Object, newObj: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffJson(oldObj: js.Object, newObj: String, options: JsonOptions & CallbackOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffJson(oldObj: js.Object, newObj: String, options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffJson(oldObj: js.Object, newObj: String, options: JsonOptions): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffJson(oldObj: js.Object, newObj: js.Object): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffJson(oldObj: js.Object, newObj: js.Object, options: JsonOptions & CallbackOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffJson(oldObj: js.Object, newObj: js.Object, options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffJson(oldObj: js.Object, newObj: js.Object, options: JsonOptions): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    
    inline def diffLines(oldStr: String, newStr: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffLines(oldStr: String, newStr: String, options: LinesOptions & CallbackOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffLines(oldStr: String, newStr: String, options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffLines(oldStr: String, newStr: String, options: LinesOptions): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    
    inline def diffSentences(oldStr: String, newStr: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffSentences")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffSentences(oldStr: String, newStr: String, options: BaseOptions & CallbackOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffSentences")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffSentences(oldStr: String, newStr: String, options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffSentences")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def diffSentences_Array(oldStr: String, newStr: String, options: BaseOptions): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffSentences")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    
    inline def diffTrimmedLines(oldStr: String, newStr: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffTrimmedLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffTrimmedLines(oldStr: String, newStr: String, options: LinesOptions & CallbackOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffTrimmedLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffTrimmedLines(oldStr: String, newStr: String, options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffTrimmedLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffTrimmedLines(oldStr: String, newStr: String, options: LinesOptions): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffTrimmedLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    
    inline def diffWords(oldStr: String, newStr: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffWords")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffWords(oldStr: String, newStr: String, options: WordsOptions & CallbackOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffWords")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffWords(oldStr: String, newStr: String, options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffWords")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffWords(oldStr: String, newStr: String, options: WordsOptions): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffWords")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    
    inline def diffWordsWithSpace(oldStr: String, newStr: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffWordsWithSpace")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    inline def diffWordsWithSpace(oldStr: String, newStr: String, options: WordsOptions & CallbackOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffWordsWithSpace")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffWordsWithSpace(oldStr: String, newStr: String, options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diffWordsWithSpace")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def diffWordsWithSpace(oldStr: String, newStr: String, options: WordsOptions): js.Array[Change] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffWordsWithSpace")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
    
    inline def merge(mine: String, theirs: String, base: String): ParsedDiff = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(mine.asInstanceOf[js.Any], theirs.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[ParsedDiff]
    
    inline def parsePatch(diffStr: String): js.Array[ParsedDiff] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePatch")(diffStr.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedDiff]]
    inline def parsePatch(diffStr: String, options: Strict): js.Array[ParsedDiff] = (^.asInstanceOf[js.Dynamic].applyDynamic("parsePatch")(diffStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParsedDiff]]
    
    inline def structuredPatch(oldFileName: String, newFileName: String, oldStr: String, newStr: String): ParsedDiff = (^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[ParsedDiff]
    inline def structuredPatch(oldFileName: String, newFileName: String, oldStr: String, newStr: String, oldHeader: String): ParsedDiff = (^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any])).asInstanceOf[ParsedDiff]
    inline def structuredPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: String,
      newHeader: String
    ): ParsedDiff = (^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[ParsedDiff]
    inline def structuredPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: String,
      newHeader: String,
      options: PatchOptions
    ): ParsedDiff = (^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedDiff]
    inline def structuredPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: String,
      newHeader: Unit,
      options: PatchOptions
    ): ParsedDiff = (^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedDiff]
    inline def structuredPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: Unit,
      newHeader: String
    ): ParsedDiff = (^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[ParsedDiff]
    inline def structuredPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: Unit,
      newHeader: String,
      options: PatchOptions
    ): ParsedDiff = (^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedDiff]
    inline def structuredPatch(
      oldFileName: String,
      newFileName: String,
      oldStr: String,
      newStr: String,
      oldHeader: Unit,
      newHeader: Unit,
      options: PatchOptions
    ): ParsedDiff = (^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedDiff]
  }
}
