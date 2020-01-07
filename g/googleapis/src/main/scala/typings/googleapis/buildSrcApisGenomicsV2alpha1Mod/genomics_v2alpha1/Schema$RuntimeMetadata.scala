package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Runtime metadata that will be populated in the runtimeMetadata field of the
  * Operation associated with a RunPipeline execution.
  */
@js.native
trait Schema$RuntimeMetadata extends js.Object {
  /**
    * Execution information specific to Google Compute Engine.
    */
  var computeEngine: js.UndefOr[Schema$ComputeEngine] = js.native
}

object Schema$RuntimeMetadata {
  @scala.inline
  def apply(computeEngine: Schema$ComputeEngine = null): Schema$RuntimeMetadata = {
    val __obj = js.Dynamic.literal()
    if (computeEngine != null) __obj.updateDynamic("computeEngine")(computeEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RuntimeMetadata]
  }
}

