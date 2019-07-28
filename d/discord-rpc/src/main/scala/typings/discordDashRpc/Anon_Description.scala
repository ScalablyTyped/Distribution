package typings.discordDashRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: String
  var icon: String
  var id: String
  var name: String
  var rpc_origins: js.Array[String]
}

object Anon_Description {
  @scala.inline
  def apply(description: String, icon: String, id: String, name: String, rpc_origins: js.Array[String]): Anon_Description = {
    val __obj = js.Dynamic.literal(description = description, icon = icon, id = id, name = name, rpc_origins = rpc_origins)
  
    __obj.asInstanceOf[Anon_Description]
  }
}

