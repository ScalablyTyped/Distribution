package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointsConfig extends js.Object {
  var EndpointsConfig: js.UndefOr[typings.dockerode.mod.EndpointsConfig] = js.native
}

object EndpointsConfig {
  @scala.inline
  def apply(): EndpointsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointsConfig]
  }
  @scala.inline
  implicit class EndpointsConfigOps[Self <: EndpointsConfig] (val x: Self) extends AnyVal {
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
    def setEndpointsConfig(value: typings.dockerode.mod.EndpointsConfig): Self = this.set("EndpointsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointsConfig: Self = this.set("EndpointsConfig", js.undefined)
  }
  
}

