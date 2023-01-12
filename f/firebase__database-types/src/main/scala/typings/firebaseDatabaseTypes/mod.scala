package typings.firebaseDatabaseTypes

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.firebaseDatabaseTypes.anon.MockUserToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/database-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database-types", "FirebaseDatabase")
  @js.native
  /* private */ open class FirebaseDatabase ()
    extends StObject
       with Database
  
  inline def enableLogging(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")().asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* a */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* a */ String, Any], persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(logger: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: Unit, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait DataSnapshot extends StObject {
    
    def child(path: String): DataSnapshot
    
    def exists(): Boolean
    
    def exportVal(): Any
    
    def forEach(action: js.Function1[/* a */ this.type, Boolean | Unit]): Boolean
    
    def getPriority(): String | Double | Null
    
    def hasChild(path: String): Boolean
    
    def hasChildren(): Boolean
    
    var key: String | Null
    
    def numChildren(): Double
    
    var ref: Reference
    
    def toJSON(): js.Object | Null
    
    def `val`(): Any
  }
  object DataSnapshot {
    
    inline def apply(
      child: String => DataSnapshot,
      exists: () => Boolean,
      exportVal: () => Any,
      forEach: js.Function1[DataSnapshot, Boolean | Unit] => Boolean,
      getPriority: () => String | Double | Null,
      hasChild: String => Boolean,
      hasChildren: () => Boolean,
      numChildren: () => Double,
      ref: Reference,
      toJSON: () => js.Object | Null,
      `val`: () => Any
    ): DataSnapshot = {
      val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), exists = js.Any.fromFunction0(exists), exportVal = js.Any.fromFunction0(exportVal), forEach = js.Any.fromFunction1(forEach), getPriority = js.Any.fromFunction0(getPriority), hasChild = js.Any.fromFunction1(hasChild), hasChildren = js.Any.fromFunction0(hasChildren), numChildren = js.Any.fromFunction0(numChildren), ref = ref.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), key = null)
      __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
      __obj.asInstanceOf[DataSnapshot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataSnapshot] (val x: Self) extends AnyVal {
      
      inline def setChild(value: String => DataSnapshot): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
      
      inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      inline def setExportVal(value: () => Any): Self = StObject.set(x, "exportVal", js.Any.fromFunction0(value))
      
      inline def setForEach(value: js.Function1[DataSnapshot, Boolean | Unit] => Boolean): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setGetPriority(value: () => String | Double | Null): Self = StObject.set(x, "getPriority", js.Any.fromFunction0(value))
      
      inline def setHasChild(value: String => Boolean): Self = StObject.set(x, "hasChild", js.Any.fromFunction1(value))
      
      inline def setHasChildren(value: () => Boolean): Self = StObject.set(x, "hasChildren", js.Any.fromFunction0(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setNumChildren(value: () => Double): Self = StObject.set(x, "numChildren", js.Any.fromFunction0(value))
      
      inline def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => js.Object | Null): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setVal(value: () => Any): Self = StObject.set(x, "val", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Database extends StObject {
    
    var app: FirebaseApp = js.native
    
    def goOffline(): Unit = js.native
    
    def goOnline(): Unit = js.native
    
    def ref(): Reference = js.native
    def ref(path: String): Reference = js.native
    def ref(path: Reference): Reference = js.native
    
    def refFromURL(url: String): Reference = js.native
    
    def useEmulator(host: String, port: Double): Unit = js.native
    def useEmulator(host: String, port: Double, options: MockUserToken): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.value
    - typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_added
    - typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_changed
    - typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_moved
    - typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_removed
  */
  trait EventType extends StObject
  object EventType {
    
    inline def child_added: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_added = "child_added".asInstanceOf[typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_added]
    
    inline def child_changed: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_changed = "child_changed".asInstanceOf[typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_changed]
    
    inline def child_moved: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_moved = "child_moved".asInstanceOf[typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_moved]
    
    inline def child_removed: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_removed = "child_removed".asInstanceOf[typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_removed]
    
    inline def value: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.value = "value".asInstanceOf[typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.value]
  }
  
  @js.native
  trait OnDisconnect extends StObject {
    
    def cancel(): js.Promise[Unit] = js.native
    def cancel(onComplete: js.Function1[/* a */ js.Error | Null, Any]): js.Promise[Unit] = js.native
    
    def remove(): js.Promise[Unit] = js.native
    def remove(onComplete: js.Function1[/* a */ js.Error | Null, Any]): js.Promise[Unit] = js.native
    
    def set(value: Any): js.Promise[Unit] = js.native
    def set(value: Any, onComplete: js.Function1[/* a */ js.Error | Null, Any]): js.Promise[Unit] = js.native
    
    def setWithPriority(value: Any): js.Promise[Any] = js.native
    def setWithPriority(value: Any, priority: String): js.Promise[Any] = js.native
    def setWithPriority(value: Any, priority: String, onComplete: js.Function1[/* a */ js.Error | Null, Any]): js.Promise[Any] = js.native
    def setWithPriority(value: Any, priority: Double): js.Promise[Any] = js.native
    def setWithPriority(value: Any, priority: Double, onComplete: js.Function1[/* a */ js.Error | Null, Any]): js.Promise[Any] = js.native
    def setWithPriority(value: Any, priority: Null, onComplete: js.Function1[/* a */ js.Error | Null, Any]): js.Promise[Any] = js.native
    
    def update(values: js.Object): js.Promise[Any] = js.native
    def update(values: js.Object, onComplete: js.Function1[/* a */ js.Error | Null, Any]): js.Promise[Any] = js.native
  }
  
  @js.native
  trait Query extends StObject {
    
    def endAt(): Query = js.native
    def endAt(value: String): Query = js.native
    def endAt(value: String, key: String): Query = js.native
    def endAt(value: Boolean): Query = js.native
    def endAt(value: Boolean, key: String): Query = js.native
    def endAt(value: Double): Query = js.native
    def endAt(value: Double, key: String): Query = js.native
    def endAt(value: Null, key: String): Query = js.native
    
    def endBefore(): Query = js.native
    def endBefore(value: String): Query = js.native
    def endBefore(value: String, key: String): Query = js.native
    def endBefore(value: Boolean): Query = js.native
    def endBefore(value: Boolean, key: String): Query = js.native
    def endBefore(value: Double): Query = js.native
    def endBefore(value: Double, key: String): Query = js.native
    def endBefore(value: Null, key: String): Query = js.native
    
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
    
    def limitToFirst(limit: Double): Query = js.native
    
    def limitToLast(limit: Double): Query = js.native
    
    def off(): Unit = js.native
    def off(
      eventType: Unit,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any]
    ): Unit = js.native
    def off(
      eventType: Unit,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      context: js.Object
    ): Unit = js.native
    def off(eventType: Unit, callback: Unit, context: js.Object): Unit = js.native
    def off(eventType: EventType): Unit = js.native
    def off(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any]
    ): Unit = js.native
    def off(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      context: js.Object
    ): Unit = js.native
    def off(eventType: EventType, callback: Unit, context: js.Object): Unit = js.native
    
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any]
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: js.Function1[/* a */ js.Error, Any]
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: js.Function1[/* a */ js.Error, Any],
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: js.Object,
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: Null,
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: Unit,
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    
    def once(eventType: EventType): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any]
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit]
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit],
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: js.Object,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: Null,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: Unit,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: Unit,
      failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit]
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: Unit,
      failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit],
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: EventType, successCallback: Unit, failureCallbackOrContext: js.Object): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: Unit,
      failureCallbackOrContext: js.Object,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: EventType, successCallback: Unit, failureCallbackOrContext: Null, context: js.Object): js.Promise[DataSnapshot] = js.native
    def once(eventType: EventType, successCallback: Unit, failureCallbackOrContext: Unit, context: js.Object): js.Promise[DataSnapshot] = js.native
    
    def orderByChild(path: String): Query = js.native
    
    def orderByKey(): Query = js.native
    
    def orderByPriority(): Query = js.native
    
    def orderByValue(): Query = js.native
    
    var ref: Reference = js.native
    
    def startAfter(): Query = js.native
    def startAfter(value: String): Query = js.native
    def startAfter(value: String, key: String): Query = js.native
    def startAfter(value: Boolean): Query = js.native
    def startAfter(value: Boolean, key: String): Query = js.native
    def startAfter(value: Double): Query = js.native
    def startAfter(value: Double, key: String): Query = js.native
    def startAfter(value: Null, key: String): Query = js.native
    
    def startAt(): Query = js.native
    def startAt(value: String): Query = js.native
    def startAt(value: String, key: String): Query = js.native
    def startAt(value: Boolean): Query = js.native
    def startAt(value: Boolean, key: String): Query = js.native
    def startAt(value: Double): Query = js.native
    def startAt(value: Double, key: String): Query = js.native
    def startAt(value: Null, key: String): Query = js.native
    
    def toJSON(): js.Object = js.native
  }
  
  @js.native
  trait Reference
    extends StObject
       with Query {
    
    def child(path: String): Reference = js.native
    
    var key: String | Null = js.native
    
    def onDisconnect(): OnDisconnect = js.native
    
    var parent: Reference | Null = js.native
    
    def push(): ThenableReference = js.native
    def push(value: Any): ThenableReference = js.native
    def push(value: Any, onComplete: js.Function1[/* a */ js.Error | Null, Any]): ThenableReference = js.native
    def push(value: Unit, onComplete: js.Function1[/* a */ js.Error | Null, Any]): ThenableReference = js.native
    
    def remove(): js.Promise[Unit] = js.native
    def remove(onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    var root: Reference = js.native
    
    def set(value: Any): js.Promise[Unit] = js.native
    def set(value: Any, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def setPriority(priority: String, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setPriority(priority: Double, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setPriority(priority: Null, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def setWithPriority(newVal: Any): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: String): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: String, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: Double): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: Double, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: Null, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def transaction(transactionUpdate: js.Function1[/* a */ Any, Any]): js.Promise[TransactionResult] = js.native
    def transaction(
      transactionUpdate: js.Function1[/* a */ Any, Any],
      onComplete: js.Function3[/* a */ js.Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, Unit]
    ): js.Promise[TransactionResult] = js.native
    def transaction(
      transactionUpdate: js.Function1[/* a */ Any, Any],
      onComplete: js.Function3[/* a */ js.Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, Unit],
      applyLocally: Boolean
    ): js.Promise[TransactionResult] = js.native
    def transaction(transactionUpdate: js.Function1[/* a */ Any, Any], onComplete: Unit, applyLocally: Boolean): js.Promise[TransactionResult] = js.native
    
    def update(values: js.Object): js.Promise[Unit] = js.native
    def update(values: js.Object, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  }
  
  trait ServerValue extends StObject {
    
    var TIMESTAMP: js.Object
    
    def increment(delta: Double): js.Object
  }
  object ServerValue {
    
    inline def apply(TIMESTAMP: js.Object, increment: Double => js.Object): ServerValue = {
      val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any], increment = js.Any.fromFunction1(increment))
      __obj.asInstanceOf[ServerValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerValue] (val x: Self) extends AnyVal {
      
      inline def setIncrement(value: Double => js.Object): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
      
      inline def setTIMESTAMP(value: js.Object): Self = StObject.set(x, "TIMESTAMP", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent @firebase/database-types.@firebase/database-types.Reference */
  /* Inlined parent std.Pick<std.Promise<@firebase/database-types.@firebase/database-types.Reference>, 'then' | 'catch'> */
  @js.native
  trait ThenableReference extends StObject {
    
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
    
    def endBefore(): Query = js.native
    def endBefore(value: String): Query = js.native
    def endBefore(value: String, key: String): Query = js.native
    def endBefore(value: Boolean): Query = js.native
    def endBefore(value: Boolean, key: String): Query = js.native
    def endBefore(value: Double): Query = js.native
    def endBefore(value: Double, key: String): Query = js.native
    def endBefore(value: Null, key: String): Query = js.native
    
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
    def off(
      eventType: Unit,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any]
    ): Unit = js.native
    def off(
      eventType: Unit,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      context: js.Object
    ): Unit = js.native
    def off(eventType: Unit, callback: Unit, context: js.Object): Unit = js.native
    def off(eventType: EventType): Unit = js.native
    def off(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any]
    ): Unit = js.native
    def off(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      context: js.Object
    ): Unit = js.native
    def off(eventType: EventType, callback: Unit, context: js.Object): Unit = js.native
    
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any]
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: js.Function1[/* a */ js.Error, Any]
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: js.Function1[/* a */ js.Error, Any],
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: js.Object,
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: Null,
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    def on(
      eventType: EventType,
      callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      cancelCallbackOrContext: Unit,
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], Any] = js.native
    
    def onDisconnect(): OnDisconnect = js.native
    
    def once(eventType: EventType): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any]
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit]
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit],
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: js.Object,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: Null,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], Any],
      failureCallbackOrContext: Unit,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: Unit,
      failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit]
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: Unit,
      failureCallbackOrContext: js.Function1[/* a */ js.Error, Unit],
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: EventType, successCallback: Unit, failureCallbackOrContext: js.Object): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: EventType,
      successCallback: Unit,
      failureCallbackOrContext: js.Object,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: EventType, successCallback: Unit, failureCallbackOrContext: Null, context: js.Object): js.Promise[DataSnapshot] = js.native
    def once(eventType: EventType, successCallback: Unit, failureCallbackOrContext: Unit, context: js.Object): js.Promise[DataSnapshot] = js.native
    
    def orderByChild(path: String): Query = js.native
    
    def orderByKey(): Query = js.native
    
    def orderByPriority(): Query = js.native
    
    def orderByValue(): Query = js.native
    
    var parent: Reference | Null = js.native
    
    def push(): ThenableReference = js.native
    def push(value: Any): ThenableReference = js.native
    def push(value: Any, onComplete: js.Function1[/* a */ js.Error | Null, Any]): ThenableReference = js.native
    def push(value: Unit, onComplete: js.Function1[/* a */ js.Error | Null, Any]): ThenableReference = js.native
    
    var ref: Reference = js.native
    
    def remove(): js.Promise[Unit] = js.native
    def remove(onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    var root: Reference = js.native
    
    def set(value: Any): js.Promise[Unit] = js.native
    def set(value: Any, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def setPriority(priority: String, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setPriority(priority: Double, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setPriority(priority: Null, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def setWithPriority(newVal: Any): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: String): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: String, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: Double): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: Double, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    def setWithPriority(newVal: Any, newPriority: Null, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
    
    def startAfter(): Query = js.native
    def startAfter(value: String): Query = js.native
    def startAfter(value: String, key: String): Query = js.native
    def startAfter(value: Boolean): Query = js.native
    def startAfter(value: Boolean, key: String): Query = js.native
    def startAfter(value: Double): Query = js.native
    def startAfter(value: Double, key: String): Query = js.native
    def startAfter(value: Null, key: String): Query = js.native
    
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
    
    def transaction(transactionUpdate: js.Function1[/* a */ Any, Any]): js.Promise[TransactionResult] = js.native
    def transaction(
      transactionUpdate: js.Function1[/* a */ Any, Any],
      onComplete: js.Function3[/* a */ js.Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, Unit]
    ): js.Promise[TransactionResult] = js.native
    def transaction(
      transactionUpdate: js.Function1[/* a */ Any, Any],
      onComplete: js.Function3[/* a */ js.Error | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, Unit],
      applyLocally: Boolean
    ): js.Promise[TransactionResult] = js.native
    def transaction(transactionUpdate: js.Function1[/* a */ Any, Any], onComplete: Unit, applyLocally: Boolean): js.Promise[TransactionResult] = js.native
    
    def update(values: js.Object): js.Promise[Unit] = js.native
    def update(values: js.Object, onComplete: js.Function1[/* a */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  }
  
  trait TransactionResult extends StObject {
    
    var committed: Boolean
    
    var snapshot: DataSnapshot
  }
  object TransactionResult {
    
    inline def apply(committed: Boolean, snapshot: DataSnapshot): TransactionResult = {
      val __obj = js.Dynamic.literal(committed = committed.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionResult] (val x: Self) extends AnyVal {
      
      inline def setCommitted(value: Boolean): Self = StObject.set(x, "committed", value.asInstanceOf[js.Any])
      
      inline def setSnapshot(value: DataSnapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var `database-compat`: FirebaseDatabase
    }
    object NameServiceMapping {
      
      inline def apply(`database-compat`: FirebaseDatabase): NameServiceMapping = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("database-compat")(`database-compat`.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        inline def `setDatabase-compat`(value: FirebaseDatabase): Self = StObject.set(x, "database-compat", value.asInstanceOf[js.Any])
      }
    }
  }
}
