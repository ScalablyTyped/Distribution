package typings
package atFrctlFractalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ServerSync extends js.Object {
  var server: js.UndefOr[java.lang.String] = js.undefined
  var sync: js.UndefOr[Anon_External] = js.undefined
}

object Anon_ServerSync {
  @scala.inline
  def apply(server: java.lang.String = null, sync: Anon_External = null): Anon_ServerSync = {
    val __obj = js.Dynamic.literal()
    if (server != null) __obj.updateDynamic("server")(server)
    if (sync != null) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[Anon_ServerSync]
  }
}

