package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstructionInput extends js.Object {
  /** The output index (origin zero) within the producer. */
  var outputNum: js.UndefOr[Double] = js.undefined
  /**
    * The index (origin zero) of the parallel instruction that produces
    * the output to be consumed by this input.  This index is relative
    * to the list of instructions in this input's instruction's
    * containing MapTask.
    */
  var producerInstructionIndex: js.UndefOr[Double] = js.undefined
}

object InstructionInput {
  @scala.inline
  def apply(
    outputNum: js.UndefOr[Double] = js.undefined,
    producerInstructionIndex: js.UndefOr[Double] = js.undefined
  ): InstructionInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(outputNum)) __obj.updateDynamic("outputNum")(outputNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(producerInstructionIndex)) __obj.updateDynamic("producerInstructionIndex")(producerInstructionIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstructionInput]
  }
}

