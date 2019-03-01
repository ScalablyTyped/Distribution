package typings
package fetchDashJsonpLib.fetchDashJsonpMod.fetchJsonpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var jsonpCallback: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(jsonpCallback: java.lang.String = null, timeout: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (jsonpCallback != null) __obj.updateDynamic("jsonpCallback")(jsonpCallback)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

