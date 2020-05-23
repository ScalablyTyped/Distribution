package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mount extends js.Object {
  var mount: js.UndefOr[String] = js.undefined
}

object Mount {
  @scala.inline
  def apply(mount: String = null): Mount = {
    val __obj = js.Dynamic.literal()
    if (mount != null) __obj.updateDynamic("mount")(mount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mount]
  }
}

