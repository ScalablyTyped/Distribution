package typings.easyXHeaders.netMod

import typings.easyXHeaders.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("net", "createConnection")
@js.native
object createConnection extends js.Object {
  
  def apply(options: `0`): Socket = js.native
  def apply(options: `0`, connectionListener: js.Function): Socket = js.native
  def apply(path: String): Socket = js.native
  def apply(path: String, connectionListener: js.Function): Socket = js.native
  def apply(port: Double): Socket = js.native
  def apply(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: js.Function): Socket = js.native
  def apply(port: Double, host: String): Socket = js.native
  def apply(port: Double, host: String, connectionListener: js.Function): Socket = js.native
}
