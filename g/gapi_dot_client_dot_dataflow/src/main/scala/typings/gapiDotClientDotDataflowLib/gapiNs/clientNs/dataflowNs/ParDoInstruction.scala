package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParDoInstruction extends js.Object {
  /** The input. */
  var input: js.UndefOr[InstructionInput] = js.undefined
  /** Information about each of the outputs, if user_fn is a  MultiDoFn. */
  var multiOutputInfos: js.UndefOr[js.Array[MultiOutputInfo]] = js.undefined
  /** The number of outputs. */
  var numOutputs: js.UndefOr[scala.Double] = js.undefined
  /** Zero or more side inputs. */
  var sideInputs: js.UndefOr[js.Array[SideInputInfo]] = js.undefined
  /** The user function to invoke. */
  var userFn: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object ParDoInstruction {
  @scala.inline
  def apply(
    input: InstructionInput = null,
    multiOutputInfos: js.Array[MultiOutputInfo] = null,
    numOutputs: scala.Int | scala.Double = null,
    sideInputs: js.Array[SideInputInfo] = null,
    userFn: stdLib.Record[java.lang.String, _] = null
  ): ParDoInstruction = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input)
    if (multiOutputInfos != null) __obj.updateDynamic("multiOutputInfos")(multiOutputInfos)
    if (numOutputs != null) __obj.updateDynamic("numOutputs")(numOutputs.asInstanceOf[js.Any])
    if (sideInputs != null) __obj.updateDynamic("sideInputs")(sideInputs)
    if (userFn != null) __obj.updateDynamic("userFn")(userFn)
    __obj.asInstanceOf[ParDoInstruction]
  }
}

