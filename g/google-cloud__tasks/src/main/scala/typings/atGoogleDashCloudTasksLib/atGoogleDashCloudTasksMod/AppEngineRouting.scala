package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEngineRouting extends js.Object {
  var host: java.lang.String
  var instance: java.lang.String
  var service: java.lang.String
  var version: java.lang.String
}

object AppEngineRouting {
  @scala.inline
  def apply(
    host: java.lang.String,
    instance: java.lang.String,
    service: java.lang.String,
    version: java.lang.String
  ): AppEngineRouting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("service")(service)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[AppEngineRouting]
  }
}

