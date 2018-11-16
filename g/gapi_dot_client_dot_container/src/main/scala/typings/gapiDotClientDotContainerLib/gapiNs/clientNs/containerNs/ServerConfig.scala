package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerConfig extends js.Object {
  /** Version of Kubernetes the service deploys by default. */
  var defaultClusterVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Default image type. */
  var defaultImageType: js.UndefOr[java.lang.String] = js.undefined
  /** List of valid image types. */
  var validImageTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** List of valid master versions. */
  var validMasterVersions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** List of valid node upgrade target versions. */
  var validNodeVersions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

