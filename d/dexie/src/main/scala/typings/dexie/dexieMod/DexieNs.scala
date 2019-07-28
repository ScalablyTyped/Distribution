package typings.dexie.dexieMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.dexie.Anon_Key
import typings.dexie.Anon_TError
import typings.dexie.Anon_Value
import typings.dexie.IndexableTypeArray
import typings.dexie.IndexableTypeArrayReadonly
import typings.dexie.dexieMod.DexieNs.Collection
import typings.dexie.dexieMod.DexieNs.CreatingHookContext
import typings.dexie.dexieMod.DexieNs.DeletingHookContext
import typings.dexie.dexieMod.DexieNs.DexieError
import typings.dexie.dexieMod.DexieNs.DexieEvent
import typings.dexie.dexieMod.DexieNs.DexieEventSet
import typings.dexie.dexieMod.DexieNs.DexieOnReadyEvent
import typings.dexie.dexieMod.DexieNs.DexiePromiseConstructor
import typings.dexie.dexieMod.DexieNs.DexieVersionChangeEvent
import typings.dexie.dexieMod.DexieNs.IndexSpec
import typings.dexie.dexieMod.DexieNs.Promise
import typings.dexie.dexieMod.DexieNs.Table
import typings.dexie.dexieMod.DexieNs.TableHooks
import typings.dexie.dexieMod.DexieNs.TableSchema
import typings.dexie.dexieMod.DexieNs.Transaction
import typings.dexie.dexieMod.DexieNs.TransactionEvents
import typings.dexie.dexieMod.DexieNs.UpdatingHookContext
import typings.dexie.dexieMod.DexieNs.Version
import typings.dexie.dexieMod.DexieNs.WhereClause
import typings.dexie.dexieStrings.abort
import typings.dexie.dexieStrings.asap
import typings.dexie.dexieStrings.blocked
import typings.dexie.dexieStrings.complete
import typings.dexie.dexieStrings.creating
import typings.dexie.dexieStrings.deleting
import typings.dexie.dexieStrings.error
import typings.dexie.dexieStrings.populate
import typings.dexie.dexieStrings.reading
import typings.dexie.dexieStrings.ready
import typings.dexie.dexieStrings.updating
import typings.dexie.dexieStrings.versionchange
import typings.std.Error
import typings.std.IDBTransaction
import typings.std.IDBVersionChangeEvent
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie")
@js.native
object DexieNs extends js.Object {
  @js.native
  class AbortError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class BulkError () extends DexieError {
    def this(msg: String) = this()
    def this(msg: String, failures: js.Array[_]) = this()
    var failures: js.Array[_] = js.native
  }
  
