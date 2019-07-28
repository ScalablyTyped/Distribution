package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessMetric extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/process-metric
  /**
    * CPU usage of the process.
    */
  var cpu: CPUUsage
  /**
    * Process id of the process.
    */
  var pid: Double
  /**
    * Process type (Browser or Tab or GPU etc).
    */
  var `type`: String
}

object ProcessMetric {
  @scala.inline
  def apply(cpu: CPUUsage, pid: Double, `type`: String): ProcessMetric = {
    val __obj = js.Dynamic.literal(cpu = cpu, pid = pid)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProcessMetric]
  }
}

