package typings.emberData.mod.DS

import typings.emberObject.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `DS.Serializer` is an abstract base class that you should override in your
  * application to customize it for your backend. The minimum set of methods
  * that you should implement is:
  */
@JSImport("ember-data", "DS.Serializer")
@js.native
class Serializer () extends default {
  /**
    * The `store` property is the application's `store` that contains
    * all records. It can be used to look up serializers for other model
    * types that may be nested inside the payload response.
    */
  var store: Store = js.native
  /**
    * The `normalize` method is used to convert a payload received from your
    * external data source into the normalized form `store.push()` expects. You
    * should override this method, munge the hash and return the normalized
    * payload.
    */
  def normalize(typeClass: Model, hash: js.Object): js.Object = js.native
  /**
    * The `normalizeResponse` method is used to normalize a payload from the
    * server to a JSON-API Document.
    */
  def normalizeResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  /**
    * The `serialize` method is used when a record is saved in order to convert
    * the record into the form that your external data source expects.
    */
  def serialize[K /* <: String */](snapshot: Snapshot[K], options: js.Object): js.Object = js.native
}

