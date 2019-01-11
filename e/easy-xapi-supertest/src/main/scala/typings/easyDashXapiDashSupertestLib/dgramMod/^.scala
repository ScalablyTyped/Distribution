package typings
package easyDashXapiDashSupertestLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dgram", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createSocket(`type`: java.lang.String): easyDashXapiDashSupertestLib.dgramMod.Socket = js.native
  def createSocket(
    `type`: java.lang.String,
    callback: js.Function2[
      /* msg */ easyDashXapiDashSupertestLib.Buffer, 
      /* rinfo */ easyDashXapiDashSupertestLib.dgramMod.RemoteInfo, 
      scala.Unit
    ]
  ): easyDashXapiDashSupertestLib.dgramMod.Socket = js.native
}

