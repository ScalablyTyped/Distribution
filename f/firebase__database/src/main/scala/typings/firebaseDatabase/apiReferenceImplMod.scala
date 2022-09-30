package typings.firebaseDatabase

import typings.firebaseDatabase.apiDatabaseMod.Database
import typings.firebaseDatabase.apiOnDisconnectMod.OnDisconnect
import typings.firebaseDatabase.apiReferenceMod.DatabaseReference
import typings.firebaseDatabase.apiReferenceMod.ListenOptions
import typings.firebaseDatabase.apiReferenceMod.Query
import typings.firebaseDatabase.apiReferenceMod.ThenableReference
import typings.firebaseDatabase.apiReferenceMod.Unsubscribe
import typings.firebaseDatabase.coreRepoMod.Repo
import typings.firebaseDatabase.indexesIndexMod.Index
import typings.firebaseDatabase.snapNodeMod.Node
import typings.firebaseDatabase.utilPathMod.Path
import typings.firebaseDatabase.viewChangeMod.Change
import typings.firebaseDatabase.viewEventMod.CancelEvent
import typings.firebaseDatabase.viewEventMod.DataEvent
import typings.firebaseDatabase.viewEventMod.Event
import typings.firebaseDatabase.viewEventMod.EventType
import typings.firebaseDatabase.viewEventRegistrationMod.CallbackContext
import typings.firebaseDatabase.viewEventRegistrationMod.EventRegistration
import typings.firebaseDatabase.viewEventRegistrationMod.QueryContext
import typings.firebaseDatabase.viewQueryParamsMod.QueryParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiReferenceImplMod {
  
  @JSImport("@firebase/database/dist/src/api/Reference_impl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/api/Reference_impl", "ChildEventRegistration")
  @js.native
  open class ChildEventRegistration protected ()
    extends StObject
       with EventRegistration {
    def this(eventType: String) = this()
    def this(eventType: String, callbackContext: CallbackContext) = this()
    
    /* private */ var callbackContext: Any = js.native
    
    /* CompleteClass */
    override def createCancelEvent(error: js.Error, path: Path): CancelEvent | Null = js.native
    
    /* CompleteClass */
    override def createEvent(change: Change, query: QueryContext): Event = js.native
    
    /* private */ var eventType: Any = js.native
    
    def getEventRunner(eventData: CancelEvent): js.Function0[Unit] = js.native
    def getEventRunner(eventData: DataEvent): js.Function0[Unit] = js.native
    /**
      * Given event data, return a function to trigger the user's callback
      */
    /* CompleteClass */
    override def getEventRunner(eventData: Event): js.Function0[Unit] = js.native
    
    /**
      * False basically means this is a "dummy" callback container being used as a sentinel
      * to remove all callback containers of a particular type.  (e.g. if the user does
      * ref.off('value') without specifying a specific callback).
      *
      * (TODO: Rework this, since it's hacky)
      *
      */
    /* CompleteClass */
    override def hasAnyCallback(): Boolean = js.native
    
    /* CompleteClass */
    override def matches(other: EventRegistration): Boolean = js.native
    
    /**
      * True if this container has a callback to trigger for this event type
      */
    /* CompleteClass */
    override def respondsTo(eventType: String): Boolean = js.native
  }
  
  @JSImport("@firebase/database/dist/src/api/Reference_impl", "DataSnapshot")
  @js.native
  open class DataSnapshot protected () extends StObject {
    /**
      * @param _node - A SnapshotNode to wrap.
      * @param ref - The location this snapshot came from.
      * @param _index - The iteration order for this snapshot
      * @hideconstructor
      */
    def this(_node: Node, /**
      * The location of this DataSnapshot.
      */
    ref: DatabaseReference, _index: Index) = this()
    
    val _index: Index = js.native
    
    val _node: Node = js.native
    
    /**
      * Gets another `DataSnapshot` for the location at the specified relative path.
      *
      * Passing a relative path to the `child()` method of a DataSnapshot returns
      * another `DataSnapshot` for the location at the specified relative path. The
      * relative path can either be a simple child name (for example, "ada") or a
      * deeper, slash-separated path (for example, "ada/name/first"). If the child
      * location has no data, an empty `DataSnapshot` (that is, a `DataSnapshot`
      * whose value is `null`) is returned.
      *
      * @param path - A relative path to the location of child data.
      */
    def child(path: String): DataSnapshot = js.native
    
    /**
      * Returns true if this `DataSnapshot` contains any data. It is slightly more
      * efficient than using `snapshot.val() !== null`.
      */
    def exists(): Boolean = js.native
    
    /**
      * Exports the entire contents of the DataSnapshot as a JavaScript object.
      *
      * The `exportVal()` method is similar to `val()`, except priority information
      * is included (if available), making it suitable for backing up your data.
      *
      * @returns The DataSnapshot's contents as a JavaScript value (Object,
      *   Array, string, number, boolean, or `null`).
      */
    def exportVal(): Any = js.native
    
    /**
      * Enumerates the top-level children in the `DataSnapshot`.
      *
      * Because of the way JavaScript objects work, the ordering of data in the
      * JavaScript object returned by `val()` is not guaranteed to match the
      * ordering on the server nor the ordering of `onChildAdded()` events. That is
      * where `forEach()` comes in handy. It guarantees the children of a
      * `DataSnapshot` will be iterated in their query order.
      *
      * If no explicit `orderBy*()` method is used, results are returned
      * ordered by key (unless priorities are used, in which case, results are
      * returned by priority).
      *
      * @param action - A function that will be called for each child DataSnapshot.
      * The callback can return true to cancel further enumeration.
      * @returns true if enumeration was canceled due to your callback returning
      * true.
      */
    def forEach(action: js.Function1[/* child */ this.type, Boolean | Unit]): Boolean = js.native
    
    /**
      * Returns true if the specified child path has (non-null) data.
      *
      * @param path - A relative path to the location of a potential child.
      * @returns `true` if data exists at the specified child path; else
      *  `false`.
      */
    def hasChild(path: String): Boolean = js.native
    
    /**
      * Returns whether or not the `DataSnapshot` has any non-`null` child
      * properties.
      *
      * You can use `hasChildren()` to determine if a `DataSnapshot` has any
      * children. If it does, you can enumerate them using `forEach()`. If it
      * doesn't, then either this snapshot contains a primitive value (which can be
      * retrieved with `val()`) or it is empty (in which case, `val()` will return
      * `null`).
      *
      * @returns true if this snapshot has any children; else false.
      */
    def hasChildren(): Boolean = js.native
    
    /**
      * The key (last part of the path) of the location of this `DataSnapshot`.
      *
      * The last token in a Database location is considered its key. For example,
      * "ada" is the key for the /users/ada/ node. Accessing the key on any
      * `DataSnapshot` will return the key for the location that generated it.
      * However, accessing the key on the root URL of a Database will return
      * `null`.
      */
    def key: String | Null = js.native
    
    /**
      * Gets the priority value of the data in this `DataSnapshot`.
      *
      * Applications need not use priority but can order collections by
      * ordinary properties (see
      * {@link https://firebase.google.com/docs/database/web/lists-of-data#sorting_and_filtering_data |Sorting and filtering data}
      * ).
      */
    def priority: String | Double | Null = js.native
    
    /**
      * The location of this DataSnapshot.
      */
    val ref: DatabaseReference = js.native
    
    /** Returns the number of child properties of this `DataSnapshot`. */
    def size: Double = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      */
    def toJSON(): js.Object | Null = js.native
    
    /**
      * Extracts a JavaScript value from a `DataSnapshot`.
      *
      * Depending on the data in a `DataSnapshot`, the `val()` method may return a
      * scalar type (string, number, or boolean), an array, or an object. It may
      * also return null, indicating that the `DataSnapshot` is empty (contains no
      * data).
      *
      * @returns The DataSnapshot's contents as a JavaScript value (Object,
      *   Array, string, number, boolean, or `null`).
      */
    def `val`(): Any = js.native
  }
  
  @JSImport("@firebase/database/dist/src/api/Reference_impl", "QueryConstraint")
  @js.native
  abstract class QueryConstraint () extends StObject {
    
    /**
      * Takes the provided `Query` and returns a copy of the `Query` with this
      * `QueryConstraint` applied.
      */
    def _apply[T](query: QueryImpl): QueryImpl = js.native
    
    /** The type of this query constraints */
    val `type`: QueryConstraintType = js.native
  }
  
  @JSImport("@firebase/database/dist/src/api/Reference_impl", "QueryImpl")
  @js.native
  open class QueryImpl protected ()
    extends StObject
       with Query {
    /**
      * @hideconstructor
      */
    def this(_repo: Repo, _path: Path, _queryParams: QueryParams, _orderByCalled: Boolean) = this()
    
    val _orderByCalled: Boolean = js.native
    
    /* CompleteClass */
    override val _path: Path = js.native
    
    /* CompleteClass */
    override val _queryIdentifier: String = js.native
    @JSName("_queryIdentifier")
    def _queryIdentifier_MQueryImpl: String = js.native
    
    /* CompleteClass */
    override val _queryObject: js.Object = js.native
    /**
      * An object representation of the query parameters used by this Query.
      */
    @JSName("_queryObject")
    def _queryObject_MQueryImpl: js.Object = js.native
    
    /* CompleteClass */
    override val _queryParams: QueryParams = js.native
    
    /* CompleteClass */
    override val _repo: Repo = js.native
    
    def isEqual(other: QueryImpl): Boolean = js.native
    
    def key: String | Null = js.native
    
    @JSName("ref")
    def ref_MQueryImpl: DatabaseReference = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseDatabase.viewEventRegistrationMod.QueryContext because Already inherited
  - typings.firebaseDatabase.apiReferenceMod.Query because Already inherited
  - typings.firebaseDatabase.apiReferenceMod.DatabaseReference because var conflicts: _queryIdentifier, _queryObject, key, ref. Inlined parent, root */ @JSImport("@firebase/database/dist/src/api/Reference_impl", "ReferenceImpl")
  @js.native
  open class ReferenceImpl protected () extends QueryImpl {
    /** @hideconstructor */
    def this(repo: Repo, path: Path) = this()
    
    def parent: ReferenceImpl | Null = js.native
    /**
      * The parent location of a `DatabaseReference`.
      *
      * The parent of a root `DatabaseReference` is `null`.
      */
    @JSName("parent")
    val parent_FReferenceImpl: DatabaseReference | Null = js.native
    
    def root: ReferenceImpl = js.native
    /** The root `DatabaseReference` of the Database. */
    @JSName("root")
    val root_FReferenceImpl: DatabaseReference = js.native
  }
  
  @JSImport("@firebase/database/dist/src/api/Reference_impl", "ValueEventRegistration")
  @js.native
  open class ValueEventRegistration protected ()
    extends StObject
       with EventRegistration {
    def this(callbackContext: CallbackContext) = this()
    
    /* private */ var callbackContext: Any = js.native
    
    /* CompleteClass */
    override def createCancelEvent(error: js.Error, path: Path): CancelEvent | Null = js.native
    
    /* CompleteClass */
    override def createEvent(change: Change, query: QueryContext): Event = js.native
    
    def getEventRunner(eventData: CancelEvent): js.Function0[Unit] = js.native
    def getEventRunner(eventData: DataEvent): js.Function0[Unit] = js.native
    /**
      * Given event data, return a function to trigger the user's callback
      */
    /* CompleteClass */
    override def getEventRunner(eventData: Event): js.Function0[Unit] = js.native
    
    /**
      * False basically means this is a "dummy" callback container being used as a sentinel
      * to remove all callback containers of a particular type.  (e.g. if the user does
      * ref.off('value') without specifying a specific callback).
      *
      * (TODO: Rework this, since it's hacky)
      *
      */
    /* CompleteClass */
    override def hasAnyCallback(): Boolean = js.native
    
    /* CompleteClass */
    override def matches(other: EventRegistration): Boolean = js.native
    
    /**
      * True if this container has a callback to trigger for this event type
      */
    /* CompleteClass */
    override def respondsTo(eventType: String): Boolean = js.native
  }
  
  inline def child(parent: DatabaseReference, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("child")(parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def endAt(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")().asInstanceOf[QueryConstraint]
  inline def endAt(value: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endAt(value: String, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endAt(value: Boolean): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endAt(value: Boolean, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endAt(value: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endAt(value: Double, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endAt(value: Null, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def endBefore(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")().asInstanceOf[QueryConstraint]
  inline def endBefore(value: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endBefore(value: String, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endBefore(value: Boolean): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endBefore(value: Boolean, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endBefore(value: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def endBefore(value: Double, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def endBefore(value: Null, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def equalTo(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")().asInstanceOf[QueryConstraint]
  inline def equalTo(value: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def equalTo(value: String, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def equalTo(value: Boolean): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def equalTo(value: Boolean, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def equalTo(value: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def equalTo(value: Double, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def equalTo(value: Null, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def get(query: Query): js.Promise[DataSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DataSnapshot]]
  
  inline def limitToFirst(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToFirst")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def limitToLast(limit: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def off(query: Query): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(
    query: Query,
    eventType: Unit,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ js.UndefOr[String | Null], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(query: Query, eventType: EventType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    query: Query,
    eventType: EventType,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ js.UndefOr[String | Null], Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ js.UndefOr[String | Null], Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ js.UndefOr[String | Null], Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[/* snapshot */ DataSnapshot, /* previousChildName */ String | Null, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildRemoved(query: Query, callback: js.Function1[/* snapshot */ DataSnapshot, Any]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[/* snapshot */ DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[/* snapshot */ DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(query: Query, callback: js.Function1[/* snapshot */ DataSnapshot, Any], options: ListenOptions): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onDisconnect(ref: DatabaseReference): OnDisconnect = ^.asInstanceOf[js.Dynamic].applyDynamic("onDisconnect")(ref.asInstanceOf[js.Any]).asInstanceOf[OnDisconnect]
  
  inline def onValue(query: Query, callback: js.Function1[/* snapshot */ DataSnapshot, Any]): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query,
    callback: js.Function1[/* snapshot */ DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query,
    callback: js.Function1[/* snapshot */ DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(query: Query, callback: js.Function1[/* snapshot */ DataSnapshot, Any], options: ListenOptions): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def orderByChild(path: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByChild")(path.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  
  inline def orderByKey(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByKey")().asInstanceOf[QueryConstraint]
  
  inline def orderByPriority(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByPriority")().asInstanceOf[QueryConstraint]
  
  inline def orderByValue(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByValue")().asInstanceOf[QueryConstraint]
  
  inline def push(parent: DatabaseReference): ThenableReference = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any]).asInstanceOf[ThenableReference]
  inline def push(parent: DatabaseReference, value: Any): ThenableReference = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ThenableReference]
  
  inline def query(query: Query, queryConstraints: QueryConstraint*): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query]
  
  inline def ref(db: Database): DatabaseReference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any]).asInstanceOf[DatabaseReference]
  inline def ref(db: Database, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def refFromURL(db: Database, url: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("refFromURL")(db.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def remove(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def set(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPriority(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setWithPriority(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startAfter(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")().asInstanceOf[QueryConstraint]
  inline def startAfter(value: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAfter(value: String, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAfter(value: Boolean): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAfter(value: Boolean, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAfter(value: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAfter(value: Double, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAfter(value: Null, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def startAt(): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")().asInstanceOf[QueryConstraint]
  inline def startAt(value: String): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAt(value: String, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAt(value: Boolean): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAt(value: Boolean, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAt(value: Double): QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[QueryConstraint]
  inline def startAt(value: Double, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAt(value: Null, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  inline def startAt(value: Unit, key: String): QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[QueryConstraint]
  
  inline def update(ref: DatabaseReference, values: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseDatabase.firebaseDatabaseStrings.endAt
    - typings.firebaseDatabase.firebaseDatabaseStrings.endBefore
    - typings.firebaseDatabase.firebaseDatabaseStrings.startAt
    - typings.firebaseDatabase.firebaseDatabaseStrings.startAfter
    - typings.firebaseDatabase.firebaseDatabaseStrings.limitToFirst
    - typings.firebaseDatabase.firebaseDatabaseStrings.limitToLast
    - typings.firebaseDatabase.firebaseDatabaseStrings.orderByChild
    - typings.firebaseDatabase.firebaseDatabaseStrings.orderByKey
    - typings.firebaseDatabase.firebaseDatabaseStrings.orderByPriority
    - typings.firebaseDatabase.firebaseDatabaseStrings.orderByValue
    - typings.firebaseDatabase.firebaseDatabaseStrings.equalTo
  */
  trait QueryConstraintType extends StObject
  object QueryConstraintType {
    
    inline def endAt: typings.firebaseDatabase.firebaseDatabaseStrings.endAt = "endAt".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.endAt]
    
    inline def endBefore: typings.firebaseDatabase.firebaseDatabaseStrings.endBefore = "endBefore".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.endBefore]
    
    inline def equalTo: typings.firebaseDatabase.firebaseDatabaseStrings.equalTo = "equalTo".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.equalTo]
    
    inline def limitToFirst: typings.firebaseDatabase.firebaseDatabaseStrings.limitToFirst = "limitToFirst".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.limitToFirst]
    
    inline def limitToLast: typings.firebaseDatabase.firebaseDatabaseStrings.limitToLast = "limitToLast".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.limitToLast]
    
    inline def orderByChild: typings.firebaseDatabase.firebaseDatabaseStrings.orderByChild = "orderByChild".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.orderByChild]
    
    inline def orderByKey: typings.firebaseDatabase.firebaseDatabaseStrings.orderByKey = "orderByKey".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.orderByKey]
    
    inline def orderByPriority: typings.firebaseDatabase.firebaseDatabaseStrings.orderByPriority = "orderByPriority".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.orderByPriority]
    
    inline def orderByValue: typings.firebaseDatabase.firebaseDatabaseStrings.orderByValue = "orderByValue".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.orderByValue]
    
    inline def startAfter: typings.firebaseDatabase.firebaseDatabaseStrings.startAfter = "startAfter".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.startAfter]
    
    inline def startAt: typings.firebaseDatabase.firebaseDatabaseStrings.startAt = "startAt".asInstanceOf[typings.firebaseDatabase.firebaseDatabaseStrings.startAt]
  }
  
  /* Inlined parent @firebase/database.@firebase/database/dist/src/api/Reference_impl.ReferenceImpl */
  /* Inlined parent std.Pick<std.Promise<@firebase/database.@firebase/database/dist/src/api/Reference_impl.ReferenceImpl>, 'then' | 'catch'> */
  @js.native
  trait ThenableReferenceImpl extends StObject {
    
    val _orderByCalled: Boolean = js.native
    
    val _path: Path = js.native
    
    def _queryIdentifier: String = js.native
    @JSName("_queryIdentifier")
    val _queryIdentifier_FThenableReferenceImpl: String = js.native
    
    /**
      * An object representation of the query parameters used by this Query.
      */
    def _queryObject: js.Object = js.native
    @JSName("_queryObject")
    val _queryObject_FThenableReferenceImpl: js.Object = js.native
    
    val _queryParams: QueryParams = js.native
    
    val _repo: Repo = js.native
    
    def `catch`[TResult](): js.Promise[ReferenceImpl | TResult] = js.native
    @JSName("catch")
    var catch_Original: js.Function0[js.Promise[ReferenceImpl | scala.Nothing]] = js.native
    
    /**
      * Returns whether or not the current and provided queries represent the same
      * location, have the same query parameters, and are from the same instance of
      * `FirebaseApp`.
      *
      * Two `DatabaseReference` objects are equivalent if they represent the same location
      * and are from the same instance of `FirebaseApp`.
      *
      * Two `Query` objects are equivalent if they represent the same location,
      * have the same query parameters, and are from the same instance of
      * `FirebaseApp`. Equivalent queries share the same sort order, limits, and
      * starting and ending points.
      *
      * @param other - The query to compare against.
      * @returns Whether or not the current and provided queries are equivalent.
      */
    def isEqual(): Boolean = js.native
    def isEqual(other: QueryImpl): Boolean = js.native
    def isEqual(other: Query): Boolean = js.native
    
    def key: String | Null = js.native
    /**
      * The last part of the `DatabaseReference`'s path.
      *
      * For example, `"ada"` is the key for
      * `https://<DATABASE_NAME>.firebaseio.com/users/ada`.
      *
      * The key of a root `DatabaseReference` is `null`.
      */
    @JSName("key")
    val key_FThenableReferenceImpl: String | Null = js.native
    
    def parent: ReferenceImpl | Null = js.native
    /**
      * The parent location of a `DatabaseReference`.
      *
      * The parent of a root `DatabaseReference` is `null`.
      */
    @JSName("parent")
    val parent_FThenableReferenceImpl: DatabaseReference | Null = js.native
    
    def ref: DatabaseReference = js.native
    /** The `DatabaseReference` for the `Query`'s location. */
    @JSName("ref")
    val ref_FThenableReferenceImpl: DatabaseReference = js.native
    
    def root: ReferenceImpl = js.native
    /** The root `DatabaseReference` of the Database. */
    @JSName("root")
    val root_FThenableReferenceImpl: DatabaseReference = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: js.Function0[js.Promise[ReferenceImpl | scala.Nothing]] = js.native
    
    /**
      * Returns a JSON-serializable representation of this object.
      *
      * @returns A JSON-serializable representation of this object.
      */
    def toJSON(): String = js.native
  }
}
