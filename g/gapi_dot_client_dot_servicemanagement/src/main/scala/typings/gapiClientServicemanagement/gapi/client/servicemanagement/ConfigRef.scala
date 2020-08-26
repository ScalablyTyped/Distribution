package typings.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigRef extends js.Object {
  /**
    * Resource name of a service config. It must have the following
    * format: "services/{service name}/configs/{config id}".
    */
  var name: js.UndefOr[String] = js.native
}

object ConfigRef {
  @scala.inline
  def apply(): ConfigRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRef]
  }
  @scala.inline
  implicit class ConfigRefOps[Self <: ConfigRef] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

