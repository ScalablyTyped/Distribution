package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED in favor of DynamicSourceSplit.
  */
@js.native
trait Schema$SourceFork extends js.Object {
  /**
    * DEPRECATED
    */
  var primary: js.UndefOr[Schema$SourceSplitShard] = js.native
  /**
    * DEPRECATED
    */
  var primarySource: js.UndefOr[Schema$DerivedSource] = js.native
  /**
    * DEPRECATED
    */
  var residual: js.UndefOr[Schema$SourceSplitShard] = js.native
  /**
    * DEPRECATED
    */
  var residualSource: js.UndefOr[Schema$DerivedSource] = js.native
}

object Schema$SourceFork {
  @scala.inline
  def apply(
    primary: Schema$SourceSplitShard = null,
    primarySource: Schema$DerivedSource = null,
    residual: Schema$SourceSplitShard = null,
    residualSource: Schema$DerivedSource = null
  ): Schema$SourceFork = {
    val __obj = js.Dynamic.literal()
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (primarySource != null) __obj.updateDynamic("primarySource")(primarySource.asInstanceOf[js.Any])
    if (residual != null) __obj.updateDynamic("residual")(residual.asInstanceOf[js.Any])
    if (residualSource != null) __obj.updateDynamic("residualSource")(residualSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceFork]
  }
}

