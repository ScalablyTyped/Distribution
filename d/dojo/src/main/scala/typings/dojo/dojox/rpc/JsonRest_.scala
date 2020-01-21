package typings.dojo.dojox.rpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/rpc/JsonRest.html
  *
  *
  */
@js.native
trait JsonRest_ extends js.Object {
  /**
    *
    */
  var conflictDateHeader: String = js.native
  /**
    *
    */
  var schemas: js.Object = js.native
  /**
    *
    */
  var services: js.Object = js.native
  /**
    *
    * @param service
    * @param id
    */
  def byId(service: js.Any, id: js.Any): js.Any = js.native
  /**
    * adds an object to the list of dirty objects.  This object
    * contains a reference to the object itself as well as a
    * cloned and trimmed version of old object for use with
    * revert.
    *
    * @param object
    * @param _deleting
    */
  def changing(`object`: js.Any, _deleting: js.Any): Unit = js.native
  /**
    * Saves the dirty data using REST Ajax methods
    *
    * @param kwArgs
    */
  def commit(kwArgs: js.Any): js.Array[_] = js.native
  /**
    * deletes an object
    *
    * @param object object to delete
    */
  def deleteObject(`object`: js.Any): Unit = js.native
  /**
    * Fetches a resource by an absolute path/id and returns a dojo.Deferred.
    *
    * @param absoluteId
    */
  def fetch(absoluteId: js.Any): js.Any = js.native
  /**
    * Creates or gets a constructor for objects from this service
    *
    * @param service
    * @param schema
    */
  def getConstructor(service: String, schema: js.Any): js.Any = js.native
  /**
    * Creates or gets a constructor for objects from this service
    *
    * @param service
    * @param schema
    */
  def getConstructor(service: js.Function, schema: js.Any): js.Any = js.native
  /**
    *
    */
  def getDirtyObjects(): js.Array[_] = js.native
  /**
    * Return the ids attribute used by this service (based on it's schema).
    * Defaults to "id", if not other id is defined
    *
    * @param service
    */
  def getIdAttribute(service: js.Any): String = js.native
  /**
    * Returns the REST service and the local id for the given absolute id. The result
    * is returned as an object with a service property and an id property
    *
    * @param absoluteId This is the absolute id of the object
    */
  def getServiceAndId(absoluteId: String): js.Object = js.native
  /**
    * returns true if the item is marked as dirty or true if there are any dirty items
    *
    * @param item
    * @param store
    */
  def isDirty(item: js.Any, store: js.Any): js.Any = js.native
  /**
    *
    * @param service
    * @param id
    * @param args
    */
  def query(service: js.Any, id: js.Any, args: js.Any): js.Any = js.native
  /**
    * Registers a service for as a JsonRest service, mapping it to a path and schema
    *
    * @param service This is the service to register
    * @param servicePath This is the path that is used for all the ids for the objects returned by service
    * @param schema               OptionalThis is a JSON Schema object to associate with objects returned by this service
    */
  def registerService(service: js.Function, servicePath: String, schema: js.Object): Unit = js.native
  /**
    * Reverts all the changes made to JSON/REST data
    *
    * @param service
    */
  def revert(service: js.Any): Unit = js.native
  /**
    *
    * @param actions
    * @param kwArgs
    */
  def sendToServer(actions: js.Any, kwArgs: js.Any): Unit = js.native
  /**
    * This provides a HTTP REST service with full range REST verbs include PUT,POST, and DELETE.
    * A normal GET query is done by using the service directly:
    *
    * var restService = dojox.rpc.Rest("Project");
    * restService("4");
    * This will do a GET for the URL "/Project/4".
    *
    * restService.put("4","new content");
    * This will do a PUT to the URL "/Project/4" with the content of "new content".
    *
    * You can also use the SMD service to generate a REST service:
    *
    * var services = dojox.rpc.Service({services: {myRestService: {transport: "REST",...
    * services.myRestService("parameters");
    * The modifying methods can be called as sub-methods of the rest service method like:
    *
    * services.myRestService.put("parameters","data to put in resource");
    * services.myRestService.post("parameters","data to post to the resource");
    * services.myRestService['delete']("parameters");
    *
    * @param path
    * @param isJson               Optional
    * @param schema               Optional
    * @param getRequest               Optional
    */
  def serviceClass(path: String, isJson: Boolean, schema: js.Object, getRequest: js.Function): js.Function = js.native
}

