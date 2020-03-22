package typings.frctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSync extends js.Object {
  var server: js.UndefOr[String] = js.undefined
  var sync: js.UndefOr[AnonExternal] = js.undefined
}

object AnonSync {
  @scala.inline
  def apply(server: String = null, sync: AnonExternal = null): AnonSync = {
    val __obj = js.Dynamic.literal()
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (sync != null) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSync]
  }
}

