package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateNodePoolRequest extends js.Object {
  /** The desired image type for the node pool. */
  var imageType: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The Kubernetes version to change the nodes to (typically an
               * upgrade). Use `-` to upgrade to the latest version supported by
               * the server.
               */
  var nodeVersion: js.UndefOr[java.lang.String] = js.undefined
}

