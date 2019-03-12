package typings
package fastDashJsonDashPatchLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch/lib/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val JsonPatchError: org.scalablytyped.runtime.Instantiable5[
    /* message */ java.lang.String, 
    /* name */ fastDashJsonDashPatchLib.libHelpersMod.JsonPatchErrorName, 
    /* index */ js.UndefOr[/* index */ scala.Double], 
    /* operation */ js.UndefOr[/* operation */ js.Any], 
    /* tree */ js.UndefOr[/* tree */ js.Any], 
    fastDashJsonDashPatchLib.libHelpersMod.PatchError
  ] = js.native
  val deepClone: js.Function1[/* obj */ js.Any, js.Any] = js.native
  def applyOperation[T](document: T, operation: Operation): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator[T]): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator[T], mutateDocument: scala.Boolean): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: scala.Boolean): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: scala.Boolean, mutateDocument: scala.Boolean): OperationResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation]): PatchResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator[T]): PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator[T],
    mutateDocument: scala.Boolean
  ): PatchResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: scala.Boolean): PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: scala.Boolean,
    mutateDocument: scala.Boolean
  ): PatchResult[T] = js.native
  def applyReducer[T](document: T, operation: Operation): T = js.native
  def getValueByPointer(document: js.Any, pointer: java.lang.String): js.Any = js.native
  def validate[T](sequence: js.Array[Operation]): fastDashJsonDashPatchLib.libHelpersMod.PatchError = js.native
  def validate[T](sequence: js.Array[Operation], document: T): fastDashJsonDashPatchLib.libHelpersMod.PatchError = js.native
  def validate[T](sequence: js.Array[Operation], document: T, externalValidator: Validator[T]): fastDashJsonDashPatchLib.libHelpersMod.PatchError = js.native
  def validator(operation: Operation, index: scala.Double): scala.Unit = js.native
  def validator(operation: Operation, index: scala.Double, document: js.Any): scala.Unit = js.native
  def validator(
    operation: Operation,
    index: scala.Double,
    document: js.Any,
    existingPathFragment: java.lang.String
  ): scala.Unit = js.native
}

