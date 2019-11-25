package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeqMapTask extends js.Object {
  /** Information about each of the inputs. */
  var inputs: js.UndefOr[js.Array[SideInputInfo]] = js.undefined
  /** The user-provided name of the SeqDo operation. */
  var name: js.UndefOr[String] = js.undefined
  /** Information about each of the outputs. */
  var outputInfos: js.UndefOr[js.Array[SeqMapTaskOutputInfo]] = js.undefined
  /**
    * System-defined name of the stage containing the SeqDo operation.
    * Unique across the workflow.
    */
  var stageName: js.UndefOr[String] = js.undefined
  /**
    * System-defined name of the SeqDo operation.
    * Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.undefined
  /** The user function to invoke. */
  var userFn: js.UndefOr[Record[String, _]] = js.undefined
}

object SeqMapTask {
  @scala.inline
  def apply(
    inputs: js.Array[SideInputInfo] = null,
    name: String = null,
    outputInfos: js.Array[SeqMapTaskOutputInfo] = null,
    stageName: String = null,
    systemName: String = null,
    userFn: Record[String, _] = null
  ): SeqMapTask = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputInfos != null) __obj.updateDynamic("outputInfos")(outputInfos.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (systemName != null) __obj.updateDynamic("systemName")(systemName.asInstanceOf[js.Any])
    if (userFn != null) __obj.updateDynamic("userFn")(userFn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeqMapTask]
  }
}

