package typings.globalAgent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyAgentConfigurationInputType extends js.Object {
  var environmentVariableNamespace: js.UndefOr[String] = js.undefined
  var forceGlobalAgent: js.UndefOr[Boolean] = js.undefined
  var socketConnectionTimeout: js.UndefOr[Double] = js.undefined
}

object ProxyAgentConfigurationInputType {
  @scala.inline
  def apply(
    environmentVariableNamespace: String = null,
    forceGlobalAgent: js.UndefOr[Boolean] = js.undefined,
    socketConnectionTimeout: js.UndefOr[Double] = js.undefined
  ): ProxyAgentConfigurationInputType = {
    val __obj = js.Dynamic.literal()
    if (environmentVariableNamespace != null) __obj.updateDynamic("environmentVariableNamespace")(environmentVariableNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(forceGlobalAgent)) __obj.updateDynamic("forceGlobalAgent")(forceGlobalAgent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(socketConnectionTimeout)) __obj.updateDynamic("socketConnectionTimeout")(socketConnectionTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyAgentConfigurationInputType]
  }
}

