package typings.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppEngineHttpQueue extends js.Object {
  var appEngineRoutingOverride: AppEngineRouting
}

object AppEngineHttpQueue {
  @scala.inline
  def apply(appEngineRoutingOverride: AppEngineRouting): AppEngineHttpQueue = {
    val __obj = js.Dynamic.literal(appEngineRoutingOverride = appEngineRoutingOverride.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppEngineHttpQueue]
  }
}

