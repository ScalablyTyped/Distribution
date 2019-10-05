package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicSourceSplit extends js.Object {
  /**
    * Primary part (continued to be processed by worker).
    * Specified relative to the previously-current source.
    * Becomes current.
    */
  var primary: js.UndefOr[DerivedSource] = js.undefined
  /**
    * Residual part (returned to the pool of work).
    * Specified relative to the previously-current source.
    */
  var residual: js.UndefOr[DerivedSource] = js.undefined
}

object DynamicSourceSplit {
  @scala.inline
  def apply(primary: DerivedSource = null, residual: DerivedSource = null): DynamicSourceSplit = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (residual != null) __obj.updateDynamic("residual")(residual)
    __obj.asInstanceOf[DynamicSourceSplit]
  }
}

