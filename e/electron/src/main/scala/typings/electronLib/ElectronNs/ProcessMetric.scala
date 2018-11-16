package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ProcessMetric extends js.Object {
  // Docs: http://electron.atom.io/docs/api/structures/process-metric
  /**
       * CPU usage of the process.
       */
  var cpu: CPUUsage
  /**
       * Memory information for the process.
       */
  var memory: MemoryInfo
  /**
       * Process id of the process.
       */
  var pid: scala.Double
  /**
       * Process type (Browser or Tab or GPU etc).
       */
  var `type`: java.lang.String
}

