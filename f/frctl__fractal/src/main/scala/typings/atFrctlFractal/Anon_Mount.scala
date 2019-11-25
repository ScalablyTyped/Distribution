package typings.atFrctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mount extends js.Object {
  var mount: js.UndefOr[String] = js.undefined
}

object Anon_Mount {
  @scala.inline
  def apply(mount: String = null): Anon_Mount = {
    val __obj = js.Dynamic.literal()
    if (mount != null) __obj.updateDynamic("mount")(mount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Mount]
  }
}

