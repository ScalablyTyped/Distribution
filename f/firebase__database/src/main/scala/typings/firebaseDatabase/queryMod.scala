package typings.firebaseDatabase

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.firebaseDatabase.dataSnapshotMod.DataSnapshot
import typings.firebaseDatabase.pathMod.Path
import typings.firebaseDatabase.queryParamsMod.QueryParams
import typings.firebaseDatabase.referenceMod.Reference
import typings.firebaseDatabase.repoMod.Repo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/src/api/Query", JSImport.Namespace)
@js.native
object queryMod extends js.Object {
  
  @js.native
  class Query protected () extends js.Object {
    def this(repo: Repo, path: Path, queryParams_ : QueryParams, orderByCalled_ : Boolean) = this()
    
    /**
      * @param {number|string|boolean|null} value
      * @param {?string=} name
      * @return {!Query}
      */
    def endAt(): Query = js.native
    def endAt(value: js.UndefOr[scala.Nothing], name: String): Query = js.native
    def endAt(value: String): Query = js.native
    def endAt(value: String, name: String): Query = js.native
    def endAt(value: Boolean): Query = js.native
    def endAt(value: Boolean, name: String): Query = js.native
    def endAt(value: Double): Query = js.native
    def endAt(value: Double, name: String): Query = js.native
    def endAt(value: Null, name: String): Query = js.native
    
    /**
      * Load the selection of children with exactly the specified value, and, optionally,
      * the specified name.
      * @param {number|string|boolean|null} value
      * @param {string=} name
      * @return {!Query}
      */
    def equalTo(): Query = js.native
    def equalTo(value: String): Query = js.native
    def equalTo(value: String, name: String): Query = js.native
    def equalTo(value: Boolean): Query = js.native
    def equalTo(value: Boolean, name: String): Query = js.native
    def equalTo(value: Double): Query = js.native
    def equalTo(value: Double, name: String): Query = js.native
    def equalTo(value: Null, name: String): Query = js.native
    
    /**
      * Get the server-value for this query, or return a cached value if not connected.
      */
    def get(): js.Promise[DataSnapshot] = js.native
    
    /**
      * @return {!QueryParams}
      */
    def getQueryParams(): QueryParams = js.native
    
    /**
      * @return {!Reference}
      */
    def getRef(): Reference = js.native
    
    /**
      * Return true if this query and the provided query are equivalent; otherwise, return false.
      * @param {Query} other
      * @return {boolean}
      */
    def isEqual(other: Query): Boolean = js.native
    
    /**
      * Set a limit and anchor it to the start of the window.
      * @param {!number} limit
      * @return {!Query}
      */
    def limitToFirst(limit: Double): Query = js.native
    
    /**
      * Set a limit and anchor it to the end of the window.
      * @param {!number} limit
      * @return {!Query}
      */
    def limitToLast(limit: Double): Query = js.native
    
    /**
      * @param {string=} eventType
      * @param {(function(!DataSnapshot, ?string=))=} callback
      * @param {Object=} context
      */
    def off(): Unit = js.native
    def off(eventType: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Object): Unit = js.native
    def off(eventType: js.UndefOr[scala.Nothing], callback: SnapshotCallback): Unit = js.native
    def off(eventType: js.UndefOr[scala.Nothing], callback: SnapshotCallback, context: js.Object): Unit = js.native
    def off(eventType: String): Unit = js.native
    def off(eventType: String, callback: js.UndefOr[scala.Nothing], context: js.Object): Unit = js.native
    def off(eventType: String, callback: SnapshotCallback): Unit = js.native
    def off(eventType: String, callback: SnapshotCallback, context: js.Object): Unit = js.native
    
    /**
      * @param {!string} eventType
      * @param {!function(DataSnapshot, string=)} callback
      * @param {(function(Error)|Object)=} cancelCallbackOrContext
      * @param {Object=} context
      * @return {!function(DataSnapshot, string=)}
      */
    def on(eventType: String, callback: SnapshotCallback): SnapshotCallback = js.native
    def on(
      eventType: String,
      callback: SnapshotCallback,
      cancelCallbackOrContext: js.UndefOr[scala.Nothing],
      context: js.Object
    ): SnapshotCallback = js.native
    def on(
      eventType: String,
      callback: SnapshotCallback,
      cancelCallbackOrContext: js.Function1[/* a */ Error, _]
    ): SnapshotCallback = js.native
    def on(
      eventType: String,
      callback: SnapshotCallback,
      cancelCallbackOrContext: js.Function1[/* a */ Error, _],
      context: js.Object
    ): SnapshotCallback = js.native
    def on(eventType: String, callback: SnapshotCallback, cancelCallbackOrContext: js.Object): SnapshotCallback = js.native
    def on(
      eventType: String,
      callback: SnapshotCallback,
      cancelCallbackOrContext: js.Object,
      context: js.Object
    ): SnapshotCallback = js.native
    def on(eventType: String, callback: SnapshotCallback, cancelCallbackOrContext: Null, context: js.Object): SnapshotCallback = js.native
    
    /**
      * @param {!Object.<string, !function(!DataSnapshot, ?string)>} callbacks
      * @param {?function(Error)} cancelCallback
      * @param {?Object} context
      * @protected
      */
    def onChildEvent(callbacks: StringDictionary[SnapshotCallback]): Unit = js.native
    def onChildEvent(callbacks: StringDictionary[SnapshotCallback], cancelCallback: js.Function1[/* a */ Error, _]): Unit = js.native
    def onChildEvent(
      callbacks: StringDictionary[SnapshotCallback],
      cancelCallback: js.Function1[/* a */ Error, _],
      context: js.Object
    ): Unit = js.native
    def onChildEvent(callbacks: StringDictionary[SnapshotCallback], cancelCallback: Null, context: js.Object): Unit = js.native
    
