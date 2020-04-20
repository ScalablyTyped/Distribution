package typings.discordRpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: String
  var icon: String
  var id: String
  var name: String
  var rpc_origins: js.Array[String]
}

object AnonDescription {
  @scala.inline
  def apply(description: String, icon: String, id: String, name: String, rpc_origins: js.Array[String]): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rpc_origins = rpc_origins.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

