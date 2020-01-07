package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When a task splits using WorkItemStatus.dynamic_source_split, this message
  * describes the two parts of the split relative to the description of the
  * current task&#39;s input.
  */
@js.native
trait Schema$DynamicSourceSplit extends js.Object {
  /**
    * Primary part (continued to be processed by worker). Specified relative to
    * the previously-current source. Becomes current.
    */
  var primary: js.UndefOr[Schema$DerivedSource] = js.native
  /**
    * Residual part (returned to the pool of work). Specified relative to the
    * previously-current source.
    */
  var residual: js.UndefOr[Schema$DerivedSource] = js.native
}

object Schema$DynamicSourceSplit {
  @scala.inline
  def apply(primary: Schema$DerivedSource = null, residual: Schema$DerivedSource = null): Schema$DynamicSourceSplit = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (residual != null) __obj.updateDynamic("residual")(residual.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DynamicSourceSplit]
  }
}

