package typings.globalAgent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyAgentConfigurationInputType extends js.Object {
  var environmentVariableNamespace: js.UndefOr[String] = js.native
  var forceGlobalAgent: js.UndefOr[Boolean] = js.native
  var socketConnectionTimeout: js.UndefOr[Double] = js.native
}

object ProxyAgentConfigurationInputType {
  @scala.inline
  def apply(): ProxyAgentConfigurationInputType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyAgentConfigurationInputType]
  }
  @scala.inline
  implicit class ProxyAgentConfigurationInputTypeOps[Self <: ProxyAgentConfigurationInputType] (val x: Self) extends AnyVal {
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
    def setEnvironmentVariableNamespace(value: String): Self = this.set("environmentVariableNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentVariableNamespace: Self = this.set("environmentVariableNamespace", js.undefined)
    @scala.inline
    def setForceGlobalAgent(value: Boolean): Self = this.set("forceGlobalAgent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceGlobalAgent: Self = this.set("forceGlobalAgent", js.undefined)
    @scala.inline
    def setSocketConnectionTimeout(value: Double): Self = this.set("socketConnectionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketConnectionTimeout: Self = this.set("socketConnectionTimeout", js.undefined)
  }
  
}

