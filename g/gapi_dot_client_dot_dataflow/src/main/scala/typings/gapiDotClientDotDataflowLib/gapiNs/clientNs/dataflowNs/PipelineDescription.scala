package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PipelineDescription extends js.Object {
  /** Pipeline level display data. */
  var displayData: js.UndefOr[js.Array[DisplayData]] = js.undefined
  /** Description of each stage of execution of the pipeline. */
  var executionPipelineStage: js.UndefOr[js.Array[ExecutionStageSummary]] = js.undefined
  /** Description of each transform in the pipeline and collections between them. */
  var originalPipelineTransform: js.UndefOr[js.Array[TransformSummary]] = js.undefined
}

