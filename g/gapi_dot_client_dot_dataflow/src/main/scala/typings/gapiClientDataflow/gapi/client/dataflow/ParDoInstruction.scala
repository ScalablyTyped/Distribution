package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParDoInstruction extends js.Object {
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.undefined
  /** Information about each of the outputs, if user_fn is a  MultiDoFn. */
  var multiOutputInfos: js.UndefOr[js.Array[MultiOutputInfo]] = js.undefined
  /** The number of outputs. */
  var numOutputs: js.UndefOr[Double] = js.undefined
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.undefined
  /** The user function to invoke. */
  var userFn: js.UndefOr[Record[String, _]] = js.undefined
}

object ParDoInstruction {
  @scala.inline
  def apply(
    input: InstructionInput = null,
    multiOutputInfos: js.Array[MultiOutputInfo] = null,
    numOutputs: js.UndefOr[Double] = js.undefined,
    sideInputs: js.Array[SideInputInfo] = null,
    userFn: Record[String, _] = null
  ): ParDoInstruction = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (multiOutputInfos != null) __obj.updateDynamic("multiOutputInfos")(multiOutputInfos.asInstanceOf[js.Any])
    if (!js.isUndefined(numOutputs)) __obj.updateDynamic("numOutputs")(numOutputs.get.asInstanceOf[js.Any])
    if (sideInputs != null) __obj.updateDynamic("sideInputs")(sideInputs.asInstanceOf[js.Any])
    if (userFn != null) __obj.updateDynamic("userFn")(userFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParDoInstruction]
  }
}

