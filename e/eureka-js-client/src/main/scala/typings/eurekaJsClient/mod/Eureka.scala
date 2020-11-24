package typings.eurekaJsClient.mod

import typings.eurekaJsClient.mod.EurekaClient.EurekaConfig
import typings.eurekaJsClient.mod.EurekaClient.EurekaInstanceConfig
import typings.eurekaJsClient.mod.EurekaClient.EurekaMiddlewareConfig
import typings.eurekaJsClient.mod.EurekaClient.EurekaYmlConfig
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
