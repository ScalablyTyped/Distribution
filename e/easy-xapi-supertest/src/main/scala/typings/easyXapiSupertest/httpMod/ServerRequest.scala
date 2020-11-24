package typings.easyXapiSupertest.httpMod

import typings.easyXapiSupertest.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerRequest extends IncomingMessage {
  
  var connection: Socket = js.native
}
