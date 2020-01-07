package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that does a ParDo operation. Takes one main input and zero
  * or more side inputs, and produces zero or more outputs. Runs user code.
  */
@js.native
trait Schema$ParDoInstruction extends js.Object {
  /**
    * The input.
    */
  var input: js.UndefOr[Schema$InstructionInput] = js.native
  /**
    * Information about each of the outputs, if user_fn is a  MultiDoFn.
    */
  var multiOutputInfos: js.UndefOr[js.Array[Schema$MultiOutputInfo]] = js.native
  /**
    * The number of outputs.
    */
  var numOutputs: js.UndefOr[Double] = js.native
  /**
    * Zero or more side inputs.
    */
  var sideInputs: js.UndefOr[js.Array[Schema$SideInputInfo]] = js.native
  /**
    * The user function to invoke.
    */
  var userFn: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object Schema$ParDoInstruction {
  @scala.inline
  def apply(
    input: Schema$InstructionInput = null,
    multiOutputInfos: js.Array[Schema$MultiOutputInfo] = null,
    numOutputs: Int | Double = null,
    sideInputs: js.Array[Schema$SideInputInfo] = null,
    userFn: StringDictionary[js.Any] = null
  ): Schema$ParDoInstruction = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (multiOutputInfos != null) __obj.updateDynamic("multiOutputInfos")(multiOutputInfos.asInstanceOf[js.Any])
    if (numOutputs != null) __obj.updateDynamic("numOutputs")(numOutputs.asInstanceOf[js.Any])
    if (sideInputs != null) __obj.updateDynamic("sideInputs")(sideInputs.asInstanceOf[js.Any])
    if (userFn != null) __obj.updateDynamic("userFn")(userFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ParDoInstruction]
  }
}

