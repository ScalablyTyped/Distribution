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
  open class JsonPatchError protected () extends PatchError {
    def this(message: String, name: JsonPatchErrorName) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Unit, operation: Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: Any, tree: Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Double, operation: Unit, tree: Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Unit, operation: Any, tree: Any) = this()
    def this(message: String, name: JsonPatchErrorName, index: Unit, operation: Unit, tree: Any) = this()
  }
  @JSImport("fast-json-patch/module/core", "JsonPatchError")
  @js.native
  val JsonPatchError: Instantiable5[
    /* message */ String, 
    /* name */ JsonPatchErrorName, 
    /* index */ js.UndefOr[Double], 
    /* operation */ js.UndefOr[Any], 
    /* tree */ js.UndefOr[Any], 
    PatchError
  ] = js.native
  
  inline def applyOperation[T](document: T, operation: Operation): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean, mutateDocument: Boolean): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Unit,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](document: T, operation: Operation, validateOperation: Unit, mutateDocument: Boolean): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Boolean,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Unit,
    mutateDocument: Unit,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T]): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T], mutateDocument: Boolean): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Unit,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  inline def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Unit,
    banPrototypeModifications: Unit,
    index: Double
  ): OperationResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOperation")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[OperationResult[T]]
  
  inline def applyPatch[T](document: T, patch: js.Array[Operation]): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  inline def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  inline def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean, mutateDocument: Boolean): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  inline def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  inline def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  inline def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Unit, mutateDocument: Boolean): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  inline def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Unit,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  inline def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Unit,
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  inline def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T]): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  inline def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T], mutateDocument: Boolean): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  inline def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  inline def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator_[T],
    mutateDocument: Unit,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatch")(document.asInstanceOf[js.Any], patch.asInstanceOf[js.Any], validateOperation.asInstanceOf[js.Any], mutateDocument.asInstanceOf[js.Any], banPrototypeModifications.asInstanceOf[js.Any])).asInstanceOf[PatchResult[T]]
  
  inline def applyReducer[T](document: T, operation: Operation, index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("applyReducer")(document.asInstanceOf[js.Any], operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def areEquals(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("_areEquals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("fast-json-patch/module/core", "deepClone")
  @js.native
  val deepClone: js.Function1[/* obj */ Any, Any] = js.native
  
  inline def getValueByPointer(document: Any, pointer: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueByPointer")(document.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def validate[T](sequence: js.Array[Operation]): PatchError = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any]).asInstanceOf[PatchError]
  inline def validate[T](sequence: js.Array[Operation], document: T): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[PatchError]
  inline def validate[T](sequence: js.Array[Operation], document: T, externalValidator: Validator_[T]): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any], externalValidator.asInstanceOf[js.Any])).asInstanceOf[PatchError]
  inline def validate[T](sequence: js.Array[Operation], document: Unit, externalValidator: Validator_[T]): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any], externalValidator.asInstanceOf[js.Any])).asInstanceOf[PatchError]
  
  inline def validator(operation: Operation, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validator(operation: Operation, index: Double, document: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validator(operation: Operation, index: Double, document: Any, existingPathFragment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any], existingPathFragment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validator(operation: Operation, index: Double, document: Unit, existingPathFragment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any], existingPathFragment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait AddOperation[T]
    extends StObject
       with BaseOperation {
    
    var op: add
    
    var value: T
  }
  object AddOperation {
    
    inline def apply[T](path: String, value: T): AddOperation[T] = {
      val __obj = js.Dynamic.literal(op = "add", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddOperation[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddOperation[?], T] (val x: Self & AddOperation[T]) extends AnyVal {
      
      inline def setOp(value: add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait BaseOperation extends StObject {
    
    var path: String
  }
  object BaseOperation {
    
    inline def apply(path: String): BaseOperation = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseOperation] (val x: Self) extends AnyVal {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
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
    
    inline def apply(from: String, path: String): CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CopyOperation] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOp(value: copy): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetOperation[T]
    extends StObject
       with BaseOperation {
    
    var op: _get
    
    var value: T
  }
  object GetOperation {
    
    inline def apply[T](path: String, value: T): GetOperation[T] = {
      val __obj = js.Dynamic.literal(op = "_get", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOperation[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetOperation[?], T] (val x: Self & GetOperation[T]) extends AnyVal {
      
      inline def setOp(value: _get): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    inline def apply(from: String, path: String): MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoveOperation] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setOp(value: move): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastJsonPatch.moduleCoreMod.AddOperation[scala.Any]
    - typings.fastJsonPatch.moduleCoreMod.RemoveOperation
    - typings.fastJsonPatch.moduleCoreMod.ReplaceOperation[scala.Any]
    - typings.fastJsonPatch.moduleCoreMod.MoveOperation
    - typings.fastJsonPatch.moduleCoreMod.CopyOperation
    - typings.fastJsonPatch.moduleCoreMod.TestOperation[scala.Any]
    - typings.fastJsonPatch.moduleCoreMod.GetOperation[scala.Any]
  */
  type Operation = _Operation | AddOperation[Any] | ReplaceOperation[Any] | TestOperation[Any] | GetOperation[Any]
  
  trait OperationResult[T] extends StObject {
    
    var newDocument: T
    
    var removed: js.UndefOr[Any] = js.undefined
    
    var test: js.UndefOr[Boolean] = js.undefined
  }
  object OperationResult {
    
    inline def apply[T](newDocument: T): OperationResult[T] = {
      val __obj = js.Dynamic.literal(newDocument = newDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationResult[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OperationResult[?], T] (val x: Self & OperationResult[T]) extends AnyVal {
      
      inline def setNewDocument(value: T): Self = StObject.set(x, "newDocument", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: Any): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedUndefined: Self = StObject.set(x, "removed", js.undefined)
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
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
    
    inline def apply(path: String): RemoveOperation = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveOperation] (val x: Self) extends AnyVal {
      
      inline def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReplaceOperation[T]
    extends StObject
       with BaseOperation {
    
    var op: replace
    
    var value: T
  }
  object ReplaceOperation {
    
    inline def apply[T](path: String, value: T): ReplaceOperation[T] = {
      val __obj = js.Dynamic.literal(op = "replace", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceOperation[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReplaceOperation[?], T] (val x: Self & ReplaceOperation[T]) extends AnyVal {
      
      inline def setOp(value: replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TestOperation[T]
    extends StObject
       with BaseOperation {
    
    var op: test
    
    var value: T
  }
  object TestOperation {
    
    inline def apply[T](path: String, value: T): TestOperation[T] = {
      val __obj = js.Dynamic.literal(op = "test", path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestOperation[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TestOperation[?], T] (val x: Self & TestOperation[T]) extends AnyVal {
      
      inline def setOp(value: test): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    inline def CopyOperation(from: String, path: String): typings.fastJsonPatch.moduleCoreMod.CopyOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "copy", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonPatch.moduleCoreMod.CopyOperation]
    }
    
    inline def MoveOperation(from: String, path: String): typings.fastJsonPatch.moduleCoreMod.MoveOperation = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], op = "move", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonPatch.moduleCoreMod.MoveOperation]
    }
    
    inline def RemoveOperation(path: String): typings.fastJsonPatch.moduleCoreMod.RemoveOperation = {
      val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.fastJsonPatch.moduleCoreMod.RemoveOperation]
    }
  }
}
