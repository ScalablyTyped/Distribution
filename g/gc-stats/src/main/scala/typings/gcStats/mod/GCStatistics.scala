package typings.gcStats.mod

import typings.gcStats.gcStatsNumbers.`15`
import typings.gcStats.gcStatsNumbers.`1`
import typings.gcStats.gcStatsNumbers.`2`
import typings.gcStats.gcStatsNumbers.`4`
import typings.gcStats.gcStatsNumbers.`8`
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
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], gctype = gctype.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], pauseMS = pauseMS.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GCStatistics]
  }
}

