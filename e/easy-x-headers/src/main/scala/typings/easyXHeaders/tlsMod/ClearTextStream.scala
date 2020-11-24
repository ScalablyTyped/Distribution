package typings.easyXHeaders.tlsMod

import typings.easyXHeaders.anon.Address
import typings.easyXHeaders.anon.Name
import typings.easyXHeaders.streamMod.Duplex
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
