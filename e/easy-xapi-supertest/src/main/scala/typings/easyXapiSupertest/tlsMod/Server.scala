package typings.easyXapiSupertest.tlsMod

import typings.easyXapiSupertest.anon.Ca
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Server
  extends typings.easyXapiSupertest.netMod.Server {
  
  def addContext(hostName: String, credentials: Ca): Unit = js.native
  
  def listen(port: Double, host: js.UndefOr[scala.Nothing], callback: js.Function): Server = js.native
  def listen(port: Double, host: String, callback: js.Function): Server = js.native
}
