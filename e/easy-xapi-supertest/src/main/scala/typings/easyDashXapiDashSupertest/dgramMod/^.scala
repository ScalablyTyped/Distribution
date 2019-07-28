package typings.easyDashXapiDashSupertest.dgramMod

import typings.easyDashXapiDashSupertest.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dgram", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createSocket(`type`: String): Socket = js.native
  def createSocket(`type`: String, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = js.native
}

