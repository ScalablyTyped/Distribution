package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MapTask consists of an ordered set of instructions, each of which describes
  * one particular low-level operation for the worker to perform in order to
  * accomplish the MapTask&#39;s WorkItem.  Each instruction must appear in the
  * list before any instructions which depends on its output.
  */
@js.native
trait Schema$MapTask extends js.Object {
  /**
    * Counter prefix that can be used to prefix counters. Not currently used in
    * Dataflow.
    */
  var counterPrefix: js.UndefOr[String] = js.native
  /**
    * The instructions in the MapTask.
    */
  var instructions: js.UndefOr[js.Array[Schema$ParallelInstruction]] = js.native
  /**
    * System-defined name of the stage containing this MapTask. Unique across
    * the workflow.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * System-defined name of this MapTask. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
}

object Schema$MapTask {
  @scala.inline
  def apply(
    counterPrefix: String = null,
    instructions: js.Array[Schema$ParallelInstruction] = null,
    stageName: String = null,
    systemName: String = null
  ): Schema$MapTask = {
    val __obj = js.Dynamic.literal()
    if (counterPrefix != null) __obj.updateDynamic("counterPrefix")(counterPrefix.asInstanceOf[js.Any])
    if (instructions != null) __obj.updateDynamic("instructions")(instructions.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (systemName != null) __obj.updateDynamic("systemName")(systemName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MapTask]
  }
}

