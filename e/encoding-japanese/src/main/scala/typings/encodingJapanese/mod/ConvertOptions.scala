package typings.encodingJapanese.mod

import typings.encodingJapanese.encodingJapaneseStrings.array
import typings.encodingJapanese.encodingJapaneseStrings.arraybuffer
import typings.encodingJapanese.encodingJapaneseStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertOptions extends js.Object {
  var bom: js.UndefOr[Boolean | String] = js.undefined
  var from: js.UndefOr[Encoding] = js.undefined
  var to: Encoding
  var `type`: js.UndefOr[string | arraybuffer | array] = js.undefined
}

object ConvertOptions {
  @scala.inline
  def apply(
    to: Encoding,
    bom: Boolean | String = null,
    from: Encoding = null,
    `type`: string | arraybuffer | array = null
  ): ConvertOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (bom != null) __obj.updateDynamic("bom")(bom.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
}

