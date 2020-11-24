package typings.firebase.mod.firebase.database

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent firebase.firebase.firebase.database.Reference */
/* Inlined parent std.Pick<std.Promise<firebase.firebase.firebase.database.Reference>, 'then' | 'catch'> */
@js.native
trait ThenableReference extends js.Object {
  
  def `catch`[TResult](): js.Promise[Reference | TResult] = js.native
  @JSName("catch")
  var catch_Original: js.Function0[js.Promise[Reference | scala.Nothing]] = js.native
  
  /**
    * Gets a `Reference` for the location at the specified relative path.
    *
    * The relative path can either be a simple child name (for example, "ada") or
    * a deeper slash-separated path (for example, "ada/name/first").
    *
    * @example
    * ```javascript
    * var usersRef = firebase.database().ref('users');
    * var adaRef = usersRef.child('ada');
    * var adaFirstNameRef = adaRef.child('name/first');
    * var path = adaFirstNameRef.toString();
    * // path is now 'https://sample-app.firebaseio.com/users/ada/name/first'
    * ```
    *
    * @param path A relative path from this location to the desired child
    *   location.
    * @return The specified child location.
    */
  def child(path: String): Reference = js.native
  
  /**
    * Creates a `Query` with the specified ending point.
    *
    * Using `startAt()`, `endAt()`, and `equalTo()` allows you to choose arbitrary
    * starting and ending points for your queries.
    *
    * The ending point is inclusive, so children with exactly the specified value
    * will be included in the query. The optional key argument can be used to
    * further limit the range of the query. If it is specified, then children that
    * have exactly the specified value must also have a key name less than or equal
    * to the specified key.
    *
    * You can read more about `endAt()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#filtering_data
    *  Filtering data}.
    *
    * @example
    * ```javascript
    * // Find all dinosaurs whose names come before Pterodactyl lexicographically.
    * var ref = firebase.database().ref("dinosaurs");
    * ref.orderByKey().endAt("pterodactyl").on("child_added", function(snapshot) {
    *   console.log(snapshot.key);
    * });
    * ```
    *
    * @param value The value to end at. The argument
    *   type depends on which `orderBy*()` function was used in this query.
    *   Specify a value that matches the `orderBy*()` type. When used in
    *   combination with `orderByKey()`, the value must be a string.
    * @param key The child key to end at, among the children with the
    *   previously specified priority. This argument is only allowed if ordering by
    *   child, value, or priority.
    */
  def endAt(): Query = js.native
  def endAt(value: String): Query = js.native
  def endAt(value: String, key: String): Query = js.native
  def endAt(value: Boolean): Query = js.native
  def endAt(value: Boolean, key: String): Query = js.native
  def endAt(value: Double): Query = js.native
  def endAt(value: Double, key: String): Query = js.native
  def endAt(value: Null, key: String): Query = js.native
  
  /**
    * Creates a `Query` that includes children that match the specified value.
    *
    * Using `startAt()`, `endAt()`, and `equalTo()` allows us to choose arbitrary
    * starting and ending points for our queries.
    *
    * The optional key argument can be used to further limit the range of the
    * query. If it is specified, then children that have exactly the specified
    * value must also have exactly the specified key as their key name. This can be
    * used to filter result sets with many matches for the same value.
    *
    * You can read more about `equalTo()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#filtering_data
    *  Filtering data}.
    *
    * @example
    * ```javascript
    * // Find all dinosaurs whose height is exactly 25 meters.
    * var ref = firebase.database().ref("dinosaurs");
    * ref.orderByChild("height").equalTo(25).on("child_added", function(snapshot) {
    *   console.log(snapshot.key);
    * });
    * ```
    *
    * @param value The value to match for. The
    *   argument type depends on which `orderBy*()` function was used in this
    *   query. Specify a value that matches the `orderBy*()` type. When used in
    *   combination with `orderByKey()`, the value must be a string.
    * @param key The child key to start at, among the children with the
    *   previously specified priority. This argument is only allowed if ordering by
    *   child, value, or priority.
    */
  def equalTo(): Query = js.native
  def equalTo(value: String): Query = js.native
  def equalTo(value: String, key: String): Query = js.native
  def equalTo(value: Boolean): Query = js.native
  def equalTo(value: Boolean, key: String): Query = js.native
  def equalTo(value: Double): Query = js.native
  def equalTo(value: Double, key: String): Query = js.native
  def equalTo(value: Null, key: String): Query = js.native
  
