package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

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
  var name: js.UndefOr[String] = js.undefined
  /**
    * Path at which to mount the volume.
    *
    * Paths must be absolute and cannot conflict with other volume paths on the
    * same build step or with certain reserved volume paths.
    */
  var path: js.UndefOr[String] = js.undefined
}

object Volume {
  @scala.inline
  def apply(name: String = null, path: String = null): Volume = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
}

