package typings.dockerEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DockerEventsOptions extends js.Object {
  
  var docker: typings.dockerode.mod.^ = js.native
}
object DockerEventsOptions {
  
  @scala.inline
  def apply(docker: typings.dockerode.mod.^): DockerEventsOptions = {
    val __obj = js.Dynamic.literal(docker = docker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DockerEventsOptions]
  }
  
  @scala.inline
  implicit class DockerEventsOptionsOps[Self <: DockerEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocker(value: typings.dockerode.mod.^): Self = this.set("docker", value.asInstanceOf[js.Any])
  }
}
