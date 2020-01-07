package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DEPRECATED in favor of DerivedSource.
  */
@js.native
trait Schema$SourceSplitShard extends js.Object {
  /**
    * DEPRECATED
    */
  var derivationMode: js.UndefOr[String] = js.native
  /**
    * DEPRECATED
    */
  var source: js.UndefOr[Schema$Source] = js.native
}

object Schema$SourceSplitShard {
  @scala.inline
  def apply(derivationMode: String = null, source: Schema$Source = null): Schema$SourceSplitShard = {
    val __obj = js.Dynamic.literal()
    if (derivationMode != null) __obj.updateDynamic("derivationMode")(derivationMode.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceSplitShard]
  }
}

