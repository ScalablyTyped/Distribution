package typings.fastDashJsonDashPatch.fastDashJsonDashPatchMod

import org.scalablytyped.runtime.Instantiable5
import typings.fastDashJsonDashPatch.Anon_ApplyOperation
import typings.fastDashJsonDashPatch.Fn_Callback
import typings.fastDashJsonDashPatch.Fn_Invertible
import typings.fastDashJsonDashPatch.Fn_Observer
import typings.fastDashJsonDashPatch.libCoreMod.Operation
import typings.fastDashJsonDashPatch.libCoreMod.OperationResult
import typings.fastDashJsonDashPatch.libCoreMod.PatchResult
import typings.fastDashJsonDashPatch.libCoreMod.Validator
import typings.fastDashJsonDashPatch.libHelpersMod.JsonPatchErrorName
import typings.fastDashJsonDashPatch.libHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in defaultNs */
@JSImport("fast-json-patch", JSImport.Default)
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
  @JSName("compare")
  var compare_Original: js.Function3[
    /* tree1 */ js.Object | js.Array[_], 
    /* tree2 */ js.Object | js.Array[_], 
    /* invertible */ js.UndefOr[Boolean], 
    js.Array[Operation]
  ] = js.native
  @JSName("deepClone")
  var deepClone_Original: js.Function1[/* obj */ js.Any, _] = js.native
  var default: Anon_ApplyOperation = js.native
  @JSName("escapePathComponent")
  var escapePathComponent_Original: js.Function1[/* path */ String, String] = js.native
  @JSName("generate")
  var generate_Original: Fn_Invertible = js.native
  @JSName("observe")
  var observe_Original: Fn_Callback = js.native
  @JSName("unescapePathComponent")
  var unescapePathComponent_Original: js.Function1[/* path */ String, String] = js.native
  @JSName("unobserve")
  var unobserve_Original: Fn_Observer = js.native
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

