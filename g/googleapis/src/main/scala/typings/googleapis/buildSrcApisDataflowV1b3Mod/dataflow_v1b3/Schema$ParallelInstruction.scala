package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a particular operation comprising a MapTask.
  */
@js.native
trait Schema$ParallelInstruction extends js.Object {
  /**
    * Additional information for Flatten instructions.
    */
  var flatten: js.UndefOr[Schema$FlattenInstruction] = js.native
  /**
    * User-provided name of this operation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * System-defined name for the operation in the original workflow graph.
    */
  var originalName: js.UndefOr[String] = js.native
  /**
    * Describes the outputs of the instruction.
    */
  var outputs: js.UndefOr[js.Array[Schema$InstructionOutput]] = js.native
  /**
    * Additional information for ParDo instructions.
    */
  var parDo: js.UndefOr[Schema$ParDoInstruction] = js.native
  /**
    * Additional information for PartialGroupByKey instructions.
    */
  var partialGroupByKey: js.UndefOr[Schema$PartialGroupByKeyInstruction] = js.native
  /**
    * Additional information for Read instructions.
    */
  var read: js.UndefOr[Schema$ReadInstruction] = js.native
  /**
    * System-defined name of this operation. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
  /**
    * Additional information for Write instructions.
    */
  var write: js.UndefOr[Schema$WriteInstruction] = js.native
}

object Schema$ParallelInstruction {
  @scala.inline
  def apply(
    flatten: Schema$FlattenInstruction = null,
    name: String = null,
    originalName: String = null,
    outputs: js.Array[Schema$InstructionOutput] = null,
    parDo: Schema$ParDoInstruction = null,
    partialGroupByKey: Schema$PartialGroupByKeyInstruction = null,
    read: Schema$ReadInstruction = null,
    systemName: String = null,
    write: Schema$WriteInstruction = null
  ): Schema$ParallelInstruction = {
    val __obj = js.Dynamic.literal()
    if (flatten != null) __obj.updateDynamic("flatten")(flatten.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalName != null) __obj.updateDynamic("originalName")(originalName.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (parDo != null) __obj.updateDynamic("parDo")(parDo.asInstanceOf[js.Any])
    if (partialGroupByKey != null) __obj.updateDynamic("partialGroupByKey")(partialGroupByKey.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (systemName != null) __obj.updateDynamic("systemName")(systemName.asInstanceOf[js.Any])
    if (write != null) __obj.updateDynamic("write")(write.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ParallelInstruction]
  }
}

