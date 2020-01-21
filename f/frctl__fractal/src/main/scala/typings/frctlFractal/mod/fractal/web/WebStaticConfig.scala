package typings.frctlFractal.mod.fractal.web

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebStaticConfig extends js.Object {
  var mount: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object WebStaticConfig {
  @scala.inline
  def apply(mount: String = null, path: String = null): WebStaticConfig = {
    val __obj = js.Dynamic.literal()
    if (mount != null) __obj.updateDynamic("mount")(mount.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebStaticConfig]
  }
}

