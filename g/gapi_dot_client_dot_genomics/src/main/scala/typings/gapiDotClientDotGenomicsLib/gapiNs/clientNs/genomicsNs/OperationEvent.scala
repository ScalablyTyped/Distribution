package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationEvent extends js.Object {
  /** Required description of event. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional time of when event finished. An event can have a start time and no
    * finish time. If an event has a finish time, there must be a start time.
    */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Optional time of when event started. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

