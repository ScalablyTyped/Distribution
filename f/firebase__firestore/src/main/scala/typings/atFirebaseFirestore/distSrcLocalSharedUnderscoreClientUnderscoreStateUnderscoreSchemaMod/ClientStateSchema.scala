package typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateUnderscoreSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientStateSchema extends js.Object {
  var activeTargetIds: js.Array[Double]
  var updateTimeMs: Double
}

object ClientStateSchema {
  @scala.inline
  def apply(activeTargetIds: js.Array[Double], updateTimeMs: Double): ClientStateSchema = {
    val __obj = js.Dynamic.literal(activeTargetIds = activeTargetIds.asInstanceOf[js.Any], updateTimeMs = updateTimeMs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientStateSchema]
  }
}

