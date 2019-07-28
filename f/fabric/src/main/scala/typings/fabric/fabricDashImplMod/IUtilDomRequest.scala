package typings.fabric.fabricDashImplMod

import typings.fabric.Anon_Method
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilDomRequest extends js.Object {
  /**
  	 * Cross-browser abstraction for sending XMLHttpRequest
  	 * @param url URL to send XMLHttpRequest to
  	 */
  def request(url: String): XMLHttpRequest = js.native
  def request(url: String, options: Anon_Method): XMLHttpRequest = js.native
}

