package typings.fastJsonPatch

import org.scalablytyped.runtime.Instantiable5
import typings.fastJsonPatch.fastJsonPatchStrings._get
import typings.fastJsonPatch.fastJsonPatchStrings.add
import typings.fastJsonPatch.fastJsonPatchStrings.copy
import typings.fastJsonPatch.fastJsonPatchStrings.move
import typings.fastJsonPatch.fastJsonPatchStrings.remove
import typings.fastJsonPatch.fastJsonPatchStrings.replace
import typings.fastJsonPatch.fastJsonPatchStrings.test
import typings.fastJsonPatch.helpersMod.JsonPatchErrorName
import typings.fastJsonPatch.helpersMod.PatchError
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fast-json-patch/commonjs/core", "JsonPatchError")
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
  @JSImport("fast-json-patch/commonjs/core", "JsonPatchError")
  @js.native
  val JsonPatchError: Instantiable5[
    /* message */ String, 
    /* name */ JsonPatchErrorName, 
    /* index */ js.UndefOr[Double], 
    /* operation */ js.UndefOr[js.Any], 
    /* tree */ js.UndefOr[js.Any], 
    PatchError
  ] = js.native
  
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](document: T, operation: Operation): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean,
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean, mutateDocument: Boolean): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T]): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T], mutateDocument: Boolean): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: js.UndefOr[scala.Nothing],
    index: Double
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyOperation")
  @js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](document: T, patch: js.Array[Operation]): PatchResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: js.UndefOr[scala.Nothing],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean): PatchResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean, mutateDocument: Boolean): PatchResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T]): PatchResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator_[T],
    mutateDocument: js.UndefOr[scala.Nothing],
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T], mutateDocument: Boolean): PatchResult[T] = js.native
  @JSImport("fast-json-patch/commonjs/core", "applyPatch")
  @js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  
  @JSImport("fast-json-patch/commonjs/core", "applyReducer")
  @js.native
  def applyReducer[T](document: T, operation: Operation, index: Double): T = js.native
  
  @JSImport("fast-json-patch/commonjs/core", "_areEquals")
  @js.native
  def areEquals(a: js.Any, b: js.Any): Boolean = js.native
  
  @JSImport("fast-json-patch/commonjs/core", "deepClone")
  @js.native
  val deepClone: js.Function1[/* obj */ js.Any, js.Any] = js.native
  
  @JSImport("fast-json-patch/commonjs/core", "getValueByPointer")
  @js.native
  def getValueByPointer(document: js.Any, pointer: String): js.Any = js.native
  
  @JSImport("fast-json-patch/commonjs/core", "validate")
  @js.native
  def validate[T](sequence: js.Array[Operation]): PatchError = js.native
  @JSImport("fast-json-patch/commonjs/core", "validate")
  @js.native
  def validate[T](sequence: js.Array[Operation], document: T): PatchError = js.native
  @JSImport("fast-json-patch/commonjs/core", "validate")
  @js.native
  def validate[T](sequence: js.Array[Operation], document: T, externalValidator: Validator_[T]): PatchError = js.native
  @JSImport("fast-json-patch/commonjs/core", "validate")
  @js.native
  def validate[T](
    sequence: js.Array[Operation],
    document: js.UndefOr[scala.Nothing],
    externalValidator: Validator_[T]
  ): PatchError = js.native
  
  @JSImport("fast-json-patch/commonjs/core", "validator")
  @js.native
  def validator(operation: Operation, index: Double): Unit = js.native
  @JSImport("fast-json-patch/commonjs/core", "validator")
  @js.native
  def validator(
    operation: Operation,
    index: Double,
    document: js.UndefOr[scala.Nothing],
    existingPathFragment: String
  ): Unit = js.native
  @JSImport("fast-json-patch/commonjs/core", "validator")
  @js.native
  def validator(operation: Operation, index: Double, document: js.Any): Unit = js.native
  @JSImport("fast-json-patch/commonjs/core", "validator")
  @js.native
  def validator(operation: Operation, index: Double, document: js.Any, existingPathFragment: String): Unit = js.native
  
  @js.native
  trait AddOperation[T] extends BaseOperation {
    
    var op: add = js.native
    
    var value: T = js.native
  }
  object AddOperation {
    
    @scala.inline
    def apply[T](op: add, path: String, value: T): AddOperation[T] = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOperation[T]]
    }
    
    @scala.inline
    implicit class AddOperationMutableBuilder[Self <: AddOperation[_], T] (val x: Self with AddOperation[T]) extends AnyVal {
      
      @scala.inline
      def setOp(value: add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BaseOperation extends StObject {
    
    var path: String = js.native
  }
  object BaseOperation {
    
    @scala.inline
    def apply(path: String): BaseOperation = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOperation]
    }
    
    @scala.inline
    implicit class BaseOperationMutableBuilder[Self <: BaseOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CopyOperation
    extends BaseOperation
       with _Operation {
    
    var from: String = js.native
    
    var op: copy = js.native
  }
  object CopyOperation {
    
    @scala.inline
    def apply(from: String, op: copy, path: String): CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyOperation]
    }
    
    @scala.inline
    implicit class CopyOperationMutableBuilder[Self <: CopyOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: copy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetOperation[T] extends BaseOperation {
    
    var op: _get = js.native
    
    var value: T = js.native
  }
  object GetOperation {
    
    @scala.inline
    def apply[T](op: _get, path: String, value: T): GetOperation[T] = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOperation[T]]
    }
    
    @scala.inline
    implicit class GetOperationMutableBuilder[Self <: GetOperation[_], T] (val x: Self with GetOperation[T]) extends AnyVal {
      
      @scala.inline
      def setOp(value: _get): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MoveOperation
    extends BaseOperation
       with _Operation {
    
    var from: String = js.native
    
    var op: move = js.native
  }
  object MoveOperation {
    
    @scala.inline
    def apply(from: String, op: move, path: String): MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveOperation]
    }
    
    @scala.inline
    implicit class MoveOperationMutableBuilder[Self <: MoveOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOp(value: move): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastJsonPatch.coreMod.AddOperation[js.Any]
    - typings.fastJsonPatch.coreMod.RemoveOperation
    - typings.fastJsonPatch.coreMod.ReplaceOperation[js.Any]
    - typings.fastJsonPatch.coreMod.MoveOperation
    - typings.fastJsonPatch.coreMod.CopyOperation
    - typings.fastJsonPatch.coreMod.TestOperation[js.Any]
    - typings.fastJsonPatch.coreMod.GetOperation[js.Any]
  */
  type Operation = _Operation | AddOperation[js.Any] | ReplaceOperation[js.Any] | TestOperation[js.Any] | GetOperation[js.Any]
  
  @js.native
  trait OperationResult[T] extends StObject {
    
    var newDocument: T = js.native
    
    var removed: js.UndefOr[js.Any] = js.native
    
    var test: js.UndefOr[Boolean] = js.native
  }
  object OperationResult {
    
    @scala.inline
    def apply[T](newDocument: T): OperationResult[T] = {
      val __obj = js.Dynamic.literal(newDocument = newDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationResult[T]]
    }
    
    @scala.inline
    implicit class OperationResultMutableBuilder[Self <: OperationResult[_], T] (val x: Self with OperationResult[T]) extends AnyVal {
      
      @scala.inline
      def setNewDocument(value: T): Self = StObject.set(x, "newDocument", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoved(value: js.Any): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
      
      @scala.inline
      def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  @js.native
  trait PatchResult[T] extends Array[OperationResult[T]] {
    
    var newDocument: T = js.native
  }
  
  @js.native
  trait RemoveOperation
    extends BaseOperation
       with _Operation {
    
    var op: remove = js.native
  }
  object RemoveOperation {
    
    @scala.inline
    def apply(op: remove, path: String): RemoveOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveOperation]
    }
    
    @scala.inline
    implicit class RemoveOperationMutableBuilder[Self <: RemoveOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReplaceOperation[T] extends BaseOperation {
    
    var op: replace = js.native
    
    var value: T = js.native
  }
  object ReplaceOperation {
    
    @scala.inline
    def apply[T](op: replace, path: String, value: T): ReplaceOperation[T] = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceOperation[T]]
    }
    
    @scala.inline
    implicit class ReplaceOperationMutableBuilder[Self <: ReplaceOperation[_], T] (val x: Self with ReplaceOperation[T]) extends AnyVal {
      
      @scala.inline
      def setOp(value: replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TestOperation[T] extends BaseOperation {
    
    var op: test = js.native
    
    var value: T = js.native
  }
  object TestOperation {
    
    @scala.inline
    def apply[T](op: test, path: String, value: T): TestOperation[T] = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestOperation[T]]
    }
    
    @scala.inline
    implicit class TestOperationMutableBuilder[Self <: TestOperation[_], T] (val x: Self with TestOperation[T]) extends AnyVal {
      
      @scala.inline
      def setOp(value: test): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Validator_[T] = js.Function4[
    /* operation */ Operation, 
    /* index */ Double, 
    /* document */ T, 
    /* existingPathFragment */ String, 
    Unit
  ]
  
  trait _Operation extends StObject
  object _Operation {
    
    @scala.inline
    def CopyOperation(from: String, op: copy, path: String): typings.fastJsonPatch.coreMod.CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonPatch.coreMod.CopyOperation]
    }
    
    @scala.inline
    def MoveOperation(from: String, op: move, path: String): typings.fastJsonPatch.coreMod.MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonPatch.coreMod.MoveOperation]
    }
    
    @scala.inline
    def RemoveOperation(op: remove, path: String): typings.fastJsonPatch.coreMod.RemoveOperation = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonPatch.coreMod.RemoveOperation]
    }
  }
}
