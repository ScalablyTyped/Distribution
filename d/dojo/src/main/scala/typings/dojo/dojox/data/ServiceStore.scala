package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/ServiceStore.html
  *
  * note that dojox.rpc.Service is not required, you can create your own services
  * A ServiceStore is a readonly data store that provides a data.data interface to an RPC service.
  *
  * var myServices = new dojox.rpc.Service(dojo.moduleUrl("dojox.rpc.tests.resources", "test.smd"));
  * var serviceStore = new dojox.data.ServiceStore({service:myServices.ServiceStore});
  * The ServiceStore also supports lazy loading. References can be made to objects that have not been loaded.
  * For example if a service returned:
  *
  * {"name":"Example","lazyLoadedObject":{"$ref":"obj2"}}
  * And this object has accessed using the dojo.data API:
  *
  * var obj = serviceStore.getValue(myObject,"lazyLoadedObject");
  * The object would automatically be requested from the server (with an object id of "obj2").
  *
  * @param options Keyword argumentsThe schema parameterThis is a schema object for this store. This should be JSON Schema format.The service parameterThis is the service object that is used to retrieve lazy data and save resultsThe function should be directly callable with a single parameter of an object id to be loadedThe idAttribute parameterDefaults to 'id'. The name of the attribute that holds an objects id.This can be a preexisting id provided by the server.If an ID isn't already provided when an objectis fetched or added to the store, the autoIdentity systemwill generate an id for it and add it to the index.The estimateCountFactor parameterThis parameter is used by the ServiceStore to estimate the total count. Whenpaging is indicated in a fetch and the response includes the full number of itemsrequested by the fetch's count parameter, then the total count will be estimatedto be estimateCountFactor multiplied by the provided count. If this is 1, then it is assumed that the serverdoes not support paging, and the response is the full set of items, where thetotal count is equal to the number of items returned. If the server does supportpaging, an estimateCountFactor of 2 is a good value for estimating the total countIt is also possible to override _processResults if the server can provide an exacttotal count.The syncMode parameterSetting this to true will set the store to using synchronous calls by default.Sync calls return their data immediately from the calling function, socallbacks are unnecessary. This will only work with a synchronous capable service.
  */
@JSGlobal("dojox.data.ServiceStore")
@js.native
class ServiceStore () extends js.Object {
  def this(options: js.Any) = this()
  /**
    * This parameter is used by the ServiceStore to estimate the total count. When
    * paging is indicated in a fetch and the response includes the full number of items
    * requested by the fetch's count parameter, then the total count will be estimated
    * to be estimateCountFactor multiplied by the provided count. If this is 1, then it is assumed that the server
    * does not support paging, and the response is the full set of items, where the
    * total count is equal to the numer of items returned. If the server does support
    * paging, an estimateCountFactor of 2 is a good value for estimating the total count
    * It is also possible to override _processResults if the server can provide an exact
    * total count.
    *
    */
  var estimateCountFactor: Double = js.native
  /**
    * Defaults to 'id'. The name of the attribute that holds an objects id.
    * This can be a preexisting id provided by the server.
    * If an ID isn't already provided when an object
    * is fetched or added to the store, the autoIdentity system
    * will generate an id for it and add it to the index.
    *
    */
  var idAttribute: String = js.native
  /**
    *
    */
  var labelAttribute: String = js.native
  /**
    *
    */
  var loadLazyValues: Boolean = js.native
  /**
    * This is a schema object for this store. This should be JSON Schema format.
    *
    */
  var schema: js.Object = js.native
  /**
    * This is the service object that is used to retrieve lazy data and save results
    * The function should be directly callable with a single parameter of an object id to be loaded
    *
    */
  var service: js.Object = js.native
  /**
    * Setting this to true will set the store to using synchronous calls by default.
    * Sync calls return their data immediately from the calling function, so
    * callbacks are unnecessary. This will only work with a synchronous capable service.
    *
    */
  var syncMode: Boolean = js.native
  /**
    *
    * @param request
    */
  def close(request: js.Any): js.Any = js.native
  /**
    * Checks to see if 'item' has 'value' at 'attribute'
    *
    * @param item
    * @param attribute
    * @param value
    */
  def containsValue(item: js.Object, attribute: String, value: js.Any): Boolean = js.native
  /**
    * See dojo/data/api/Read.fetch
    *
    * @param args The queryOptions.cache parameterIf true, indicates that the query result should be cached for future use. This is only availableif dojox.data.ClientFilter has been loaded before the ServiceStoreThe syncMode parameterIndicates that the call should be fetch synchronously if possible (this is not always possible)The clientFetch parameterThis is a fetch keyword argument for explicitly doing client side filtering, querying, and paging
    */
  def fetch(args: js.Any): String = js.native
  /**
    * fetch an item by its identity, by looking in our index of what we have loaded
    *
    * @param args
    */
  def fetchItemByIdentity(args: js.Any): js.Any = js.native
  /**
    * Gets the available attributes of an item's 'property' and returns
    * it as an array.
    *
    * @param item
    */
  def getAttributes(item: js.Object): js.Array[_] = js.native
  /**
    * return the store feature set
    *
    */
  def getFeatures(): js.Object = js.native
  /**
    *
    * @param item
    */
  def getIdentity(item: js.Any): js.Any = js.native
  /**
    * returns the attributes which are used to make up the
    * identity of an item.    Basically returns this.idAttribute
    *
    * @param item
    */
  def getIdentityAttributes(item: js.Any): js.Array[_] = js.native
  /**
    * returns the label for an item. Just gets the "label" attribute.
    *
    * @param item
    */
  def getLabel(item: js.Any): js.Any = js.native
  /**
    * returns an array of attributes that are used to create the label of an item
    *
    * @param item
    */
  def getLabelAttributes(item: js.Any): js.Array[_] = js.native
  /**
    * Returns a reference to the JSON Schema
    *
    */
  def getSchema(): js.Any = js.native
  /**
    * Gets the value of an item's 'property'
    *
    * @param item The item to get the value from
    * @param property property to look up value for
    * @param defaultValue               Optionalthe default value
    */
  def getValue(item: js.Object, property: String, defaultValue: js.Any): js.Any = js.native
  /**
    * Gets the value of an item's 'property' and returns
    * it. If this value is an array it is just returned,
    * if not, the value is added to an array and that is returned.
    *
    * @param item
    * @param property property to look up value for
    */
  def getValues(item: js.Object, property: String): js.Array[_] = js.native
  /**
    * Checks to see if item has attribute
    *
    * @param item
    * @param attribute
    */
  def hasAttribute(item: js.Object, attribute: String): Boolean = js.native
  /**
    * Checks to see if the argument is an item
    *
    * @param item
    */
  def isItem(item: js.Object): Boolean = js.native
  /**
    * Checks to see if the item is loaded.
    *
    * @param item
    */
  def isItemLoaded(item: js.Object): js.Any = js.native
  /**
    * Loads an item and calls the callback handler. Note, that this will call the callback
    * handler even if the item is loaded. Consequently, you can use loadItem to ensure
    * that an item is loaded is situations when the item may or may not be loaded yet.
    * If you access a value directly through property access, you can use this to load
    * a lazy value as well (doesn't need to be an item).
    *
    * @param args
    */
  def loadItem(args: js.Any): js.Any = js.native
}

