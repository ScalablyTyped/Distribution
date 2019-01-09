package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUtilDomRequest extends js.Object {
  /**
  	 * Cross-browser abstraction for sending XMLHttpRequest
  	 * @param url URL to send XMLHttpRequest to
  	 */
  def request(url: java.lang.String): stdLib.XMLHttpRequest = js.native
  def request(url: java.lang.String, options: fabricLib.Anon_Method): stdLib.XMLHttpRequest = js.native
}

