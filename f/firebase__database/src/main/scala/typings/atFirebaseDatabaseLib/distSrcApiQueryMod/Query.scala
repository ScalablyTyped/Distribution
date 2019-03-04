package typings
package atFirebaseDatabaseLib.distSrcApiQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/api/Query", "Query")
@js.native
class Query protected () extends js.Object {
  def this(repo: atFirebaseDatabaseLib.distSrcCoreRepoMod.Repo, path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path, queryParams_ : atFirebaseDatabaseLib.distSrcCoreViewQueryParamsMod.QueryParams, orderByCalled_ : scala.Boolean) = this()
  var orderByCalled_ : js.Any = js.native
  var path: atFirebaseDatabaseLib.distSrcCoreUtilPathMod.Path = js.native
  var queryParams_ : js.Any = js.native
  val ref: atFirebaseDatabaseLib.distSrcApiReferenceMod.Reference = js.native
  var repo: atFirebaseDatabaseLib.distSrcCoreRepoMod.Repo = js.native
  /**
    * Validates that no other order by call has been made
    * @param {!string} fnName
    * @private
    */
  var validateNoPreviousOrderByCall_ : js.Any = js.native
  /**
    * @param {number|string|boolean|null} value
    * @param {?string=} name
    * @return {!Query}
    */
  def endAt(): Query = js.native
  def endAt(value: java.lang.String): Query = js.native
  def endAt(value: java.lang.String, name: java.lang.String): Query = js.native
  def endAt(value: scala.Boolean): Query = js.native
  def endAt(value: scala.Boolean, name: java.lang.String): Query = js.native
  def endAt(value: scala.Double): Query = js.native
  def endAt(value: scala.Double, name: java.lang.String): Query = js.native
  def endAt(value: scala.Null, name: java.lang.String): Query = js.native
  def equalTo(): Query = js.native
  def equalTo(value: java.lang.String): Query = js.native
  def equalTo(value: java.lang.String, name: java.lang.String): Query = js.native
  def equalTo(value: scala.Boolean): Query = js.native
  def equalTo(value: scala.Boolean, name: java.lang.String): Query = js.native
  /**
    * Load the selection of children with exactly the specified value, and, optionally,
    * the specified name.
    * @param {number|string|boolean|null} value
    * @param {string=} name
    * @return {!Query}
    */
  def equalTo(value: scala.Double): Query = js.native
  def equalTo(value: scala.Double, name: java.lang.String): Query = js.native
  def equalTo(value: scala.Null, name: java.lang.String): Query = js.native
  /**
    * @return {!QueryParams}
    */
  def getQueryParams(): atFirebaseDatabaseLib.distSrcCoreViewQueryParamsMod.QueryParams = js.native
  /**
    * @return {!Reference}
    */
  def getRef(): atFirebaseDatabaseLib.distSrcApiReferenceMod.Reference = js.native
  /**
    * Return true if this query and the provided query are equivalent; otherwise, return false.
    * @param {Query} other
    * @return {boolean}
    */
  def isEqual(other: Query): scala.Boolean = js.native
  /**
    * Set a limit and anchor it to the start of the window.
    * @param {!number} limit
    * @return {!Query}
    */
  def limitToFirst(limit: scala.Double): Query = js.native
  /**
    * Set a limit and anchor it to the end of the window.
    * @param {!number} limit
    * @return {!Query}
    */
  def limitToLast(limit: scala.Double): Query = js.native
  /**
    * @param {string=} eventType
    * @param {(function(!DataSnapshot, ?string=))=} callback
    * @param {Object=} context
    */
  def off(): scala.Unit = js.native
  def off(eventType: java.lang.String): scala.Unit = js.native
  def off(eventType: java.lang.String, callback: SnapshotCallback): scala.Unit = js.native
  def off(eventType: java.lang.String, callback: SnapshotCallback, context: js.Object): scala.Unit = js.native
  /**
    * @param {!string} eventType
    * @param {!function(DataSnapshot, string=)} callback
    * @param {(function(Error)|Object)=} cancelCallbackOrContext
    * @param {Object=} context
    * @return {!function(DataSnapshot, string=)}
    */
  def on(eventType: java.lang.String, callback: SnapshotCallback): SnapshotCallback = js.native
  def on(
    eventType: java.lang.String,
    callback: SnapshotCallback,
    cancelCallbackOrContext: js.Function1[/* a */ stdLib.Error, _]
  ): SnapshotCallback = js.native
  def on(
    eventType: java.lang.String,
    callback: SnapshotCallback,
    cancelCallbackOrContext: js.Function1[/* a */ stdLib.Error, _],
    context: js.Object
  ): SnapshotCallback = js.native
  def on(eventType: java.lang.String, callback: SnapshotCallback, cancelCallbackOrContext: js.Object): SnapshotCallback = js.native
  def on(
    eventType: java.lang.String,
    callback: SnapshotCallback,
    cancelCallbackOrContext: js.Object,
    context: js.Object
  ): SnapshotCallback = js.native
  def onChildEvent(callbacks: org.scalablytyped.runtime.StringDictionary[SnapshotCallback]): scala.Unit = js.native
  def onChildEvent(
    callbacks: org.scalablytyped.runtime.StringDictionary[SnapshotCallback],
    cancelCallback: js.Function1[/* a */ stdLib.Error, _]
  ): scala.Unit = js.native
  /**
    * @param {!Object.<string, !function(!DataSnapshot, ?string)>} callbacks
    * @param {?function(Error)} cancelCallback
    * @param {?Object} context
    * @protected
    */
  def onChildEvent(
    callbacks: org.scalablytyped.runtime.StringDictionary[SnapshotCallback],
    cancelCallback: js.Function1[/* a */ stdLib.Error, _],
    context: js.Object
  ): scala.Unit = js.native
  def onChildEvent(
    callbacks: org.scalablytyped.runtime.StringDictionary[SnapshotCallback],
    cancelCallback: scala.Null,
    context: js.Object
  ): scala.Unit = js.native
  /* protected */ def onValueEvent(
    callback: js.Function1[/* a */ atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, scala.Unit]
  ): scala.Unit = js.native
  /* protected */ def onValueEvent(
    callback: js.Function1[/* a */ atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, scala.Unit],
    cancelCallback: js.Function1[/* a */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  /**
    * @param {!function(!DataSnapshot)} callback
    * @param {?function(Error)} cancelCallback
    * @param {?Object} context
    * @protected
    */
  /* protected */ def onValueEvent(
    callback: js.Function1[/* a */ atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, scala.Unit],
    cancelCallback: js.Function1[/* a */ stdLib.Error, scala.Unit],
    context: js.Object
  ): scala.Unit = js.native
  /* protected */ def onValueEvent(
    callback: js.Function1[/* a */ atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot, scala.Unit],
    cancelCallback: scala.Null,
    context: js.Object
  ): scala.Unit = js.native
  /**
    * Attaches a listener, waits for the first event, and then removes the listener
    * @param {!string} eventType
    * @param {!function(!DataSnapshot, string=)} userCallback
    * @param cancelOrContext
    * @param context
    * @return {!firebase.Promise}
    */
  def once(eventType: java.lang.String): js.Promise[atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot] = js.native
  def once(eventType: java.lang.String, userCallback: SnapshotCallback): js.Promise[atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot] = js.native
  def once(
    eventType: java.lang.String,
    userCallback: SnapshotCallback,
    cancelOrContext: js.Function1[/* a */ stdLib.Error, scala.Unit]
  ): js.Promise[atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot] = js.native
  def once(
    eventType: java.lang.String,
    userCallback: SnapshotCallback,
    cancelOrContext: js.Function1[/* a */ stdLib.Error, scala.Unit],
    context: js.Object
  ): js.Promise[atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot] = js.native
  def once(eventType: java.lang.String, userCallback: SnapshotCallback, cancelOrContext: js.Object): js.Promise[atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot] = js.native
  def once(
    eventType: java.lang.String,
    userCallback: SnapshotCallback,
    cancelOrContext: js.Object,
    context: js.Object
  ): js.Promise[atFirebaseDatabaseLib.distSrcApiDataSnapshotMod.DataSnapshot] = js.native
  /**
    * Given a child path, return a new query ordered by the specified grandchild path.
    * @param {!string} path
    * @return {!Query}
    */
  def orderByChild(path: java.lang.String): Query = js.native
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
  /**
    * @return {!string}
    */
  def queryIdentifier(): java.lang.String = js.native
  /**
    * An object representation of the query parameters used by this Query.
    * @return {!Object}
    */
  def queryObject(): js.Object = js.native
  /**
    * @param {number|string|boolean|null} value
    * @param {?string=} name
    * @return {!Query}
    */
  def startAt(): Query = js.native
  def startAt(value: java.lang.String): Query = js.native
  def startAt(value: java.lang.String, name: java.lang.String): Query = js.native
  def startAt(value: scala.Boolean): Query = js.native
  def startAt(value: scala.Boolean, name: java.lang.String): Query = js.native
  def startAt(value: scala.Double): Query = js.native
  def startAt(value: scala.Double, name: java.lang.String): Query = js.native
  def startAt(value: scala.Null, name: java.lang.String): Query = js.native
  def toJSON(): java.lang.String = js.native
}

/* static members */
@JSImport("@firebase/database/dist/src/api/Query", "Query")
@js.native
object Query extends js.Object {
  var __referenceConstructor: js.Any = js.native
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

