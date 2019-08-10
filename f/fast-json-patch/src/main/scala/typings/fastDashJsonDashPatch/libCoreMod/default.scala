package typings.fastDashJsonDashPatch.libCoreMod

import org.scalablytyped.runtime.Instantiable5
import typings.fastDashJsonDashPatch.Fn_BanPrototypeModifications
import typings.fastDashJsonDashPatch.Fn_BanPrototypeModificationsDocument
import typings.fastDashJsonDashPatch.Fn_Document
import typings.fastDashJsonDashPatch.Fn_DocumentExternalValidator
import typings.fastDashJsonDashPatch.libHelpersMod.JsonPatchErrorName
import typings.fastDashJsonDashPatch.libHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in defaultNs */
@JSImport("fast-json-patch/lib/core", JSImport.Default)
@js.native
object default extends js.Object {
  var JsonPatchError: Instantiable5[
    /* message */ String, 
    /* name */ JsonPatchErrorName, 
    js.UndefOr[/* index */ Double], 
    js.UndefOr[/* operation */ js.Any], 
    js.UndefOr[/* tree */ js.Any], 
    PatchError
  ] = js.native
  @JSName("applyOperation")
  var applyOperation_Original: Fn_BanPrototypeModifications = js.native
  @JSName("applyPatch")
  var applyPatch_Original: Fn_BanPrototypeModificationsDocument = js.native
  @JSName("applyReducer")
  var applyReducer_Original: Fn_Document = js.native
  @JSName("deepClone")
  var deepClone_Original: js.Function1[/* obj */ js.Any, _] = js.native
  @JSName("getValueByPointer")
  var getValueByPointer_Original: js.Function2[/* document */ js.Any, /* pointer */ String, _] = js.native
  @JSName("validate")
  var validate_Original: Fn_DocumentExternalValidator = js.native
  @JSName("validator")
  var validator_Original: js.Function4[
    /* operation */ Operation, 
    /* index */ Double, 
    /* document */ js.UndefOr[js.Any], 
    /* existingPathFragment */ js.UndefOr[String], 
    Unit
  ] = js.native
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
  def deepClone(obj: js.Any): js.Any = js.native
  def getValueByPointer(document: js.Any, pointer: String): js.Any = js.native
  def validate[T](sequence: js.Array[Operation]): PatchError = js.native
  def validate[T](sequence: js.Array[Operation], document: T): PatchError = js.native
  def validate[T](sequence: js.Array[Operation], document: T, externalValidator: Validator[T]): PatchError = js.native
  def validator(operation: Operation, index: Double): Unit = js.native
  def validator(operation: Operation, index: Double, document: js.Any): Unit = js.native
  def validator(operation: Operation, index: Double, document: js.Any, existingPathFragment: String): Unit = js.native
}

