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

