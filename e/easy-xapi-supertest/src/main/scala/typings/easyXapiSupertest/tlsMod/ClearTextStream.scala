package typings.easyXapiSupertest.tlsMod

import typings.easyXapiSupertest.anon.Address
import typings.easyXapiSupertest.anon.Name
import typings.easyXapiSupertest.streamMod.Duplex
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearTextStream extends Duplex {
  
  var address: Address = js.native
  
  var authorizationError: Error = js.native
  
  var authorized: Boolean = js.native
  
  var getCipher: Name = js.native
  
  def getPeerCertificate(): js.Any = js.native
  
  var remoteAddress: String = js.native
  
  var remotePort: Double = js.native
}
