package typings.dojo.dojox.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/data/S3Store.html
  *
  * S3JsonRestStore is an extension of JsonRestStore to handle
  * Amazon's S3 service using JSON data
  *
  * @param options Keyword argumentsThe schema parameterThis is a schema object for this store. This should be JSON Schema format.The service parameterThis is the service object that is used to retrieve lazy data and save resultsThe function should be directly callable with a single parameter of an object id to be loadedThe function should also have the following methods:put(id,value) - puts the value at the given idpost(id,value) - posts (appends) the value at the given iddelete(id) - deletes the value corresponding to the given idNote that it is critical that the service parses responses as JSON.If you are using dojox.rpc.Service, the easiest way to make sure thishappens is to make the responses have a content type ofapplication/json. If you are creating your own service, make sure youuse handleAs: "json" with your XHR requests.The target parameterThis is the target URL for this Service store. This may be used in placeof a service parameter to connect directly to RESTful URL withoutusing a dojox.rpc.Service object.The idAttribute parameterDefaults to 'id'. The name of the attribute that holds an objects id.This can be a preexisting id provided by the server.If an ID isn't already provided when an objectis fetched or added to the store, the autoIdentity systemwill generate an id for it and add it to the index.The syncMode parameterSetting this to true will set the store to using synchronous calls by default.Sync calls return their data immediately from the calling function, socallbacks are unnecessary
  */
@JSGlobal("dojox.data.S3Store")
@js.native
class S3Store () extends JsonRestStore {
  def this(options: js.Any) = this()
}

