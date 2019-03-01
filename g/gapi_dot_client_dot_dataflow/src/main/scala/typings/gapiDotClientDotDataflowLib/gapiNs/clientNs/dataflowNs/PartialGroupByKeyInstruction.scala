package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialGroupByKeyInstruction extends js.Object {
  /** Describes the input to the partial group-by-key instruction. */
  var input: js.UndefOr[InstructionInput] = js.undefined
  /** The codec to use for interpreting an element in the input PTable. */
  var inputElementCodec: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
    * If this instruction includes a combining function this is the name of the
    * intermediate store between the GBK and the CombineValues.
    */
  var originalCombineValuesInputStoreName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If this instruction includes a combining function, this is the name of the
    * CombineValues instruction lifted into this instruction.
    */
  var originalCombineValuesStepName: js.UndefOr[java.lang.String] = js.undefined
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.undefined
  /** The value combining function to invoke. */
  var valueCombiningFn: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object PartialGroupByKeyInstruction {
  @scala.inline
  def apply(
    input: InstructionInput = null,
    inputElementCodec: stdLib.Record[java.lang.String, _] = null,
    originalCombineValuesInputStoreName: java.lang.String = null,
    originalCombineValuesStepName: java.lang.String = null,
    sideInputs: js.Array[SideInputInfo] = null,
    valueCombiningFn: stdLib.Record[java.lang.String, _] = null
  ): PartialGroupByKeyInstruction = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (inputElementCodec != null) __obj.updateDynamic("inputElementCodec")(inputElementCodec)
    if (originalCombineValuesInputStoreName != null) __obj.updateDynamic("originalCombineValuesInputStoreName")(originalCombineValuesInputStoreName)
    if (originalCombineValuesStepName != null) __obj.updateDynamic("originalCombineValuesStepName")(originalCombineValuesStepName)
    if (sideInputs != null) __obj.updateDynamic("sideInputs")(sideInputs)
    if (valueCombiningFn != null) __obj.updateDynamic("valueCombiningFn")(valueCombiningFn)
    __obj.asInstanceOf[PartialGroupByKeyInstruction]
  }
}