  /**
    * Gets the most up-to-date result for this query.
    *
    * @return A promise which resolves to the resulting DataSnapshot if
    * a value is available, or rejects if the client is unable to return
    * a value (e.g., if the server is unreachable and there is nothing
    * cached).
    */
  def get(): js.Promise[DataSnapshot] = js.native
  
  /**
    * Returns whether or not the current and provided queries represent the same
    * location, have the same query parameters, and are from the same instance of
    * `firebase.app.App`.
    *
    * Two `Reference` objects are equivalent if they represent the same location
    * and are from the same instance of `firebase.app.App`.
    *
    * Two `Query` objects are equivalent if they represent the same location, have
    * the same query parameters, and are from the same instance of
    * `firebase.app.App`. Equivalent queries share the same sort order, limits, and
    * starting and ending points.
    *
    * @example
    * ```javascript
    * var rootRef = firebase.database.ref();
    * var usersRef = rootRef.child("users");
    *
    * usersRef.isEqual(rootRef);  // false
    * usersRef.isEqual(rootRef.child("users"));  // true
    * usersRef.parent.isEqual(rootRef);  // true
    * ```
    *
    * @example
    * ```javascript
    * var rootRef = firebase.database.ref();
    * var usersRef = rootRef.child("users");
    * var usersQuery = usersRef.limitToLast(10);
    *
    * usersQuery.isEqual(usersRef);  // false
    * usersQuery.isEqual(usersRef.limitToLast(10));  // true
    * usersQuery.isEqual(rootRef.limitToLast(10));  // false
    * usersQuery.isEqual(usersRef.orderByKey().limitToLast(10));  // false
    * ```
    *
    * @param other The query to compare against.
    * @return Whether or not the current and provided queries are
    *   equivalent.
    */
  def isEqual(): Boolean = js.native
  def isEqual(other: Query): Boolean = js.native
  
  /**
    * The last part of the `Reference`'s path.
    *
    * For example, `"ada"` is the key for
    * `https://<DATABASE_NAME>.firebaseio.com/users/ada`.
    *
    * The key of a root `Reference` is `null`.
    *
    * @example
    * ```javascript
    * // The key of a root reference is null
    * var rootRef = firebase.database().ref();
    * var key = rootRef.key;  // key === null
    * ```
    *
    * @example
    * ```javascript
    * // The key of any non-root reference is the last token in the path
    * var adaRef = firebase.database().ref("users/ada");
    * var key = adaRef.key;  // key === "ada"
    * key = adaRef.child("name/last").key;  // key === "last"
    * ```
    */
  var key: String | Null = js.native
  
  /**
    * Generates a new `Query` limited to the first specific number of children.
    *
    * The `limitToFirst()` method is used to set a maximum number of children to be
    * synced for a given callback. If we set a limit of 100, we will initially only
    * receive up to 100 `child_added` events. If we have fewer than 100 messages
    * stored in our Database, a `child_added` event will fire for each message.
    * However, if we have over 100 messages, we will only receive a `child_added`
    * event for the first 100 ordered messages. As items change, we will receive
    * `child_removed` events for each item that drops out of the active list so
    * that the total number stays at 100.
    *
    * You can read more about `limitToFirst()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#filtering_data
    *  Filtering data}.
    *
    * @example
    * ```javascript
    * // Find the two shortest dinosaurs.
    * var ref = firebase.database().ref("dinosaurs");
    * ref.orderByChild("height").limitToFirst(2).on("child_added", function(snapshot) {
    *   // This will be called exactly two times (unless there are less than two
    *   // dinosaurs in the Database).
    *
    *   // It will also get fired again if one of the first two dinosaurs is
    *   // removed from the data set, as a new dinosaur will now be the second
    *   // shortest.
    *   console.log(snapshot.key);
    * });
    * ```
    *
    * @param limit The maximum number of nodes to include in this query.
    */
  def limitToFirst(limit: Double): Query = js.native
  
