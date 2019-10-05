package typings.emberDashData.emberDashDataMod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ## Using Embedded Records
  */
@JSImport("ember-data", "DS.EmbeddedRecordsMixin")
@js.native
class EmbeddedRecordsMixin () extends js.Object {
  /**
    * Normalize the record and recursively normalize/extract all the embedded records
    * while pushing them into the store as they are encountered
    */
  def normalize(typeClass: Model, hash: js.Object, prop: String): js.Object = js.native
  /**
    * When serializing an embedded record, modify the property (in the json payload)
    * that refers to the parent record (foreign key for relationship).
    */
  def removeEmbeddedForeignKey[K /* <: String */](snapshot: Snapshot[K], embeddedSnapshot: Snapshot[K], relationship: js.Object, json: js.Object): js.Any = js.native
  /**
    * Serialize `belongsTo` relationship when it is configured as an embedded object.
    */
  def serializeBelongsTo[K /* <: String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
  /**
    * Serializes `hasMany` relationships when it is configured as embedded objects.
    */
  def serializeHasMany[K /* <: String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
}

