package typings.dojo.dojo

import typings.dojo.dojo.promise.Promise
import typings.dojo.dojo.store.JsonRest
import typings.dojo.dojo.store.Memory
import typings.dojo.dojo.store.api.Store
import typings.dojo.dojo.store.api.Store.PutDirectives
import typings.dojo.dojo.store.api.Store.QueryOptions
import typings.dojo.dojo.store.api.Store.QueryResults
import typings.dojo.dojo.store.api.Store.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojo.store")
@js.native
object store extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/Cache.html
    *
    * The Cache store wrapper takes a master store and a caching store,
    * caches data from the master into the caching store for faster
    * lookup. Normally one would use a memory store for the caching
    * store and a server store like JsonRest for the master store.
    *
    * @param masterStore This is the authoritative store, all uncached requests or non-safe requests willbe made against this store.
    * @param cachingStore This is the caching store that will be used to store responses for quick access.Typically this should be a local store.
    * @param options       OptionalThese are additional options for how caching is handled.
    */
  @js.native
  class Cache protected () extends Store {
    def this(masterStore: js.Any, cachingStore: js.Any) = this()
    def this(masterStore: js.Any, cachingStore: js.Any, options: js.Object) = this()
    def add(`object`: js.Object, directives: js.Any): Double = js.native
    /**
      * Remove the object with the given id from the underlying caching store.
      *
      * @param id The identifier for the object in question.
      */
    def evict(id: Double): Unit = js.native
    def get(id: Double, directives: js.Object): QueryResults = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/DataStore.html
    *
    * This is an adapter for using Dojo Data stores with an object store consumer.
    * You can provide a Dojo data store and use this adapter to interact with it through
    * the Dojo object store API
    *
    * @param options       OptionalThis provides any configuration information that will be mixed into the store,including a reference to the Dojo data store under the property "store".
    */
  @js.native
  class DataStore () extends Store {
    def this(options: js.Object) = this()
    /**
      * The object store to convert to a data store
      *
      */
    var store: js.Object = js.native
    /**
      *
      */
    var target: String = js.native
    /**
      * Retrieves an object by it's identity. This will trigger a fetchItemByIdentity
      *
      * @param id               OptionalThe identity to use to lookup the object
      * @param options
      */
    def get(id: js.Object): js.Any = js.native
    def get(id: js.Object, options: js.Any): js.Any = js.native
    def put(`object`: js.Object, options: js.Object): Unit = js.native
    def query(query: js.Object, options: js.Object): js.Any = js.native
    /**
      * Defines the query engine to use for querying the data store
      *
      * @param query An object hash with fields that may match fields of items in the store.Values in the hash will be compared by normal == operator, but regular expressionsor any object that provides a test() method are also supported and can beused to match strings by more complex expressions(and then the regex's or object's test() method will be used to match values).
      * @param options               OptionalAn object that contains optional information such as sort, start, and count.
      */
    def queryEngine(query: js.Object): js.Any = js.native
    /**
      * Deletes an object by its identity.
      *
      * @param id The identity to use to delete the object
      */
    def remove(id: js.Object): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/JsonRest.html
    *
    * This is a basic store for RESTful communicating with a server through JSON
    * formatted data. It implements dojo/store/api/Store.
    *
    * @param options This provides any configuration information that will be mixed into the store
    */
  @js.native
  class JsonRest protected () extends Store {
    def this(options: JsonRest) = this()
    /**
      * Defines the Accept header to use on HTTP requests
      *
      */
    var accepts: String = js.native
    /**
      * The prefix to apply to sort attribute names that are ascending
      *
      */
    var ascendingPrefix: String = js.native
    /**
      * The prefix to apply to sort attribute names that are ascending
      *
      */
    var descendingPrefix: String = js.native
    /**
      * Additional headers to pass in all requests to the server. These can be overridden
      * by passing additional headers to calls to the store.
      *
      */
    var headers: js.Object = js.native
    /**
      * The target base URL to use for all requests to the server. This string will be
      * prepended to the id to generate the URL (relative or absolute) for requests
      * sent to the server
      *
      */
    var target: String = js.native
    def add(`object`: js.Object, options: js.Object): js.Any = js.native
    def get(id: Double, options: js.Object): js.Any = js.native
    def put(`object`: js.Object, options: js.Object): js.Any = js.native
    def query(query: js.Object, options: js.Object): js.Any = js.native
    def remove(id: Double, options: js.Object): js.Any = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/Memory.html
    *
    * This is a basic in-memory object store. It implements dojo/store/api/Store.
    *
    * @param options This provides any configuration information that will be mixed into the store.This should generally include the data property to provide the starting set of data.
    */
  @js.native
  class Memory protected () extends Store {
    def this(options: Memory) = this()
    /**
      * The array of all the objects in the memory store
      *
      */
    var data: js.Array[_] = js.native
    /**
      * An index of data indices into the data array by id
      *
      */
    var index: js.Object = js.native
    /**
      * Defines the query engine to use for querying the data store
      *
      * @param query An object hash with fields that may match fields of items in the store.Values in the hash will be compared by normal == operator, but regular expressionsor any object that provides a test() method are also supported and can beused to match strings by more complex expressions(and then the regex's or object's test() method will be used to match values).
      * @param options               OptionalAn object that contains optional information such as sort, start, and count.
      */
    def queryEngine(query: js.Object): js.Any = js.native
    /**
      * Sets the given data as the source for this store, and indexes it
      *
      * @param data An array of objects to use as the source of data.
      */
    def setData(data: js.Array[js.Object]): Unit = js.native
  }
  
  @js.native
  object api extends js.Object {
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.html
      *
      * This is an abstract API that data provider implementations conform to.
      * This file defines methods signatures and intentionally leaves all the
      * methods unimplemented.  For more information on the ,
      * please visit: http://dojotoolkit.org/reference-guide/dojo/store.html
      * Every method and property is optional, and is only needed if the functionality
      * it provides is required.
      * Every method may return a promise for the specified return value if the
      * execution of the operation is asynchronous (except
      * for query() which already defines an async return value).
      *
      */
    @js.native
    class Store () extends js.Object {
      /**
        * If the store has a single primary key, this indicates the property to use as the
        * identity property. The values of this property should be unique.
        *
        */
      var idProperty: String = js.native
      /**
        *
        */
      def PutDirectives(): Unit = js.native
      /**
        *
        */
      def QueryOptions(): Unit = js.native
      /**
        *
        */
      def QueryResults(): Unit = js.native
      /**
        *
        */
      def SortInformation(): Unit = js.native
      /**
        *
        */
      def Transaction(): Unit = js.native
      /**
        * Creates an object, throws an error if the object already exists
        *
        * @param object The object to store.
        * @param directives               OptionalAdditional directives for creating objects.
        */
      def add(`object`: js.Object): js.Any = js.native
      def add(`object`: js.Object, directives: PutDirectives): js.Any = js.native
      /**
        * Retrieves an object by its identity
        *
        * @param id The identity to use to lookup the object
        */
      def get(id: Double): js.Object = js.native
      /**
        * Retrieves the children of an object.
        *
        * @param parent The object to find the children of.
        * @param options               OptionalAdditional options to apply to the retrieval of the children.
        */
      def getChildren(parent: js.Object): QueryResults = js.native
      def getChildren(parent: js.Object, options: QueryOptions): QueryResults = js.native
      /**
        * Returns an object's identity
        *
        * @param object The object to get the identity from
        */
      def getIdentity(`object`: js.Object): js.Any = js.native
      /**
        * Returns any metadata about the object. This may include attribution,
        * cache directives, history, or version information.
        *
        * @param object The object to return metadata for.
        */
      def getMetadata(`object`: js.Object): js.Object = js.native
      /**
        * Stores an object
        *
        * @param object The object to store.
        * @param directives               OptionalAdditional directives for storing objects.
        */
      def put(`object`: js.Object): js.Any = js.native
      def put(`object`: js.Object, directives: PutDirectives): js.Any = js.native
      /**
        * Queries the store for objects. This does not alter the store, but returns a
        * set of data from the store.
        *
        * @param query The query to use for retrieving objects from the store.
        * @param options The optional arguments to apply to the resultset.
        */
      def query(query: String): QueryResults = js.native
      def query(query: String, options: QueryOptions): QueryResults = js.native
      /**
        * Queries the store for objects. This does not alter the store, but returns a
        * set of data from the store.
        *
        * @param query The query to use for retrieving objects from the store.
        * @param options The optional arguments to apply to the resultset.
        */
      def query(query: js.Function): QueryResults = js.native
      def query(query: js.Function, options: QueryOptions): QueryResults = js.native
      /**
        * Queries the store for objects. This does not alter the store, but returns a
        * set of data from the store.
        *
        * @param query The query to use for retrieving objects from the store.
        * @param options The optional arguments to apply to the resultset.
        */
      def query(query: js.Object): QueryResults = js.native
      def query(query: js.Object, options: QueryOptions): QueryResults = js.native
      /**
        * If the store can be queried locally (on the client side in JS), this defines
        * the query engine to use for querying the data store.
        * This takes a query and query options and returns a function that can execute
        * the provided query on a JavaScript array. The queryEngine may be replace to
        * provide more sophisticated querying capabilities. For example:
        *
        * var query = store.queryEngine({foo:"bar"}, {count:10});
        * query(someArray) -> filtered array
        * The returned query function may have a "matches" property that can be
        *
        * used to determine if an object matches the query. For example:
        *
        * query.matches({id:"some-object", foo:"bar"}) -> true
        * query.matches({id:"some-object", foo:"something else"}) -> false
        *
        */
      def queryEngine(query: js.Object, options: QueryOptions): js.Any = js.native
      /**
        * Deletes an object by its identity
        *
        * @param id The identity to use to delete the object
        */
      def remove(id: Double): Unit = js.native
      /**
        * Starts a new transaction.
        * Note that a store user might not call transaction() prior to using put,
        * delete, etc. in which case these operations effectively could be thought of
        * as "auto-commit" style actions.
        *
        */
      def transaction(): Transaction = js.native
    }
    
    @js.native
    object Store extends js.Object {
      /**
        * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.PutDirectives.html
        *
        * Directives passed to put() and add() handlers for guiding the update and
        * creation of stored objects.
        *
        */
      @js.native
      class PutDirectives () extends js.Object {
        /**
          * If the collection of objects in the store has a natural ordering,
          * this indicates that the created or updated object should be placed before the
          * object specified by the value of this property. A value of null indicates that the
          * object should be last.
          *
          */
        var before: js.Object = js.native
        /**
          * Indicates the identity of the object if a new object is created
          *
          */
        var id: String = js.native
        /**
          * If this is provided as a boolean it indicates that the object should or should not
          * overwrite an existing object. A value of true indicates that a new object
          * should not be created, the operation should update an existing object. A
          * value of false indicates that an existing object should not be updated, a new
          * object should be created (which is the same as an add() operation). When
          * this property is not provided, either an update or creation is acceptable.
          *
          */
        var overwrite: Boolean = js.native
        /**
          * If the store is hierarchical (with single parenting) this property indicates the
          * new parent of the created or updated object.
          *
          */
        var parent: js.Object = js.native
      }
      
      /**
        * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.QueryOptions.html
        *
        * Optional object with additional parameters for query results.
        *
        */
      @js.native
      class QueryOptions () extends js.Object {
        /**
          * The number of how many results should be returned.
          *
          */
        var count: Double = js.native
        /**
          * A list of attributes to sort on, as well as direction
          * For example:
          *
          * [{attribute:"price, descending: true}].
          * If the sort parameter is omitted, then the natural order of the store may be
          *
          * applied if there is a natural order.
          *
          */
        var sort: js.Object = js.native
        /**
          * The first result to begin iteration on
          *
          */
        var start: Double = js.native
      }
      
      /**
        * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.QueryResults.html
        *
        * This is an object returned from query() calls that provides access to the results
        * of a query. Queries may be executed asynchronously.
        *
        */
      @js.native
      class QueryResults () extends js.Object {
        /**
          * This property should be included in if the query options included the "count"
          * property limiting the result set. This property indicates the total number of objects
          * matching the query (as if "start" and "count" weren't present). This may be
          * a promise if the query is asynchronous.
          *
          */
        var total: Double = js.native
        /**
          * Filters the query results, based on
          * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/filter.
          * Note that this may executed asynchronously. The callback may be called
          * after this function returns.
          *
          * @param callback Function that is called for each object in the query results
          * @param thisObject The object to use as |this| in the callback.
          */
        def filter(callback: js.Any, thisObject: js.Any): QueryResults = js.native
        /**
          * Iterates over the query results, based on
          * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/forEach.
          * Note that this may executed asynchronously. The callback may be called
          * after this function returns.
          *
          * @param callback Function that is called for each object in the query results
          * @param thisObject The object to use as |this| in the callback.
          */
        def forEach(callback: js.Any, thisObject: js.Any): Unit = js.native
        /**
          * Maps the query results, based on
          * https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/map.
          * Note that this may executed asynchronously. The callback may be called
          * after this function returns.
          *
          * @param callback Function that is called for each object in the query results
          * @param thisObject The object to use as |this| in the callback.
          */
        def map(callback: js.Any, thisObject: js.Any): QueryResults = js.native
        /**
          * This registers a callback for notification of when data is modified in the query results.
          * This is an optional method, and is usually provided by dojo/store/Observable.
          *
          * @param listener The listener function is called when objects in the query results are modifiedto affect the query result. The listener function is called with the following arguments:listener(object, removedFrom, insertedInto);The object parameter indicates the object that was create, modified, or deleted.The removedFrom parameter indicates the index in the result array wherethe object used to be. If the value is -1, then the object is an addition tothis result set (due to a new object being created, or changed such that itis a part of the result set).The insertedInto parameter indicates the index in the result array wherethe object should be now. If the value is -1, then the object is a removalfrom this result set (due to an object being deleted, or changed such that itis not a part of the result set).
          * @param includeAllUpdates This indicates whether or not to include object updates that do not affectthe inclusion or order of the object in the query results. By default this is false,which means that if any object is updated in such a way that it remainsin the result set and it's position in result sets is not affected, then the listenerwill not be fired.
          */
        def observe(listener: js.Function, includeAllUpdates: js.Any): Unit = js.native
        /**
          * This registers a callback for when the query is complete, if the query is asynchronous.
          * This is an optional method, and may not be present for synchronous queries.
          *
          * @param callback This is called when the query is completed successfully, and is passed a single argumentthat is an array representing the query results.
          * @param errorHandler This is called if the query failed, and is passed a single argument that is the errorfor the failure.
          */
        def `then`(callback: js.Any, errorHandler: js.Any): Unit = js.native
      }
      
      /**
        * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.SortInformation.html
        *
        * An object describing what attribute to sort on, and the direction of the sort.
        *
        */
      @js.native
      class SortInformation () extends js.Object {
        /**
          * The name of the attribute to sort on.
          *
          */
        var attribute: String = js.native
        /**
          * The direction of the sort.  Default is false.
          *
          */
        var descending: Boolean = js.native
      }
      
      /**
        * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/api/Store.Transaction.html
        *
        * This is an object returned from transaction() calls that represents the current
        * transaction.
        *
        */
      @js.native
      class Transaction () extends js.Object {
        /**
          * Aborts the transaction. This may throw an error if it fails. Of if the operation
          * is asynchronous, it may return a promise that represents the eventual success
          * or failure of the abort.
          *
          * @param callback
          * @param thisObject
          */
        def abort(callback: js.Any, thisObject: js.Any): Unit = js.native
        /**
          * Commits the transaction. This may throw an error if it fails. Of if the operation
          * is asynchronous, it may return a promise that represents the eventual success
          * or failure of the commit.
          *
          */
        def commit(): Unit = js.native
      }
      
    }
    
  }
  
  @js.native
  object util extends js.Object {
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/util/QueryResults.html
      *
      * A function that wraps the results of a store query with additional
      * methods.
      * QueryResults is a basic wrapper that allows for array-like iteration
      * over any kind of returned data from a query.  While the simplest store
      * will return a plain array of data, other stores may return deferreds or
      * promises; this wrapper makes sure that all results can be treated
      * the same.
      *
      * Additional methods include forEach, filter and map.
      *
      * @param results The result set as an array, or a promise for an array.
      */
    @js.native
    trait QueryResults extends js.Object {
      def apply(results: js.Array[_]): Unit = js.native
      def apply(results: Promise[_]): Unit = js.native
    }
    
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/util/SimpleQueryEngine.html
      *
      * Simple query engine that matches using filter functions, named filter
      * functions or objects by name-value on a query object hash
      * The SimpleQueryEngine provides a way of getting a QueryResults through
      * the use of a simple object hash as a filter.  The hash will be used to
      * match properties on data objects with the corresponding value given. In
      * other words, only exact matches will be returned.
      *
      * This function can be used as a template for more complex query engines;
      * for example, an engine can be created that accepts an object hash that
      * contains filtering functions, or a string that gets evaluated, etc.
      *
      * When creating a new dojo.store, simply set the store's queryEngine
      * field as a reference to this function.
      *
      * @param query An object hash with fields that may match fields of items in the store.Values in the hash will be compared by normal == operator, but regular expressionsor any object that provides a test() method are also supported and can beused to match strings by more complex expressions(and then the regex's or object's test() method will be used to match values).
      * @param options       OptionalAn object that contains optional information such as sort, start, and count.
      */
    type SimpleQueryEngine = js.Function2[/* query */ js.Object, /* options */ js.UndefOr[QueryOptions], Unit]
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/store/Observable.html
    *
    * The Observable store wrapper takes a store and sets an observe method on query()
    * results that can be used to monitor results for changes.
    * Observable wraps an existing store so that notifications can be made when a query
    * is performed.
    *
    * @param store
    */
  type Observable = js.Function1[/* store */ Store, Unit]
}

