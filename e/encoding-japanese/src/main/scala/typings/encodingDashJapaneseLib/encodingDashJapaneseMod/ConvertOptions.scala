package typings
package encodingDashJapaneseLib.encodingDashJapaneseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvertOptions extends js.Object {
  var bom: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var from: js.UndefOr[Encoding] = js.undefined
  var to: Encoding
  var `type`: js.UndefOr[
    encodingDashJapaneseLib.encodingDashJapaneseLibStrings.string | encodingDashJapaneseLib.encodingDashJapaneseLibStrings.arraybuffer | encodingDashJapaneseLib.encodingDashJapaneseLibStrings.array
  ] = js.undefined
}

object ConvertOptions {
  @scala.inline
  def apply(
    to: Encoding,
    bom: scala.Boolean | java.lang.String = null,
    from: Encoding = null,
    `type`: encodingDashJapaneseLib.encodingDashJapaneseLibStrings.string | encodingDashJapaneseLib.encodingDashJapaneseLibStrings.arraybuffer | encodingDashJapaneseLib.encodingDashJapaneseLibStrings.array = null
  ): ConvertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(to)
    if (bom != null) __obj.updateDynamic("bom")(bom.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertOptions]
  }
}

