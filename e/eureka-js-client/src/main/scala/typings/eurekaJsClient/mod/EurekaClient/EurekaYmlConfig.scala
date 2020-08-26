package typings.eurekaJsClient.mod.EurekaClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EurekaYmlConfig extends js.Object {
  var cwd: String = js.native
  var filename: js.UndefOr[String] = js.native
}

object EurekaYmlConfig {
  @scala.inline
  def apply(cwd: String): EurekaYmlConfig = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[EurekaYmlConfig]
  }
  @scala.inline
  implicit class EurekaYmlConfigOps[Self <: EurekaYmlConfig] (val x: Self) extends AnyVal {
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
  }
  
}

