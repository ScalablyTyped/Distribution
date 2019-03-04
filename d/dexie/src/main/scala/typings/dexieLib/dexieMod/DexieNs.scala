package typings
package dexieLib.dexieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dexie", "Dexie")
@js.native
object DexieNs extends js.Object {
  @js.native
  class AbortError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class BulkError () extends DexieError {
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, failures: js.Array[_]) = this()
    var failures: js.Array[_] = js.native
  }
  
  @js.native
  trait Collection[T, Key] extends js.Object {
    def and(filter: js.Function1[/* x */ T, scala.Boolean]): Collection[T, Key] = js.native
    def clone(props: js.Object): Collection[T, Key] = js.native
    def count(): Promise[scala.Double] = js.native
    def count[R](thenShortcut: dexieLib.ThenShortcut[scala.Double, R]): Promise[R] = js.native
    // Mutating methods
    def delete(): Promise[scala.Double] = js.native
    def distinct(): Collection[T, Key] = js.native
    def each(callback: js.Function2[/* obj */ T, /* cursor */ dexieLib.Anon_Key[Key], _]): Promise[scala.Unit] = js.native
    def eachKey(
      callback: js.Function2[/* key */ dexieLib.dexieMod.IndexableType, /* cursor */ dexieLib.Anon_Key[Key], _]
    ): Promise[scala.Unit] = js.native
    def eachPrimaryKey(callback: js.Function2[/* key */ Key, /* cursor */ dexieLib.Anon_Key[Key], _]): Promise[scala.Unit] = js.native
    def eachUniqueKey(
      callback: js.Function2[/* key */ dexieLib.dexieMod.IndexableType, /* cursor */ dexieLib.Anon_Key[Key], _]
    ): Promise[scala.Unit] = js.native
    def filter(filter: js.Function1[/* x */ T, scala.Boolean]): Collection[T, Key] = js.native
    def first(): Promise[js.UndefOr[T]] = js.native
    def first[R](thenShortcut: dexieLib.ThenShortcut[js.UndefOr[T], R]): Promise[R] = js.native
    def keys(): Promise[dexieLib.IndexableTypeArray] = js.native
    def keys[R](thenShortcut: dexieLib.ThenShortcut[dexieLib.IndexableTypeArray, R]): Promise[R] = js.native
    def last(): Promise[js.UndefOr[T]] = js.native
    def last[R](thenShortcut: dexieLib.ThenShortcut[js.UndefOr[T], R]): Promise[R] = js.native
    def limit(n: scala.Double): Collection[T, Key] = js.native
    def modify(changeCallback: js.Function2[/* obj */ T, /* ctx */ dexieLib.Anon_Value[T], scala.Unit]): Promise[scala.Double] = js.native
    def modify(changes: org.scalablytyped.runtime.StringDictionary[js.Any]): Promise[scala.Double] = js.native
    def offset(n: scala.Double): Collection[T, Key] = js.native
    def or(indexOrPrimayKey: java.lang.String): WhereClause[T, Key] = js.native
    def primaryKeys(): Promise[js.Array[Key]] = js.native
    def primaryKeys[R](thenShortcut: dexieLib.ThenShortcut[js.Array[Key], R]): Promise[R] = js.native
    def raw(): Collection[T, Key] = js.native
    def reverse(): Collection[T, Key] = js.native
    def sortBy(keyPath: java.lang.String): Promise[js.Array[T]] = js.native
    def sortBy[R](keyPath: java.lang.String, thenShortcut: dexieLib.ThenShortcut[js.Array[T], R]): Promise[R] = js.native
    def toArray(): Promise[js.Array[T]] = js.native
    def toArray[R](thenShortcut: dexieLib.ThenShortcut[js.Array[T], R]): Promise[R] = js.native
    def uniqueKeys(): Promise[dexieLib.IndexableTypeArray] = js.native
    def uniqueKeys[R](thenShortcut: dexieLib.ThenShortcut[dexieLib.IndexableTypeArray, R]): Promise[R] = js.native
    def until(filter: js.Function1[/* value */ T, scala.Boolean]): Collection[T, Key] = js.native
    def until(filter: js.Function1[/* value */ T, scala.Boolean], includeStopEntry: scala.Boolean): Collection[T, Key] = js.native
  }
  
  @js.native
  class ConstraintError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  trait CreatingHookContext[T, Key] extends js.Object {
    var onerror: js.UndefOr[js.Function1[/* err */ js.Any, scala.Unit]] = js.undefined
    var onsuccess: js.UndefOr[js.Function1[/* primKey */ Key, scala.Unit]] = js.undefined
  }
  
  @js.native
  class DataCloneError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class DataError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class DatabaseClosedError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  trait DbEvents extends DexieEventSet {
    var blocked: DexieEvent = js.native
    var populate: DexieEvent = js.native
    var ready: DexieOnReadyEvent = js.native
    var versionchange: DexieVersionChangeEvent = js.native
    def apply(eventName: dexieLib.dexieLibStrings.blocked, subscriber: js.Function0[_]): scala.Unit = js.native
    def apply(eventName: dexieLib.dexieLibStrings.populate, subscriber: js.Function0[_]): scala.Unit = js.native
    def apply(eventName: dexieLib.dexieLibStrings.ready, subscriber: js.Function0[_]): scala.Unit = js.native
    def apply(eventName: dexieLib.dexieLibStrings.ready, subscriber: js.Function0[_], bSticky: scala.Boolean): scala.Unit = js.native
    def apply(
      eventName: dexieLib.dexieLibStrings.versionchange,
      subscriber: js.Function1[/* event */ stdLib.IDBVersionChangeEvent, _]
    ): scala.Unit = js.native
  }
  
  trait DeletingHookContext[T, Key] extends js.Object {
    var onerror: js.UndefOr[js.Function1[/* err */ js.Any, scala.Unit]] = js.undefined
    var onsuccess: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  }
  
  @js.native
  class DexieError ()
    extends stdLib.Error {
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, message: java.lang.String) = this()
    var inner: js.Any = js.native
    /* CompleteClass */
    override var message: java.lang.String = js.native
    /* CompleteClass */
    override var name: java.lang.String = js.native
    @JSName("stack")
    var stack_DexieError: java.lang.String = js.native
  }
  
  trait DexieErrorEvent extends js.Object {
    def fire(error: js.Any): js.Any
    def subscribe(fn: js.Function1[/* error */ js.Any, _]): scala.Unit
    def unsubscribe(fn: js.Function1[/* error */ js.Any, _]): scala.Unit
  }
  
  trait DexieEvent extends js.Object {
    var subscribers: js.Array[js.Function]
    def fire(args: js.Any*): js.Any
    def subscribe(fn: js.Function1[/* repeated */ js.Any, _]): scala.Unit
    def unsubscribe(fn: js.Function1[/* repeated */ js.Any, _]): scala.Unit
  }
  
  @js.native
  trait DexieEventSet extends js.Object {
    def apply(eventName: java.lang.String): DexieEvent = js.native
     // To be able to unsubscribe.
    def addEventType(eventName: java.lang.String): DexieEvent = js.native
    def addEventType(
      eventName: java.lang.String,
      chainFunction: js.Function2[/* f1 */ js.Function, /* f2 */ js.Function, js.Function]
    ): DexieEvent = js.native
    def addEventType(
      eventName: java.lang.String,
      chainFunction: js.Function2[/* f1 */ js.Function, /* f2 */ js.Function, js.Function],
      defaultFunction: js.Function
    ): DexieEvent = js.native
    @JSName("addEventType")
    def addEventType_asap(
      events: org.scalablytyped.runtime.StringDictionary[
          dexieLib.dexieLibStrings.asap | (js.Tuple2[js.Function2[/* f1 */ js.Function, /* f2 */ js.Function, js.Function], js.Function])
        ]
    ): DexieEvent = js.native
  }
  
  trait DexieOnReadyEvent extends js.Object {
    def fire(): js.Any
    def subscribe(fn: js.Function0[_], bSticky: scala.Boolean): scala.Unit
    def unsubscribe(fn: js.Function0[_]): scala.Unit
  }
  
  @js.native
  trait DexiePromiseConstructor
    extends org.scalablytyped.runtime.Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], scala.Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
            scala.Unit
          ], 
          Promise[js.Object]
        ] {
    def all[T](values: js.Array[T | js.Thenable[T]]): Promise[js.Array[T]] = js.native
    // From lib.es6.d.ts:
    def all[TAll](values: stdLib.Iterable[TAll | js.Thenable[TAll]]): Promise[js.Array[TAll]] = js.native
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
    def race[T](values: stdLib.Iterable[T | js.Thenable[T]]): Promise[T] = js.native
    def reject(reason: js.Any): Promise[scala.Nothing] = js.native
    @JSName("reject")
    def reject_T[T](reason: js.Any): Promise[T] = js.native
    def resolve(): Promise[scala.Unit] = js.native
    def resolve[T](value: T): Promise[T] = js.native
    def resolve[T](value: js.Thenable[T]): Promise[T] = js.native
  }
  
  trait DexieVersionChangeEvent extends js.Object {
    def fire(event: stdLib.IDBVersionChangeEvent): js.Any
    def subscribe(fn: js.Function1[/* event */ stdLib.IDBVersionChangeEvent, _]): scala.Unit
    def unsubscribe(fn: js.Function1[/* event */ stdLib.IDBVersionChangeEvent, _]): scala.Unit
  }
  
  trait IndexSpec extends js.Object {
    var auto: scala.Boolean
    var compound: scala.Boolean
    var keyPath: java.lang.String | js.Array[java.lang.String]
    var multi: scala.Boolean
    var name: java.lang.String
    var src: java.lang.String
    var unique: scala.Boolean
  }
  
  @js.native
  class InternalError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidAccessError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidArgumentError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidStateError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class InvalidTableError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class MissingAPIError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class ModifyError () extends DexieError {
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, failures: js.Array[_]) = this()
    def this(msg: java.lang.String, failures: js.Array[_], successCount: scala.Double) = this()
    def this(msg: java.lang.String, failures: js.Array[_], successCount: scala.Double, failedKeys: dexieLib.IndexableTypeArrayReadonly) = this()
    var failedKeys: dexieLib.IndexableTypeArrayReadonly = js.native
    var failures: js.Array[_] = js.native
    var successCount: scala.Double = js.native
  }
  
  @js.native
  class NoSuchDatabaseError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class NotFoundError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class OpenFailedError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  trait Promise[T] extends js.Object {
    @JSName(org.scalablytyped.runtime.Symbol.toStringTag)
    val toStringTag: dexieLib.dexieLibStrings.Promise = js.native
    def `catch`(): Promise[T] = js.native
    /**
      * Catch errors where error => error.name === errorName. Other errors will remain uncaught.
      * 
      * @param errorName Name of the type of error to catch such as 'RangeError', 'TypeError', 'DatabaseClosedError', etc.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    def `catch`(
      errorName: java.lang.String,
      onrejected: js.Function1[/* reason */ stdLib.Error, T | js.Thenable[T]]
    ): Promise[T] = js.native
    def `catch`(onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]): Promise[T] = js.native
    /**
      * Catch errors where error => error instanceof errorConstructor. Other errors will remain uncaught.
      * 
      * @param errorConstructor Type of error to catch such as RangeError, TypeError, etc.
      * @param onrejected The callback to execute when the Promise is rejected.
      * @returns A Promise for the completion of the callback.
      */
    def `catch`[TError](
      errorConstructor: dexieLib.Anon_TError[TError],
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
    def catch_TResult[TResult](
      errorName: java.lang.String,
      onrejected: js.Function1[/* reason */ stdLib.Error, TResult | js.Thenable[TResult]]
    ): Promise[T | TResult] = js.native
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
      errorConstructor: dexieLib.Anon_TError[TError],
      onrejected: js.Function1[/* reason */ TError, TResult | js.Thenable[TResult]]
    ): Promise[T | TResult] = js.native
    /**
      * Attaches a callback to be executed when promise is settled no matter if it was rejected
      * or resolved.
      * 
      * @param onFinally The callback to execute when promise is settled.
      * @returns A Promise for the completion of the callback.
      */
    def `finally`(onFinally: js.Function0[scala.Unit]): Promise[T] = js.native
    // From Promise<T> in lib.es2015.d.ts and lib.es2015.symbol.wellknown.d.ts but with return type Dexie.Promise<T>:
    def `then`(): Promise[T] = js.native
    def `then`(onfulfilled: js.Function1[/* value */ T, T | js.Thenable[T]]): Promise[T] = js.native
    def `then`(
      onfulfilled: js.Function1[/* value */ T, T | js.Thenable[T]],
      onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]
    ): Promise[T] = js.native
    def `then`(
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]
    ): Promise[T] = js.native
    def `then`(onfulfilled: scala.Null, onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T]]): Promise[T] = js.native
    @JSName("then")
    def then_TResult[TResult](onfulfilled: js.Function1[/* value */ T, TResult | js.Thenable[TResult]]): Promise[TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](
      onfulfilled: js.Function1[/* value */ T, T | TResult | js.Thenable[T] | js.Thenable[TResult]],
      onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]
    ): Promise[T | TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]
    ): Promise[T | TResult] = js.native
    @JSName("then")
    def then_TResult[TResult](
      onfulfilled: scala.Null,
      onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]
    ): Promise[T | TResult] = js.native
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
    def timeout(milliseconds: scala.Double): Promise[T] = js.native
  }
  
  @js.native
  class QuotaExceededError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class ReadOnlyError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class SchemaError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class SubTransactionError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class SyntaxError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  trait Table[T, Key] extends js.Object {
    @JSName("hook")
    var hook_Original: TableHooks[T, Key] = js.native
    var name: java.lang.String = js.native
    var schema: TableSchema = js.native
    def add(item: T): Promise[Key] = js.native
    def add(item: T, key: Key): Promise[Key] = js.native
    def bulkAdd(items: js.Array[T]): Promise[Key] = js.native
    def bulkAdd(items: js.Array[T], keys: dexieLib.IndexableTypeArrayReadonly): Promise[Key] = js.native
    def bulkDelete(keys: dexieLib.IndexableTypeArrayReadonly): Promise[scala.Unit] = js.native
    def bulkPut(items: js.Array[T]): Promise[Key] = js.native
    def bulkPut(items: js.Array[T], keys: dexieLib.IndexableTypeArrayReadonly): Promise[Key] = js.native
    def clear(): Promise[scala.Unit] = js.native
    def count(): Promise[scala.Double] = js.native
    def count[R](thenShortcut: dexieLib.ThenShortcut[scala.Double, R]): Promise[R] = js.native
    def delete(key: Key): Promise[scala.Unit] = js.native
    def each(callback: js.Function2[/* obj */ T, /* cursor */ dexieLib.Anon_Key[Key], _]): Promise[scala.Unit] = js.native
    def filter(fn: js.Function1[/* obj */ T, scala.Boolean]): Collection[T, Key] = js.native
    def get(equalityCriterias: org.scalablytyped.runtime.StringDictionary[dexieLib.dexieMod.IndexableType]): Promise[js.UndefOr[T]] = js.native
    def get(key: Key): Promise[js.UndefOr[T]] = js.native
    def get[R](
      equalityCriterias: org.scalablytyped.runtime.StringDictionary[dexieLib.dexieMod.IndexableType],
      thenShortcut: dexieLib.ThenShortcut[js.UndefOr[T], R]
    ): Promise[R] = js.native
    def get[R](key: Key, thenShortcut: dexieLib.ThenShortcut[js.UndefOr[T], R]): Promise[R] = js.native
    def hook(eventName: java.lang.String): DexieEvent = js.native
    @JSName("hook")
    def hook_creating(
      eventName: dexieLib.dexieLibStrings.creating,
      subscriber: js.ThisFunction3[
          /* this */ CreatingHookContext[T, Key], 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): scala.Unit = js.native
    @JSName("hook")
    def hook_deleting(
      eventName: dexieLib.dexieLibStrings.deleting,
      subscriber: js.ThisFunction3[
          /* this */ DeletingHookContext[T, Key], 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): scala.Unit = js.native
    @JSName("hook")
    def hook_reading(eventName: dexieLib.dexieLibStrings.reading, subscriber: js.Function1[/* obj */ T, T | _]): scala.Unit = js.native
    @JSName("hook")
    def hook_updating(
      eventName: dexieLib.dexieLibStrings.updating,
      subscriber: js.ThisFunction4[
          /* this */ UpdatingHookContext[T, Key], 
          /* modifications */ js.Object, 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): scala.Unit = js.native
    def limit(n: scala.Double): Collection[T, Key] = js.native
    def mapToClass(constructor: js.Function): js.Function = js.native
    def offset(n: scala.Double): Collection[T, Key] = js.native
    def orderBy(index: java.lang.String): Collection[T, Key] = js.native
    def orderBy(index: js.Array[java.lang.String]): Collection[T, Key] = js.native
    def put(item: T): Promise[Key] = js.native
    def put(item: T, key: Key): Promise[Key] = js.native
    def reverse(): Collection[T, Key] = js.native
    def toArray(): Promise[js.Array[T]] = js.native
    def toArray[R](thenShortcut: dexieLib.ThenShortcut[js.Array[T], R]): Promise[R] = js.native
    def toCollection(): Collection[T, Key] = js.native
    def update(key: Key, changes: org.scalablytyped.runtime.StringDictionary[js.Any]): Promise[scala.Double] = js.native
    def where(equalityCriterias: org.scalablytyped.runtime.StringDictionary[dexieLib.dexieMod.IndexableType]): Collection[T, Key] = js.native
    def where(index: java.lang.String): WhereClause[T, Key] = js.native
    def where(index: js.Array[java.lang.String]): WhereClause[T, Key] = js.native
  }
  
  @js.native
  trait TableHooks[T, Key] extends DexieEventSet {
    var creating: DexieEvent = js.native
    var deleting: DexieEvent = js.native
    var reading: DexieEvent = js.native
    var updating: DexieEvent = js.native
    def apply(
      eventName: dexieLib.dexieLibStrings.creating,
      subscriber: js.ThisFunction3[
          /* this */ CreatingHookContext[T, Key], 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): scala.Unit = js.native
    def apply(
      eventName: dexieLib.dexieLibStrings.deleting,
      subscriber: js.ThisFunction3[
          /* this */ DeletingHookContext[T, Key], 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): scala.Unit = js.native
    def apply(eventName: dexieLib.dexieLibStrings.reading, subscriber: js.Function1[/* obj */ T, T | _]): scala.Unit = js.native
    def apply(
      eventName: dexieLib.dexieLibStrings.updating,
      subscriber: js.ThisFunction4[
          /* this */ UpdatingHookContext[T, Key], 
          /* modifications */ js.Object, 
          /* primKey */ Key, 
          /* obj */ T, 
          /* transaction */ Transaction, 
          _
        ]
    ): scala.Unit = js.native
  }
  
  trait TableSchema extends js.Object {
    var indexes: js.Array[IndexSpec]
    var mappedClass: js.Function
    var name: java.lang.String
    var primKey: IndexSpec
  }
  
  @js.native
  class TimeoutError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  trait Transaction extends js.Object {
    var active: scala.Boolean = js.native
    var db: dexieLib.dexieMod.Dexie = js.native
    var idbtrans: stdLib.IDBTransaction = js.native
    var mode: java.lang.String = js.native
    @JSName("on")
    var on_Original: TransactionEvents = js.native
    var storeNames: js.Array[java.lang.String] = js.native
    var tables: org.scalablytyped.runtime.StringDictionary[Table[_, _]] = js.native
    def abort(): scala.Unit = js.native
    def on(eventName: java.lang.String): DexieEvent = js.native
    @JSName("on")
    def on_abort(eventName: dexieLib.dexieLibStrings.abort, subscriber: js.Function0[_]): scala.Unit = js.native
    @JSName("on")
    def on_complete(eventName: dexieLib.dexieLibStrings.complete, subscriber: js.Function0[_]): scala.Unit = js.native
    @JSName("on")
    def on_error(eventName: dexieLib.dexieLibStrings.error, subscriber: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
    def table(tableName: java.lang.String): Table[_, _] = js.native
    @JSName("table")
    def table_T[T](tableName: java.lang.String): Table[T, _] = js.native
    @JSName("table")
    def table_TKey[T, Key](tableName: java.lang.String): Table[T, Key] = js.native
  }
  
  @js.native
  trait TransactionEvents extends DexieEventSet {
    var abort: DexieEvent = js.native
    var complete: DexieEvent = js.native
    var error: DexieEvent = js.native
    def apply(eventName: dexieLib.dexieLibStrings.abort, subscriber: js.Function0[_]): scala.Unit = js.native
    def apply(eventName: dexieLib.dexieLibStrings.complete, subscriber: js.Function0[_]): scala.Unit = js.native
    def apply(eventName: dexieLib.dexieLibStrings.error, subscriber: js.Function1[/* error */ js.Any, _]): scala.Unit = js.native
  }
  
  @js.native
  class TransactionInactiveError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class UnknownError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class UnsupportedError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  trait UpdatingHookContext[T, Key] extends js.Object {
    var onerror: js.UndefOr[js.Function1[/* err */ js.Any, scala.Unit]] = js.undefined
    var onsuccess: js.UndefOr[js.Function1[/* updatedObj */ T, scala.Unit]] = js.undefined
  }
  
  @js.native
  class UpgradeError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  trait Version extends js.Object {
    def stores(schema: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]): Version
    def upgrade(fn: js.Function1[/* trans */ Transaction, scala.Unit]): Version
  }
  
  @js.native
  class VersionChangeError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  class VersionError () extends DexieError {
    def this(inner: js.Object) = this()
    def this(msg: java.lang.String) = this()
    def this(msg: java.lang.String, inner: js.Object) = this()
  }
  
  @js.native
  trait WhereClause[T, Key] extends js.Object {
    def above(key: dexieLib.dexieMod.IndexableType): Collection[T, Key] = js.native
    def aboveOrEqual(key: dexieLib.dexieMod.IndexableType): Collection[T, Key] = js.native
    def anyOf(keys: dexieLib.IndexableTypeArray | dexieLib.IndexableTypeArrayReadonly): Collection[T, Key] = js.native
    def anyOfIgnoreCase(keys: java.lang.String*): Collection[T, Key] = js.native
    def anyOfIgnoreCase(keys: js.Array[java.lang.String]): Collection[T, Key] = js.native
    def below(key: dexieLib.dexieMod.IndexableType): Collection[T, Key] = js.native
    def belowOrEqual(key: dexieLib.dexieMod.IndexableType): Collection[T, Key] = js.native
    def between(lower: dexieLib.dexieMod.IndexableType, upper: dexieLib.dexieMod.IndexableType): Collection[T, Key] = js.native
    def between(
      lower: dexieLib.dexieMod.IndexableType,
      upper: dexieLib.dexieMod.IndexableType,
      includeLower: scala.Boolean
    ): Collection[T, Key] = js.native
    def between(
      lower: dexieLib.dexieMod.IndexableType,
      upper: dexieLib.dexieMod.IndexableType,
      includeLower: scala.Boolean,
      includeUpper: scala.Boolean
    ): Collection[T, Key] = js.native
    def equals(key: dexieLib.dexieMod.IndexableType): Collection[T, Key] = js.native
    def equalsIgnoreCase(key: java.lang.String): Collection[T, Key] = js.native
    def inAnyRange(ranges: js.Array[dexieLib.IndexableTypeArrayReadonly]): Collection[T, Key] = js.native
    def noneOf(keys: js.Array[dexieLib.dexieMod.IndexableType]): Collection[T, Key] = js.native
    def notEqual(key: dexieLib.dexieMod.IndexableType): Collection[T, Key] = js.native
    def startsWith(key: java.lang.String): Collection[T, Key] = js.native
    def startsWithAnyOf(prefixes: java.lang.String*): Collection[T, Key] = js.native
    def startsWithAnyOf(prefixes: js.Array[java.lang.String]): Collection[T, Key] = js.native
    def startsWithAnyOfIgnoreCase(prefixes: java.lang.String*): Collection[T, Key] = js.native
    def startsWithAnyOfIgnoreCase(prefixes: js.Array[java.lang.String]): Collection[T, Key] = js.native
    def startsWithIgnoreCase(key: java.lang.String): Collection[T, Key] = js.native
  }
  
  var Promise: DexiePromiseConstructor = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(IndexSpec, Events) */ var TableSchema: org.scalablytyped.runtime.Instantiable0[TableSchema] = js.native
  // errnames - handy spellcheck in switch (error.name) {} cases.        
  var errnames: dexieLib.Anon_Abort = js.native
}

