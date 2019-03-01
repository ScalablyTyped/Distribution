package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeqMapTask extends js.Object {
  /** Information about each of the inputs. */
  var inputs: js.UndefOr[js.Array[SideInputInfo]] = js.undefined
  /** The user-provided name of the SeqDo operation. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Information about each of the outputs. */
  var outputInfos: js.UndefOr[js.Array[SeqMapTaskOutputInfo]] = js.undefined
  /**
    * System-defined name of the stage containing the SeqDo operation.
    * Unique across the workflow.
    */
  var stageName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * System-defined name of the SeqDo operation.
    * Unique across the workflow.
    */
  var systemName: js.UndefOr[java.lang.String] = js.undefined
  /** The user function to invoke. */
  var userFn: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
}

object SeqMapTask {
  @scala.inline
  def apply(
    inputs: js.Array[SideInputInfo] = null,
    name: java.lang.String = null,
    outputInfos: js.Array[SeqMapTaskOutputInfo] = null,
    stageName: java.lang.String = null,
    systemName: java.lang.String = null,
    userFn: stdLib.Record[java.lang.String, _] = null
  ): SeqMapTask = {
    val __obj = js.Dynamic.literal()
    if (inputs != null) __obj.updateDynamic("inputs")(inputs)
    if (name != null) __obj.updateDynamic("name")(name)
    if (outputInfos != null) __obj.updateDynamic("outputInfos")(outputInfos)
    if (stageName != null) __obj.updateDynamic("stageName")(stageName)
    if (systemName != null) __obj.updateDynamic("systemName")(systemName)
    if (userFn != null) __obj.updateDynamic("userFn")(userFn)
    __obj.asInstanceOf[SeqMapTask]
  }
}

