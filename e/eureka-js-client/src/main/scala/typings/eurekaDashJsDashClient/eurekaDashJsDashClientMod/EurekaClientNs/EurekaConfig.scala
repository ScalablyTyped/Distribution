package typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClientNs

import typings.eurekaDashJsDashClient.Anon_Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaConfig extends js.Object {
  var eureka: EurekaClientConfig
  var instance: EurekaInstanceConfig
  var logger: js.UndefOr[Anon_Args] = js.undefined
  var requestMiddleware: js.UndefOr[EurekaMiddlewareConfig] = js.undefined
  var shouldUseDelta: js.UndefOr[Boolean] = js.undefined
}

object EurekaConfig {
  @scala.inline
  def apply(
    eureka: EurekaClientConfig,
    instance: EurekaInstanceConfig,
    logger: Anon_Args = null,
    requestMiddleware: EurekaMiddlewareConfig = null,
    shouldUseDelta: js.UndefOr[Boolean] = js.undefined
  ): EurekaConfig = {
    val __obj = js.Dynamic.literal(eureka = eureka, instance = instance)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (requestMiddleware != null) __obj.updateDynamic("requestMiddleware")(requestMiddleware)
    if (!js.isUndefined(shouldUseDelta)) __obj.updateDynamic("shouldUseDelta")(shouldUseDelta)
    __obj.asInstanceOf[EurekaConfig]
  }
}

