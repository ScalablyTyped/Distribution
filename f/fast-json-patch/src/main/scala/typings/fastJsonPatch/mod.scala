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
      def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any) = this()
      def this(message: String, name: JsonPatchErrorName, index: Unit, operation: js.Any) = this()
      def this(message: String, name: JsonPatchErrorName, index: Double, operation: js.Any, tree: js.Any) = this()
      def this(message: String, name: JsonPatchErrorName, index: Double, operation: Unit, tree: js.Any) = this()
      def this(message: String, name: JsonPatchErrorName, index: Unit, operation: js.Any, tree: js.Any) = this()
      def this(message: String, name: JsonPatchErrorName, index: Unit, operation: Unit, tree: js.Any) = this()
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
    
    @scala.inline
    def compare(tree1: js.Array[js.Any], tree2: js.Array[js.Any]): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    @scala.inline
    def compare(tree1: js.Array[js.Any], tree2: js.Array[js.Any], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    @scala.inline
    def compare(tree1: js.Array[js.Any], tree2: js.Object): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    @scala.inline
    def compare(tree1: js.Array[js.Any], tree2: js.Object, invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    @scala.inline
    def compare(tree1: js.Object, tree2: js.Array[js.Any]): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    @scala.inline
    def compare(tree1: js.Object, tree2: js.Array[js.Any], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    @scala.inline
    def compare(tree1: js.Object, tree2: js.Object): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    @scala.inline
    def compare(tree1: js.Object, tree2: js.Object, invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    
    @JSImport("fast-json-patch", "default.deepClone")
    @js.native
    def deepClone: js.Function1[/* obj */ js.Any, js.Any] = js.native
    @scala.inline
    def deepClone(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepClone")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def deepClone_=(x: js.Function1[/* obj */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deepClone")(x.asInstanceOf[js.Any])
    
    @JSImport("fast-json-patch", "default.escapePathComponent")
    @js.native
    def escapePathComponent: js.Function1[/* path */ String, String] = js.native
    @scala.inline
    def escapePathComponent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapePathComponent")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def escapePathComponent_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapePathComponent")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def generate[T](observer: Observer[js.Object]): js.Array[Operation] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(observer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Operation]]
    @scala.inline
    def generate[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(observer.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
    
    @scala.inline
    def getValueByPointer(document: js.Any, pointer: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueByPointer")(document.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def observe[T](obj: js.Array[T]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
    @scala.inline
    def observe[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
    @scala.inline
    def observe[T](obj: js.Object): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
    @scala.inline
    def observe[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
    
    @JSImport("fast-json-patch", "default.unescapePathComponent")
    @js.native
    def unescapePathComponent: js.Function1[/* path */ String, String] = js.native
    @scala.inline
    def unescapePathComponent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapePathComponent")(path.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def unescapePathComponent_=(x: js.Function1[/* path */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unescapePathComponent")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def unobserve[T](root: T, observer: Observer[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unobserve")(root.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
  }
  
  @JSImport("fast-json-patch", "JsonPatchError")
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
  
  @scala.inline
  def compare(tree1: js.Array[js.Any], tree2: js.Array[js.Any]): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  @scala.inline
  def compare(tree1: js.Array[js.Any], tree2: js.Array[js.Any], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  @scala.inline
  def compare(tree1: js.Array[js.Any], tree2: js.Object): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  @scala.inline
  def compare(tree1: js.Array[js.Any], tree2: js.Object, invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  @scala.inline
  def compare(tree1: js.Object, tree2: js.Array[js.Any]): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  @scala.inline
  def compare(tree1: js.Object, tree2: js.Array[js.Any], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  @scala.inline
  def compare(tree1: js.Object, tree2: js.Object): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  @scala.inline
  def compare(tree1: js.Object, tree2: js.Object, invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(tree1.asInstanceOf[js.Any], tree2.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  @scala.inline
  def deepClone(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("deepClone")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def escapePathComponent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapePathComponent")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def generate[T](observer: Observer[js.Object]): js.Array[Operation] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(observer.asInstanceOf[js.Any]).asInstanceOf[js.Array[Operation]]
  @scala.inline
  def generate[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(observer.asInstanceOf[js.Any], invertible.asInstanceOf[js.Any])).asInstanceOf[js.Array[Operation]]
  
  @scala.inline
  def getValueByPointer(document: js.Any, pointer: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueByPointer")(document.asInstanceOf[js.Any], pointer.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def observe[T](obj: js.Array[T]): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  @scala.inline
  def observe[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  @scala.inline
  def observe[T](obj: js.Object): Observer[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any]).asInstanceOf[Observer[T]]
  @scala.inline
  def observe[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("observe")(obj.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Observer[T]]
  
  @scala.inline
  def unescapePathComponent(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapePathComponent")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def unobserve[T](root: T, observer: Observer[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unobserve")(root.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
}
