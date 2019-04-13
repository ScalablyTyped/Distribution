package typings
package dockerodeLib.dockerodeMod

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
    val __obj = js.Dynamic.literal(Socket = Socket, Types = Types)
  
    __obj.asInstanceOf[Interface]
  }
}

