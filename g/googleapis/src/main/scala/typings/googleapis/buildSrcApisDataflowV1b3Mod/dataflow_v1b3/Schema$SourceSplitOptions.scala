package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hints for splitting a Source into bundles (parts for parallel processing)
  * using SourceSplitRequest.
  */
@js.native
trait Schema$SourceSplitOptions extends js.Object {
  /**
    * The source should be split into a set of bundles where the estimated size
    * of each is approximately this many bytes.
    */
  var desiredBundleSizeBytes: js.UndefOr[String] = js.native
  /**
    * DEPRECATED in favor of desired_bundle_size_bytes.
    */
  var desiredShardSizeBytes: js.UndefOr[String] = js.native
}

object Schema$SourceSplitOptions {
  @scala.inline
  def apply(desiredBundleSizeBytes: String = null, desiredShardSizeBytes: String = null): Schema$SourceSplitOptions = {
    val __obj = js.Dynamic.literal()
    if (desiredBundleSizeBytes != null) __obj.updateDynamic("desiredBundleSizeBytes")(desiredBundleSizeBytes.asInstanceOf[js.Any])
    if (desiredShardSizeBytes != null) __obj.updateDynamic("desiredShardSizeBytes")(desiredShardSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceSplitOptions]
  }
}

