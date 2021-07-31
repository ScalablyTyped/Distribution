package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def applyPatch(source: java.lang.String, patch: java.lang.String): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def applyPatch(source: java.lang.String, patch: java.lang.String, options: typings.diff.mod.ApplyPatchOptions): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def applyPatch(source: java.lang.String, patch: js.Array[typings.diff.mod.ParsedDiff]): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def applyPatch(
  source: java.lang.String,
  patch: js.Array[typings.diff.mod.ParsedDiff],
  options: typings.diff.mod.ApplyPatchOptions
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def applyPatch(source: java.lang.String, patch: typings.diff.mod.ParsedDiff): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def applyPatch(
  source: java.lang.String,
  patch: typings.diff.mod.ParsedDiff,
  options: typings.diff.mod.ApplyPatchOptions
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(source.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

@scala.inline
def applyPatches(patch: java.lang.String, options: typings.diff.mod.ApplyPatchesOptions): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPatches")(patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def applyPatches(patch: js.Array[typings.diff.mod.ParsedDiff], options: typings.diff.mod.ApplyPatchesOptions): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("applyPatches")(patch.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def canonicalize(obj: js.Any, stack: js.Array[js.Any], replacementStack: js.Array[js.Any]): js.Any = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("canonicalize")(obj.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], replacementStack.asInstanceOf[js.Any])).asInstanceOf[js.Any]

@scala.inline
def convertChangesToDMP(changes: js.Array[typings.diff.mod.Change]): js.Array[
js.Tuple2[
  typings.diff.diffNumbers.`1` | typings.diff.diffNumbers.`0` | typings.diff.diffNumbers.`-1`, 
  java.lang.String
]] = typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertChangesToDMP")(changes.asInstanceOf[js.Any]).asInstanceOf[js.Array[
js.Tuple2[
  typings.diff.diffNumbers.`1` | typings.diff.diffNumbers.`0` | typings.diff.diffNumbers.`-1`, 
  java.lang.String
]]]

@scala.inline
def convertChangesToXML(changes: js.Array[typings.diff.mod.Change]): java.lang.String = typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("convertChangesToXML")(changes.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

@scala.inline
def createPatch(fileName: java.lang.String, oldStr: java.lang.String, newStr: java.lang.String): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createPatch(
  fileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createPatch(
  fileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String,
  newHeader: java.lang.String
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createPatch(
  fileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String,
  newHeader: java.lang.String,
  options: typings.diff.mod.PatchOptions
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createPatch(
  fileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String,
  newHeader: scala.Unit,
  options: typings.diff.mod.PatchOptions
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createPatch(
  fileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: scala.Unit,
  newHeader: java.lang.String
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createPatch(
  fileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: scala.Unit,
  newHeader: java.lang.String,
  options: typings.diff.mod.PatchOptions
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createPatch(
  fileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: scala.Unit,
  newHeader: scala.Unit,
  options: typings.diff.mod.PatchOptions
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createPatch")(fileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

@scala.inline
def createTwoFilesPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createTwoFilesPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createTwoFilesPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String,
  newHeader: java.lang.String
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createTwoFilesPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String,
  newHeader: java.lang.String,
  options: typings.diff.mod.PatchOptions
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createTwoFilesPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String,
  newHeader: scala.Unit,
  options: typings.diff.mod.PatchOptions
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createTwoFilesPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: scala.Unit,
  newHeader: java.lang.String
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createTwoFilesPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: scala.Unit,
  newHeader: java.lang.String,
  options: typings.diff.mod.PatchOptions
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
@scala.inline
def createTwoFilesPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: scala.Unit,
  newHeader: scala.Unit,
  options: typings.diff.mod.PatchOptions
): java.lang.String = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTwoFilesPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

@scala.inline
def diffArrays[TOld, TNew](oldArr: js.Array[TOld], newArr: js.Array[TNew]): js.Array[typings.diff.mod.ArrayChange[TOld | TNew]] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffArrays")(oldArr.asInstanceOf[js.Any], newArr.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.ArrayChange[TOld | TNew]]]
@scala.inline
def diffArrays[TOld, TNew](oldArr: js.Array[TOld], newArr: js.Array[TNew], options: typings.diff.mod.ArrayOptions[TOld, TNew]): js.Array[typings.diff.mod.ArrayChange[TOld | TNew]] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffArrays")(oldArr.asInstanceOf[js.Any], newArr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.ArrayChange[TOld | TNew]]]

@scala.inline
def diffChars(oldStr: java.lang.String, newStr: java.lang.String): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffChars")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffChars(
  oldStr: java.lang.String,
  newStr: java.lang.String,
  options: typings.diff.mod.BaseOptions & typings.diff.mod.CallbackOptions
): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffChars")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffChars(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.Callback): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffChars")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def diffChars_Array(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.BaseOptions): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffChars")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]

@scala.inline
def diffCss(oldStr: java.lang.String, newStr: java.lang.String): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffCss")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffCss(
  oldStr: java.lang.String,
  newStr: java.lang.String,
  options: typings.diff.mod.BaseOptions & typings.diff.mod.CallbackOptions
): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffCss")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffCss(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.Callback): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffCss")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def diffCss_Array(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.BaseOptions): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffCss")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]

@scala.inline
def diffJson(oldObj: java.lang.String, newObj: java.lang.String): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffJson(
  oldObj: java.lang.String,
  newObj: java.lang.String,
  options: typings.diff.mod.JsonOptions & typings.diff.mod.CallbackOptions
): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffJson(oldObj: java.lang.String, newObj: java.lang.String, options: typings.diff.mod.Callback): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffJson(oldObj: java.lang.String, newObj: java.lang.String, options: typings.diff.mod.JsonOptions): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffJson(oldObj: java.lang.String, newObj: js.Object): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffJson(
  oldObj: java.lang.String,
  newObj: js.Object,
  options: typings.diff.mod.JsonOptions & typings.diff.mod.CallbackOptions
): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffJson(oldObj: java.lang.String, newObj: js.Object, options: typings.diff.mod.Callback): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffJson(oldObj: java.lang.String, newObj: js.Object, options: typings.diff.mod.JsonOptions): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffJson(oldObj: js.Object, newObj: java.lang.String): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffJson(
  oldObj: js.Object,
  newObj: java.lang.String,
  options: typings.diff.mod.JsonOptions & typings.diff.mod.CallbackOptions
): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffJson(oldObj: js.Object, newObj: java.lang.String, options: typings.diff.mod.Callback): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffJson(oldObj: js.Object, newObj: java.lang.String, options: typings.diff.mod.JsonOptions): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffJson(oldObj: js.Object, newObj: js.Object): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffJson(
  oldObj: js.Object,
  newObj: js.Object,
  options: typings.diff.mod.JsonOptions & typings.diff.mod.CallbackOptions
): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffJson(oldObj: js.Object, newObj: js.Object, options: typings.diff.mod.Callback): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffJson(oldObj: js.Object, newObj: js.Object, options: typings.diff.mod.JsonOptions): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffJson")(oldObj.asInstanceOf[js.Any], newObj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]

@scala.inline
def diffLines(oldStr: java.lang.String, newStr: java.lang.String): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffLines(
  oldStr: java.lang.String,
  newStr: java.lang.String,
  options: typings.diff.mod.LinesOptions & typings.diff.mod.CallbackOptions
): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffLines(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.Callback): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffLines(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.LinesOptions): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]

@scala.inline
def diffSentences(oldStr: java.lang.String, newStr: java.lang.String): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffSentences")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffSentences(
  oldStr: java.lang.String,
  newStr: java.lang.String,
  options: typings.diff.mod.BaseOptions & typings.diff.mod.CallbackOptions
): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffSentences")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffSentences(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.Callback): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffSentences")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

@scala.inline
def diffSentences_Array(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.BaseOptions): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffSentences")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]

@scala.inline
def diffTrimmedLines(oldStr: java.lang.String, newStr: java.lang.String): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffTrimmedLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffTrimmedLines(
  oldStr: java.lang.String,
  newStr: java.lang.String,
  options: typings.diff.mod.LinesOptions & typings.diff.mod.CallbackOptions
): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffTrimmedLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffTrimmedLines(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.Callback): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffTrimmedLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffTrimmedLines(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.LinesOptions): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffTrimmedLines")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]

@scala.inline
def diffWords(oldStr: java.lang.String, newStr: java.lang.String): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffWords")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffWords(
  oldStr: java.lang.String,
  newStr: java.lang.String,
  options: typings.diff.mod.WordsOptions & typings.diff.mod.CallbackOptions
): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffWords")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffWords(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.Callback): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffWords")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffWords(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.WordsOptions): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffWords")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]

