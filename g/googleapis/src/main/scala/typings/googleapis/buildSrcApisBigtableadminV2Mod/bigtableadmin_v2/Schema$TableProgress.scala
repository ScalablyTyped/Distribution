package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Progress info for copying a table&#39;s data to the new cluster.
  */
@js.native
trait Schema$TableProgress extends js.Object {
  /**
    * Estimate of the number of bytes copied so far for this table. This will
    * eventually reach &#39;estimated_size_bytes&#39; unless the table copy is
    * CANCELLED.
    */
  var estimatedCopiedBytes: js.UndefOr[String] = js.native
  /**
    * Estimate of the size of the table to be copied.
    */
  var estimatedSizeBytes: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object Schema$TableProgress {
  @scala.inline
  def apply(estimatedCopiedBytes: String = null, estimatedSizeBytes: String = null, state: String = null): Schema$TableProgress = {
    val __obj = js.Dynamic.literal()
    if (estimatedCopiedBytes != null) __obj.updateDynamic("estimatedCopiedBytes")(estimatedCopiedBytes.asInstanceOf[js.Any])
    if (estimatedSizeBytes != null) __obj.updateDynamic("estimatedSizeBytes")(estimatedSizeBytes.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableProgress]
  }
}

