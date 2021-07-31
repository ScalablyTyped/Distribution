package typings.fastJsonPatch

import org.scalablytyped.runtime.Instantiable5
import typings.fastJsonPatch.fastJsonPatchStrings._get
import typings.fastJsonPatch.fastJsonPatchStrings.add
import typings.fastJsonPatch.fastJsonPatchStrings.copy
import typings.fastJsonPatch.fastJsonPatchStrings.move
import typings.fastJsonPatch.fastJsonPatchStrings.remove
import typings.fastJsonPatch.fastJsonPatchStrings.replace
import typings.fastJsonPatch.fastJsonPatchStrings.test
import typings.fastJsonPatch.moduleHelpersMod.JsonPatchErrorName
import typings.fastJsonPatch.moduleHelpersMod.PatchError
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleCoreMod {
  
  @JSImport("fast-json-patch/module/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("fast-json-patch/module/core", "JsonPatchError")
  @js.native
  class JsonPatchError protected () extends PatchError {
    def this(message: String, name: JsonPatchErrorName) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Unit, operation: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any, tree: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: Unit, tree: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Unit, operation: js.Any, tree: js.Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Unit, operation: Unit, tree: js.Any) = this()
  }
  @JSImport("fast-json-patch/module/core", "JsonPatchError")
  @js.native
  val JsonPatchError: Instantiable5[
    /* message */ String, 
    /* name */ JsonPatchErrorName, 
    /* index */ js.UndefOr[Double], 
    /* operation */ js.UndefOr[js.Any], 
    /* tree */ js.UndefOr[js.Any], 
    PatchError
  ] = js.native
  
  @scala.inline
  def applyOperation[T](document: T, operation: Operation): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean, mutateDocument: Boolean): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Unit,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](document: T, operation: Operation, validateOperation: Unit, mutateDocument: Boolean): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Boolean,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Unit,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T]): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T], mutateDocument: Boolean): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Unit,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  @scala.inline
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Unit,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  
  @scala.inline
  def applyPatch[T](document: T, patch: js.Array[Operation]): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  @scala.inline
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  @scala.inline
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean, mutateDocument: Boolean): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  @scala.inline
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  @scala.inline
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  @scala.inline
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Unit, mutateDocument: Boolean): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  @scala.inline
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Unit,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  @scala.inline
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Unit,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  @scala.inline
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T]): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  @scala.inline
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T], mutateDocument: Boolean): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  @scala.inline
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  @scala.inline
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator_[T],
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  
  @scala.inline
  def applyReducer[T](document: T, operation: Operation, index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("applyReducer")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def areEquals(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_areEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("fast-json-patch/module/core", "deepClone")
  @js.native
  val deepClone: js.Function1[/* obj */ js.Any, js.Any] = js.native
  
  @scala.inline
  def getValueByPointer(document: js.Any, pointer: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueByPointer")(document.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def validate[T](sequence: js.Array[Operation]): PatchError = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any]).asInstanceOf[PatchError]
  @scala.inline
  def validate[T](sequence: js.Array[Operation], document: T): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[PatchError]
  @scala.inline
  def validate[T](sequence: js.Array[Operation], document: T, externalValidator: Validator_[T]): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any], externalValidator.asInstanceOf[js.Any])).asInstanceOf[PatchError]
  @scala.inline
  def validate[T](sequence: js.Array[Operation], document: Unit, externalValidator: Validator_[T]): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any], externalValidator.asInstanceOf[js.Any])).asInstanceOf[PatchError]
  
  @scala.inline
  def validator(operation: Operation, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def validator(operation: Operation, index: Double, document: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def validator(operation: Operation, index: Double, document: js.Any, existingPathFragment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any], existingPathFragment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def validator(operation: Operation, index: Double, document: Unit, existingPathFragment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any], existingPathFragment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AddOperation[T]
    extends StObject
       with BaseOperation {
    
    var op: add
    
    var value: T
  }
  object AddOperation {
    
    @scala.inline
    def apply[T](path: String, value: T): AddOperation[T] = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOperation[T]]
    }
    
    @scala.inline
    implicit class AddOperationMutableBuilder[Self <: AddOperation[?], T] (val x: Self & AddOperation[T]) extends AnyVal {
      
      @scala.inline
      def setOp(value: add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseOperation extends StObject {
    
    var path: String
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
  
  trait CopyOperation
    extends StObject
       with BaseOperation
       with _Operation {
    
    var from: String
    
    var op: copy
  }
  object CopyOperation {
    
    @scala.inline
    def apply(from: String, path: String): CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
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
  
  trait GetOperation[T]
    extends StObject
       with BaseOperation {
    
    var op: _get
    
    var value: T
  }
  object GetOperation {
    
    @scala.inline
    def apply[T](path: String, value: T): GetOperation[T] = {
      val __obj = js.Dynamic.literal(op = "_get", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOperation[T]]
    }
    
    @scala.inline
    implicit class GetOperationMutableBuilder[Self <: GetOperation[?], T] (val x: Self & GetOperation[T]) extends AnyVal {
      
      @scala.inline
      def setOp(value: _get): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MoveOperation
    extends StObject
       with BaseOperation
       with _Operation {
    
    var from: String
    
    var op: move
  }
  object MoveOperation {
    
    @scala.inline
    def apply(from: String, path: String): MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
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
    - typings.fastJsonPatch.moduleCoreMod.AddOperation[js.Any]
    - typings.fastJsonPatch.moduleCoreMod.RemoveOperation
    - typings.fastJsonPatch.moduleCoreMod.ReplaceOperation[js.Any]
    - typings.fastJsonPatch.moduleCoreMod.MoveOperation
    - typings.fastJsonPatch.moduleCoreMod.CopyOperation
    - typings.fastJsonPatch.moduleCoreMod.TestOperation[js.Any]
    - typings.fastJsonPatch.moduleCoreMod.GetOperation[js.Any]
  */
  type Operation = _Operation | AddOperation[js.Any] | ReplaceOperation[js.Any] | TestOperation[js.Any] | GetOperation[js.Any]
  
  trait OperationResult[T] extends StObject {
    
    var newDocument: T
    
    var removed: js.UndefOr[js.Any] = js.undefined
    
    var test: js.UndefOr[Boolean] = js.undefined
  }
  object OperationResult {
    
    @scala.inline
    def apply[T](newDocument: T): OperationResult[T] = {
      val __obj = js.Dynamic.literal(newDocument = newDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationResult[T]]
    }
    
    @scala.inline
    implicit class OperationResultMutableBuilder[Self <: OperationResult[?], T] (val x: Self & OperationResult[T]) extends AnyVal {
      
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
  trait PatchResult[T]
    extends StObject
       with Array[OperationResult[T]] {
    
    var newDocument: T = js.native
  }
  
  trait RemoveOperation
    extends StObject
       with BaseOperation
       with _Operation {
    
    var op: remove
  }
  object RemoveOperation {
    
    @scala.inline
    def apply(path: String): RemoveOperation = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveOperation]
    }
    
    @scala.inline
    implicit class RemoveOperationMutableBuilder[Self <: RemoveOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplaceOperation[T]
    extends StObject
       with BaseOperation {
    
    var op: replace
    
    var value: T
  }
  object ReplaceOperation {
    
    @scala.inline
    def apply[T](path: String, value: T): ReplaceOperation[T] = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceOperation[T]]
    }
    
    @scala.inline
    implicit class ReplaceOperationMutableBuilder[Self <: ReplaceOperation[?], T] (val x: Self & ReplaceOperation[T]) extends AnyVal {
      
      @scala.inline
      def setOp(value: replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestOperation[T]
    extends StObject
       with BaseOperation {
    
    var op: test
    
    var value: T
  }
  object TestOperation {
    
    @scala.inline
    def apply[T](path: String, value: T): TestOperation[T] = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestOperation[T]]
    }
    
    @scala.inline
    implicit class TestOperationMutableBuilder[Self <: TestOperation[?], T] (val x: Self & TestOperation[T]) extends AnyVal {
      
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
    def CopyOperation(from: String, path: String): typings.fastJsonPatch.moduleCoreMod.CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonPatch.moduleCoreMod.CopyOperation]
    }
    
    @scala.inline
    def MoveOperation(from: String, path: String): typings.fastJsonPatch.moduleCoreMod.MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonPatch.moduleCoreMod.MoveOperation]
    }
    
    @scala.inline
    def RemoveOperation(path: String): typings.fastJsonPatch.moduleCoreMod.RemoveOperation = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonPatch.moduleCoreMod.RemoveOperation]
    }
  }
}
