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
    socketConnectionTimeout: Int | Double = null
  ): ProxyAgentConfigurationInputType = {
    val __obj = js.Dynamic.literal()
    if (environmentVariableNamespace != null) __obj.updateDynamic("environmentVariableNamespace")(environmentVariableNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(forceGlobalAgent)) __obj.updateDynamic("forceGlobalAgent")(forceGlobalAgent.asInstanceOf[js.Any])
    if (socketConnectionTimeout != null) __obj.updateDynamic("socketConnectionTimeout")(socketConnectionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyAgentConfigurationInputType]
  }
}