  @js.native
  trait Collection[T, Key] extends js.Object {
    def and(filter: js.Function1[/* x */ T, Boolean]): Collection[T, Key] = js.native
    def clone(props: js.Object): Collection[T, Key] = js.native
    def count(): Promise[Double] = js.native
    def count[R](thenShortcut: ThenShortcut[Double, R]): Promise[R] = js.native
    // Mutating methods
    def delete(): Promise[Double] = js.native
    def distinct(): Collection[T, Key] = js.native
    def each(callback: js.Function2[/* obj */ T, /* cursor */ Anon_Key[Key], _]): Promise[Unit] = js.native
    def eachKey(callback: js.Function2[/* key */ IndexableType, /* cursor */ Anon_Key[Key], _]): Promise[Unit] = js.native
    def eachPrimaryKey(callback: js.Function2[/* key */ Key, /* cursor */ Anon_Key[Key], _]): Promise[Unit] = js.native
    def eachUniqueKey(callback: js.Function2[/* key */ IndexableType, /* cursor */ Anon_Key[Key], _]): Promise[Unit] = js.native
    def filter(filter: js.Function1[/* x */ T, Boolean]): Collection[T, Key] = js.native
    def first(): Promise[js.UndefOr[T]] = js.native
    def first[R](thenShortcut: ThenShortcut[js.UndefOr[T], R]): Promise[R] = js.native
    def keys(): Promise[IndexableTypeArray] = js.native
    def keys[R](thenShortcut: ThenShortcut[IndexableTypeArray, R]): Promise[R] = js.native
    def last(): Promise[js.UndefOr[T]] = js.native
    def last[R](thenShortcut: ThenShortcut[js.UndefOr[T], R]): Promise[R] = js.native
    def limit(n: Double): Collection[T, Key] = js.native
    def modify(changeCallback: js.Function2[/* obj */ T, /* ctx */ Anon_Value[T], Unit]): Promise[Double] = js.native
    def modify(changes: StringDictionary[js.Any]): Promise[Double] = js.native
    def offset(n: Double): Collection[T, Key] = js.native
    def or(indexOrPrimayKey: String): WhereClause[T, Key] = js.native
    def primaryKeys(): Promise[js.Array[Key]] = js.native
    def primaryKeys[R](thenShortcut: ThenShortcut[js.Array[Key], R]): Promise[R] = js.native
    def raw(): Collection[T, Key] = js.native
    def reverse(): Collection[T, Key] = js.native
    def sortBy(keyPath: String): Promise[js.Array[T]] = js.native
    def sortBy[R](keyPath: String, thenShortcut: ThenShortcut[js.Array[T], R]): Promise[R] = js.native
    def toArray(): Promise[js.Array[T]] = js.native
    def toArray[R](thenShortcut: ThenShortcut[js.Array[T], R]): Promise[R] = js.native
    def uniqueKeys(): Promise[IndexableTypeArray] = js.native
    def uniqueKeys[R](thenShortcut: ThenShortcut[IndexableTypeArray, R]): Promise[R] = js.native
    def until(filter: js.Function1[/* value */ T, Boolean]): Collection[T, Key] = js.native
    def until(filter: js.Function1[/* value */ T, Boolean], includeStopEntry: Boolean): Collection[T, Key] = js.native
  }
  
  @js.native
  class ConstraintError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  trait CreatingHookContext[T, Key] extends js.Object {
    var onerror: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
    var onsuccess: js.UndefOr[js.Function1[/* primKey */ Key, Unit]] = js.undefined
  }
  
  @js.native
  class DataCloneError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class DataError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class DatabaseClosedError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  trait DbEvents extends DexieEventSet {
    var blocked: DexieEvent = js.native
    var populate: DexieEvent = js.native
    var ready: DexieOnReadyEvent = js.native
    var versionchange: DexieVersionChangeEvent = js.native
    def apply(eventName: blocked, subscriber: js.Function0[_]): Unit = js.native
    def apply(eventName: populate, subscriber: js.Function0[_]): Unit = js.native
    def apply(eventName: ready, subscriber: js.Function0[_]): Unit = js.native
    def apply(eventName: ready, subscriber: js.Function0[_], bSticky: Boolean): Unit = js.native
    def apply(eventName: versionchange, subscriber: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit = js.native
  }
  
  trait DeletingHookContext[T, Key] extends js.Object {
    var onerror: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
    var onsuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  
  @js.native
  class DexieError () extends Error {
    def this(name: String) = this()
    def this(name: String, message: String) = this()
    var inner: js.Any = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    @JSName("stack")
    var stack_DexieError: String = js.native
  }
  
  trait DexieErrorEvent extends js.Object {
    def fire(error: js.Any): js.Any
    def subscribe(fn: js.Function1[/* error */ js.Any, _]): Unit
    def unsubscribe(fn: js.Function1[/* error */ js.Any, _]): Unit
  }
  
  trait DexieEvent extends js.Object {
    var subscribers: js.Array[js.Function]
    def fire(args: js.Any*): js.Any
    def subscribe(fn: js.Function1[/* repeated */ js.Any, _]): Unit
    def unsubscribe(fn: js.Function1[/* repeated */ js.Any, _]): Unit
  }
  
