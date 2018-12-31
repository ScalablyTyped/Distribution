package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume extends js.Object {
  /**
    * Name of the volume to mount.
    *
    * Volume names must be unique per build step and must be valid names for
    * Docker volumes. Each named volume must be used by at least two build steps.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Path at which to mount the volume.
    *
    * Paths must be absolute and cannot conflict with other volume paths on the
    * same build step or with certain reserved volume paths.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

