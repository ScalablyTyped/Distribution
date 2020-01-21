package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelInstruction extends js.Object {
  /** Additional information for Flatten instructions. */
  var flatten: js.UndefOr[FlattenInstruction] = js.undefined
  /** User-provided name of this operation. */
  var name: js.UndefOr[String] = js.undefined
  /** System-defined name for the operation in the original workflow graph. */
  var originalName: js.UndefOr[String] = js.undefined
  /** Describes the outputs of the instruction. */
  var outputs: js.UndefOr[js.Array[InstructionOutput]] = js.undefined
  /** Additional information for ParDo instructions. */
  var parDo: js.UndefOr[ParDoInstruction] = js.undefined
  /** Additional information for PartialGroupByKey instructions. */
  var partialGroupByKey: js.UndefOr[PartialGroupByKeyInstruction] = js.undefined
  /** Additional information for Read instructions. */
  var read: js.UndefOr[ReadInstruction] = js.undefined
  /**
    * System-defined name of this operation.
    * Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.undefined
  /** Additional information for Write instructions. */
  var write: js.UndefOr[WriteInstruction] = js.undefined
}

object ParallelInstruction {
  @scala.inline
  def apply(
    flatten: FlattenInstruction = null,
    name: String = null,
    originalName: String = null,
    outputs: js.Array[InstructionOutput] = null,
    parDo: ParDoInstruction = null,
    partialGroupByKey: PartialGroupByKeyInstruction = null,
    read: ReadInstruction = null,
    systemName: String = null,
    write: WriteInstruction = null
  ): ParallelInstruction = {
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
    __obj.asInstanceOf[ParallelInstruction]
  }
}

