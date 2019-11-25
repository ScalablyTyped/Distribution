package typings.atFrctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ServerSync extends js.Object {
  var server: js.UndefOr[String] = js.undefined
  var sync: js.UndefOr[Anon_External] = js.undefined
}

object Anon_ServerSync {
  @scala.inline
  def apply(server: String = null, sync: Anon_External = null): Anon_ServerSync = {
    val __obj = js.Dynamic.literal()
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (sync != null) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ServerSync]
  }
}

