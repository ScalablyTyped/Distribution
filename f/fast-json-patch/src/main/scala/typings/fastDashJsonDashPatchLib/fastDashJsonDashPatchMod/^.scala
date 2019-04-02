package typings
package fastDashJsonDashPatchLib.fastDashJsonDashPatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyOperation[T](document: T, operation: fastDashJsonDashPatchLib.libCoreMod.Operation): fastDashJsonDashPatchLib.libCoreMod.OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: fastDashJsonDashPatchLib.libCoreMod.Operation,
    validateOperation: fastDashJsonDashPatchLib.libCoreMod.Validator[T]
  ): fastDashJsonDashPatchLib.libCoreMod.OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: fastDashJsonDashPatchLib.libCoreMod.Operation,
    validateOperation: fastDashJsonDashPatchLib.libCoreMod.Validator[T],
    mutateDocument: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: fastDashJsonDashPatchLib.libCoreMod.Operation,
    validateOperation: fastDashJsonDashPatchLib.libCoreMod.Validator[T],
    mutateDocument: scala.Boolean,
    banPrototypeModifications: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: fastDashJsonDashPatchLib.libCoreMod.Operation,
    validateOperation: fastDashJsonDashPatchLib.libCoreMod.Validator[T],
    mutateDocument: scala.Boolean,
    banPrototypeModifications: scala.Boolean,
    index: scala.Double
  ): fastDashJsonDashPatchLib.libCoreMod.OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: fastDashJsonDashPatchLib.libCoreMod.Operation,
    validateOperation: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: fastDashJsonDashPatchLib.libCoreMod.Operation,
    validateOperation: scala.Boolean,
    mutateDocument: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: fastDashJsonDashPatchLib.libCoreMod.Operation,
    validateOperation: scala.Boolean,
    mutateDocument: scala.Boolean,
    banPrototypeModifications: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: fastDashJsonDashPatchLib.libCoreMod.Operation,
    validateOperation: scala.Boolean,
    mutateDocument: scala.Boolean,
    banPrototypeModifications: scala.Boolean,
    index: scala.Double
  ): fastDashJsonDashPatchLib.libCoreMod.OperationResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation]): fastDashJsonDashPatchLib.libCoreMod.PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation],
    validateOperation: fastDashJsonDashPatchLib.libCoreMod.Validator[T]
  ): fastDashJsonDashPatchLib.libCoreMod.PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation],
    validateOperation: fastDashJsonDashPatchLib.libCoreMod.Validator[T],
    mutateDocument: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation],
    validateOperation: fastDashJsonDashPatchLib.libCoreMod.Validator[T],
    mutateDocument: scala.Boolean,
    banPrototypeModifications: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation],
    validateOperation: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation],
    validateOperation: scala.Boolean,
    mutateDocument: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation],
    validateOperation: scala.Boolean,
    mutateDocument: scala.Boolean,
    banPrototypeModifications: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.PatchResult[T] = js.native
  def applyReducer[T](document: T, operation: fastDashJsonDashPatchLib.libCoreMod.Operation, index: scala.Double): T = js.native
  def compare(tree1: js.Array[_], tree2: js.Array[_]): js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation] = js.native
  def compare(tree1: js.Array[_], tree2: js.Object): js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation] = js.native
  def compare(tree1: js.Object, tree2: js.Array[_]): js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation] = js.native
  def compare(tree1: js.Object, tree2: js.Object): js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation] = js.native
  def deepClone(obj: js.Any): js.Any = js.native
  def escapePathComponent(path: java.lang.String): java.lang.String = js.native
  def generate[T](observer: Observer[js.Object]): js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation] = js.native
  def getValueByPointer(document: js.Any, pointer: java.lang.String): js.Any = js.native
  def observe[T](obj: js.Array[T]): Observer[T] = js.native
  def observe[T](
    obj: js.Array[T],
    callback: js.Function1[/* patches */ js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation], scala.Unit]
  ): Observer[T] = js.native
  def observe[T](obj: js.Object): Observer[T] = js.native
  def observe[T](
    obj: js.Object,
    callback: js.Function1[/* patches */ js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation], scala.Unit]
  ): Observer[T] = js.native
  def unescapePathComponent(path: java.lang.String): java.lang.String = js.native
  def unobserve[T](root: T, observer: Observer[T]): scala.Unit = js.native
  def validate[T](sequence: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation]): fastDashJsonDashPatchLib.libHelpersMod.PatchError = js.native
  def validate[T](sequence: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation], document: T): fastDashJsonDashPatchLib.libHelpersMod.PatchError = js.native
  def validate[T](
    sequence: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation],
    document: T,
    externalValidator: fastDashJsonDashPatchLib.libCoreMod.Validator[T]
  ): fastDashJsonDashPatchLib.libHelpersMod.PatchError = js.native
  def validator(operation: fastDashJsonDashPatchLib.libCoreMod.Operation, index: scala.Double): scala.Unit = js.native
  def validator(operation: fastDashJsonDashPatchLib.libCoreMod.Operation, index: scala.Double, document: js.Any): scala.Unit = js.native
  def validator(
    operation: fastDashJsonDashPatchLib.libCoreMod.Operation,
    index: scala.Double,
    document: js.Any,
    existingPathFragment: java.lang.String
  ): scala.Unit = js.native
}

