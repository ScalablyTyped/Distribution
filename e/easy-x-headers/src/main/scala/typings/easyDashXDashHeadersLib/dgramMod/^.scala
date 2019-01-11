package typings
package easyDashXDashHeadersLib.dgramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dgram", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createSocket(`type`: java.lang.String): easyDashXDashHeadersLib.dgramMod.Socket = js.native
  def createSocket(
    `type`: java.lang.String,
    callback: js.Function2[
      /* msg */ easyDashXDashHeadersLib.Buffer, 
      /* rinfo */ easyDashXDashHeadersLib.dgramMod.RemoteInfo, 
      scala.Unit
    ]
  ): easyDashXDashHeadersLib.dgramMod.Socket = js.native
}

