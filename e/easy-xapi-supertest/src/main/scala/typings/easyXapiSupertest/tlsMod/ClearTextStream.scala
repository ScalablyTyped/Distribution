package typings.easyXapiSupertest.tlsMod

import typings.easyXapiSupertest.AnonAddress
import typings.easyXapiSupertest.AnonName
import typings.easyXapiSupertest.streamMod.Duplex
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearTextStream extends Duplex {
  var address: AnonAddress = js.native
  var authorizationError: Error = js.native
  var authorized: Boolean = js.native
  var getCipher: AnonName = js.native
  var remoteAddress: String = js.native
  var remotePort: Double = js.native
  def getPeerCertificate(): js.Any = js.native
}

