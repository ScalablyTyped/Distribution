package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelInstruction extends js.Object {
  /** Additional information for Flatten instructions. */
  var flatten: js.UndefOr[FlattenInstruction] = js.undefined
  /** User-provided name of this operation. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** System-defined name for the operation in the original workflow graph. */
  var originalName: js.UndefOr[java.lang.String] = js.undefined
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
  var systemName: js.UndefOr[java.lang.String] = js.undefined
  /** Additional information for Write instructions. */
  var write: js.UndefOr[WriteInstruction] = js.undefined
}

