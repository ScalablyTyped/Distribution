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

