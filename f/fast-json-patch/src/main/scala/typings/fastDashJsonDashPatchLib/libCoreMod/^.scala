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
    validateOperation: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: fastDashJsonDashPatchLib.libCoreMod.Operation,
    validateOperation: scala.Boolean,
    mutateDocument: scala.Boolean
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
    validateOperation: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[fastDashJsonDashPatchLib.libCoreMod.Operation],
    validateOperation: scala.Boolean,
    mutateDocument: scala.Boolean
  ): fastDashJsonDashPatchLib.libCoreMod.PatchResult[T] = js.native
  def applyReducer[T](document: T, operation: fastDashJsonDashPatchLib.libCoreMod.Operation): T = js.native
  def getValueByPointer(document: js.Any, pointer: java.lang.String): js.Any = js.native
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

