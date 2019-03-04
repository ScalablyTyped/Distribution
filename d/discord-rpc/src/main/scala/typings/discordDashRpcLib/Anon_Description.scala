package typings
package discordDashRpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: java.lang.String
  var icon: java.lang.String
  var id: java.lang.String
  var name: java.lang.String
  var rpc_origins: js.Array[java.lang.String]
}

object Anon_Description {
  @scala.inline
  def apply(
    description: java.lang.String,
    icon: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    rpc_origins: js.Array[java.lang.String]
  ): Anon_Description = {
    val __obj = js.Dynamic.literal(description = description, icon = icon, id = id, name = name, rpc_origins = rpc_origins)
  
    __obj.asInstanceOf[Anon_Description]
  }
}

