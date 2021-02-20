package typings.firebaseDatabaseTypes

import typings.firebaseAppTypes.mod.FirebaseApp
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/database-types", "FirebaseDatabase")
  @js.native
  class FirebaseDatabase protected () extends Database
  
  @JSImport("@firebase/database-types", "enableLogging")
  @js.native
  def enableLogging(): js.Any = js.native
  @JSImport("@firebase/database-types", "enableLogging")
  @js.native
  def enableLogging(logger: js.UndefOr[scala.Nothing], persistent: Boolean): js.Any = js.native
  @JSImport("@firebase/database-types", "enableLogging")
  @js.native
  def enableLogging(logger: js.Function1[/* a */ String, _]): js.Any = js.native
  @JSImport("@firebase/database-types", "enableLogging")
  @js.native
  def enableLogging(logger: js.Function1[/* a */ String, _], persistent: Boolean): js.Any = js.native
  @JSImport("@firebase/database-types", "enableLogging")
  @js.native
  def enableLogging(logger: Boolean): js.Any = js.native
  @JSImport("@firebase/database-types", "enableLogging")
  @js.native
  def enableLogging(logger: Boolean, persistent: Boolean): js.Any = js.native
  
  @js.native
  trait DataSnapshot extends StObject {
    
    def child(path: String): DataSnapshot = js.native
    
    def exists(): Boolean = js.native
    
    def exportVal(): js.Any = js.native
    
    def forEach(action: js.Function1[/* a */ this.type, Boolean | Unit]): Boolean = js.native
    
    def getPriority(): String | Double | Null = js.native
    
    def hasChild(path: String): Boolean = js.native
    
    def hasChildren(): Boolean = js.native
    
    var key: String | Null = js.native
    
    def numChildren(): Double = js.native
    
    var ref: Reference = js.native
    
    def toJSON(): js.Object | Null = js.native
    
    def `val`(): js.Any = js.native
  }
  object DataSnapshot {
    
    @scala.inline
    def apply(
      child: String => DataSnapshot,
      exists: () => Boolean,
      exportVal: () => js.Any,
      forEach: js.Function1[DataSnapshot, Boolean | Unit] => Boolean,
      getPriority: () => String | Double | Null,
      hasChild: String => Boolean,
      hasChildren: () => Boolean,
      numChildren: () => Double,
      ref: Reference,
      toJSON: () => js.Object | Null,
      `val`: () => js.Any
    ): DataSnapshot = {
      val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), exists = js.Any.fromFunction0(exists), exportVal = js.Any.fromFunction0(exportVal), forEach = js.Any.fromFunction1(forEach), getPriority = js.Any.fromFunction0(getPriority), hasChild = js.Any.fromFunction1(hasChild), hasChildren = js.Any.fromFunction0(hasChildren), numChildren = js.Any.fromFunction0(numChildren), ref = ref.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
      __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
      __obj.asInstanceOf[DataSnapshot]
    }
    
    @scala.inline
    implicit class DataSnapshotMutableBuilder[Self <: DataSnapshot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: String => DataSnapshot): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExportVal(value: () => js.Any): Self = StObject.set(x, "exportVal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setForEach(value: js.Function1[DataSnapshot, Boolean | Unit] => Boolean): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPriority(value: () => String | Double | Null): Self = StObject.set(x, "getPriority", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasChild(value: String => Boolean): Self = StObject.set(x, "hasChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasChildren(value: () => Boolean): Self = StObject.set(x, "hasChildren", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setNumChildren(value: () => Double): Self = StObject.set(x, "numChildren", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Object | Null): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVal(value: () => js.Any): Self = StObject.set(x, "val", js.Any.fromFunction0(value))
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
    
    @scala.inline
    def child_added: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_added = "child_added".asInstanceOf[typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_added]
    
    @scala.inline
    def child_changed: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_changed = "child_changed".asInstanceOf[typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_changed]
    
    @scala.inline
    def child_moved: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_moved = "child_moved".asInstanceOf[typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_moved]
    
    @scala.inline
    def child_removed: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_removed = "child_removed".asInstanceOf[typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.child_removed]
    
    @scala.inline
    def value: typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.value = "value".asInstanceOf[typings.firebaseDatabaseTypes.firebaseDatabaseTypesStrings.value]
  }
  
  @js.native
  trait OnDisconnect extends StObject {
    
    def cancel(): js.Promise[Unit] = js.native
    def cancel(onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[Unit] = js.native
    
    def remove(): js.Promise[Unit] = js.native
    def remove(onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[Unit] = js.native
    
    def set(value: js.Any): js.Promise[Unit] = js.native
    def set(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[Unit] = js.native
    
    def setWithPriority(value: js.Any): js.Promise[_] = js.native
    def setWithPriority(value: js.Any, priority: String): js.Promise[_] = js.native
    def setWithPriority(value: js.Any, priority: String, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
    def setWithPriority(value: js.Any, priority: Double): js.Promise[_] = js.native
    def setWithPriority(value: js.Any, priority: Double, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
    def setWithPriority(value: js.Any, priority: Null, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
    
    def update(values: js.Object): js.Promise[_] = js.native
    def update(values: js.Object, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
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
    
    var ref: Reference = js.native
    
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
  trait Reference extends Query {
    
    def child(path: String): Reference = js.native
    
    var key: String | Null = js.native
    
    def onDisconnect(): OnDisconnect = js.native
    
    var parent: Reference | Null = js.native
    
    def push(): ThenableReference = js.native
    def push(value: js.UndefOr[scala.Nothing], onComplete: js.Function1[/* a */ Error | Null, _]): ThenableReference = js.native
    def push(value: js.Any): ThenableReference = js.native
    def push(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, _]): ThenableReference = js.native
    
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
  
  @js.native
  trait ServerValue extends StObject {
    
    var TIMESTAMP: js.Object = js.native
    
    def increment(delta: Double): js.Object = js.native
  }
  object ServerValue {
    
    @scala.inline
    def apply(TIMESTAMP: js.Object, increment: Double => js.Object): ServerValue = {
      val __obj = js.Dynamic.literal(TIMESTAMP = TIMESTAMP.asInstanceOf[js.Any], increment = js.Any.fromFunction1(increment))
      __obj.asInstanceOf[ServerValue]
    }
    
    @scala.inline
    implicit class ServerValueMutableBuilder[Self <: ServerValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncrement(value: Double => js.Object): Self = StObject.set(x, "increment", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTIMESTAMP(value: js.Object): Self = StObject.set(x, "TIMESTAMP", value.asInstanceOf[js.Any])
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
  
  object firebaseComponentAugmentingMod {
    
    @js.native
    trait NameServiceMapping extends StObject {
      
      var database: FirebaseDatabase = js.native
    }
    object NameServiceMapping {
      
      @scala.inline
      def apply(database: FirebaseDatabase): NameServiceMapping = {
        val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit class NameServiceMappingMutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDatabase(value: FirebaseDatabase): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      }
    }
  }
}
