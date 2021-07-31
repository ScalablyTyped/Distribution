package typings.escpos.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("escpos", "Server")
@js.native
class Server protected ()
  extends typings.node.netMod.Server {
  def this(device: Adapter) = this()
  
  def request(client: js.Any): Unit = js.native
}
