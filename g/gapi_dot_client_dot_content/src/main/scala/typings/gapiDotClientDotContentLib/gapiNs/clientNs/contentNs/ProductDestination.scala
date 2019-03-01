package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductDestination extends js.Object {
  /** The name of the destination. */
  var destinationName: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the destination is required, excluded or should be validated. */
  var intention: js.UndefOr[java.lang.String] = js.undefined
}

object ProductDestination {
  @scala.inline
  def apply(destinationName: java.lang.String = null, intention: java.lang.String = null): ProductDestination = {
    val __obj = js.Dynamic.literal()
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName)
    if (intention != null) __obj.updateDynamic("intention")(intention)
    __obj.asInstanceOf[ProductDestination]
  }
}

