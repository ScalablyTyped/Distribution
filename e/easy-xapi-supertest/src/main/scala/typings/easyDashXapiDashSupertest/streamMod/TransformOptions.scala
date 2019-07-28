package typings.easyDashXapiDashSupertest.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.easyDashXapiDashSupertest.streamMod.WritableOptions because var conflicts: highWaterMark. Inlined decodeStrings */ trait TransformOptions extends ReadableOptions {
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    __obj.asInstanceOf[TransformOptions]
  }
}

