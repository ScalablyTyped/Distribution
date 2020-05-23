package typings.glue.mod

import typings.glue.anon.Plugins
import typings.hapi.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Manifest extends js.Object {
  var register: js.UndefOr[Plugins] = js.undefined
  var server: ServerOptions
}

object Manifest {
  @scala.inline
  def apply(server: ServerOptions, register: Plugins = null): Manifest = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    if (register != null) __obj.updateDynamic("register")(register.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
}

