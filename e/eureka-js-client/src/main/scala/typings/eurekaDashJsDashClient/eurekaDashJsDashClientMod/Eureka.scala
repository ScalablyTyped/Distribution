package typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod

import typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClientNs.EurekaConfig
import typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClientNs.EurekaInstanceConfig
import typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClientNs.EurekaMiddlewareConfig
import typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClientNs.EurekaYmlConfig
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eureka-js-client", "Eureka")
@js.native
class Eureka protected () extends js.Object {
  def this(config: EurekaConfig) = this()
  def this(config: EurekaMiddlewareConfig) = this()
  def this(config: EurekaYmlConfig) = this()
  def getInstancesByAppId(appId: String): js.Array[EurekaInstanceConfig] = js.native
  def getInstancesByVipAddress(vidAddress: String): js.Array[EurekaInstanceConfig] = js.native
  def start(): Unit = js.native
  def start(cb: js.Function2[/* err */ Error, /* repeated */ js.Any, Unit]): Unit = js.native
  def stop(): Unit = js.native
  def stop(cb: js.Function2[/* err */ Error, /* repeated */ js.Any, Unit]): Unit = js.native
}

