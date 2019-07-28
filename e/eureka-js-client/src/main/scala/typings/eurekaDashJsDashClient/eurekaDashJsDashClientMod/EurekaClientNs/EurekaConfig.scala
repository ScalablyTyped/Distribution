package typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaConfig extends js.Object {
  var eureka: EurekaClientConfig
  var instance: EurekaInstanceConfig
  var requestMiddleware: js.UndefOr[EurekaMiddlewareConfig] = js.undefined
}

object EurekaConfig {
  @scala.inline
  def apply(
    eureka: EurekaClientConfig,
    instance: EurekaInstanceConfig,
    requestMiddleware: EurekaMiddlewareConfig = null
  ): EurekaConfig = {
    val __obj = js.Dynamic.literal(eureka = eureka, instance = instance)
    if (requestMiddleware != null) __obj.updateDynamic("requestMiddleware")(requestMiddleware)
    __obj.asInstanceOf[EurekaConfig]
  }
}

