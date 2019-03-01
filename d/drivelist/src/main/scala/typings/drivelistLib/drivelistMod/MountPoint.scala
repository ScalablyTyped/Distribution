package typings
package drivelistLib.drivelistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MountPoint extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String
}

object MountPoint {
  @scala.inline
  def apply(path: java.lang.String, label: java.lang.String = null): MountPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[MountPoint]
  }
}

