package typings.firebaseDatabaseTypes.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent @firebase/database-types.@firebase/database-types.Reference */
/* Inlined parent std.Pick<std.Promise<@firebase/database-types.@firebase/database-types.Reference>, 'then' | 'catch'> */
@js.native
trait ThenableReference extends js.Object {
  
  def `catch`[TResult](): js.Promise[Reference | TResult] = js.native
  @JSName("catch")
  var catch_Original: js.Function0[js.Promise[Reference | scala.Nothing]] = js.native
  
  def child(path: String): Reference = js.native
  
  def endAt(): Query = js.native
  def endAt(value: String): Query = js.native
  def endAt(value: String, key: String): Query = js.native
  def endAt(value: Boolean): Query = js.native
  def endAt(value: Boolean, key: String): Query = js.native
  def endAt(value: Double): Query = js.native
  def endAt(value: Double, key: String): Query = js.native
  def endAt(value: Null, key: String): Query = js.native
  
  def equalTo(): Query = js.native
  def equalTo(value: String): Query = js.native
  def equalTo(value: String, key: String): Query = js.native
  def equalTo(value: Boolean): Query = js.native
  def equalTo(value: Boolean, key: String): Query = js.native
  def equalTo(value: Double): Query = js.native
  def equalTo(value: Double, key: String): Query = js.native
  def equalTo(value: Null, key: String): Query = js.native
  
  def get(): js.Promise[DataSnapshot] = js.native
  
  def isEqual(): Boolean = js.native
  def isEqual(other: Query): Boolean = js.native
  
  var key: String | Null = js.native
  
  def limitToFirst(limit: Double): Query = js.native
  
  def limitToLast(limit: Double): Query = js.native
  
  def off(): Unit = js.native
  def off(eventType: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Object): Unit = js.native
  def off(
    eventType: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _]
  ): Unit = js.native
  def off(
    eventType: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    context: js.Object
  ): Unit = js.native
  def off(eventType: EventType): Unit = js.native
  def off(eventType: EventType, callback: js.UndefOr[scala.Nothing], context: js.Object): Unit = js.native
  def off(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _]
  ): Unit = js.native
  def off(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    context: js.Object
  ): Unit = js.native
  
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _]
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.Function1[/* a */ Error, _]
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.Function1[/* a */ Error, _],
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.Object
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.Object,
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: Null,
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _] = js.native
  
  def onDisconnect(): OnDisconnect = js.native
  
  def once(eventType: EventType): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: js.Function1[/* a */ Error, Unit]
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: js.Function1[/* a */ Error, Unit],
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: js.Object,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallbackOrContext: Null,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _]
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: js.Function1[/* a */ Error, Unit]
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: js.Function1[/* a */ Error, Unit],
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: js.Object,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  def once(
    eventType: EventType,
    successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    failureCallbackOrContext: Null,
    context: js.Object
  ): js.Promise[DataSnapshot] = js.native
  
  def orderByChild(path: String): Query = js.native
  
  def orderByKey(): Query = js.native
  
  def orderByPriority(): Query = js.native
  
  def orderByValue(): Query = js.native
  
  var parent: Reference | Null = js.native
  
  def push(): ThenableReference = js.native
  def push(value: js.UndefOr[scala.Nothing], onComplete: js.Function1[/* a */ Error | Null, _]): ThenableReference = js.native
  def push(value: js.Any): ThenableReference = js.native
  def push(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, _]): ThenableReference = js.native
  
  var ref: Reference = js.native
  
  def remove(): js.Promise[_] = js.native
  def remove(onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  
  var root: Reference = js.native
  
  def set(value: js.Any): js.Promise[_] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  
  def setPriority(priority: String, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setPriority(priority: Double, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setPriority(priority: Null, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  
  def setWithPriority(newVal: js.Any): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: String): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: String, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Double): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Double, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Null, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  
  def startAt(): Query = js.native
  def startAt(value: String): Query = js.native
  def startAt(value: String, key: String): Query = js.native
  def startAt(value: Boolean): Query = js.native
  def startAt(value: Boolean, key: String): Query = js.native
  def startAt(value: Double): Query = js.native
  def startAt(value: Double, key: String): Query = js.native
  def startAt(value: Null, key: String): Query = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  @JSName("then")
  var then_Original: js.Function0[js.Promise[Reference | scala.Nothing]] = js.native
  
  def toJSON(): js.Object = js.native
  
  def transaction(transactionUpdate: js.Function1[/* a */ js.Any, _]): js.Promise[_] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.UndefOr[scala.Nothing],
    applyLocally: Boolean
  ): js.Promise[_] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[/* a */ Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, _]
  ): js.Promise[_] = js.native
  def transaction(
    transactionUpdate: js.Function1[/* a */ js.Any, _],
    onComplete: js.Function3[/* a */ Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, _],
    applyLocally: Boolean
  ): js.Promise[_] = js.native
  
  def update(values: js.Object): js.Promise[_] = js.native
  def update(values: js.Object, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
}