    /**
      * @param {!function(!DataSnapshot)} callback
      * @param {?function(Error)} cancelCallback
      * @param {?Object} context
      * @protected
      */
    /* protected */ def onValueEvent(callback: js.Function1[/* a */ DataSnapshot, Unit]): Unit = js.native
    /* protected */ def onValueEvent(
      callback: js.Function1[/* a */ DataSnapshot, Unit],
      cancelCallback: js.Function1[/* a */ Error, Unit]
    ): Unit = js.native
    /* protected */ def onValueEvent(
      callback: js.Function1[/* a */ DataSnapshot, Unit],
      cancelCallback: js.Function1[/* a */ Error, Unit],
      context: js.Object
    ): Unit = js.native
    /* protected */ def onValueEvent(callback: js.Function1[/* a */ DataSnapshot, Unit], cancelCallback: Null, context: js.Object): Unit = js.native
    
    /**
      * Attaches a listener, waits for the first event, and then removes the listener
      * @param {!string} eventType
      * @param {!function(!DataSnapshot, string=)} userCallback
      * @param failureCallbackOrContext
      * @param context
      * @return {!firebase.Promise}
      */
    def once(eventType: String): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      userCallback: js.UndefOr[scala.Nothing],
      failureCallbackOrContext: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      userCallback: js.UndefOr[scala.Nothing],
      failureCallbackOrContext: js.Function1[/* a */ Error, Unit]
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      userCallback: js.UndefOr[scala.Nothing],
      failureCallbackOrContext: js.Function1[/* a */ Error, Unit],
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, userCallback: js.UndefOr[scala.Nothing], failureCallbackOrContext: js.Object): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      userCallback: js.UndefOr[scala.Nothing],
      failureCallbackOrContext: js.Object,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      userCallback: js.UndefOr[scala.Nothing],
      failureCallbackOrContext: Null,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, userCallback: SnapshotCallback): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      userCallback: SnapshotCallback,
      failureCallbackOrContext: js.UndefOr[scala.Nothing],
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      userCallback: SnapshotCallback,
      failureCallbackOrContext: js.Function1[/* a */ Error, Unit]
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      userCallback: SnapshotCallback,
      failureCallbackOrContext: js.Function1[/* a */ Error, Unit],
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: String, userCallback: SnapshotCallback, failureCallbackOrContext: js.Object): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      userCallback: SnapshotCallback,
      failureCallbackOrContext: js.Object,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: String,
      userCallback: SnapshotCallback,
      failureCallbackOrContext: Null,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    
    var orderByCalled_ : js.Any = js.native
    
    /**
      * Given a child path, return a new query ordered by the specified grandchild path.
      * @param {!string} path
      * @return {!Query}
      */
    def orderByChild(path: String): Query = js.native
    
    /**
      * Return a new query ordered by the KeyIndex
      * @return {!Query}
      */
    def orderByKey(): Query = js.native
    
    /**
      * Return a new query ordered by the PriorityIndex
      * @return {!Query}
      */
    def orderByPriority(): Query = js.native
    
    /**
      * Return a new query ordered by the ValueIndex
      * @return {!Query}
      */
    def orderByValue(): Query = js.native
    
    var path: Path = js.native
    
    /**
      * @return {!string}
      */
    def queryIdentifier(): String = js.native
    
    /**
      * An object representation of the query parameters used by this Query.
      * @return {!Object}
      */
    def queryObject(): js.Object = js.native
    
    var queryParams_ : js.Any = js.native
    
    def ref: Reference = js.native
    
    var repo: Repo = js.native
    
    /**
      * @param {number|string|boolean|null} value
      * @param {?string=} name
      * @return {!Query}
      */
    def startAt(): Query = js.native
    def startAt(value: js.UndefOr[scala.Nothing], name: String): Query = js.native
    def startAt(value: String): Query = js.native
    def startAt(value: String, name: String): Query = js.native
    def startAt(value: Boolean): Query = js.native
    def startAt(value: Boolean, name: String): Query = js.native
    def startAt(value: Double): Query = js.native
    def startAt(value: Double, name: String): Query = js.native
    def startAt(value: Null, name: String): Query = js.native
    
    def toJSON(): String = js.native
    
    /**
      * Validates that no other order by call has been made
      * @param {!string} fnName
      * @private
      */
    var validateNoPreviousOrderByCall_ : js.Any = js.native
  }
  /* static members */
  @js.native
  object Query extends js.Object {
    
    def __referenceConstructor: Instantiable2[/* repo */ Repo, /* path */ Path, Query] = js.native
    def __referenceConstructor_=(`val`: Instantiable2[/* repo */ Repo, /* path */ Path, Query]): Unit = js.native
    
    /**
      * Helper used by .on and .once to extract the context and or cancel arguments.
      * @param {!string} fnName The function name (on or once)
      * @param {(function(Error)|Object)=} cancelOrContext
      * @param {Object=} context
      * @return {{cancel: ?function(Error), context: ?Object}}
      * @private
      */
    var getCancelAndContextArgs_ : js.Any = js.native
    
    /**
      * Validates that limit* has been called with the correct combination of parameters
      * @param {!QueryParams} params
      * @private
      */
    var validateLimit_ : js.Any = js.native
    
    /**
      * Validates start/end values for queries.
      * @param {!QueryParams} params
      * @private
      */
    var validateQueryEndpoints_ : js.Any = js.native
  }
  
  type SnapshotCallback = js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], js.Any]
}
