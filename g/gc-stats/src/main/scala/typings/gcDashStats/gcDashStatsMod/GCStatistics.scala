package typings.gcDashStats.gcDashStatsMod

import typings.gcDashStats.gcDashStatsNumbers.`15`
import typings.gcDashStats.gcDashStatsNumbers.`1`
import typings.gcDashStats.gcDashStatsNumbers.`2`
import typings.gcDashStats.gcDashStatsNumbers.`4`
import typings.gcDashStats.gcDashStatsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GCStatistics extends js.Object {
  var after: MemoryStatistics
  var before: MemoryStatistics
  var diff: MemoryStatistics
  var endTime: Double
  var gctype: `1` | `2` | `4` | `8` | `15`
  var pause: Double
  var pauseMS: Double
  var startTime: Double
}

object GCStatistics {
  @scala.inline
  def apply(
    after: MemoryStatistics,
    before: MemoryStatistics,
    diff: MemoryStatistics,
    endTime: Double,
    gctype: `1` | `2` | `4` | `8` | `15`,
    pause: Double,
    pauseMS: Double,
    startTime: Double
  ): GCStatistics = {
    val __obj = js.Dynamic.literal(after = after, before = before, diff = diff, endTime = endTime, gctype = gctype.asInstanceOf[js.Any], pause = pause, pauseMS = pauseMS, startTime = startTime)
  
    __obj.asInstanceOf[GCStatistics]
  }
}

