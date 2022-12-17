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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fast-json-patch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
        /* operation */ js.UndefOr[Any], 
        /* tree */ js.UndefOr[Any], 
        PatchError
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("fast-json-patch", "default.JsonPatchError")
    @js.native
    open class JsonPatchErrorCls protected () extends PatchError {
      def this(message: String, name: JsonPatchErrorName) = this()
      def this(message: String, name: JsonPatchErrorName, index: Double) = this()
      def this(message: String, name: JsonPatchErrorName, index: Double, operation: Any) = this()
      def this(message: String, name: JsonPatchErrorName, index: Unit, operation: Any) = this()
      def this(message: String, name: JsonPatchErrorName, index: Double, operation: Any, tree: Any) = this()
      def this(message: String, name: JsonPatchErrorName, index: Double, operation: Unit, tree: Any) = this()
      def this(message: String, name: JsonPatchErrorName, index: Unit, operation: Any, tree: Any) = this()
      def this(message: String, name: JsonPatchErrorName, index: Unit, operation: Unit, tree: Any) = this()
    }
    
    inline def JsonPatchError_=(
      x: Instantiable5[
          /* message */ String, 
          /* name */ JsonPatchErrorName, 
          /* index */ js.UndefOr[Double], 
          /* operation */ js.UndefOr[Any], 
          /* tree */ js.UndefOr[Any], 
          PatchError
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JsonPatchError")(x.asInstanceOf[js.Any])
    
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
    
    inline def compare(tree1: js.Array[Any], tree2: js.Array[Any]): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    inline def compare(tree1: js.Array[Any], tree2: js.Array[Any], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    inline def compare(tree1: js.Array[Any], tree2: js.Object): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    inline def compare(tree1: js.Array[Any], tree2: js.Object, invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    inline def compare(tree1: js.Object, tree2: js.Array[Any]): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    inline def compare(tree1: js.Object, tree2: js.Array[Any], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    inline def compare(tree1: js.Object, tree2: js.Object): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    inline def compare(tree1: js.Object, tree2: js.Object, invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    
    @JSImport("fast-json-patch", "default.deepClone")
    @js.native
    def deepClone: js.Function1[/* obj */ Any, Any] = js.native
    inline def deepClone(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepClone")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def deepClone_=(x: js.Function1[/* obj */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deepClone")(x.asInstanceOf[js.Any])
    
    @JSImport("fast-json-patch", "default.escapePathComponent")
    @js.native
    def escapePathComponent: js.Function1[/* path */ String, String] = js.native
    inline def escapePathComponent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapePathComponent")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def escapePathComponent_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapePathComponent")(x.asInstanceOf[js.Any])
    
    inline def generate[T](observer: Observer[js.Object]): js.Array[Operation] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(observer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Operation]]
    inline def generate[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(observer.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    
    inline def getValueByPointer(document: Any, pointer: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueByPointer")(document.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def observe[T](obj: js.Array[T]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
    inline def observe[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
    inline def observe[T](obj: js.Object): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
    inline def observe[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
    
    @JSImport("fast-json-patch", "default.unescapePathComponent")
    @js.native
    def unescapePathComponent: js.Function1[/* path */ String, String] = js.native
    inline def unescapePathComponent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapePathComponent")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unescapePathComponent_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unescapePathComponent")(x.asInstanceOf[js.Any])
    
    inline def unobserve[T](root: T, observer: Observer[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unobserve")(root.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def validate[T](sequence: js.Array[Operation]): PatchError = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any]).asInstanceOf[PatchError]
    inline def validate[T](sequence: js.Array[Operation], document: T): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[PatchError]
    inline def validate[T](sequence: js.Array[Operation], document: T, externalValidator: Validator_[T]): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any], externalValidator.asInstanceOf[js.Any])).asInstanceOf[PatchError]
    inline def validate[T](sequence: js.Array[Operation], document: Unit, externalValidator: Validator_[T]): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any], externalValidator.asInstanceOf[js.Any])).asInstanceOf[PatchError]
    
    inline def validator(operation: Operation, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def validator(operation: Operation, index: Double, document: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def validator(operation: Operation, index: Double, document: Any, existingPathFragment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any], existingPathFragment.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def validator(operation: Operation, index: Double, document: Unit, existingPathFragment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any], existingPathFragment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("fast-json-patch", "JsonPatchError")
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
  
  inline def compare(tree1: js.Array[Any], tree2: js.Array[Any]): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Array[Any], tree2: js.Array[Any], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Array[Any], tree2: js.Object): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Array[Any], tree2: js.Object, invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Object, tree2: js.Array[Any]): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Object, tree2: js.Array[Any], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Object, tree2: js.Object): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  inline def compare(tree1: js.Object, tree2: js.Object, invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  inline def deepClone(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepClone")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def escapePathComponent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapePathComponent")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generate[T](observer: Observer[js.Object]): js.Array[Operation] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(observer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Operation]]
  inline def generate[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(observer.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  inline def getValueByPointer(document: Any, pointer: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueByPointer")(document.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def observe[T](obj: js.Array[T]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  inline def observe[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  inline def observe[T](obj: js.Object): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  inline def observe[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  
  inline def unescapePathComponent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapePathComponent")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unobserve[T](root: T, observer: Observer[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unobserve")(root.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validate[T](sequence: js.Array[Operation]): PatchError = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any]).asInstanceOf[PatchError]
  inline def validate[T](sequence: js.Array[Operation], document: T): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[PatchError]
  inline def validate[T](sequence: js.Array[Operation], document: T, externalValidator: Validator_[T]): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any], externalValidator.asInstanceOf[js.Any])).asInstanceOf[PatchError]
  inline def validate[T](sequence: js.Array[Operation], document: Unit, externalValidator: Validator_[T]): PatchError = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(sequence.asInstanceOf[js.Any], document.asInstanceOf[js.Any], externalValidator.asInstanceOf[js.Any])).asInstanceOf[PatchError]
  
  inline def validator(operation: Operation, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validator(operation: Operation, index: Double, document: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validator(operation: Operation, index: Double, document: Any, existingPathFragment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any], existingPathFragment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validator(operation: Operation, index: Double, document: Unit, existingPathFragment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validator")(operation.asInstanceOf[js.Any], index.asInstanceOf[js.Any], document.asInstanceOf[js.Any], existingPathFragment.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
