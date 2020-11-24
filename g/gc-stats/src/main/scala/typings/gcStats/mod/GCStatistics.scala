package typings.gcStats.mod

import typings.gcStats.gcStatsNumbers.`15`
import typings.gcStats.gcStatsNumbers.`1`
import typings.gcStats.gcStatsNumbers.`2`
import typings.gcStats.gcStatsNumbers.`4`
import typings.gcStats.gcStatsNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GCStatistics extends js.Object {
  
  var after: MemoryStatistics = js.native
  
  var before: MemoryStatistics = js.native
  
  var diff: MemoryStatistics = js.native
  
  var endTime: Double = js.native
  
  var gctype: `1` | `2` | `4` | `8` | `15` = js.native
  
  var pause: Double = js.native
  
  var pauseMS: Double = js.native
  
  var startTime: Double = js.native
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
  
  @scala.inline
  implicit class GCStatisticsOps[Self <: GCStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAfter(value: MemoryStatistics): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: MemoryStatistics): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiff(value: MemoryStatistics): Self = this.set("diff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGctype(value: `1` | `2` | `4` | `8` | `15`): Self = this.set("gctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: Double): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseMS(value: Double): Self = this.set("pauseMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
}
