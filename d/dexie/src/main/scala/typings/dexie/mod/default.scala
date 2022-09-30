package typings.dexie.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", JSImport.Default)
  @js.native
  open class ^ protected ()
    extends StObject
       with Dexie {
    def this(databaseName: String) = this()
    def this(databaseName: String, options: DexieOptions) = this()
  }
  
  @JSImport("dexie", JSImport.Default)
  @js.native
  val ^ : js.Object & DexieConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.BulkError")
  @js.native
  open class BulkError ()
    extends StObject
       with typings.dexie.mod.BulkError {
    def this(msg: String) = this()
    def this(msg: String, failures: NumberDictionary[js.Error]) = this()
    def this(msg: Unit, failures: NumberDictionary[js.Error]) = this()
    
    /* CompleteClass */
    var failures: js.Array[js.Error] = js.native
    
    /* CompleteClass */
    var failuresByPos: NumberDictionary[js.Error] = js.native
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.ConstraintError")
  @js.native
  open class ConstraintError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.DataCloneError")
  @js.native
  open class DataCloneError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.DataError")
  @js.native
  open class DataError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.DatabaseClosedError")
  @js.native
  open class DatabaseClosedError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.DexieError")
  @js.native
  open class DexieError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.ForeignAwaitError")
  @js.native
  open class ForeignAwaitError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.InternalError")
  @js.native
  open class InternalError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.InvalidAccessError")
  @js.native
  open class InvalidAccessError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.InvalidArgumentError")
  @js.native
  open class InvalidArgumentError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.InvalidStateError")
  @js.native
  open class InvalidStateError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.InvalidTableError")
  @js.native
  open class InvalidTableError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.MissingAPIError")
  @js.native
  open class MissingAPIError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.ModifyError")
  @js.native
  open class ModifyError ()
    extends StObject
       with typings.dexie.mod.ModifyError {
    def this(msg: String) = this()
    def this(msg: String, failures: js.Array[Any]) = this()
    def this(msg: Unit, failures: js.Array[Any]) = this()
    def this(msg: String, failures: js.Array[Any], successCount: Double) = this()
    def this(msg: String, failures: Unit, successCount: Double) = this()
    def this(msg: Unit, failures: js.Array[Any], successCount: Double) = this()
    def this(msg: Unit, failures: Unit, successCount: Double) = this()
    def this(msg: String, failures: js.Array[Any], successCount: Double, failedKeys: IndexableTypeArrayReadonly) = this()
    def this(msg: String, failures: js.Array[Any], successCount: Unit, failedKeys: IndexableTypeArrayReadonly) = this()
    def this(msg: String, failures: Unit, successCount: Double, failedKeys: IndexableTypeArrayReadonly) = this()
    def this(msg: String, failures: Unit, successCount: Unit, failedKeys: IndexableTypeArrayReadonly) = this()
    def this(msg: Unit, failures: js.Array[Any], successCount: Double, failedKeys: IndexableTypeArrayReadonly) = this()
    def this(msg: Unit, failures: js.Array[Any], successCount: Unit, failedKeys: IndexableTypeArrayReadonly) = this()
    def this(msg: Unit, failures: Unit, successCount: Double, failedKeys: IndexableTypeArrayReadonly) = this()
    def this(msg: Unit, failures: Unit, successCount: Unit, failedKeys: IndexableTypeArrayReadonly) = this()
    
    /* CompleteClass */
    var failedKeys: IndexableTypeArrayReadonly = js.native
    
    /* CompleteClass */
    var failures: js.Array[Any] = js.native
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
    
    /* CompleteClass */
    var successCount: Double = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.NoSuchDatabaseError")
  @js.native
  open class NoSuchDatabaseError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.NotFoundError")
  @js.native
  open class NotFoundError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.OpenFailedError")
  @js.native
  open class OpenFailedError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.PrematureCommitError")
  @js.native
  open class PrematureCommitError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  // Work-around for different build tools handling default imports differently.
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("dexie", "default.Promise")
  @js.native
  open class PromiseCls[T] protected ()
    extends StObject
       with PromiseExtended[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | PromiseLike[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.QuotaExceededError")
  @js.native
  open class QuotaExceededError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.ReadOnlyError")
  @js.native
  open class ReadOnlyError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.SchemaError")
  @js.native
  open class SchemaError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.SubTransactionError")
  @js.native
  open class SubTransactionError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.TimeoutError")
  @js.native
  open class TimeoutError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.TransactionInactiveError")
  @js.native
  open class TransactionInactiveError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.UnknownError")
  @js.native
  open class UnknownError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.UnsupportedError")
  @js.native
  open class UnsupportedError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.UpgradeError")
  @js.native
  open class UpgradeError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.VersionChangeError")
  @js.native
  open class VersionChangeError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "default.VersionError")
  @js.native
  open class VersionError ()
    extends StObject
       with typings.dexie.mod.DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
    def this(msg: Unit, inner: js.Object) = this()
    
    /* CompleteClass */
    var inner: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  type _To = js.Object & DexieConstructor
  
  /* This means you don't have to write `^`, but can instead just say `default.foo` */
  override def _to: js.Object & DexieConstructor = ^
}
