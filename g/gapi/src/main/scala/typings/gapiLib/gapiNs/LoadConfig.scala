package typings
package gapiLib.gapiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadConfig extends js.Object {
  @JSName("callback")
  var callback_Original: LoadCallback = js.native
  var onerror: js.UndefOr[js.Function] = js.native
  var ontimeout: js.UndefOr[js.Function] = js.native
  var timeout: js.UndefOr[scala.Double] = js.native
  def callback(args: js.Any*): scala.Unit = js.native
}

