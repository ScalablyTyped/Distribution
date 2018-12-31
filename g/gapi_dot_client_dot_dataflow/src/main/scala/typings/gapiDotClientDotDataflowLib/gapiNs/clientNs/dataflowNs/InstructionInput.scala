package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstructionInput extends js.Object {
  /** The output index (origin zero) within the producer. */
  var outputNum: js.UndefOr[scala.Double] = js.undefined
  /**
    * The index (origin zero) of the parallel instruction that produces
    * the output to be consumed by this input.  This index is relative
    * to the list of instructions in this input's instruction's
    * containing MapTask.
    */
  var producerInstructionIndex: js.UndefOr[scala.Double] = js.undefined
}

