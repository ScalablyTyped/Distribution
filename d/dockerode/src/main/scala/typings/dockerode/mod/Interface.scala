package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interface extends js.Object {
  var Socket: String = js.native
  var Types: js.Array[PluginInterfaceType] = js.native
}

object Interface {
  @scala.inline
  def apply(Socket: String, Types: js.Array[PluginInterfaceType]): Interface = {
    val __obj = js.Dynamic.literal(Socket = Socket.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interface]
  }
  @scala.inline
  implicit class InterfaceOps[Self <: Interface] (val x: Self) extends AnyVal {
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
    def setSocket(value: String): Self = this.set("Socket", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: PluginInterfaceType*): Self = this.set("Types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[PluginInterfaceType]): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
  
}