  /**
    * Generates a new `Query` object limited to the last specific number of
    * children.
    *
    * The `limitToLast()` method is used to set a maximum number of children to be
    * synced for a given callback. If we set a limit of 100, we will initially only
    * receive up to 100 `child_added` events. If we have fewer than 100 messages
    * stored in our Database, a `child_added` event will fire for each message.
    * However, if we have over 100 messages, we will only receive a `child_added`
    * event for the last 100 ordered messages. As items change, we will receive
    * `child_removed` events for each item that drops out of the active list so
    * that the total number stays at 100.
    *
    * You can read more about `limitToLast()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#filtering_data
    *  Filtering data}.
    *
    * @example
    * ```javascript
    * // Find the two heaviest dinosaurs.
    * var ref = firebase.database().ref("dinosaurs");
    * ref.orderByChild("weight").limitToLast(2).on("child_added", function(snapshot) {
    *   // This callback will be triggered exactly two times, unless there are
    *   // fewer than two dinosaurs stored in the Database. It will also get fired
    *   // for every new, heavier dinosaur that gets added to the data set.
    *   console.log(snapshot.key);
    * });
    * ```
    *
    * @param limit The maximum number of nodes to include in this query.
    */
  def limitToLast(limit: Double): Query = js.native
  
  /**
    * Detaches a callback previously attached with `on()`.
    *
    * Detach a callback previously attached with `on()`. Note that if `on()` was
    * called multiple times with the same eventType and callback, the callback
    * will be called multiple times for each event, and `off()` must be called
    * multiple times to remove the callback. Calling `off()` on a parent listener
    * will not automatically remove listeners registered on child nodes, `off()`
    * must also be called on any child listeners to remove the callback.
    *
    * If a callback is not specified, all callbacks for the specified eventType
    * will be removed. Similarly, if no eventType is specified, all callbacks
    * for the `Reference` will be removed.
    *
    * @example
    * ```javascript
    * var onValueChange = function(dataSnapshot) {  ... };
    * ref.on('value', onValueChange);
    * ref.child('meta-data').on('child_added', onChildAdded);
    * // Sometime later...
    * ref.off('value', onValueChange);
    *
    * // You must also call off() for any child listeners on ref
    * // to cancel those callbacks
    * ref.child('meta-data').off('child_added', onValueAdded);
    * ```
    *
    * @example
    * ```javascript
    * // Or you can save a line of code by using an inline function
    * // and on()'s return value.
    * var onValueChange = ref.on('value', function(dataSnapshot) { ... });
    * // Sometime later...
    * ref.off('value', onValueChange);
    * ```
    *
    * @param eventType One of the following strings: "value",
    *   "child_added", "child_changed", "child_removed", or "child_moved." If
    *   omitted, all callbacks for the `Reference` will be removed.
    * @param callback The callback function that was passed to `on()` or
    *   `undefined` to remove all callbacks.
    * @param context The context that was passed to `on()`.
    */
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
  
