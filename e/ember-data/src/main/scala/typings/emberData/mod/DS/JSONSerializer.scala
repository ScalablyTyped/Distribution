package typings.emberData.mod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Ember Data 2.0 Serializer:
  */
@JSImport("ember-data", "DS.JSONSerializer")
@js.native
class JSONSerializer () extends Serializer {
  /**
    * The `primaryKey` is used when serializing and deserializing
    * data. Ember Data always uses the `id` property to store the id of
    * the record. The external source may not always follow this
    * convention. In these cases it is useful to override the
    * `primaryKey` property to match the `primaryKey` of your external
    * store.
    */
  var primaryKey: String = js.native
  /**
    * Returns the resource's attributes formatted as a JSON-API "attributes object".
    */
  def extractAttributes(modelClass: js.Object, resourceHash: js.Object): js.Object = js.native
  /**
    * `extractErrors` is used to extract model errors when a call
    * to `DS.Model#save` fails with an `InvalidError`. By default
    * Ember Data expects error information to be located on the `errors`
    * property of the payload object.
    */
  def extractErrors(store: Store, typeClass: Model, payload: js.Object, id: String): js.Object = js.native
  def extractErrors(store: Store, typeClass: Model, payload: js.Object, id: Double): js.Object = js.native
  /**
    * Returns the resource's ID.
    */
  def extractId(modelClass: js.Object, resourceHash: js.Object): String = js.native
  /**
    * `extractMeta` is used to deserialize any meta information in the
    * adapter payload. By default Ember Data expects meta information to
    * be located on the `meta` property of the payload object.
    */
  def extractMeta(store: Store, modelClass: Model, payload: js.Object): js.Any = js.native
  /**
    * Returns a polymorphic relationship formatted as a JSON-API "relationship object".
    */
  def extractPolymorphicRelationship(relationshipModelName: js.Object, relationshipHash: js.Object, relationshipOptions: js.Object): js.Object = js.native
  /**
    * Returns a relationship formatted as a JSON-API "relationship object".
    */
  def extractRelationship(relationshipModelName: js.Object, relationshipHash: js.Object): js.Object = js.native
  /**
    * Returns the resource's relationships formatted as a JSON-API "relationships object".
    */
  def extractRelationships(modelClass: js.Object, resourceHash: js.Object): js.Object = js.native
  /**
    * `keyForAttribute` can be used to define rules for how to convert an
    * attribute name in your model to a key in your JSON.
    */
  def keyForAttribute(key: String, method: String): String = js.native
  /**
    * `keyForLink` can be used to define a custom key when deserializing link
    * properties.
    */
  def keyForLink(key: String, kind: String): String = js.native
  /**
    * `keyForRelationship` can be used to define a custom key when
    * serializing and deserializing relationship properties. By default
    * `JSONSerializer` does not provide an implementation of this method.
    */
  def keyForRelationship(key: String, typeClass: String, method: String): String = js.native
  def modelNameFromPayloadKey(key: String): String = js.native
  def modelNameFromPayloadType(`type`: String): String = js.native
  def normalizeArrayResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeArrayResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeCreateRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeCreateRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeDeleteRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeDeleteRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeFindAllResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeFindAllResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeFindBelongsToResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeFindBelongsToResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeFindHasManyResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeFindHasManyResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeFindManyResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeFindManyResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeFindRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeFindRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeQueryRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeQueryRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeQueryResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeQueryResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeSaveResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeSaveResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeSingleResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeSingleResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  def normalizeUpdateRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: String, requestType: String): js.Object = js.native
  def normalizeUpdateRecordResponse(store: Store, primaryModelClass: Model, payload: js.Object, id: Double, requestType: String): js.Object = js.native
  /**
    * `serializeAttribute` can be used to customize how `DS.attr`
    * properties are serialized
    */
  def serializeAttribute[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](snapshot: Snapshot[K], json: js.Object, key: String, attribute: js.Object): js.Any = js.native
  /**
    * `serializeBelongsTo` can be used to customize how `DS.belongsTo`
    * properties are serialized.
    */
  def serializeBelongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
  /**
    * `serializeHasMany` can be used to customize how `DS.hasMany`
    * properties are serialized.
    */
  def serializeHasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
  /**
    * serializeId can be used to customize how id is serialized
    * For example, your server may expect integer datatype of id
    */
  def serializeId[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](snapshot: Snapshot[K], json: js.Object, primaryKey: String): js.Any = js.native
  /**
    * You can use this method to customize how a serialized record is added to the complete
    * JSON hash to be sent to the server. By default the JSON Serializer does not namespace
    * the payload and just sends the raw serialized JSON object.
    * If your server expects namespaced keys, you should consider using the RESTSerializer.
    * Otherwise you can override this method to customize how the record is added to the hash.
    * The hash property should be modified by reference.
    */
  def serializeIntoHash[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
    hash: js.Object,
    typeClass: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
    snapshot: Snapshot[K]
  ): js.Any = js.native
  def serializeIntoHash[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](
    hash: js.Object,
    typeClass: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any,
    snapshot: Snapshot[K],
    options: js.Object
  ): js.Any = js.native
  /**
    * You can use this method to customize how polymorphic objects are
    * serialized. Objects are considered to be polymorphic if
    * `{ polymorphic: true }` is pass as the second argument to the
    * `DS.belongsTo` function.
    */
  def serializePolymorphicType[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
  /**
    * Check if the given hasMany relationship should be serialized
    */
  def shouldSerializeHasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](snapshot: Snapshot[K], key: String, relationshipType: String): Boolean = js.native
}

