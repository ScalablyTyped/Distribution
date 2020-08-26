package typings.dockerode.mod

import typings.dockerode.anon.Activeanon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryStats extends js.Object {
  var failcnt: Double = js.native
  var limit: Double = js.native
  var max_usage: Double = js.native
  var stats: Activeanon = js.native
  var usage: Double = js.native
}

object MemoryStats {
  @scala.inline
  def apply(failcnt: Double, limit: Double, max_usage: Double, stats: Activeanon, usage: Double): MemoryStats = {
    val __obj = js.Dynamic.literal(failcnt = failcnt.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], max_usage = max_usage.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryStats]
  }
  @scala.inline
  implicit class MemoryStatsOps[Self <: MemoryStats] (val x: Self) extends AnyVal {
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
    def setFailcnt(value: Double): Self = this.set("failcnt", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax_usage(value: Double): Self = this.set("max_usage", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Activeanon): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsage(value: Double): Self = this.set("usage", value.asInstanceOf[js.Any])
  }
  
}

