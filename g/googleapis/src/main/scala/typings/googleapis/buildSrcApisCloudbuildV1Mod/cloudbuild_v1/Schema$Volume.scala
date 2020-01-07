package typings.googleapis.buildSrcApisCloudbuildV1Mod.cloudbuild_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Volume describes a Docker container volume which is mounted into build
  * steps in order to persist files across build step execution.
  */
@js.native
trait Schema$Volume extends js.Object {
  /**
    * Name of the volume to mount.  Volume names must be unique per build step
    * and must be valid names for Docker volumes. Each named volume must be
    * used by at least two build steps.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Path at which to mount the volume.  Paths must be absolute and cannot
    * conflict with other volume paths on the same build step or with certain
    * reserved volume paths.
    */
  var path: js.UndefOr[String] = js.native
}

object Schema$Volume {
  @scala.inline
  def apply(name: String = null, path: String = null): Schema$Volume = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Volume]
  }
}

