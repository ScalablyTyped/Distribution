package typings
package googleDashTranslateDashApiLib.googleDashTranslateDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateOption extends js.Object {
  var from: js.UndefOr[java.lang.String] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
}

object TranslateOption {
  @scala.inline
  def apply(
    from: java.lang.String = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    to: java.lang.String = null
  ): TranslateOption = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[TranslateOption]
  }
}

