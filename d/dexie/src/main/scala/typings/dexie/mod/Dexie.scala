package typings.dexie.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.dexie.anon.Name
import typings.dexie.anon.`1`
import typings.dexie.dexieStrings.blocked
import typings.dexie.dexieStrings.close
import typings.dexie.dexieStrings.populate
import typings.dexie.dexieStrings.ready
import typings.dexie.dexieStrings.versionchange
import typings.std.ArrayLike
import typings.std.Event
import typings.std.IDBDatabase
import typings.std.IDBTransactionMode
import typings.std.IDBVersionChangeEvent
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dexie
  extends StObject
     with Database {
  
  val _allTables: StringDictionary[Table[Any, IndexableType]] = js.native
  
  def _createTransaction(mode: IDBTransactionMode, storeNames: ArrayLike[String], dbschema: DbSchema): Transaction = js.native
  def _createTransaction(
    mode: IDBTransactionMode,
    storeNames: ArrayLike[String],
    dbschema: DbSchema,
    parentTransaction: Transaction
  ): Transaction = js.native
  
  var _dbSchema: DbSchema = js.native
  
  def backendDB(): IDBDatabase = js.native
  
  def close(): Unit = js.native
  
  val core: DBCore = js.native
  
  def delete(): PromiseExtended[Unit] = js.native
  
  def dynamicallyOpened(): Boolean = js.native
  
  def hasBeenClosed(): Boolean = js.native
  
  def hasFailed(): Boolean = js.native
  
  def isOpen(): Boolean = js.native
  
  def on(eventName: String): DexieEvent = js.native
  @JSName("on")
  var on_Original: DbEvents = js.native
  @JSName("on")
  def on_blocked(eventName: blocked, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, Any]): Unit = js.native
  @JSName("on")
  def on_close(eventName: close, subscriber: js.Function1[/* event */ Event, Any]): Unit = js.native
  @JSName("on")
  def on_populate(eventName: populate, subscriber: js.Function1[/* trans */ Transaction, Any]): Unit = js.native
  @JSName("on")
  def on_ready(eventName: ready, subscriber: js.Function1[/* vipDb */ Dexie, Any]): Unit = js.native
  @JSName("on")
  def on_ready(eventName: ready, subscriber: js.Function1[/* vipDb */ Dexie, Any], bSticky: Boolean): Unit = js.native
  @JSName("on")
  def on_versionchange(eventName: versionchange, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, Any]): Unit = js.native
  
  def open(): PromiseExtended[Dexie] = js.native
  
  def transaction[U](
    mode: TransactionMode,
    table: String,
    scope: js.Function1[/* trans */ Transaction, PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: String,
    table2: String,
    scope: js.Function1[/* trans */ Transaction, PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: String,
    table2: String,
    table3: String,
    scope: js.Function1[/* trans */ Transaction, PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: String,
    table2: String,
    table3: String,
    table4: String,
    scope: js.Function1[/* trans */ Transaction, PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: String,
    table2: String,
    table3: String,
    table4: String,
    table5: String,
    scope: js.Function1[/* trans */ Transaction, PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    tables: js.Array[String | (Table[Any, IndexableType])],
    scope: js.Function1[/* trans */ Transaction, PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[Any, IndexableType],
    scope: js.Function1[/* trans */ Transaction, PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[Any, IndexableType],
    table2: Table[Any, IndexableType],
    scope: js.Function1[/* trans */ Transaction, PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[Any, IndexableType],
    table2: Table[Any, IndexableType],
    table3: Table[Any, IndexableType],
    scope: js.Function1[/* trans */ Transaction, PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[Any, IndexableType],
    table2: Table[Any, IndexableType],
    table3: Table[Any, IndexableType],
    table4: Table[Any, IndexableType],
    scope: js.Function1[/* trans */ Transaction, PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  def transaction[U](
    mode: TransactionMode,
    table: Table[Any, IndexableType],
    table2: Table[Any, IndexableType],
    table3: Table[Any, IndexableType],
    table4: Table[Any, IndexableType],
    table5: Table[Any, IndexableType],
    scope: js.Function1[/* trans */ Transaction, PromiseLike[U] | U]
  ): PromiseExtended[U] = js.native
  
  def unuse(param0: Name): this.type = js.native
  // Add more supported stacks here... : use(middleware: Middleware<HookStack>): this;
  def unuse(param0: Middleware[`1`]): this.type = js.native
  
  def use(middleware: Middleware[DBCore]): this.type = js.native
  
  val verno: Double = js.native
  
  def version(versionNumber: Double): Version = js.native
  
  val vip: Dexie = js.native
}
object Dexie extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "Dexie")
  @js.native
  open class ^ protected ()
    extends StObject
       with Dexie {
    def this(databaseName: String) = this()
    def this(databaseName: String, options: DexieOptions) = this()
  }
  
  @JSImport("dexie", "Dexie")
  @js.native
  val ^ : js.Object & DexieConstructor = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dexie", "Dexie.AbortError")
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
  @JSImport("dexie", "Dexie.BulkError")
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
  @JSImport("dexie", "Dexie.ConstraintError")
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
  @JSImport("dexie", "Dexie.DataCloneError")
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
  @JSImport("dexie", "Dexie.DataError")
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
  @JSImport("dexie", "Dexie.DatabaseClosedError")
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
  @JSImport("dexie", "Dexie.DexieError")
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
  @JSImport("dexie", "Dexie.ForeignAwaitError")
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
  @JSImport("dexie", "Dexie.InternalError")
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
  @JSImport("dexie", "Dexie.InvalidAccessError")
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
  @JSImport("dexie", "Dexie.InvalidArgumentError")
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
  @JSImport("dexie", "Dexie.InvalidStateError")
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
  @JSImport("dexie", "Dexie.InvalidTableError")
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
  @JSImport("dexie", "Dexie.MissingAPIError")
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
  @JSImport("dexie", "Dexie.ModifyError")
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
  @JSImport("dexie", "Dexie.NoSuchDatabaseError")
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
  @JSImport("dexie", "Dexie.NotFoundError")
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
  @JSImport("dexie", "Dexie.OpenFailedError")
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
  @JSImport("dexie", "Dexie.PrematureCommitError")
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
  @JSImport("dexie", "Dexie.Promise")
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
  @JSImport("dexie", "Dexie.QuotaExceededError")
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
  @JSImport("dexie", "Dexie.ReadOnlyError")
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
  @JSImport("dexie", "Dexie.SchemaError")
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
  @JSImport("dexie", "Dexie.SubTransactionError")
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
  @JSImport("dexie", "Dexie.TimeoutError")
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
  @JSImport("dexie", "Dexie.TransactionInactiveError")
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
  @JSImport("dexie", "Dexie.UnknownError")
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
  @JSImport("dexie", "Dexie.UnsupportedError")
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
  @JSImport("dexie", "Dexie.UpgradeError")
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
  @JSImport("dexie", "Dexie.VersionChangeError")
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
  @JSImport("dexie", "Dexie.VersionError")
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
  
  // Because all samples have been Dexie.Table<...>
  // The "Dexie.Collection" interface. Same as named exported interface Collection.
  type Collection[T, Key] = _Collection[T, Key]
  
  // The "Dexie.Promise" type.
  type Promise[T] = PromiseExtended[T]
  
  // Because many samples have been Dexie.Promise.
  // The "Dexie.Table" interface. Same as named exported interface Table.
  type Table[T, Key] = _Table[T, Key]
  
  type _To = js.Object & DexieConstructor
  
  /* This means you don't have to write `^`, but can instead just say `Dexie.foo` */
  override def _to: js.Object & DexieConstructor = ^
}
