package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CPUUsage extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/cpu-usage
  /**
    * The number of average idle CPU wakeups per second since the last call to
    * getCPUUsage. First call returns 0. Will always return 0 on Windows.
    */
  var idleWakeupsPerSecond: Double
  /**
    * Percentage of CPU used since the last call to getCPUUsage. First call returns 0.
    */
  var percentCPUUsage: Double
}

object CPUUsage {
  @scala.inline
  def apply(idleWakeupsPerSecond: Double, percentCPUUsage: Double): CPUUsage = {
    val __obj = js.Dynamic.literal(idleWakeupsPerSecond = idleWakeupsPerSecond.asInstanceOf[js.Any], percentCPUUsage = percentCPUUsage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CPUUsage]
  }
}

