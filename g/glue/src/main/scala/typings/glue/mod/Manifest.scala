package typings.glue.mod

import typings.glue.anon.Plugins
import typings.hapi.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Manifest extends js.Object {
  var register: js.UndefOr[Plugins] = js.native
  var server: ServerOptions = js.native
}

object Manifest {
  @scala.inline
  def apply(server: ServerOptions): Manifest = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Manifest]
  }
  @scala.inline
  implicit class ManifestOps[Self <: Manifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setServer(value: ServerOptions): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegister(value: Plugins): Self = this.set("register", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
  }
  
}

