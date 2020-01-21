package typings.emberData.mod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Normally, applications will use the `RESTSerializer` by implementing
  * the `normalize` method.
  */
@JSImport("ember-data", "DS.RESTSerializer")
@js.native
class RESTSerializer () extends JSONSerializer {
  /**
    * `keyForPolymorphicType` can be used to define a custom key when
    * serializing and deserializing a polymorphic type. By default, the
    * returned key is `${key}Type`.
    */
  def keyForPolymorphicType(key: String, typeClass: String, method: String): String = js.native
  def normalize(modelClass: Model, resourceHash: js.Object, prop: String): js.Object = js.native
  /**
    * You can use `payloadKeyFromModelName` to override the root key for an outgoing
    * request. By default, the RESTSerializer returns a camelized version of the
    * model's name.
    */
  def payloadKeyFromModelName[K /* <: String */](modelName: K): String = js.native
  /**
    * `payloadTypeFromModelName` can be used to change the mapping for the type in
    * the payload, taken from the model name.
    */
  def payloadTypeFromModelName[K /* <: String */](modelName: K): String = js.native
  /**
    * This method allows you to push a payload containing top-level
    * collections of records organized per type.
    */
  def pushPayload(store: Store, payload: js.Object): js.Any = js.native
  /**
    * You can use this method to customize the root keys serialized into the JSON.
    * The hash property should be modified by reference (possibly using something like _.extend)
    * By default the REST Serializer sends the modelName of a model, which is a camelized
    * version of the name.
    */
  def serializeIntoHash[K /* <: String */](hash: js.Object, typeClass: Model, snapshot: Snapshot[K]): js.Any = js.native
  def serializeIntoHash[K /* <: String */](hash: js.Object, typeClass: Model, snapshot: Snapshot[K], options: js.Object): js.Any = js.native
}

