package typings.forgeDashApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Access extends js.Object {
  var access: js.UndefOr[String] = js.undefined
}

object Anon_Access {
  @scala.inline
  def apply(access: String = null): Anon_Access = {
    val __obj = js.Dynamic.literal()
    if (access != null) __obj.updateDynamic("access")(access.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Access]
  }
}

