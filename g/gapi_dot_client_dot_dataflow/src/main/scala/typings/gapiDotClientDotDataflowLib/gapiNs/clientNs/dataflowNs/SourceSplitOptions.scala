package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceSplitOptions extends js.Object {
  /**
    * The source should be split into a set of bundles where the estimated size
    * of each is approximately this many bytes.
    */
  var desiredBundleSizeBytes: js.UndefOr[java.lang.String] = js.undefined
  /** DEPRECATED in favor of desired_bundle_size_bytes. */
  var desiredShardSizeBytes: js.UndefOr[java.lang.String] = js.undefined
}

object SourceSplitOptions {
  @scala.inline
  def apply(desiredBundleSizeBytes: java.lang.String = null, desiredShardSizeBytes: java.lang.String = null): SourceSplitOptions = {
    val __obj = js.Dynamic.literal()
    if (desiredBundleSizeBytes != null) __obj.updateDynamic("desiredBundleSizeBytes")(desiredBundleSizeBytes)
    if (desiredShardSizeBytes != null) __obj.updateDynamic("desiredShardSizeBytes")(desiredShardSizeBytes)
    __obj.asInstanceOf[SourceSplitOptions]
  }
}

