package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTask extends js.Object {
  /** The instructions in the MapTask. */
  var instructions: js.UndefOr[js.Array[ParallelInstruction]] = js.undefined
  /**
    * System-defined name of the stage containing this MapTask.
    * Unique across the workflow.
    */
  var stageName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * System-defined name of this MapTask.
    * Unique across the workflow.
    */
  var systemName: js.UndefOr[java.lang.String] = js.undefined
}