  @js.native
  trait DexieEventSet extends js.Object {
    def apply(eventName: String): DexieEvent = js.native
     // To be able to unsubscribe.
    def addEventType(eventName: String): DexieEvent = js.native
    def addEventType(
      eventName: String,
      chainFunction: js.Function2[/* f1 */ js.Function, /* f2 */ js.Function, js.Function]
    ): DexieEvent = js.native
    def addEventType(
      eventName: String,
      chainFunction: js.Function2[/* f1 */ js.Function, /* f2 */ js.Function, js.Function],
      defaultFunction: js.Function
    ): DexieEvent = js.native
    @JSName("addEventType")
    def addEventType_asap(
      events: StringDictionary[
          asap | (js.Tuple2[js.Function2[/* f1 */ js.Function, /* f2 */ js.Function, js.Function], js.Function])
        ]
    ): DexieEvent = js.native
  }
  
  trait DexieOnReadyEvent extends js.Object {
    def fire(): js.Any
    def subscribe(fn: js.Function0[_], bSticky: Boolean): Unit
    def unsubscribe(fn: js.Function0[_]): Unit
  }
  
  @js.native
  trait DexiePromiseConstructor
    extends Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          Promise[js.Object]
        ] {
    def all[T](values: js.Array[T | js.Thenable[T]]): Promise[js.Array[T]] = js.native
    // From lib.es6.d.ts:
    def all[TAll](values: Iterable[TAll | js.Thenable[TAll]]): Promise[js.Array[TAll]] = js.native
    def all[T1, T2](values: js.Tuple2[T1 | js.Thenable[T1], T2 | js.Thenable[T2]]): Promise[js.Tuple2[T1, T2]] = js.native
    def all[T1, T2, T3](values: js.Tuple3[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3]]): Promise[js.Tuple3[T1, T2, T3]] = js.native
    def all[T1, T2, T3, T4](
      values: js.Tuple4[T1 | js.Thenable[T1], T2 | js.Thenable[T2], T3 | js.Thenable[T3], T4 | js.Thenable[T4]]
    ): Promise[js.Tuple4[T1, T2, T3, T4]] = js.native
    def all[T1, T2, T3, T4, T5](
      values: js.Tuple5[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5]
        ]
    ): Promise[js.Tuple5[T1, T2, T3, T4, T5]] = js.native
    def all[T1, T2, T3, T4, T5, T6](
      values: js.Tuple6[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6]
        ]
    ): Promise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7](
      values: js.Tuple7[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7]
        ]
    ): Promise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8](
      values: js.Tuple8[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8]
        ]
    ): Promise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      values: js.Tuple9[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9]
        ]
    ): Promise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = js.native
    def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      values: js.Tuple10[
          T1 | js.Thenable[T1], 
          T2 | js.Thenable[T2], 
          T3 | js.Thenable[T3], 
          T4 | js.Thenable[T4], 
          T5 | js.Thenable[T5], 
          T6 | js.Thenable[T6], 
          T7 | js.Thenable[T7], 
          T8 | js.Thenable[T8], 
          T9 | js.Thenable[T9], 
          T10 | js.Thenable[T10]
        ]
    ): Promise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = js.native
    def race[T](values: Iterable[T | js.Thenable[T]]): Promise[T] = js.native
    def reject(reason: js.Any): Promise[scala.Nothing] = js.native
    @JSName("reject")
    def reject_T[T](reason: js.Any): Promise[T] = js.native
    def resolve(): Promise[Unit] = js.native
    def resolve[T](value: T): Promise[T] = js.native
    def resolve[T](value: js.Thenable[T]): Promise[T] = js.native
  }
  
  trait DexieVersionChangeEvent extends js.Object {
    def fire(event: IDBVersionChangeEvent): js.Any
    def subscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit
    def unsubscribe(fn: js.Function1[/* event */ IDBVersionChangeEvent, _]): Unit
  }
  
  trait IndexSpec extends js.Object {
    var auto: Boolean
    var compound: Boolean
    var keyPath: String | js.Array[String]
    var multi: Boolean
    var name: String
    var src: String
    var unique: Boolean
  }
  
  @js.native
  class InternalError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidAccessError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidArgumentError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidStateError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidTableError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class MissingAPIError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class ModifyError () extends DexieError {
    def this(msg: String) = this()
    def this(msg: String, failures: js.Array[_]) = this()
    def this(msg: String, failures: js.Array[_], successCount: Double) = this()
    def this(msg: String, failures: js.Array[_], successCount: Double, failedKeys: IndexableTypeArrayReadonly) = this()
    var failedKeys: IndexableTypeArrayReadonly = js.native
    var failures: js.Array[_] = js.native
    var successCount: Double = js.native
  }
  
  @js.native
  class NoSuchDatabaseError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class NotFoundError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class OpenFailedError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  trait Promise[T] extends js.Object {
    @JSName(scala.scalajs.js.Symbol.toStringTag)
    val toStringTag: typings.dexie.dexieStrings.Promise = js.native
    def `catch`(): Promise[T] = js.native
    /**
      * Catch errors where error => error.name === errorName. Other errors will remain uncaught.
      * 
      * @param errorName Name of the type of error to catch such as 'RangeError', 'TypeError', 'DatabaseClosedError', etc.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    def `catch`(errorName: String, onrejected: js.Function1[/* reason */ Error, T | js.Thenable[T]]): Promise[T] = js.native
    def `catch`(onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]): Promise[T] = js.native
    /**
      * Catch errors where error => error instanceof errorConstructor. Other errors will remain uncaught.
      * 
      * @param errorConstructor Type of error to catch such as RangeError, TypeError, etc.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    def `catch`[TError](
      errorConstructor: Anon_TError[TError],
      onrejected: js.Function1[/* reason */ TError, T | js.Thenable[T]]
    ): Promise[T] = js.native
    // Extended methods provided by Dexie.Promise:
    /**
      * Catch errors where error => error.name === errorName. Other errors will remain uncaught.
      * 
      * @param errorName Name of the type of error to catch such as 'RangeError', 'TypeError', 'DatabaseClosedError', etc.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    @JSName("catch")
    def catch_TResult[TResult](errorName: String, onrejected: js.Function1[/* reason */ Error, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
    @JSName("catch")
    def catch_TResult[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
    /**
      * Catch errors where error => error instanceof errorConstructor. Other errors will remain uncaught.
      * 
      * @param errorConstructor Type of error to catch such as RangeError, TypeError, etc.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    @JSName("catch")
    def catch_TResultTError[TResult, TError](
      errorConstructor: Anon_TError[TError],
      onrejected: js.Function1[/* reason */ TError, TResult | js.Thenable[TResult]]
    ): Promise[T | TResult] = js.native
    /**
      * Attaches a callback to be executed when promise is settled no matter if it was rejected
      * or resolved.
      * 
      * @param onFinally The callback to execute when promise is settled.
      * @returns A Promise for the completion of the callback.
      */
    def `finally`(onFinally: js.Function0[Unit]): Promise[T] = js.native
    // From Promise<T> in lib.es2015.d.ts and lib.es2015.symbol.wellknown.d.ts but with return type Dexie.Promise<T>:
    def `then`(): Promise[T] = js.native
    def `then`(
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]
    ): Promise[T] = js.native
    def `then`(onfulfilled: js.Function1[/* value */ T, T | js.Thenable[T]]): Promise[T] = js.native
    def `then`(
      onfulfilled: js.Function1[/* value */ T, T | js.Thenable[T]],
      onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]
    ): Promise[T] = js.native
    def `then`(onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]): Promise[T] = js.native
    @JSName("then")
    def then_TResult[TResult](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]
    ): Promise[T | TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](onfulfilled: js.Function1[/* value */ T, TResult | js.Thenable[TResult]]): Promise[TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](
      onfulfilled: js.Function1[/* value */ T, T | TResult | (js.Thenable[T | TResult])],
      onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]
    ): Promise[T | TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): Promise[T | TResult] = js.native
    @JSName("then")
    def then_TResult1TResult2[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): Promise[TResult1 | TResult2] = js.native
    /**
      * Apply a timeout limit for the promise. If timeout is reached before promise is settled,
      * the returned promise will reject with an Error object where name='TimeoutError'.
      * 
      * @param milliseconds Number of milliseconds for the timeout.
      * @returns A Promise that will resolve or reject identically to current Promise, but if timeout is reached,
      *          it will reject with TimeoutError.
      */
    def timeout(milliseconds: Double): Promise[T] = js.native
  }
  
  @js.native
  class PromiseCls[T] protected () extends Promise[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
  }
  
  @js.native
  class QuotaExceededError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class ReadOnlyError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class SchemaError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class SubTransactionError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class SyntaxError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  trait Table[T, Key] extends js.Object {
    @JSName("hook")
    var hook_Original: TableHooks[T, Key] = js.native
    var name: String = js.native
    var schema: TableSchema = js.native
    def add(item: T): Promise[Key] = js.native
    def add(item: T, key: Key): Promise[Key] = js.native
    def bulkAdd(items: js.Array[T]): Promise[Key] = js.native
    def bulkAdd(items: js.Array[T], keys: IndexableTypeArrayReadonly): Promise[Key] = js.native
    def bulkDelete(keys: IndexableTypeArrayReadonly): Promise[Unit] = js.native
    def bulkPut(items: js.Array[T]): Promise[Key] = js.native
    def bulkPut(items: js.Array[T], keys: IndexableTypeArrayReadonly): Promise[Key] = js.native
    def clear(): Promise[Unit] = js.native
    def count(): Promise[Double] = js.native
    def count[R](thenShortcut: ThenShortcut[Double, R]): Promise[R] = js.native
    def delete(key: Key): Promise[Unit] = js.native
    def each(callback: js.Function2[/* obj */ T, /* cursor */ Anon_Key[Key], _]): Promise[Unit] = js.native
    def filter(fn: js.Function1[/* obj */ T, Boolean]): Collection[T, Key] = js.native
    def get(equalityCriterias: StringDictionary[IndexableType]): Promise[js.UndefOr[T]] = js.native
    def get(key: Key): Promise[js.UndefOr[T]] = js.native
    def get[R](equalityCriterias: StringDictionary[IndexableType], thenShortcut: ThenShortcut[js.UndefOr[T], R]): Promise[R] = js.native
    def get[R](key: Key, thenShortcut: ThenShortcut[js.UndefOr[T], R]): Promise[R] = js.native
    def hook(eventName: String): DexieEvent = js.native
    @JSName("hook")
    def hook_creating(
      eventName: creating,
      subscriber: js.ThisFunction3[
          /* this */ CreatingHookContext[T, Key], 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): Unit = js.native
    @JSName("hook")
    def hook_deleting(
      eventName: deleting,
      subscriber: js.ThisFunction3[
          /* this */ DeletingHookContext[T, Key], 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): Unit = js.native
    @JSName("hook")
    def hook_reading(eventName: reading, subscriber: js.Function1[/* obj */ T, T | _]): Unit = js.native
    @JSName("hook")
    def hook_updating(
      eventName: updating,
      subscriber: js.ThisFunction4[
          /* this */ UpdatingHookContext[T, Key], 
          /* modifications */ js.Object, 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): Unit = js.native
    def limit(n: Double): Collection[T, Key] = js.native
    def mapToClass(constructor: js.Function): js.Function = js.native
    def offset(n: Double): Collection[T, Key] = js.native
    def orderBy(index: String): Collection[T, Key] = js.native
    def orderBy(index: js.Array[String]): Collection[T, Key] = js.native
    def put(item: T): Promise[Key] = js.native
    def put(item: T, key: Key): Promise[Key] = js.native
    def reverse(): Collection[T, Key] = js.native
    def toArray(): Promise[js.Array[T]] = js.native
    def toArray[R](thenShortcut: ThenShortcut[js.Array[T], R]): Promise[R] = js.native
    def toCollection(): Collection[T, Key] = js.native
    def update(key: Key, changes: StringDictionary[js.Any]): Promise[Double] = js.native
    def where(equalityCriterias: StringDictionary[IndexableType]): Collection[T, Key] = js.native
    def where(index: String): WhereClause[T, Key] = js.native
    def where(index: js.Array[String]): WhereClause[T, Key] = js.native
  }
  
  @js.native
  trait TableHooks[T, Key] extends DexieEventSet {
    var creating: DexieEvent = js.native
    var deleting: DexieEvent = js.native
    var reading: DexieEvent = js.native
    var updating: DexieEvent = js.native
    def apply(
      eventName: creating,
      subscriber: js.ThisFunction3[
          /* this */ CreatingHookContext[T, Key], 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): Unit = js.native
    def apply(
      eventName: deleting,
      subscriber: js.ThisFunction3[
          /* this */ DeletingHookContext[T, Key], 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): Unit = js.native
    def apply(eventName: reading, subscriber: js.Function1[/* obj */ T, T | _]): Unit = js.native
    def apply(
      eventName: updating,
      subscriber: js.ThisFunction4[
          /* this */ UpdatingHookContext[T, Key], 
          /* modifications */ js.Object, 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): Unit = js.native
  }
  
  trait TableSchema extends js.Object {
    var indexes: js.Array[IndexSpec]
    var mappedClass: js.Function
    var name: String
    var primKey: IndexSpec
  }
  
  @js.native
  class TimeoutError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  trait Transaction extends js.Object {
    var active: Boolean = js.native
    var db: Dexie = js.native
    var idbtrans: IDBTransaction = js.native
    var mode: String = js.native
    @JSName("on")
    var on_Original: TransactionEvents = js.native
    var storeNames: js.Array[String] = js.native
    var tables: StringDictionary[Table[_, _]] = js.native
    def abort(): Unit = js.native
    def on(eventName: String): DexieEvent = js.native
    @JSName("on")
    def on_abort(eventName: abort, subscriber: js.Function0[_]): Unit = js.native
    @JSName("on")
    def on_complete(eventName: complete, subscriber: js.Function0[_]): Unit = js.native
    @JSName("on")
    def on_error(eventName: error, subscriber: js.Function1[/* error */ js.Any, _]): Unit = js.native
    def table(tableName: String): Table[_, _] = js.native
    @JSName("table")
    def table_T[T](tableName: String): Table[T, _] = js.native
    @JSName("table")
    def table_TKey[T, Key](tableName: String): Table[T, Key] = js.native
  }
  
  @js.native
  trait TransactionEvents extends DexieEventSet {
    var abort: DexieEvent = js.native
    var complete: DexieEvent = js.native
    var error: DexieEvent = js.native
    def apply(eventName: abort, subscriber: js.Function0[_]): Unit = js.native
    def apply(eventName: complete, subscriber: js.Function0[_]): Unit = js.native
    def apply(eventName: error, subscriber: js.Function1[/* error */ js.Any, _]): Unit = js.native
  }
  
  @js.native
  class TransactionInactiveError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class UnknownError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class UnsupportedError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  trait UpdatingHookContext[T, Key] extends js.Object {
    var onerror: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
    var onsuccess: js.UndefOr[js.Function1[/* updatedObj */ T, Unit]] = js.undefined
  }
  
  @js.native
  class UpgradeError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  trait Version extends js.Object {
    def stores(schema: StringDictionary[String | Null]): Version
    def upgrade(fn: js.Function1[/* trans */ Transaction, Unit]): Version
  }
  
  @js.native
  class VersionChangeError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  class VersionError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: String) = this()
    def this(msg: String, inner: js.Object) = this()
  }
  
  @js.native
  trait WhereClause[T, Key] extends js.Object {
    def above(key: IndexableType): Collection[T, Key] = js.native
    def aboveOrEqual(key: IndexableType): Collection[T, Key] = js.native
    def anyOf(keys: IndexableTypeArray | IndexableTypeArrayReadonly): Collection[T, Key] = js.native
    def anyOfIgnoreCase(keys: String*): Collection[T, Key] = js.native
    def anyOfIgnoreCase(keys: js.Array[String]): Collection[T, Key] = js.native
    def below(key: IndexableType): Collection[T, Key] = js.native
    def belowOrEqual(key: IndexableType): Collection[T, Key] = js.native
    def between(lower: IndexableType, upper: IndexableType): Collection[T, Key] = js.native
    def between(lower: IndexableType, upper: IndexableType, includeLower: Boolean): Collection[T, Key] = js.native
    def between(lower: IndexableType, upper: IndexableType, includeLower: Boolean, includeUpper: Boolean): Collection[T, Key] = js.native
    def equals(key: IndexableType): Collection[T, Key] = js.native
    def equalsIgnoreCase(key: String): Collection[T, Key] = js.native
    def inAnyRange(ranges: js.Array[IndexableTypeArrayReadonly]): Collection[T, Key] = js.native
    def noneOf(keys: js.Array[IndexableType]): Collection[T, Key] = js.native
    def notEqual(key: IndexableType): Collection[T, Key] = js.native
    def startsWith(key: String): Collection[T, Key] = js.native
    def startsWithAnyOf(prefixes: String*): Collection[T, Key] = js.native
    def startsWithAnyOf(prefixes: js.Array[String]): Collection[T, Key] = js.native
    def startsWithAnyOfIgnoreCase(prefixes: String*): Collection[T, Key] = js.native
    def startsWithAnyOfIgnoreCase(prefixes: js.Array[String]): Collection[T, Key] = js.native
    def startsWithIgnoreCase(key: String): Collection[T, Key] = js.native
  }
  
  var Promise: DexiePromiseConstructor = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(IndexSpec, Events) */ var TableSchema: Instantiable0[TableSchema] = js.native
  // errnames - handy spellcheck in switch (error.name) {} cases.        
  @js.native
  object errnames extends js.Object {
    var Abort: typings.dexie.dexieStrings.AbortError = js.native
    var Constraint: typings.dexie.dexieStrings.ConstraintError = js.native
    var Data: typings.dexie.dexieStrings.DataError = js.native
    var DataClone: typings.dexie.dexieStrings.DataCloneError = js.native
    var DatabaseClosed: typings.dexie.dexieStrings.DatabaseClosedError = js.native
    var Internal: typings.dexie.dexieStrings.InternalError = js.native
    var InvalidAccess: typings.dexie.dexieStrings.InvalidAccessError = js.native
    var InvalidArgument: typings.dexie.dexieStrings.InvalidArgumentError = js.native
    var InvalidState: typings.dexie.dexieStrings.InvalidStateError = js.native
    var InvalidTable: typings.dexie.dexieStrings.InvalidTableError = js.native
    var MissingAPI: typings.dexie.dexieStrings.MissingAPIError = js.native
    // Dexie-specific error names:
    var Modify: typings.dexie.dexieStrings.ModifyError = js.native
    var NoSuchDatabase: typings.dexie.dexieStrings.NoSuchDatabaseError = js.native
    var NotFound: typings.dexie.dexieStrings.NotFoundError = js.native
    var OpenFailed: typings.dexie.dexieStrings.OpenFailedError = js.native
    var QuotaExceeded: typings.dexie.dexieStrings.QuotaExceededError = js.native
    var ReadOnly: typings.dexie.dexieStrings.ReadOnlyError = js.native
    var Schema: typings.dexie.dexieStrings.SchemaError = js.native
    var SubTransaction: typings.dexie.dexieStrings.Error = js.native
    var Syntax: typings.dexie.dexieStrings.SyntaxError = js.native
    var Timeout: typings.dexie.dexieStrings.TimeoutError = js.native
    var TransactionInactive: typings.dexie.dexieStrings.TransactionInactiveError = js.native
    // Error names generated by indexedDB:
    var Unknown: typings.dexie.dexieStrings.UnknownError = js.native
    var Unsupported: typings.dexie.dexieStrings.UnsupportedError = js.native
    var Upgrade: typings.dexie.dexieStrings.UpgradeError = js.native
    var Version: typings.dexie.dexieStrings.VersionError = js.native
    var VersionChange: typings.dexie.dexieStrings.VersionChangeError = js.native
  }
  
}

