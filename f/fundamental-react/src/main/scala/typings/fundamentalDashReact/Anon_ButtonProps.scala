package typings.fundamentalDashReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonProps
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to enable the selection of a date range (begin and end). */
  var enableRangeSelection: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Anon_ButtonProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    buttonProps: StringDictionary[js.Any] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    enableRangeSelection: js.UndefOr[Boolean] = js.undefined,
    inputProps: StringDictionary[js.Any] = null
  ): Anon_ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(enableRangeSelection)) __obj.updateDynamic("enableRangeSelection")(enableRangeSelection)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    __obj.asInstanceOf[Anon_ButtonProps]
  }
}

