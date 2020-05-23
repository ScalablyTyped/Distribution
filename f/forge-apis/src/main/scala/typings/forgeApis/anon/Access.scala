package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Access extends js.Object {
  var access: js.UndefOr[String] = js.undefined
}

object Access {
  @scala.inline
  def apply(access: String = null): Access = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    __obj.asInstanceOf[Access]
  }
}

