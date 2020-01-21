package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output configuration for export assets destination.
  */
@js.native
trait SchemaOutputConfig extends js.Object {
  /**
    * Destination on Cloud Storage.
    */
  var gcsDestination: js.UndefOr[SchemaGcsDestination] = js.native
}

object SchemaOutputConfig {
  @scala.inline
  def apply(gcsDestination: SchemaGcsDestination = null): SchemaOutputConfig = {
    val __obj = js.Dynamic.literal()
    if (gcsDestination != null) __obj.updateDynamic("gcsDestination")(gcsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOutputConfig]
  }
}

