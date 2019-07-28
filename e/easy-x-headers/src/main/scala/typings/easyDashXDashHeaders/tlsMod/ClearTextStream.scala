package typings.easyDashXDashHeaders.tlsMod

import typings.easyDashXDashHeaders.Anon_Address
import typings.easyDashXDashHeaders.Anon_Name
import typings.easyDashXDashHeaders.streamMod.Duplex
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearTextStream extends Duplex {
  var address: Anon_Address = js.native
  var authorizationError: Error = js.native
  var authorized: Boolean = js.native
  var getCipher: Anon_Name = js.native
  var remoteAddress: String = js.native
  var remotePort: Double = js.native
  def getPeerCertificate(): js.Any = js.native
}

