package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sync extends js.Object {
  var server: js.UndefOr[String] = js.undefined
  var sync: js.UndefOr[External] = js.undefined
}

object Sync {
  @scala.inline
  def apply(server: String = null, sync: External = null): Sync = {
    val __obj = js.Dynamic.literal()
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (sync != null) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sync]
  }
}

