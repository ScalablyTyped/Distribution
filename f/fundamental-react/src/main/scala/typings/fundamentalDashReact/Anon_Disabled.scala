package typings.fundamentalDashReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled
  extends /* x */ StringDictionary[js.Any] {
  var disabled: js.UndefOr[Boolean] = js.undefined
  /* Additional props to be spread to the hours down `<button>` element. */
  var hoursDownButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the hours `<input>` element. */
  var hoursInputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the hours up `<button>` element. */
  var hoursUpButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var localizedText: js.UndefOr[Anon_MeridiemAM] = js.undefined
  /* Additional props to be spread to the meridiem down `<button>` element. */
  var meridiemDownButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the meridiem `<input>` element. */
  var meridiemInputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the meridiem up `<button>` element. */
  var meridiemUpButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the minutes down `<button>` element. */
  var minutesDownButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the minutes `<input>` element. */
  var minutesInputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the minutes up `<button>` element. */
  var minutesUpButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* time */ Anon_0, Unit]] = js.undefined
  /* Additional props to be spread to the seconds down `<button>` element. */
  var secondsDownButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the seconds `<input>` element. */
  var secondsInputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the seconds up `<button>` element. */
  var secondsUpButtonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Anon_Disabled {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hoursDownButtonProps: StringDictionary[js.Any] = null,
    hoursInputProps: StringDictionary[js.Any] = null,
    hoursUpButtonProps: StringDictionary[js.Any] = null,
    id: String = null,
    localizedText: Anon_MeridiemAM = null,
    meridiemDownButtonProps: StringDictionary[js.Any] = null,
    meridiemInputProps: StringDictionary[js.Any] = null,
    meridiemUpButtonProps: StringDictionary[js.Any] = null,
    minutesDownButtonProps: StringDictionary[js.Any] = null,
    minutesInputProps: StringDictionary[js.Any] = null,
    minutesUpButtonProps: StringDictionary[js.Any] = null,
    onChange: /* time */ Anon_0 => Unit = null,
    secondsDownButtonProps: StringDictionary[js.Any] = null,
    secondsInputProps: StringDictionary[js.Any] = null,
    secondsUpButtonProps: StringDictionary[js.Any] = null
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (hoursDownButtonProps != null) __obj.updateDynamic("hoursDownButtonProps")(hoursDownButtonProps.asInstanceOf[js.Any])
    if (hoursInputProps != null) __obj.updateDynamic("hoursInputProps")(hoursInputProps.asInstanceOf[js.Any])
    if (hoursUpButtonProps != null) __obj.updateDynamic("hoursUpButtonProps")(hoursUpButtonProps.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (meridiemDownButtonProps != null) __obj.updateDynamic("meridiemDownButtonProps")(meridiemDownButtonProps.asInstanceOf[js.Any])
    if (meridiemInputProps != null) __obj.updateDynamic("meridiemInputProps")(meridiemInputProps.asInstanceOf[js.Any])
    if (meridiemUpButtonProps != null) __obj.updateDynamic("meridiemUpButtonProps")(meridiemUpButtonProps.asInstanceOf[js.Any])
    if (minutesDownButtonProps != null) __obj.updateDynamic("minutesDownButtonProps")(minutesDownButtonProps.asInstanceOf[js.Any])
    if (minutesInputProps != null) __obj.updateDynamic("minutesInputProps")(minutesInputProps.asInstanceOf[js.Any])
    if (minutesUpButtonProps != null) __obj.updateDynamic("minutesUpButtonProps")(minutesUpButtonProps.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (secondsDownButtonProps != null) __obj.updateDynamic("secondsDownButtonProps")(secondsDownButtonProps.asInstanceOf[js.Any])
    if (secondsInputProps != null) __obj.updateDynamic("secondsInputProps")(secondsInputProps.asInstanceOf[js.Any])
    if (secondsUpButtonProps != null) __obj.updateDynamic("secondsUpButtonProps")(secondsUpButtonProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Disabled]
  }
}

