package typings.fastDashJsonDashPatch.fastDashJsonDashPatchMod

import typings.fastDashJsonDashPatch.libCoreMod.Operation
import typings.fastDashJsonDashPatch.libCoreMod.OperationResult
import typings.fastDashJsonDashPatch.libCoreMod.PatchResult
import typings.fastDashJsonDashPatch.libCoreMod.Validator
import typings.fastDashJsonDashPatch.libHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def applyOperation[T](document: T, operation: Operation): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean, mutateDocument: Boolean): OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator[T]): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator[T], mutateDocument: Boolean): OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation]): PatchResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean): PatchResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean, mutateDocument: Boolean): PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator[T]): PatchResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator[T], mutateDocument: Boolean): PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  def applyReducer[T](document: T, operation: Operation, index: Double): T = js.native
  def compare(tree1: js.Array[_], tree2: js.Array[_]): js.Array[Operation] = js.native
  def compare(tree1: js.Array[_], tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
  def compare(tree1: js.Array[_], tree2: js.Object): js.Array[Operation] = js.native
  def compare(tree1: js.Array[_], tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
  def compare(tree1: js.Object, tree2: js.Array[_]): js.Array[Operation] = js.native
  def compare(tree1: js.Object, tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
  def compare(tree1: js.Object, tree2: js.Object): js.Array[Operation] = js.native
  def compare(tree1: js.Object, tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
  def deepClone(obj: js.Any): js.Any = js.native
  def escapePathComponent(path: String): String = js.native
  def generate[T](observer: Observer[js.Object]): js.Array[Operation] = js.native
  def generate[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = js.native
  def getValueByPointer(document: js.Any, pointer: String): js.Any = js.native
  def observe[T](obj: js.Array[T]): Observer[T] = js.native
  def observe[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
  def observe[T](obj: js.Object): Observer[T] = js.native
  def observe[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
  def unescapePathComponent(path: String): String = js.native
  def unobserve[T](root: T, observer: Observer[T]): Unit = js.native
  def validate[T](sequence: js.Array[Operation]): PatchError = js.native
  def validate[T](sequence: js.Array[Operation], document: T): PatchError = js.native
  def validate[T](sequence: js.Array[Operation], document: T, externalValidator: Validator[T]): PatchError = js.native
  def validator(operation: Operation, index: Double): Unit = js.native
  def validator(operation: Operation, index: Double, document: js.Any): Unit = js.native
  def validator(operation: Operation, index: Double, document: js.Any, existingPathFragment: String): Unit = js.native
}

