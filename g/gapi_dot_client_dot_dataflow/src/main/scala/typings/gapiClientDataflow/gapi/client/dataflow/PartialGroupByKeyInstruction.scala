package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialGroupByKeyInstruction extends js.Object {
  /** Describes the input to the partial group-by-key instruction. */
  var input: js.UndefOr[InstructionInput] = js.undefined
  /** The codec to use for interpreting an element in the input PTable. */
  var inputElementCodec: js.UndefOr[Record[String, _]] = js.undefined
  /**
    * If this instruction includes a combining function this is the name of the
    * intermediate store between the GBK and the CombineValues.
    */
  var originalCombineValuesInputStoreName: js.UndefOr[String] = js.undefined
  /**
    * If this instruction includes a combining function, this is the name of the
    * CombineValues instruction lifted into this instruction.
    */
  var originalCombineValuesStepName: js.UndefOr[String] = js.undefined
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.undefined
  /** The value combining function to invoke. */
  var valueCombiningFn: js.UndefOr[Record[String, _]] = js.undefined
}

object PartialGroupByKeyInstruction {
  @scala.inline
  def apply(
    input: InstructionInput = null,
    inputElementCodec: Record[String, _] = null,
    originalCombineValuesInputStoreName: String = null,
    originalCombineValuesStepName: String = null,
    sideInputs: js.Array[SideInputInfo] = null,
    valueCombiningFn: Record[String, _] = null
  ): PartialGroupByKeyInstruction = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputElementCodec != null) __obj.updateDynamic("inputElementCodec")(inputElementCodec.asInstanceOf[js.Any])
    if (originalCombineValuesInputStoreName != null) __obj.updateDynamic("originalCombineValuesInputStoreName")(originalCombineValuesInputStoreName.asInstanceOf[js.Any])
    if (originalCombineValuesStepName != null) __obj.updateDynamic("originalCombineValuesStepName")(originalCombineValuesStepName.asInstanceOf[js.Any])
    if (sideInputs != null) __obj.updateDynamic("sideInputs")(sideInputs.asInstanceOf[js.Any])
    if (valueCombiningFn != null) __obj.updateDynamic("valueCombiningFn")(valueCombiningFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGroupByKeyInstruction]
  }
}

