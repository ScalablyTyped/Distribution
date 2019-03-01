package typings
package electronLib.ElectronNs

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
  var pid: scala.Double
  /**
    * Process type (Browser or Tab or GPU etc).
    */
  var `type`: java.lang.String
}

object ProcessMetric {
  @scala.inline
  def apply(cpu: CPUUsage, pid: scala.Double, `type`: java.lang.String): ProcessMetric = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("cpu")(cpu)
    __obj.updateDynamic("pid")(pid)
    __obj.asInstanceOf[ProcessMetric]
  }
}

