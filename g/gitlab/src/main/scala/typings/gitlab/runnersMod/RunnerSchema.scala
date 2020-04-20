package typings.gitlab.runnersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunnerSchema extends js.Object {
  var active: Boolean
  var description: String
  var id: Double
  var ip_address: String
  var is_shared: Boolean
  var name: String
  var online: Boolean
  var status: String
}

object RunnerSchema {
  @scala.inline
  def apply(
    active: Boolean,
    description: String,
    id: Double,
    ip_address: String,
    is_shared: Boolean,
    name: String,
    online: Boolean,
    status: String
  ): RunnerSchema = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], is_shared = is_shared.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerSchema]
  }
}