  /**
    * Listens for data changes at a particular location.
    *
    * This is the primary way to read data from a Database. Your callback
    * will be triggered for the initial data and again whenever the data changes.
    * Use `off( )` to stop receiving updates. See
    * {@link https://firebase.google.com/docs/database/web/retrieve-data
    *   Retrieve Data on the Web}
    * for more details.
    *
    * <h4>value event</h4>
    *
    * This event will trigger once with the initial data stored at this location,
    * and then trigger again each time the data changes. The `DataSnapshot` passed
    * to the callback will be for the location at which `on()` was called. It
    * won't trigger until the entire contents has been synchronized. If the
    * location has no data, it will be triggered with an empty `DataSnapshot`
    * (`val()` will return `null`).
    *
    * <h4>child_added event</h4>
    *
    * This event will be triggered once for each initial child at this location,
    * and it will be triggered again every time a new child is added. The
    * `DataSnapshot` passed into the callback will reflect the data for the
    * relevant child. For ordering purposes, it is passed a second argument which
    * is a string containing the key of the previous sibling child by sort order,
    * or `null` if it is the first child.
    *
    * <h4>child_removed event</h4>
    *
    * This event will be triggered once every time a child is removed. The
    * `DataSnapshot` passed into the callback will be the old data for the child
    * that was removed. A child will get removed when either:
    *
    * - a client explicitly calls `remove()` on that child or one of its ancestors
    * - a client calls `set(null)` on that child or one of its ancestors
    * - that child has all of its children removed
    * - there is a query in effect which now filters out the child (because it's
    *   sort order changed or the max limit was hit)
    *
    * <h4>child_changed event</h4>
    *
    * This event will be triggered when the data stored in a child (or any of its
    * descendants) changes. Note that a single `child_changed` event may represent
    * multiple changes to the child. The `DataSnapshot` passed to the callback will
    * contain the new child contents. For ordering purposes, the callback is also
    * passed a second argument which is a string containing the key of the previous
    * sibling child by sort order, or `null` if it is the first child.
    *
    * <h4>child_moved event</h4>
    *
    * This event will be triggered when a child's sort order changes such that its
    * position relative to its siblings changes. The `DataSnapshot` passed to the
    * callback will be for the data of the child that has moved. It is also passed
    * a second argument which is a string containing the key of the previous
    * sibling child by sort order, or `null` if it is the first child.
    *
    * @example **Handle a new value:**
    * ```javascript
    * ref.on('value', function(dataSnapshot) {
    *   ...
    * });
    * ```
    *
    * @example **Handle a new child:**
    * ```javascript
    * ref.on('child_added', function(childSnapshot, prevChildKey) {
    *   ...
    * });
    * ```
    *
    * @example **Handle child removal:**
    * ```javascript
    * ref.on('child_removed', function(oldChildSnapshot) {
    *   ...
    * });
    * ```
    *
    * @example **Handle child data changes:**
    * ```javascript
    * ref.on('child_changed', function(childSnapshot, prevChildKey) {
    *   ...
    * });
    * ```
    *
    * @example **Handle child ordering changes:**
    * ```javascript
    * ref.on('child_moved', function(childSnapshot, prevChildKey) {
    *   ...
    * });
    * ```
    *
    * @param eventType One of the following strings: "value",
    *   "child_added", "child_changed", "child_removed", or "child_moved."
    * @param callback A
    *   callback that fires when the specified event occurs. The callback will be
    *   passed a DataSnapshot. For ordering purposes, "child_added",
    *   "child_changed", and "child_moved" will also be passed a string containing
    *   the key of the previous child, by sort order, or `null` if it is the
    *   first child.
    * @param cancelCallbackOrContext An optional
    *   callback that will be notified if your event subscription is ever canceled
    *   because your client does not have permission to read this data (or it had
    *   permission but has now lost it). This callback will be passed an `Error`
    *   object indicating why the failure occurred.
    * @param context If provided, this object will be used as `this`
    *   when calling your callback(s).
    * @return The provided
    *   callback function is returned unmodified. This is just for convenience if
    *   you want to pass an inline function to `on()` but store the callback
    *   function for later passing to `off()`.
    */
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _]
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.UndefOr[scala.Nothing],
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.Object
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: js.Object,
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], _] = js.native
  def on(
    eventType: EventType,
    callback: js.Function2[/* a */ DataSnapshot, /* b */ js.UndefOr[String | Null], _],
    cancelCallbackOrContext: Null,
    context: js.Object
  ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String | Null], _] = js.native
  
  /**
    * Returns an `OnDisconnect` object - see
    * {@link
    *   https://firebase.google.com/docs/database/web/offline-capabilities
    *   Enabling Offline Capabilities in JavaScript} for more information on how
    * to use it.
    */
  def onDisconnect(): OnDisconnect = js.native
  
  /**
    * Listens for exactly one event of the specified event type, and then stops
    * listening.
    *
    * This is equivalent to calling {@link firebase.database.Query.on `on()`}, and
    * then calling {@link firebase.database.Query.off `off()`} inside the callback
    * function. See {@link firebase.database.Query.on `on()`} for details on the
    * event types.
    *
    * @example
    * ```javascript
    * // Basic usage of .once() to read the data located at ref.
    * ref.once('value')
    *   .then(function(dataSnapshot) {
    *     // handle read data.
    *   });
    * ```
    *
    * @param eventType One of the following strings: "value",
    *   "child_added", "child_changed", "child_removed", or "child_moved."
    * @param successCallback A
    *   callback that fires when the specified event occurs. The callback will be
    *   passed a DataSnapshot. For ordering purposes, "child_added",
    *   "child_changed", and "child_moved" will also be passed a string containing
    *   the key of the previous child by sort order, or `null` if it is the
    *   first child.
    * @param failureCallbackOrContext An optional
    *   callback that will be notified if your client does not have permission to
    *   read the data. This callback will be passed an `Error` object indicating
    *   why the failure occurred.
    * @param context If provided, this object will be used as `this`
    *   when calling your callback(s).
    */
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
  
  /**
    * Generates a new `Query` object ordered by the specified child key.
    *
    * Queries can only order by one key at a time. Calling `orderByChild()`
    * multiple times on the same query is an error.
    *
    * Firebase queries allow you to order your data by any child key on the fly.
    * However, if you know in advance what your indexes will be, you can define
    * them via the .indexOn rule in your Security Rules for better performance. See
    * the {@link https://firebase.google.com/docs/database/security/indexing-data
    * .indexOn} rule for more information.
    *
    * You can read more about `orderByChild()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sort_data
    *  Sort data}.
    *
    * @example
    * ```javascript
    * var ref = firebase.database().ref("dinosaurs");
    * ref.orderByChild("height").on("child_added", function(snapshot) {
    *   console.log(snapshot.key + " was " + snapshot.val().height + " m tall");
    * });
    * ```
    */
  def orderByChild(path: String): Query = js.native
  
  /**
    * Generates a new `Query` object ordered by key.
    *
    * Sorts the results of a query by their (ascending) key values.
    *
    * You can read more about `orderByKey()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sort_data
    *  Sort data}.
    *
    * @example
    * ```javascript
    * var ref = firebase.database().ref("dinosaurs");
    * ref.orderByKey().on("child_added", function(snapshot) {
    *   console.log(snapshot.key);
    * });
    * ```
    */
  def orderByKey(): Query = js.native
  
  /**
    * Generates a new `Query` object ordered by priority.
    *
    * Applications need not use priority but can order collections by
    * ordinary properties (see
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sort_data
    *  Sort data} for alternatives to priority.
    */
  def orderByPriority(): Query = js.native
  
  /**
    * Generates a new `Query` object ordered by value.
    *
    * If the children of a query are all scalar values (string, number, or
    * boolean), you can order the results by their (ascending) values.
    *
    * You can read more about `orderByValue()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sort_data
    *  Sort data}.
    *
    * @example
    * ```javascript
    * var scoresRef = firebase.database().ref("scores");
    * scoresRef.orderByValue().limitToLast(3).on("value", function(snapshot) {
    *   snapshot.forEach(function(data) {
    *     console.log("The " + data.key + " score is " + data.val());
    *   });
    * });
    * ```
    */
  def orderByValue(): Query = js.native
  
  /**
    * The parent location of a `Reference`.
    *
    * The parent of a root `Reference` is `null`.
    *
    * @example
    * ```javascript
    * // The parent of a root reference is null
    * var rootRef = firebase.database().ref();
    * parent = rootRef.parent;  // parent === null
    * ```
    *
    * @example
    * ```javascript
    * // The parent of any non-root reference is the parent location
    * var usersRef = firebase.database().ref("users");
    * var adaRef = firebase.database().ref("users/ada");
    * // usersRef and adaRef.parent represent the same location
    * ```
    */
  var parent: Reference | Null = js.native
  
  /**
    * Generates a new child location using a unique key and returns its
    * `Reference`.
    *
    * This is the most common pattern for adding data to a collection of items.
    *
    * If you provide a value to `push()`, the value is written to the
    * generated location. If you don't pass a value, nothing is written to the
    * database and the child remains empty (but you can use the `Reference`
    * elsewhere).
    *
    * The unique keys generated by `push()` are ordered by the current time, so the
    * resulting list of items is chronologically sorted. The keys are also
    * designed to be unguessable (they contain 72 random bits of entropy).
    *
    *
    * See
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#append_to_a_list_of_data
    *  Append to a list of data}
    * </br>See
    * {@link
    *  https://firebase.googleblog.com/2015/02/the-2120-ways-to-ensure-unique_68.html
    *  The 2^120 Ways to Ensure Unique Identifiers}
    *
    * @example
    * ```javascript
    * var messageListRef = firebase.database().ref('message_list');
    * var newMessageRef = messageListRef.push();
    * newMessageRef.set({
    *   'user_id': 'ada',
    *   'text': 'The Analytical Engine weaves algebraical patterns just as the Jacquard loom weaves flowers and leaves.'
    * });
    * // We've appended a new message to the message_list location.
    * var path = newMessageRef.toString();
    * // path will be something like
    * // 'https://sample-app.firebaseio.com/message_list/-IKo28nwJLH0Nc5XeFmj'
    * ```
    *
    * @param value Optional value to be written at the generated location.
    * @param onComplete Callback called when write to server is
    *   complete.
    * @return Combined `Promise` and `Reference`; resolves when write is complete, but can be
    *   used immediately as the `Reference` to the child location.
    */
  def push(): ThenableReference = js.native
  def push(value: js.UndefOr[scala.Nothing], onComplete: js.Function1[/* a */ Error | Null, _]): ThenableReference = js.native
  def push(value: js.Any): ThenableReference = js.native
  def push(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, _]): ThenableReference = js.native
  
  /**
    * Returns a `Reference` to the `Query`'s location.
    */
  var ref: Reference = js.native
  
  /**
    * Removes the data at this Database location.
    *
    * Any data at child locations will also be deleted.
    *
    * The effect of the remove will be visible immediately and the corresponding
    * event 'value' will be triggered. Synchronization of the remove to the
    * Firebase servers will also be started, and the returned Promise will resolve
    * when complete. If provided, the onComplete callback will be called
    * asynchronously after synchronization has finished.
    *
    * @example
    * ```javascript
    * var adaRef = firebase.database().ref('users/ada');
    * adaRef.remove()
    *   .then(function() {
    *     console.log("Remove succeeded.")
    *   })
    *   .catch(function(error) {
    *     console.log("Remove failed: " + error.message)
    *   });
    * ```
    *
    * @param onComplete Callback called when write to server is
    *   complete.
    * @return Resolves when remove on server is complete.
    */
  def remove(): js.Promise[_] = js.native
  def remove(onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  
  /**
    * The root `Reference` of the Database.
    *
    * @example
    * ```javascript
    * // The root of a root reference is itself
    * var rootRef = firebase.database().ref();
    * // rootRef and rootRef.root represent the same location
    * ```
    *
    * @example
    * ```javascript
    * // The root of any non-root reference is the root location
    * var adaRef = firebase.database().ref("users/ada");
    * // rootRef and adaRef.root represent the same location
    * ```
    */
  var root: Reference = js.native
  
  /**
    * Writes data to this Database location.
    *
    * This will overwrite any data at this location and all child locations.
    *
    * The effect of the write will be visible immediately, and the corresponding
    * events ("value", "child_added", etc.) will be triggered. Synchronization of
    * the data to the Firebase servers will also be started, and the returned
    * Promise will resolve when complete. If provided, the `onComplete` callback
    * will be called asynchronously after synchronization has finished.
    *
    * Passing `null` for the new value is equivalent to calling `remove()`; namely,
    * all data at this location and all child locations will be deleted.
    *
    * `set()` will remove any priority stored at this location, so if priority is
    * meant to be preserved, you need to use `setWithPriority()` instead.
    *
    * Note that modifying data with `set()` will cancel any pending transactions
    * at that location, so extreme care should be taken if mixing `set()` and
    * `transaction()` to modify the same data.
    *
    * A single `set()` will generate a single "value" event at the location where
    * the `set()` was performed.
    *
    * @example
    * ```javascript
    * var adaNameRef = firebase.database().ref('users/ada/name');
    * adaNameRef.child('first').set('Ada');
    * adaNameRef.child('last').set('Lovelace');
    * // We've written 'Ada' to the Database location storing Ada's first name,
    * // and 'Lovelace' to the location storing her last name.
    * ```
    *
    * @example
    * ```javascript
    * adaNameRef.set({ first: 'Ada', last: 'Lovelace' });
    * // Exact same effect as the previous example, except we've written
    * // Ada's first and last name simultaneously.
    * ```
    *
    * @example
    * ```javascript
    * adaNameRef.set({ first: 'Ada', last: 'Lovelace' })
    *   .then(function() {
    *     console.log('Synchronization succeeded');
    *   })
    *   .catch(function(error) {
    *     console.log('Synchronization failed');
    *   });
    * // Same as the previous example, except we will also log a message
    * // when the data has finished synchronizing.
    * ```
    *
    * @param value The value to be written (string, number, boolean, object,
    *   array, or null).
    * @param onComplete Callback called when write to server is
    *   complete.
    * @return Resolves when write to server is complete.
    */
  def set(value: js.Any): js.Promise[_] = js.native
  def set(value: js.Any, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  
  /**
    * Sets a priority for the data at this Database location.
    *
    * Applications need not use priority but can order collections by
    * ordinary properties (see
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sorting_and_filtering_data
    *  Sorting and filtering data}).
    */
  def setPriority(priority: String, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setPriority(priority: Double, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setPriority(priority: Null, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  
  /**
    * Writes data the Database location. Like `set()` but also specifies the
    * priority for that data.
    *
    * Applications need not use priority but can order collections by
    * ordinary properties (see
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#sorting_and_filtering_data
    *  Sorting and filtering data}).
    */
  def setWithPriority(newVal: js.Any): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: String): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: String, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Double): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Double, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  def setWithPriority(newVal: js.Any, newPriority: Null, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
  
  /**
    * Creates a `Query` with the specified starting point.
    *
    * Using `startAt()`, `endAt()`, and `equalTo()` allows you to choose arbitrary
    * starting and ending points for your queries.
    *
    * The starting point is inclusive, so children with exactly the specified value
    * will be included in the query. The optional key argument can be used to
    * further limit the range of the query. If it is specified, then children that
    * have exactly the specified value must also have a key name greater than or
    * equal to the specified key.
    *
    * You can read more about `startAt()` in
    * {@link
    *  https://firebase.google.com/docs/database/web/lists-of-data#filtering_data
    *  Filtering data}.
    *
    * @example
    * ```javascript
    * // Find all dinosaurs that are at least three meters tall.
    * var ref = firebase.database().ref("dinosaurs");
    * ref.orderByChild("height").startAt(3).on("child_added", function(snapshot) {
    *   console.log(snapshot.key)
    * });
    * ```
    *
    * @param value The value to start at. The argument
    *   type depends on which `orderBy*()` function was used in this query.
    *   Specify a value that matches the `orderBy*()` type. When used in
    *   combination with `orderByKey()`, the value must be a string.
    * @param key The child key to start at. This argument is only allowed
    *   if ordering by child, value, or priority.
    */
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
  
  /**
    * Returns a JSON-serializable representation of this object.
    *
    * @return A JSON-serializable representation of this object.
    */
  def toJSON(): js.Object = js.native
  
  /**
    * Atomically modifies the data at this location.
    *
    * Atomically modify the data at this location. Unlike a normal `set()`, which
    * just overwrites the data regardless of its previous value, `transaction()` is
    * used to modify the existing value to a new value, ensuring there are no
    * conflicts with other clients writing to the same location at the same time.
    *
    * To accomplish this, you pass `transaction()` an update function which is used
    * to transform the current value into a new value. If another client writes to
    * the location before your new value is successfully written, your update
    * function will be called again with the new current value, and the write will
    * be retried. This will happen repeatedly until your write succeeds without
    * conflict or you abort the transaction by not returning a value from your
    * update function.
    *
    * Note: Modifying data with `set()` will cancel any pending transactions at
    * that location, so extreme care should be taken if mixing `set()` and
    * `transaction()` to update the same data.
    *
    * Note: When using transactions with Security and Firebase Rules in place, be
    * aware that a client needs `.read` access in addition to `.write` access in
    * order to perform a transaction. This is because the client-side nature of
    * transactions requires the client to read the data in order to transactionally
    * update it.
    *
    * @example
    * ```javascript
    * // Increment Ada's rank by 1.
    * var adaRankRef = firebase.database().ref('users/ada/rank');
    * adaRankRef.transaction(function(currentRank) {
    *   // If users/ada/rank has never been set, currentRank will be `null`.
    *   return currentRank + 1;
    * });
    * ```
    *
    * @example
    * ```javascript
    * // Try to create a user for ada, but only if the user id 'ada' isn't
    * // already taken
    * var adaRef = firebase.database().ref('users/ada');
    * adaRef.transaction(function(currentData) {
    *   if (currentData === null) {
    *     return { name: { first: 'Ada', last: 'Lovelace' } };
    *   } else {
    *     console.log('User ada already exists.');
    *     return; // Abort the transaction.
    *   }
    * }, function(error, committed, snapshot) {
    *   if (error) {
    *     console.log('Transaction failed abnormally!', error);
    *   } else if (!committed) {
    *     console.log('We aborted the transaction (because ada already exists).');
    *   } else {
    *     console.log('User ada added!');
    *   }
    *   console.log("Ada's data: ", snapshot.val());
    * });
    * ```
    *
    * @param transactionUpdate A developer-supplied function which
    *   will be passed the current data stored at this location (as a JavaScript
    *   object). The function should return the new value it would like written (as
    *   a JavaScript object). If `undefined` is returned (i.e. you return with no
    *   arguments) the transaction will be aborted and the data at this location
    *   will not be modified.
    * @param onComplete A callback
    *   function that will be called when the transaction completes. The callback
    *   is passed three arguments: a possibly-null `Error`, a `boolean` indicating
    *   whether the transaction was committed, and a `DataSnapshot` indicating the
    *   final result. If the transaction failed abnormally, the first argument will
    *   be an `Error` object indicating the failure cause. If the transaction
    *   finished normally, but no data was committed because no data was returned
    *   from `transactionUpdate`, then second argument will be false. If the
    *   transaction completed and committed data to Firebase, the second argument
    *   will be true. Regardless, the third argument will be a `DataSnapshot`
    *   containing the resulting data in this location.
    * @param applyLocally By default, events are raised each time the
    *   transaction update function runs. So if it is run multiple times, you may
    *   see intermediate states. You can set this to false to suppress these
    *   intermediate states and instead wait until the transaction has completed
    *   before events are raised.
    * @return Returns a Promise that can optionally be used instead of the onComplete
    *   callback to handle success and failure.
    */
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
  
  /**
    * Writes multiple values to the Database at once.
    *
    * The `values` argument contains multiple property-value pairs that will be
    * written to the Database together. Each child property can either be a simple
    * property (for example, "name") or a relative path (for example,
    * "name/first") from the current location to the data to update.
    *
    * As opposed to the `set()` method, `update()` can be use to selectively update
    * only the referenced properties at the current location (instead of replacing
    * all the child properties at the current location).
    *
    * The effect of the write will be visible immediately, and the corresponding
    * events ('value', 'child_added', etc.) will be triggered. Synchronization of
    * the data to the Firebase servers will also be started, and the returned
    * Promise will resolve when complete. If provided, the `onComplete` callback
    * will be called asynchronously after synchronization has finished.
    *
    * A single `update()` will generate a single "value" event at the location
    * where the `update()` was performed, regardless of how many children were
    * modified.
    *
    * Note that modifying data with `update()` will cancel any pending
    * transactions at that location, so extreme care should be taken if mixing
    * `update()` and `transaction()` to modify the same data.
    *
    * Passing `null` to `update()` will remove the data at this location.
    *
    * See
    * {@link
    *  https://firebase.googleblog.com/2015/09/introducing-multi-location-updates-and_86.html
    *  Introducing multi-location updates and more}.
    *
    * @example
    * ```javascript
    * var adaNameRef = firebase.database().ref('users/ada/name');
    * // Modify the 'first' and 'last' properties, but leave other data at
    * // adaNameRef unchanged.
    * adaNameRef.update({ first: 'Ada', last: 'Lovelace' });
    * ```
    *
    * @param values Object containing multiple values.
    * @param onComplete Callback called when write to server is
    *   complete.
    * @return Resolves when update on server is complete.
    */
  def update(values: js.Object): js.Promise[_] = js.native
  def update(values: js.Object, onComplete: js.Function1[/* a */ Error | Null, _]): js.Promise[_] = js.native
}
