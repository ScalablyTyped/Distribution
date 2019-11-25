package typings.dockerode.dockerodeMod

import typings.dockerode.Anon_Activeanon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryStats extends js.Object {
  var failcnt: Double
  var limit: Double
  var max_usage: Double
  var stats: Anon_Activeanon
  var usage: Double
}

object MemoryStats {
  @scala.inline
  def apply(failcnt: Double, limit: Double, max_usage: Double, stats: Anon_Activeanon, usage: Double): MemoryStats = {
    val __obj = js.Dynamic.literal(failcnt = failcnt.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], max_usage = max_usage.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemoryStats]
  }
}

