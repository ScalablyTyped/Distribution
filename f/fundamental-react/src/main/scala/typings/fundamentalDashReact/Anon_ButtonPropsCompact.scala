package typings.fundamentalDashReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonPropsCompact
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  /* Set to **true** to enable the selection of a date range (begin and end). */
  var enableRangeSelection: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* hasDateFormattedDate */ Anon_DateFormattedDate, Unit]] = js.undefined
}

object Anon_ButtonPropsCompact {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    buttonProps: StringDictionary[js.Any] = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    enableRangeSelection: js.UndefOr[Boolean] = js.undefined,
    inputProps: StringDictionary[js.Any] = null,
    onBlur: /* hasDateFormattedDate */ Anon_DateFormattedDate => Unit = null
  ): Anon_ButtonPropsCompact = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRangeSelection)) __obj.updateDynamic("enableRangeSelection")(enableRangeSelection.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    __obj.asInstanceOf[Anon_ButtonPropsCompact]
  }
}

