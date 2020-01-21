package typings.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccess extends js.Object {
  var access: js.UndefOr[String] = js.undefined
}

object AnonAccess {
  @scala.inline
  def apply(access: String = null): AnonAccess = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccess]
  }
}

