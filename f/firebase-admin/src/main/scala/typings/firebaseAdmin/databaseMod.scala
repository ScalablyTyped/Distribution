package typings.firebaseAdmin

import typings.firebaseAdmin.firebaseNamespaceApiMod.app.App
import typings.firebaseDatabaseTypes.mod.FirebaseDatabase
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  object database {
    
    inline def apply(): Database = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Database]
    inline def apply(app: App): Database = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Database]
    
    @JSImport("firebase-admin/lib/database", "database")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * [`ServerValue`](https://firebase.google.com/docs/reference/js/firebase.database.ServerValue)
      * module from the `@firebase/database` package.
      */
    @JSImport("firebase-admin/lib/database", "database.ServerValue")
    @js.native
    val ServerValue: typings.firebaseDatabaseTypes.mod.ServerValue = js.native
    
    inline def enableLogging(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")().asInstanceOf[js.Any]
    inline def enableLogging(logger: js.Function1[/* a */ String, js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def enableLogging(logger: js.Function1[/* a */ String, js.Any], persistent: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def enableLogging(logger: Boolean): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def enableLogging(logger: Boolean, persistent: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def enableLogging(logger: Unit, persistent: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    trait DataSnapshot extends StObject {
      
      def child(path: String): typings.firebaseDatabaseTypes.mod.DataSnapshot
      
      def exists(): Boolean
      
      def exportVal(): js.Any
      
      def forEach(action: js.Function1[/* a */ this.type, Boolean | Unit]): Boolean
      
      def getPriority(): String | Double | Null
      
      def hasChild(path: String): Boolean
      
      def hasChildren(): Boolean
      
      var key: String | Null
      
      def numChildren(): Double
      
      var ref: typings.firebaseDatabaseTypes.mod.Reference
      
      def toJSON(): js.Object | Null
      
      def `val`(): js.Any
    }
    object DataSnapshot {
      
      inline def apply(
        child: String => typings.firebaseDatabaseTypes.mod.DataSnapshot,
        exists: () => Boolean,
        exportVal: () => js.Any,
        forEach: js.Function1[DataSnapshot, Boolean | Unit] => Boolean,
        getPriority: () => String | Double | Null,
        hasChild: String => Boolean,
        hasChildren: () => Boolean,
        numChildren: () => Double,
        ref: typings.firebaseDatabaseTypes.mod.Reference,
        toJSON: () => js.Object | Null,
        `val`: () => js.Any
      ): DataSnapshot = {
        val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), exists = js.Any.fromFunction0(exists), exportVal = js.Any.fromFunction0(exportVal), forEach = js.Any.fromFunction1(forEach), getPriority = js.Any.fromFunction0(getPriority), hasChild = js.Any.fromFunction1(hasChild), hasChildren = js.Any.fromFunction0(hasChildren), numChildren = js.Any.fromFunction0(numChildren), ref = ref.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), key = null)
        __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
        __obj.asInstanceOf[DataSnapshot]
      }
      
      extension [Self <: DataSnapshot](x: Self) {
        
        inline def setChild(value: String => typings.firebaseDatabaseTypes.mod.DataSnapshot): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
        
        inline def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
        
        inline def setExportVal(value: () => js.Any): Self = StObject.set(x, "exportVal", js.Any.fromFunction0(value))
        
        inline def setForEach(value: js.Function1[DataSnapshot, Boolean | Unit] => Boolean): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
        
        inline def setGetPriority(value: () => String | Double | Null): Self = StObject.set(x, "getPriority", js.Any.fromFunction0(value))
        
        inline def setHasChild(value: String => Boolean): Self = StObject.set(x, "hasChild", js.Any.fromFunction1(value))
        
        inline def setHasChildren(value: () => Boolean): Self = StObject.set(x, "hasChildren", js.Any.fromFunction0(value))
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyNull: Self = StObject.set(x, "key", null)
        
        inline def setNumChildren(value: () => Double): Self = StObject.set(x, "numChildren", js.Any.fromFunction0(value))
        
        inline def setRef(value: typings.firebaseDatabaseTypes.mod.Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
        
        inline def setToJSON(value: () => js.Object | Null): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
        
        inline def setVal(value: () => js.Any): Self = StObject.set(x, "val", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait Database extends FirebaseDatabase {
      
      /**
        * Gets the currently applied security rules as a string. The return value consists of
        * the rules source including comments.
        *
        * @return A promise fulfilled with the rules as a raw string.
        */
      def getRules(): js.Promise[String] = js.native
      
      /**
        * Gets the currently applied security rules as a parsed JSON object. Any comments in
        * the original source are stripped away.
        *
        * @return A promise fulfilled with the parsed rules object.
        */
      def getRulesJSON(): js.Promise[js.Object] = js.native
      
      /**
        * Sets the specified rules on the Firebase Realtime Database instance. If the rules source is
        * specified as a string or a Buffer, it may include comments.
        *
        * @param source Source of the rules to apply. Must not be `null` or empty.
        * @return Resolves when the rules are set on the Realtime Database.
        */
      def setRules(source: String): js.Promise[Unit] = js.native
      def setRules(source: js.Object): js.Promise[Unit] = js.native
      def setRules(source: Buffer): js.Promise[Unit] = js.native
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.firebaseAdmin.firebaseAdminStrings.value
      - typings.firebaseAdmin.firebaseAdminStrings.child_added
      - typings.firebaseAdmin.firebaseAdminStrings.child_changed
      - typings.firebaseAdmin.firebaseAdminStrings.child_moved
      - typings.firebaseAdmin.firebaseAdminStrings.child_removed
    */
    trait EventType extends StObject
    object EventType {
      
      inline def child_added: typings.firebaseAdmin.firebaseAdminStrings.child_added = "child_added".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.child_added]
      
      inline def child_changed: typings.firebaseAdmin.firebaseAdminStrings.child_changed = "child_changed".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.child_changed]
      
      inline def child_moved: typings.firebaseAdmin.firebaseAdminStrings.child_moved = "child_moved".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.child_moved]
      
      inline def child_removed: typings.firebaseAdmin.firebaseAdminStrings.child_removed = "child_removed".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.child_removed]
      
      inline def value: typings.firebaseAdmin.firebaseAdminStrings.value = "value".asInstanceOf[typings.firebaseAdmin.firebaseAdminStrings.value]
    }
    
    @js.native
    trait OnDisconnect extends StObject {
      
      def cancel(): js.Promise[Unit] = js.native
      def cancel(onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[Unit] = js.native
      
      def remove(): js.Promise[Unit] = js.native
      def remove(onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[Unit] = js.native
      
      def set(value: js.Any): js.Promise[Unit] = js.native
      def set(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[Unit] = js.native
      
      def setWithPriority(value: js.Any): js.Promise[js.Any] = js.native
      def setWithPriority(value: js.Any, priority: String): js.Promise[js.Any] = js.native
      def setWithPriority(value: js.Any, priority: String, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      def setWithPriority(value: js.Any, priority: Double): js.Promise[js.Any] = js.native
      def setWithPriority(value: js.Any, priority: Double, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      def setWithPriority(value: js.Any, priority: Null, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      
      def update(values: js.Object): js.Promise[js.Any] = js.native
      def update(values: js.Object, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
    }
    
    @js.native
    trait Query extends StObject {
      
      def endAt(): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: String, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Boolean): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Boolean, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Double): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Double, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Null, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def equalTo(): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: String, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Boolean): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Boolean, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Double): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Double, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Null, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def get(): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      
      def isEqual(): Boolean = js.native
      def isEqual(other: typings.firebaseDatabaseTypes.mod.Query): Boolean = js.native
      
      def limitToFirst(limit: Double): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def limitToLast(limit: Double): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def off(): Unit = js.native
      def off(
        eventType: Unit,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ]
      ): Unit = js.native
      def off(
        eventType: Unit,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        context: js.Object
      ): Unit = js.native
      def off(eventType: Unit, callback: Unit, context: js.Object): Unit = js.native
      def off(eventType: typings.firebaseDatabaseTypes.mod.EventType): Unit = js.native
      def off(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ]
      ): Unit = js.native
      def off(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        context: js.Object
      ): Unit = js.native
      def off(eventType: typings.firebaseDatabaseTypes.mod.EventType, callback: Unit, context: js.Object): Unit = js.native
      
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ]
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: js.Function1[/* a */ Error, js.Any]
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: js.Function1[/* a */ Error, js.Any],
        context: js.Object
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: js.Object
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: js.Object,
        context: js.Object
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: Null,
        context: js.Object
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: Unit,
        context: js.Object
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      
      def once(eventType: typings.firebaseDatabaseTypes.mod.EventType): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ]
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: js.Function1[/* a */ Error, Unit]
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: js.Function1[/* a */ Error, Unit],
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: js.Object,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: Null,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: Unit,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: js.Function1[/* a */ Error, Unit]
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: js.Function1[/* a */ Error, Unit],
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: js.Object,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: Null,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: Unit,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      
      def orderByChild(path: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByKey(): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByPriority(): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByValue(): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      var ref: typings.firebaseDatabaseTypes.mod.Reference = js.native
      
      def startAt(): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: String, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Boolean): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Boolean, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Double): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Double, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Null, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def toJSON(): js.Object = js.native
    }
    
    @js.native
    trait Reference
      extends StObject
         with typings.firebaseDatabaseTypes.mod.Query {
      
      def child(path: String): typings.firebaseDatabaseTypes.mod.Reference = js.native
      
      var key: String | Null = js.native
      
      def onDisconnect(): typings.firebaseDatabaseTypes.mod.OnDisconnect = js.native
      
      var parent: typings.firebaseDatabaseTypes.mod.Reference | Null = js.native
      
      def push(): typings.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: js.Any): typings.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, js.Any]): typings.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: Unit, onComplete: js.Function1[/* a */ Error | Null, js.Any]): typings.firebaseDatabaseTypes.mod.ThenableReference = js.native
      
      def remove(): js.Promise[js.Any] = js.native
      def remove(onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      
      var root: typings.firebaseDatabaseTypes.mod.Reference = js.native
      
      def set(value: js.Any): js.Promise[js.Any] = js.native
      def set(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      
      def setPriority(priority: String, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      def setPriority(priority: Double, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      def setPriority(priority: Null, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      
      def setWithPriority(newVal: js.Any): js.Promise[js.Any] = js.native
      def setWithPriority(newVal: js.Any, newPriority: String): js.Promise[js.Any] = js.native
      def setWithPriority(newVal: js.Any, newPriority: String, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Double): js.Promise[js.Any] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Double, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Null, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      
      def transaction(transactionUpdate: js.Function1[/* a */ js.Any, js.Any]): js.Promise[js.Any] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, js.Any],
        onComplete: js.Function3[
              /* a */ Error | Null, 
              /* b */ Boolean, 
              /* c */ typings.firebaseDatabaseTypes.mod.DataSnapshot | Null, 
              js.Any
            ]
      ): js.Promise[js.Any] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, js.Any],
        onComplete: js.Function3[
              /* a */ Error | Null, 
              /* b */ Boolean, 
              /* c */ typings.firebaseDatabaseTypes.mod.DataSnapshot | Null, 
              js.Any
            ],
        applyLocally: Boolean
      ): js.Promise[js.Any] = js.native
      def transaction(transactionUpdate: js.Function1[/* a */ js.Any, js.Any], onComplete: Unit, applyLocally: Boolean): js.Promise[js.Any] = js.native
      
      def update(values: js.Object): js.Promise[js.Any] = js.native
      def update(values: js.Object, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
    }
    
    /* Inlined parent @firebase/database-types.@firebase/database-types.Reference */
    /* Inlined parent std.Pick<std.Promise<@firebase/database-types.@firebase/database-types.Reference>, 'then' | 'catch'> */
    @js.native
    trait ThenableReference extends StObject {
      
      def `catch`[TResult](): js.Promise[typings.firebaseDatabaseTypes.mod.Reference | TResult] = js.native
      @JSName("catch")
      var catch_Original: js.Function0[js.Promise[typings.firebaseDatabaseTypes.mod.Reference | scala.Nothing]] = js.native
      
      def child(path: String): typings.firebaseDatabaseTypes.mod.Reference = js.native
      
      def endAt(): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: String, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Boolean): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Boolean, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Double): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Double, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def endAt(value: Null, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def equalTo(): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: String, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Boolean): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Boolean, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Double): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Double, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def equalTo(value: Null, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def get(): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      
      def isEqual(): Boolean = js.native
      def isEqual(other: typings.firebaseDatabaseTypes.mod.Query): Boolean = js.native
      
      var key: String | Null = js.native
      
      def limitToFirst(limit: Double): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def limitToLast(limit: Double): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def off(): Unit = js.native
      def off(
        eventType: Unit,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ]
      ): Unit = js.native
      def off(
        eventType: Unit,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        context: js.Object
      ): Unit = js.native
      def off(eventType: Unit, callback: Unit, context: js.Object): Unit = js.native
      def off(eventType: typings.firebaseDatabaseTypes.mod.EventType): Unit = js.native
      def off(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ]
      ): Unit = js.native
      def off(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        context: js.Object
      ): Unit = js.native
      def off(eventType: typings.firebaseDatabaseTypes.mod.EventType, callback: Unit, context: js.Object): Unit = js.native
      
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ]
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: js.Function1[/* a */ Error, js.Any]
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: js.Function1[/* a */ Error, js.Any],
        context: js.Object
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: js.Object
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: js.Object,
        context: js.Object
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: Null,
        context: js.Object
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      def on(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        callback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        cancelCallbackOrContext: Unit,
        context: js.Object
      ): js.Function2[
            /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
            /* b */ js.UndefOr[String | Null], 
            js.Any
          ] = js.native
      
      def onDisconnect(): typings.firebaseDatabaseTypes.mod.OnDisconnect = js.native
      
      def once(eventType: typings.firebaseDatabaseTypes.mod.EventType): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ]
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: js.Function1[/* a */ Error, Unit]
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: js.Function1[/* a */ Error, Unit],
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: js.Object,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: Null,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: js.Function2[
              /* a */ typings.firebaseDatabaseTypes.mod.DataSnapshot, 
              /* b */ js.UndefOr[String | Null], 
              js.Any
            ],
        failureCallbackOrContext: Unit,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: js.Function1[/* a */ Error, Unit]
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: js.Function1[/* a */ Error, Unit],
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: js.Object,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: Null,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      def once(
        eventType: typings.firebaseDatabaseTypes.mod.EventType,
        successCallback: Unit,
        failureCallbackOrContext: Unit,
        context: js.Object
      ): js.Promise[typings.firebaseDatabaseTypes.mod.DataSnapshot] = js.native
      
      def orderByChild(path: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByKey(): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByPriority(): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def orderByValue(): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      var parent: typings.firebaseDatabaseTypes.mod.Reference | Null = js.native
      
      def push(): typings.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: js.Any): typings.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, js.Any]): typings.firebaseDatabaseTypes.mod.ThenableReference = js.native
      def push(value: Unit, onComplete: js.Function1[/* a */ Error | Null, js.Any]): typings.firebaseDatabaseTypes.mod.ThenableReference = js.native
      
      var ref: typings.firebaseDatabaseTypes.mod.Reference = js.native
      
      def remove(): js.Promise[js.Any] = js.native
      def remove(onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      
      var root: typings.firebaseDatabaseTypes.mod.Reference = js.native
      
      def set(value: js.Any): js.Promise[js.Any] = js.native
      def set(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      
      def setPriority(priority: String, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      def setPriority(priority: Double, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      def setPriority(priority: Null, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      
      def setWithPriority(newVal: js.Any): js.Promise[js.Any] = js.native
      def setWithPriority(newVal: js.Any, newPriority: String): js.Promise[js.Any] = js.native
      def setWithPriority(newVal: js.Any, newPriority: String, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Double): js.Promise[js.Any] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Double, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      def setWithPriority(newVal: js.Any, newPriority: Null, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
      
      def startAt(): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: String, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Boolean): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Boolean, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Double): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Double, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      def startAt(value: Null, key: String): typings.firebaseDatabaseTypes.mod.Query = js.native
      
      def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
      @JSName("then")
      var then_Original: js.Function0[js.Promise[typings.firebaseDatabaseTypes.mod.Reference | scala.Nothing]] = js.native
      
      def toJSON(): js.Object = js.native
      
      def transaction(transactionUpdate: js.Function1[/* a */ js.Any, js.Any]): js.Promise[js.Any] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, js.Any],
        onComplete: js.Function3[
              /* a */ Error | Null, 
              /* b */ Boolean, 
              /* c */ typings.firebaseDatabaseTypes.mod.DataSnapshot | Null, 
              js.Any
            ]
      ): js.Promise[js.Any] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, js.Any],
        onComplete: js.Function3[
              /* a */ Error | Null, 
              /* b */ Boolean, 
              /* c */ typings.firebaseDatabaseTypes.mod.DataSnapshot | Null, 
              js.Any
            ],
        applyLocally: Boolean
      ): js.Promise[js.Any] = js.native
      def transaction(transactionUpdate: js.Function1[/* a */ js.Any, js.Any], onComplete: Unit, applyLocally: Boolean): js.Promise[js.Any] = js.native
      
      def update(values: js.Object): js.Promise[js.Any] = js.native
      def update(values: js.Object, onComplete: js.Function1[/* a */ Error | Null, js.Any]): js.Promise[js.Any] = js.native
    }
  }
}
