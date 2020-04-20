package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interface extends js.Object {
  var Socket: String
  var Types: js.Array[PluginInterfaceType]
}

object Interface {
  @scala.inline
  def apply(Socket: String, Types: js.Array[PluginInterfaceType]): Interface = {
    val __obj = js.Dynamic.literal(Socket = Socket.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interface]
  }
}

