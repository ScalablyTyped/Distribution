package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaQueryTimelineSample extends js.Object {
  /**
    * Total number of units currently being processed by workers. This does not
    * correspond directly to slot usage. This is the largest value observed
    * since the last sample.
    */
  var activeUnits: js.UndefOr[String] = js.native
  /**
    * Total parallel units of work completed by this query.
    */
  var completedUnits: js.UndefOr[String] = js.native
  /**
    * Milliseconds elapsed since the start of query execution.
    */
  var elapsedMs: js.UndefOr[String] = js.native
  /**
    * Total parallel units of work remaining for the active stages.
    */
  var pendingUnits: js.UndefOr[String] = js.native
  /**
    * Cumulative slot-ms consumed by the query.
    */
  var totalSlotMs: js.UndefOr[String] = js.native
}

object SchemaQueryTimelineSample {
  @scala.inline
  def apply(
    activeUnits: String = null,
    completedUnits: String = null,
    elapsedMs: String = null,
    pendingUnits: String = null,
    totalSlotMs: String = null
  ): SchemaQueryTimelineSample = {
    val __obj = js.Dynamic.literal()
    if (activeUnits != null) __obj.updateDynamic("activeUnits")(activeUnits.asInstanceOf[js.Any])
    if (completedUnits != null) __obj.updateDynamic("completedUnits")(completedUnits.asInstanceOf[js.Any])
    if (elapsedMs != null) __obj.updateDynamic("elapsedMs")(elapsedMs.asInstanceOf[js.Any])
    if (pendingUnits != null) __obj.updateDynamic("pendingUnits")(pendingUnits.asInstanceOf[js.Any])
    if (totalSlotMs != null) __obj.updateDynamic("totalSlotMs")(totalSlotMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryTimelineSample]
  }
}

