package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportedParallelism extends js.Object {
  /**
    * Specifies whether the parallelism is infinite. If true, "value" is
    * ignored.
    * Infinite parallelism means the service will assume that the work item
    * can always be split into more non-empty work items by dynamic splitting.
    * This is a work-around for lack of support for infinity by the current
    * JSON-based Java RPC stack.
    */
  var isInfinite: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the level of parallelism in case it is finite. */
  var value: js.UndefOr[scala.Double] = js.undefined
}