@scala.inline
def diffWordsWithSpace(oldStr: java.lang.String, newStr: java.lang.String): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffWordsWithSpace")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]
@scala.inline
def diffWordsWithSpace(
  oldStr: java.lang.String,
  newStr: java.lang.String,
  options: typings.diff.mod.WordsOptions & typings.diff.mod.CallbackOptions
): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffWordsWithSpace")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffWordsWithSpace(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.Callback): scala.Unit = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffWordsWithSpace")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
@scala.inline
def diffWordsWithSpace(oldStr: java.lang.String, newStr: java.lang.String, options: typings.diff.mod.WordsOptions): js.Array[typings.diff.mod.Change] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("diffWordsWithSpace")(oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.Change]]

@scala.inline
def merge(mine: java.lang.String, theirs: java.lang.String, base: java.lang.String): typings.diff.mod.ParsedDiff = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("merge")(mine.asInstanceOf[js.Any], theirs.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[typings.diff.mod.ParsedDiff]

@scala.inline
def parsePatch(diffStr: java.lang.String): js.Array[typings.diff.mod.ParsedDiff] = typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parsePatch")(diffStr.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.diff.mod.ParsedDiff]]
@scala.inline
def parsePatch(diffStr: java.lang.String, options: typings.diff.anon.Strict): js.Array[typings.diff.mod.ParsedDiff] = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parsePatch")(diffStr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.diff.mod.ParsedDiff]]

@scala.inline
def structuredPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String
): typings.diff.mod.ParsedDiff = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any])).asInstanceOf[typings.diff.mod.ParsedDiff]
@scala.inline
def structuredPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String
): typings.diff.mod.ParsedDiff = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any])).asInstanceOf[typings.diff.mod.ParsedDiff]
@scala.inline
def structuredPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String,
  newHeader: java.lang.String
): typings.diff.mod.ParsedDiff = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[typings.diff.mod.ParsedDiff]
@scala.inline
def structuredPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String,
  newHeader: java.lang.String,
  options: typings.diff.mod.PatchOptions
): typings.diff.mod.ParsedDiff = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.diff.mod.ParsedDiff]
@scala.inline
def structuredPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: java.lang.String,
  newHeader: scala.Unit,
  options: typings.diff.mod.PatchOptions
): typings.diff.mod.ParsedDiff = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.diff.mod.ParsedDiff]
@scala.inline
def structuredPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: scala.Unit,
  newHeader: java.lang.String
): typings.diff.mod.ParsedDiff = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any])).asInstanceOf[typings.diff.mod.ParsedDiff]
@scala.inline
def structuredPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: scala.Unit,
  newHeader: java.lang.String,
  options: typings.diff.mod.PatchOptions
): typings.diff.mod.ParsedDiff = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.diff.mod.ParsedDiff]
@scala.inline
def structuredPatch(
  oldFileName: java.lang.String,
  newFileName: java.lang.String,
  oldStr: java.lang.String,
  newStr: java.lang.String,
  oldHeader: scala.Unit,
  newHeader: scala.Unit,
  options: typings.diff.mod.PatchOptions
): typings.diff.mod.ParsedDiff = (typings.diff.mod.^.asInstanceOf[js.Dynamic].applyDynamic("structuredPatch")(oldFileName.asInstanceOf[js.Any], newFileName.asInstanceOf[js.Any], oldStr.asInstanceOf[js.Any], newStr.asInstanceOf[js.Any], oldHeader.asInstanceOf[js.Any], newHeader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.diff.mod.ParsedDiff]

type Callback = js.Function2[
/* err */ scala.Unit, 
/* value */ js.UndefOr[js.Array[typings.diff.mod.Change]], 
scala.Unit]
