package typings.googleTranslateApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateOption extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object TranslateOption {
  @scala.inline
  def apply(from: String = null, raw: js.UndefOr[Boolean] = js.undefined, to: String = null): TranslateOption = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateOption]
  }
}

