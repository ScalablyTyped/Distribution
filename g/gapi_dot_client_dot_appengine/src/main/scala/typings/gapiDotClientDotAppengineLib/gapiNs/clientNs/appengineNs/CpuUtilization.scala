package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CpuUtilization extends js.Object {
  /** Period of time over which CPU utilization is calculated. */
  var aggregationWindowLength: js.UndefOr[java.lang.String] = js.undefined
  /** Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1. */
  var targetUtilization: js.UndefOr[scala.Double] = js.undefined
}

