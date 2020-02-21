package typings.dockerEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DockerEventsOptions extends js.Object {
  var docker: typings.dockerode.mod.^
}

object DockerEventsOptions {
  @scala.inline
  def apply(docker: typings.dockerode.mod.^): DockerEventsOptions = {
    val __obj = js.Dynamic.literal(docker = docker.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DockerEventsOptions]
  }
}

