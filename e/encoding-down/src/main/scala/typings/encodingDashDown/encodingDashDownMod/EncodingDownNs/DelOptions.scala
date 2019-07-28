package typings.encodingDashDown.encodingDashDownMod.EncodingDownNs

import org.scalablytyped.runtime.StringDictionary
import typings.abstractDashLeveldown.abstractDashLeveldownMod.AbstractOptions
import typings.levelDashCodec.levelDashCodecMod.CodecEncoder
import typings.levelDashCodec.levelDashCodecMod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelOptions
  extends AbstractOptions
     with CodecOptions

object DelOptions {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.Any] = null,
    keyEncoding: String | CodecEncoder = null,
    valueEncoding: String | CodecEncoder = null
  ): DelOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (valueEncoding != null) __obj.updateDynamic("valueEncoding")(valueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelOptions]
  }
}

