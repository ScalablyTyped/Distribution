package typings.emberData.mod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ember-data", "DS.SnapshotRecordArray")
@js.native
class SnapshotRecordArray[K /* <: /* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String */] () extends js.Object {
  
  /**
    * The relationships to include for this request.
    */
  var include: String | js.Array[_] = js.native
  
  /**
    * Number of records in the array
    */
  var length: Double = js.native
  
  /**
    * Get snapshots of the underlying record array
    */
  def snapshots(): js.Array[
    Snapshot[/* keyof ember-data.ember-data/types/registries/model.ModelRegistry */ String]
  ] = js.native
  
  /**
    * The type of the underlying records for the snapshots in the array, as a DS.Model
    */
  var `type`: /* import warning: importer.ImportType#apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
}
