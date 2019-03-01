package typings
package gcDashStatsLib.gcDashStatsMod.GCStatsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GCStatistics extends js.Object {
  var after: MemoryStatistics
  var before: MemoryStatistics
  var diff: MemoryStatistics
  var endTime: scala.Double
  var gctype: gcDashStatsLib.gcDashStatsLibNumbers.`1` | gcDashStatsLib.gcDashStatsLibNumbers.`2` | gcDashStatsLib.gcDashStatsLibNumbers.`4` | gcDashStatsLib.gcDashStatsLibNumbers.`8` | gcDashStatsLib.gcDashStatsLibNumbers.`15`
  var pause: scala.Double
  var pauseMS: scala.Double
  var startTime: scala.Double
}

object GCStatistics {
  @scala.inline
  def apply(
    after: MemoryStatistics,
    before: MemoryStatistics,
    diff: MemoryStatistics,
    endTime: scala.Double,
    gctype: gcDashStatsLib.gcDashStatsLibNumbers.`1` | gcDashStatsLib.gcDashStatsLibNumbers.`2` | gcDashStatsLib.gcDashStatsLibNumbers.`4` | gcDashStatsLib.gcDashStatsLibNumbers.`8` | gcDashStatsLib.gcDashStatsLibNumbers.`15`,
    pause: scala.Double,
    pauseMS: scala.Double,
    startTime: scala.Double
  ): GCStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("after")(after)
    __obj.updateDynamic("before")(before)
    __obj.updateDynamic("diff")(diff)
    __obj.updateDynamic("endTime")(endTime)
    __obj.updateDynamic("gctype")(gctype.asInstanceOf[js.Any])
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("pauseMS")(pauseMS)
    __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[GCStatistics]
  }
}

