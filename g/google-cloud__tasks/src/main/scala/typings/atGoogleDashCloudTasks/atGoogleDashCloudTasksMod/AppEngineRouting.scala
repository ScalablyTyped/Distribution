package typings.atGoogleDashCloudTasks.atGoogleDashCloudTasksMod

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
    val __obj = js.Dynamic.literal(host = host, instance = instance, service = service, version = version)
  
    __obj.asInstanceOf[AppEngineRouting]
  }
}

