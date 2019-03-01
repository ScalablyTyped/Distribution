package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryStats extends js.Object {
  var failcnt: scala.Double
  var limit: scala.Double
  var max_usage: scala.Double
  var stats: dockerodeLib.Anon_Activeanon
  var usage: scala.Double
}

object MemoryStats {
  @scala.inline
  def apply(
    failcnt: scala.Double,
    limit: scala.Double,
    max_usage: scala.Double,
    stats: dockerodeLib.Anon_Activeanon,
    usage: scala.Double
  ): MemoryStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("failcnt")(failcnt)
    __obj.updateDynamic("limit")(limit)
    __obj.updateDynamic("max_usage")(max_usage)
    __obj.updateDynamic("stats")(stats)
    __obj.updateDynamic("usage")(usage)
    __obj.asInstanceOf[MemoryStats]
  }
}

