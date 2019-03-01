package typings
package gapiDotClientDotSearchconsoleLib.gapiNs.clientNs.searchconsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockedResource extends js.Object {
  /** URL of the blocked resource. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object BlockedResource {
  @scala.inline
  def apply(url: java.lang.String = null): BlockedResource = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[BlockedResource]
  }
}

