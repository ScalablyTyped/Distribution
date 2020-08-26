package typings.dwt.dynamsoftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagerEnv extends js.Object {
  var IfUpdateService: Boolean = js.native
  var resourcesPath: String = js.native
}

object ManagerEnv {
  @scala.inline
  def apply(IfUpdateService: Boolean, resourcesPath: String): ManagerEnv = {
    val __obj = js.Dynamic.literal(IfUpdateService = IfUpdateService.asInstanceOf[js.Any], resourcesPath = resourcesPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagerEnv]
  }
  @scala.inline
  implicit class ManagerEnvOps[Self <: ManagerEnv] (val x: Self) extends AnyVal {
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
    def setIfUpdateService(value: Boolean): Self = this.set("IfUpdateService", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourcesPath(value: String): Self = this.set("resourcesPath", value.asInstanceOf[js.Any])
  }
  
}

