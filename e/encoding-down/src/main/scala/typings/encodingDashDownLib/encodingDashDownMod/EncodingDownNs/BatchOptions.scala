package typings
package encodingDashDownLib.encodingDashDownMod.EncodingDownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchOptions
  extends abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractOptions
     with levelDashCodecLib.levelDashCodecMod.CodecOptions

object BatchOptions {
  @scala.inline
  def apply(
    keyEncoding: java.lang.String | levelDashCodecLib.levelDashCodecMod.CodecEncoder = null,
    valueEncoding: java.lang.String | levelDashCodecLib.levelDashCodecMod.CodecEncoder = null
  ): BatchOptions = {
    val __obj = js.Dynamic.literal()
    if (keyEncoding != null) __obj.updateDynamic("keyEncoding")(keyEncoding.asInstanceOf[js.Any])
    if (valueEncoding != null) __obj.updateDynamic("valueEncoding")(valueEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchOptions]
  }
}

