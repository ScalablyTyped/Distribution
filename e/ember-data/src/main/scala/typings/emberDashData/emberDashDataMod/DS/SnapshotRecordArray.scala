package typings.emberDashData.emberDashDataMod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember-data", "DS.SnapshotRecordArray")
@js.native
class SnapshotRecordArray[K /* <: String */] () extends js.Object {
  /**
    * The relationships to include for this request.
    */
  var include: String | js.Array[_] = js.native
  /**
    * Number of records in the array
    */
  var length: Double = js.native
  /**
    * The type of the underlying records for the snapshots in the array, as a DS.Model
    */
  var `type`: /* import warning: ImportType.apply Failed type conversion: ember-data.ember-data/types/registries/model.ModelRegistry[K] */ js.Any = js.native
  /**
    * Get snapshots of the underlying record array
    */
  def snapshots(): js.Array[Snapshot[_]] = js.native
}

