package typings.gapiDotClientDotGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuntimeMetadata extends js.Object {
  /** Execution information specific to Google Compute Engine. */
  var computeEngine: js.UndefOr[ComputeEngine] = js.undefined
}

object RuntimeMetadata {
  @scala.inline
  def apply(computeEngine: ComputeEngine = null): RuntimeMetadata = {
    val __obj = js.Dynamic.literal()
    if (computeEngine != null) __obj.updateDynamic("computeEngine")(computeEngine)
    __obj.asInstanceOf[RuntimeMetadata]
  }
}

