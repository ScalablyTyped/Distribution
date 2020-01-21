package typings.gapiClientDataflow.gapi.client.dataflow

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
  var stageName: js.UndefOr[String] = js.undefined
  /**
    * System-defined name of this MapTask.
    * Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.undefined
}

object MapTask {
  @scala.inline
  def apply(
    instructions: js.Array[ParallelInstruction] = null,
    stageName: String = null,
    systemName: String = null
  ): MapTask = {
    val __obj = js.Dynamic.literal()
    if (instructions != null) __obj.updateDynamic("instructions")(instructions.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (systemName != null) __obj.updateDynamic("systemName")(systemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTask]
  }
}

