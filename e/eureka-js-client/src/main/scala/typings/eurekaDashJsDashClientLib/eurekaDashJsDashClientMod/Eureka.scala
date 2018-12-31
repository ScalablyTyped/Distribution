package typings
package eurekaDashJsDashClientLib.eurekaDashJsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eureka-js-client", "Eureka")
@js.native
class Eureka protected () extends js.Object {
  def this(config: eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs.EurekaConfig) = this()
  def this(config: eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs.EurekaYmlConfig) = this()
  def getInstancesByAppId(appId: java.lang.String): js.Array[
    eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs.EurekaInstanceConfig
  ] = js.native
  def getInstancesByVipAddress(vidAddress: java.lang.String): js.Array[
    eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs.EurekaInstanceConfig
  ] = js.native
  def start(): scala.Unit = js.native
  def start(cb: js.Function2[/* err */ stdLib.Error, /* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def stop(cb: js.Function2[/* err */ stdLib.Error, /* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
}

