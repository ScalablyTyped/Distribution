package typings
package dockerodeLib.dockerodeMod.DockerodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interface extends js.Object {
  var Socket: java.lang.String
  var Types: js.Array[PluginInterfaceType]
}

object Interface {
  @scala.inline
  def apply(Socket: java.lang.String, Types: js.Array[PluginInterfaceType]): Interface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Socket")(Socket)
    __obj.updateDynamic("Types")(Types)
    __obj.asInstanceOf[Interface]
  }
}

