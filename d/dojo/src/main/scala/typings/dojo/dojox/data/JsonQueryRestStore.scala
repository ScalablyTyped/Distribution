package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/JsonQueryRestStore.html
  *
  *
  * @param options Keyword argumentsThe schema parameterThis is a schema object for this store. This should be JSON Schema format.The service parameterThis is the service object that is used to retrieve lazy data and save resultsThe function should be directly callable with a single parameter of an object id to be loadedThe function should also have the following methods:put(id,value) - puts the value at the given idpost(id,value) - posts (appends) the value at the given iddelete(id) - deletes the value corresponding to the given idNote that it is critical that the service parses responses as JSON.If you are using dojox.rpc.Service, the easiest way to make sure thishappens is to make the responses have a content type ofapplication/json. If you are creating your own service, make sure youuse handleAs: "json" with your XHR requests.The target parameterThis is the target URL for this Service store. This may be used in placeof a service parameter to connect directly to RESTful URL withoutusing a dojox.rpc.Service object.The idAttribute parameterDefaults to 'id'. The name of the attribute that holds an objects id.This can be a preexisting id provided by the server.If an ID isn't already provided when an objectis fetched or added to the store, the autoIdentity systemwill generate an id for it and add it to the index.The syncMode parameterSetting this to true will set the store to using synchronous calls by default.Sync calls return their data immediately from the calling function, socallbacks are unnecessary
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.data.util.JsonQuery because Inheritance from two classes. Inlined jsonQueryPagination, useFullIdInQueries, clientSideFetch, fetch, isUpdateable, matchesQuery, querySuperSet */ @JSGlobal("dojox.data.JsonQueryRestStore")
@js.native
class JsonQueryRestStore () extends JsonRestStore {
  def this(options: js.Any) = this()
  /**
    *
    */
  var jsonQueryPagination: Boolean = js.native
  /**
    *
    */
  var useFullIdInQueries: Boolean = js.native
  /**
    *
    * @param request
    * @param baseResults
    */
  /**
    *
    * @param request
    * @param baseResults
    */
  def clientSideFetch(request: js.Object, baseResults: js.Array[_]): js.Any = js.native
  /**
    * See dojo/data/api/Read.fetch
    *
    * @param args The queryOptions.cache parameterIf true, indicates that the query result should be cached for future use. This is only availableif dojox.data.ClientFilter has been loaded before the ServiceStoreThe syncMode parameterIndicates that the call should be fetch synchronously if possible (this is not always possible)The clientFetch parameterThis is a fetch keyword argument for explicitly doing client side filtering, querying, and paging
    */
  @JSName("fetch")
  def fetch_String(args: js.Any): String = js.native
  /**
    *
    */
  /**
    *
    */
  def isUpdateable(): Boolean = js.native
  /**
    *
    * @param item
    * @param request
    */
  /**
    *
    * @param item
    * @param request
    */
  def matchesQuery(item: js.Any, request: js.Any): js.Any = js.native
  /**
    *
    * @param argsSuper
    * @param argsSub
    */
  /**
    *
    * @param argsSuper
    * @param argsSub
    */
  def querySuperSet(argsSuper: js.Any, argsSub: js.Any): js.Any = js.native
}

