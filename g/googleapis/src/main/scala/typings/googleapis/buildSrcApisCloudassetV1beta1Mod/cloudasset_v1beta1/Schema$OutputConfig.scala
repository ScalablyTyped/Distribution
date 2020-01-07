package typings.googleapis.buildSrcApisCloudassetV1beta1Mod.cloudasset_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output configuration for export assets destination.
  */
@js.native
trait Schema$OutputConfig extends js.Object {
  /**
    * Destination on Cloud Storage.
    */
  var gcsDestination: js.UndefOr[Schema$GcsDestination] = js.native
}

object Schema$OutputConfig {
  @scala.inline
  def apply(gcsDestination: Schema$GcsDestination = null): Schema$OutputConfig = {
    val __obj = js.Dynamic.literal()
    if (gcsDestination != null) __obj.updateDynamic("gcsDestination")(gcsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OutputConfig]
  }
}

