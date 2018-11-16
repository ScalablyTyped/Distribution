package typings
package easyDashXDashHeadersLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearTextStream
  extends easyDashXDashHeadersLib.streamMod.Duplex {
  var address: easyDashXDashHeadersLib.Anon_Address = js.native
  var authorizationError: nodeLib.Error = js.native
  var authorized: scala.Boolean = js.native
  var getCipher: easyDashXDashHeadersLib.Anon_Name = js.native
  var remoteAddress: java.lang.String = js.native
  var remotePort: scala.Double = js.native
  def getPeerCertificate(): js.Any = js.native
}

