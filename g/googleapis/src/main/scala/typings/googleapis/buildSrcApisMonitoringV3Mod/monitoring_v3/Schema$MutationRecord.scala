package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a change made to a configuration.
  */
@js.native
trait Schema$MutationRecord extends js.Object {
  /**
    * When the change occurred.
    */
  var mutateTime: js.UndefOr[String] = js.native
  /**
    * The email address of the user making the change.
    */
  var mutatedBy: js.UndefOr[String] = js.native
}

object Schema$MutationRecord {
  @scala.inline
  def apply(mutateTime: String = null, mutatedBy: String = null): Schema$MutationRecord = {
    val __obj = js.Dynamic.literal()
    if (mutateTime != null) __obj.updateDynamic("mutateTime")(mutateTime.asInstanceOf[js.Any])
    if (mutatedBy != null) __obj.updateDynamic("mutatedBy")(mutatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MutationRecord]
  }
}

