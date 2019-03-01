package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductAspect extends js.Object {
  /** The name of the aspect. */
  var aspectName: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the destination. Leave out to apply to all destinations. */
  var destinationName: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the aspect is required, excluded or should be validated. */
  var intention: js.UndefOr[java.lang.String] = js.undefined
}

object ProductAspect {
  @scala.inline
  def apply(
    aspectName: java.lang.String = null,
    destinationName: java.lang.String = null,
    intention: java.lang.String = null
  ): ProductAspect = {
    val __obj = js.Dynamic.literal()
    if (aspectName != null) __obj.updateDynamic("aspectName")(aspectName)
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName)
    if (intention != null) __obj.updateDynamic("intention")(intention)
    __obj.asInstanceOf[ProductAspect]
  }
}

