package typings
package easyDashXapiDashSupertestLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- easyDashXapiDashSupertestLib.streamMod.WritableOptions because var conflicts: highWaterMark. Inlined decodeStrings */ trait DuplexOptions extends ReadableOptions {
  var allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined
  var decodeStrings: js.UndefOr[scala.Boolean] = js.undefined
}

object DuplexOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    highWaterMark: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined
  ): DuplexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    __obj.asInstanceOf[DuplexOptions]
  }
}

