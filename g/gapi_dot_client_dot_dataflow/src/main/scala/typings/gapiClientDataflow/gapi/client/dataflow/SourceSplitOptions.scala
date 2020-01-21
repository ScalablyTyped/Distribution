package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSplitOptions extends js.Object {
  /**
    * The source should be split into a set of bundles where the estimated size
    * of each is approximately this many bytes.
    */
  var desiredBundleSizeBytes: js.UndefOr[String] = js.undefined
  /** DEPRECATED in favor of desired_bundle_size_bytes. */
  var desiredShardSizeBytes: js.UndefOr[String] = js.undefined
}

object SourceSplitOptions {
  @scala.inline
  def apply(desiredBundleSizeBytes: String = null, desiredShardSizeBytes: String = null): SourceSplitOptions = {
    val __obj = js.Dynamic.literal()
    if (desiredBundleSizeBytes != null) __obj.updateDynamic("desiredBundleSizeBytes")(desiredBundleSizeBytes.asInstanceOf[js.Any])
    if (desiredShardSizeBytes != null) __obj.updateDynamic("desiredShardSizeBytes")(desiredShardSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSplitOptions]
  }
}

