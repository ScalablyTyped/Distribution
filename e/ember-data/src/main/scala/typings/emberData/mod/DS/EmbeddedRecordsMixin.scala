package typings.emberData.mod.DS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ## Using Embedded Records
  */
@JSImport("ember-data", "DS.EmbeddedRecordsMixin")
@js.native
class EmbeddedRecordsMixin () extends StObject {
  
  /**
    * Normalize the record and recursively normalize/extract all the embedded records
    * while pushing them into the store as they are encountered
    */
  def normalize(typeClass: Model, hash: js.Object, prop: String): js.Object = js.native
  
  /**
    * When serializing an embedded record, modify the property (in the json payload)
    * that refers to the parent record (foreign key for relationship).
    */
  def removeEmbeddedForeignKey[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](snapshot: Snapshot[K], embeddedSnapshot: Snapshot[K], relationship: js.Object, json: js.Object): js.Any = js.native
  
  /**
    * Serialize `belongsTo` relationship when it is configured as an embedded object.
    */
  def serializeBelongsTo[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
  
  /**
    * Serializes `hasMany` relationships when it is configured as embedded objects.
    */
  def serializeHasMany[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */](snapshot: Snapshot[K], json: js.Object, relationship: js.Object): js.Any = js.native
}
