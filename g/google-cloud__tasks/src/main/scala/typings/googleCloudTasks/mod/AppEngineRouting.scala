package typings.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEngineRouting extends js.Object {
  var host: String
  var instance: String
  var service: String
  var version: String
}

object AppEngineRouting {
  @scala.inline
  def apply(host: String, instance: String, service: String, version: String): AppEngineRouting = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppEngineRouting]
  }
}

