package typings.easyXapiSupertest.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.easyXapiSupertest.streamMod.WritableOptions because var conflicts: highWaterMark. Inlined decodeStrings */ trait TransformOptions extends ReadableOptions {
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
}

object TransformOptions {
  @scala.inline
  def apply(
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    highWaterMark: js.UndefOr[Double] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined
  ): TransformOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions]
  }
}

