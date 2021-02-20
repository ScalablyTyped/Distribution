package typings.fastJsonPatch

import org.scalablytyped.runtime.Instantiable5
import typings.fastJsonPatch.moduleCoreMod.Operation
import typings.fastJsonPatch.moduleCoreMod.OperationResult
import typings.fastJsonPatch.moduleCoreMod.PatchResult
import typings.fastJsonPatch.moduleCoreMod.Validator_
import typings.fastJsonPatch.moduleDuplexMod.Observer
import typings.fastJsonPatch.moduleHelpersMod.JsonPatchErrorName
import typings.fastJsonPatch.moduleHelpersMod.PatchError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("fast-json-patch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fast-json-patch", "default.JsonPatchError")
    @js.native
    def JsonPatchError: Instantiable5[
        /* message */ String, 
        /* name */ JsonPatchErrorName, 
        /* index */ js.UndefOr[Double], 
        /* operation */ js.UndefOr[js.Any], 
        /* tree */ js.UndefOr[js.Any], 
        PatchError
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("fast-json-patch", "default.JsonPatchError")
    @js.native
    class JsonPatchErrorCls protected () extends PatchError {
      def this(message: String, name: JsonPatchErrorName) = this()
      def this(message: String, name: JsonPatchErrorName, index: Double) = this()
      def this(message: String, name: JsonPatchErrorName, index: js.UndefOr[scala.Nothing], operation: js.Any) = this()
      def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any) = this()
      def this(
        message: String,
        name: JsonPatchErrorName,
        index: js.UndefOr[scala.Nothing],
        operation: js.UndefOr[scala.Nothing],
        tree: js.Any
      ) = this()
      def this(
        message: String,
        name: JsonPatchErrorName,
        index: js.UndefOr[scala.Nothing],
        operation: js.Any,
        tree: js.Any
      ) = this()
      def this(
        message: String,
        name: JsonPatchErrorName,
        index: Double,
        operation: js.UndefOr[scala.Nothing],
        tree: js.Any
      ) = this()
      def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any, tree: js.Any) = this()
    }
    
    @scala.inline
    def JsonPatchError_=(
      x: Instantiable5[
          /* message */ String, 
          /* name */ JsonPatchErrorName, 
          /* index */ js.UndefOr[Double], 
          /* operation */ js.UndefOr[js.Any], 
          /* tree */ js.UndefOr[js.Any], 
          PatchError
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JsonPatchError")(x.asInstanceOf[js.Any])
    
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](document: T, operation: Operation): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: js.UndefOr[scala.Nothing],
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: js.UndefOr[scala.Nothing],
      index: Double
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: js.UndefOr[scala.Nothing],
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: Boolean
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: js.UndefOr[scala.Nothing],
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: Boolean,
      index: Double
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: js.UndefOr[scala.Nothing],
      mutateDocument: Boolean
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: js.UndefOr[scala.Nothing],
      mutateDocument: Boolean,
      banPrototypeModifications: js.UndefOr[scala.Nothing],
      index: Double
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: js.UndefOr[scala.Nothing],
      mutateDocument: Boolean,
      banPrototypeModifications: Boolean
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: js.UndefOr[scala.Nothing],
      mutateDocument: Boolean,
      banPrototypeModifications: Boolean,
      index: Double
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Boolean,
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: js.UndefOr[scala.Nothing],
      index: Double
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Boolean,
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: Boolean
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Boolean,
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: Boolean,
      index: Double
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean, mutateDocument: Boolean): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Boolean,
      mutateDocument: Boolean,
      banPrototypeModifications: js.UndefOr[scala.Nothing],
      index: Double
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Boolean,
      mutateDocument: Boolean,
      banPrototypeModifications: Boolean
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Boolean,
      mutateDocument: Boolean,
      banPrototypeModifications: Boolean,
      index: Double
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T]): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Validator_[T],
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: js.UndefOr[scala.Nothing],
      index: Double
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Validator_[T],
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: Boolean
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Validator_[T],
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: Boolean,
      index: Double
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T], mutateDocument: Boolean): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Validator_[T],
      mutateDocument: Boolean,
      banPrototypeModifications: js.UndefOr[scala.Nothing],
      index: Double
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Validator_[T],
      mutateDocument: Boolean,
      banPrototypeModifications: Boolean
    ): OperationResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyOperation")
    @js.native
    def applyOperation[T](
      document: T,
      operation: Operation,
      validateOperation: Validator_[T],
      mutateDocument: Boolean,
      banPrototypeModifications: Boolean,
      index: Double
    ): OperationResult[T] = js.native
    
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](document: T, patch: js.Array[Operation]): PatchResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](
      document: T,
      patch: js.Array[Operation],
      validateOperation: js.UndefOr[scala.Nothing],
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: Boolean
    ): PatchResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](
      document: T,
      patch: js.Array[Operation],
      validateOperation: js.UndefOr[scala.Nothing],
      mutateDocument: Boolean
    ): PatchResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](
      document: T,
      patch: js.Array[Operation],
      validateOperation: js.UndefOr[scala.Nothing],
      mutateDocument: Boolean,
      banPrototypeModifications: Boolean
    ): PatchResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean): PatchResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](
      document: T,
      patch: js.Array[Operation],
      validateOperation: Boolean,
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: Boolean
    ): PatchResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean, mutateDocument: Boolean): PatchResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](
      document: T,
      patch: js.Array[Operation],
      validateOperation: Boolean,
      mutateDocument: Boolean,
      banPrototypeModifications: Boolean
    ): PatchResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T]): PatchResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](
      document: T,
      patch: js.Array[Operation],
      validateOperation: Validator_[T],
      mutateDocument: js.UndefOr[scala.Nothing],
      banPrototypeModifications: Boolean
    ): PatchResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T], mutateDocument: Boolean): PatchResult[T] = js.native
    @JSImport("fast-json-patch", "default.applyPatch")
    @js.native
    def applyPatch[T](
      document: T,
      patch: js.Array[Operation],
      validateOperation: Validator_[T],
      mutateDocument: Boolean,
      banPrototypeModifications: Boolean
    ): PatchResult[T] = js.native
    
    @JSImport("fast-json-patch", "default.applyReducer")
    @js.native
    def applyReducer[T](document: T, operation: Operation, index: Double): T = js.native
    
    @JSImport("fast-json-patch", "default._areEquals")
    @js.native
    def areEquals(a: js.Any, b: js.Any): Boolean = js.native
    
    @JSImport("fast-json-patch", "default.compare")
    @js.native
    def compare(tree1: js.Array[_], tree2: js.Array[_]): js.Array[Operation] = js.native
    @JSImport("fast-json-patch", "default.compare")
    @js.native
    def compare(tree1: js.Array[_], tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
    @JSImport("fast-json-patch", "default.compare")
    @js.native
    def compare(tree1: js.Array[_], tree2: js.Object): js.Array[Operation] = js.native
    @JSImport("fast-json-patch", "default.compare")
    @js.native
    def compare(tree1: js.Array[_], tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
    @JSImport("fast-json-patch", "default.compare")
    @js.native
    def compare(tree1: js.Object, tree2: js.Array[_]): js.Array[Operation] = js.native
    @JSImport("fast-json-patch", "default.compare")
    @js.native
    def compare(tree1: js.Object, tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
    @JSImport("fast-json-patch", "default.compare")
    @js.native
    def compare(tree1: js.Object, tree2: js.Object): js.Array[Operation] = js.native
    @JSImport("fast-json-patch", "default.compare")
    @js.native
    def compare(tree1: js.Object, tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
    
    @JSImport("fast-json-patch", "default.deepClone")
    @js.native
    def deepClone: js.Function1[/* obj */ js.Any, js.Any] = js.native
    @JSImport("fast-json-patch", "default.deepClone")
    @js.native
    def deepClone(obj: js.Any): js.Any = js.native
    @scala.inline
    def deepClone_=(x: js.Function1[/* obj */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deepClone")(x.asInstanceOf[js.Any])
    
    @JSImport("fast-json-patch", "default.escapePathComponent")
    @js.native
    def escapePathComponent: js.Function1[/* path */ String, String] = js.native
    @JSImport("fast-json-patch", "default.escapePathComponent")
    @js.native
    def escapePathComponent(path: String): String = js.native
    @scala.inline
    def escapePathComponent_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapePathComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("fast-json-patch", "default.generate")
    @js.native
    def generate[T](observer: Observer[js.Object]): js.Array[Operation] = js.native
    @JSImport("fast-json-patch", "default.generate")
    @js.native
    def generate[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = js.native
    
    @JSImport("fast-json-patch", "default.getValueByPointer")
    @js.native
    def getValueByPointer(document: js.Any, pointer: String): js.Any = js.native
    
    @JSImport("fast-json-patch", "default.observe")
    @js.native
    def observe[T](obj: js.Array[T]): Observer[T] = js.native
    @JSImport("fast-json-patch", "default.observe")
    @js.native
    def observe[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
    @JSImport("fast-json-patch", "default.observe")
    @js.native
    def observe[T](obj: js.Object): Observer[T] = js.native
    @JSImport("fast-json-patch", "default.observe")
    @js.native
    def observe[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
    
    @JSImport("fast-json-patch", "default.unescapePathComponent")
    @js.native
    def unescapePathComponent: js.Function1[/* path */ String, String] = js.native
    @JSImport("fast-json-patch", "default.unescapePathComponent")
    @js.native
    def unescapePathComponent(path: String): String = js.native
    @scala.inline
    def unescapePathComponent_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unescapePathComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("fast-json-patch", "default.unobserve")
    @js.native
    def unobserve[T](root: T, observer: Observer[T]): Unit = js.native
    
    @JSImport("fast-json-patch", "default.validate")
    @js.native
    def validate[T](sequence: js.Array[Operation]): PatchError = js.native
    @JSImport("fast-json-patch", "default.validate")
    @js.native
    def validate[T](sequence: js.Array[Operation], document: T): PatchError = js.native
    @JSImport("fast-json-patch", "default.validate")
    @js.native
    def validate[T](sequence: js.Array[Operation], document: T, externalValidator: Validator_[T]): PatchError = js.native
    @JSImport("fast-json-patch", "default.validate")
    @js.native
    def validate[T](
      sequence: js.Array[Operation],
      document: js.UndefOr[scala.Nothing],
      externalValidator: Validator_[T]
    ): PatchError = js.native
    
    @JSImport("fast-json-patch", "default.validator")
    @js.native
    def validator(operation: Operation, index: Double): Unit = js.native
    @JSImport("fast-json-patch", "default.validator")
    @js.native
    def validator(
      operation: Operation,
      index: Double,
      document: js.UndefOr[scala.Nothing],
      existingPathFragment: String
    ): Unit = js.native
    @JSImport("fast-json-patch", "default.validator")
    @js.native
    def validator(operation: Operation, index: Double, document: js.Any): Unit = js.native
    @JSImport("fast-json-patch", "default.validator")
    @js.native
    def validator(operation: Operation, index: Double, document: js.Any, existingPathFragment: String): Unit = js.native
  }
  
  @JSImport("fast-json-patch", "JsonPatchError")
  @js.native
  class JsonPatchError protected () extends PatchError {
    def this(message: String, name: JsonPatchErrorName) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double) = this()
    def this(message: String, name: JsonPatchErrorName, index: js.UndefOr[scala.Nothing], operation: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any) = this()
    def this(
      message: String,
      name: JsonPatchErrorName,
      index: js.UndefOr[scala.Nothing],
      operation: js.UndefOr[scala.Nothing],
      tree: js.Any
    ) = this()
    def this(
      message: String,
      name: JsonPatchErrorName,
      index: js.UndefOr[scala.Nothing],
      operation: js.Any,
      tree: js.Any
    ) = this()
    def this(
      message: String,
      name: JsonPatchErrorName,
      index: Double,
      operation: js.UndefOr[scala.Nothing],
      tree: js.Any
    ) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any, tree: js.Any) = this()
  }
  
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](document: T, operation: Operation): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean,
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean, mutateDocument: Boolean): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T]): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T], mutateDocument: Boolean): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](document: T, patch: js.Array[Operation]): PatchResult[T] = js.native
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean): PatchResult[T] = js.native
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean, mutateDocument: Boolean): PatchResult[T] = js.native
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T]): PatchResult[T] = js.native
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator_[T],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T], mutateDocument: Boolean): PatchResult[T] = js.native
  @JSImport("fast-json-patch", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  
  @JSImport("fast-json-patch", "applyReducer")
  @js.native
  def applyReducer[T](document: T, operation: Operation, index: Double): T = js.native
  
  @JSImport("fast-json-patch", "_areEquals")
  @js.native
  def areEquals(a: js.Any, b: js.Any): Boolean = js.native
  
  @JSImport("fast-json-patch", "compare")
  @js.native
  def compare(tree1: js.Array[_], tree2: js.Array[_]): js.Array[Operation] = js.native
  @JSImport("fast-json-patch", "compare")
  @js.native
  def compare(tree1: js.Array[_], tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
  @JSImport("fast-json-patch", "compare")
  @js.native
  def compare(tree1: js.Array[_], tree2: js.Object): js.Array[Operation] = js.native
  @JSImport("fast-json-patch", "compare")
  @js.native
  def compare(tree1: js.Array[_], tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
  @JSImport("fast-json-patch", "compare")
  @js.native
  def compare(tree1: js.Object, tree2: js.Array[_]): js.Array[Operation] = js.native
  @JSImport("fast-json-patch", "compare")
  @js.native
  def compare(tree1: js.Object, tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
  @JSImport("fast-json-patch", "compare")
  @js.native
  def compare(tree1: js.Object, tree2: js.Object): js.Array[Operation] = js.native
  @JSImport("fast-json-patch", "compare")
  @js.native
  def compare(tree1: js.Object, tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
  
  @JSImport("fast-json-patch", "deepClone")
  @js.native
  def deepClone(obj: js.Any): js.Any = js.native
  
  @JSImport("fast-json-patch", "escapePathComponent")
  @js.native
  def escapePathComponent(path: String): String = js.native
  
  @JSImport("fast-json-patch", "generate")
  @js.native
  def generate[T](observer: Observer[js.Object]): js.Array[Operation] = js.native
  @JSImport("fast-json-patch", "generate")
  @js.native
  def generate[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = js.native
  
  @JSImport("fast-json-patch", "getValueByPointer")
  @js.native
  def getValueByPointer(document: js.Any, pointer: String): js.Any = js.native
  
  @JSImport("fast-json-patch", "observe")
  @js.native
  def observe[T](obj: js.Array[T]): Observer[T] = js.native
  @JSImport("fast-json-patch", "observe")
  @js.native
  def observe[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
  @JSImport("fast-json-patch", "observe")
  @js.native
  def observe[T](obj: js.Object): Observer[T] = js.native
  @JSImport("fast-json-patch", "observe")
  @js.native
  def observe[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
  
  @JSImport("fast-json-patch", "unescapePathComponent")
  @js.native
  def unescapePathComponent(path: String): String = js.native
  
  @JSImport("fast-json-patch", "unobserve")
  @js.native
  def unobserve[T](root: T, observer: Observer[T]): Unit = js.native
  
  @JSImport("fast-json-patch", "validate")
  @js.native
  def validate[T](sequence: js.Array[Operation]): PatchError = js.native
  @JSImport("fast-json-patch", "validate")
  @js.native
  def validate[T](sequence: js.Array[Operation], document: T): PatchError = js.native
  @JSImport("fast-json-patch", "validate")
  @js.native
  def validate[T](sequence: js.Array[Operation], document: T, externalValidator: Validator_[T]): PatchError = js.native
  @JSImport("fast-json-patch", "validate")
  @js.native
  def validate[T](
    sequence: js.Array[Operation],
    document: js.UndefOr[scala.Nothing],
    externalValidator: Validator_[T]
  ): PatchError = js.native
  
  @JSImport("fast-json-patch", "validator")
  @js.native
  def validator(operation: Operation, index: Double): Unit = js.native
  @JSImport("fast-json-patch", "validator")
  @js.native
  def validator(
    operation: Operation,
    index: Double,
    document: js.UndefOr[scala.Nothing],
    existingPathFragment: String
  ): Unit = js.native
  @JSImport("fast-json-patch", "validator")
  @js.native
  def validator(operation: Operation, index: Double, document: js.Any): Unit = js.native
  @JSImport("fast-json-patch", "validator")
  @js.native
  def validator(operation: Operation, index: Double, document: js.Any, existingPathFragment: String): Unit = js.native
}
