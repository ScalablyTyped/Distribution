package typings
package fundamentalDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /* Additional props to be spread to the hours down `<button>` element. */
  var hoursDownButtonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the hours `<input>` element. */
  var hoursInputProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the hours up `<button>` element. */
  var hoursUpButtonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var localizedText: js.UndefOr[Anon_MeridiemAM] = js.undefined
  /* Additional props to be spread to the meridiem down `<button>` element. */
  var meridiemDownButtonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the meridiem `<input>` element. */
  var meridiemInputProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the meridiem up `<button>` element. */
  var meridiemUpButtonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the minutes down `<button>` element. */
  var minutesDownButtonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the minutes `<input>` element. */
  var minutesInputProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the minutes up `<button>` element. */
  var minutesUpButtonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* time */ Anon_0, scala.Unit]] = js.undefined
  /* Additional props to be spread to the seconds down `<button>` element. */
  var secondsDownButtonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the seconds `<input>` element. */
  var secondsInputProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the seconds up `<button>` element. */
  var secondsUpButtonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Anon_Disabled {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hoursDownButtonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    hoursInputProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    hoursUpButtonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    id: java.lang.String = null,
    localizedText: Anon_MeridiemAM = null,
    meridiemDownButtonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    meridiemInputProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    meridiemUpButtonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    minutesDownButtonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    minutesInputProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    minutesUpButtonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    onChange: /* time */ Anon_0 => scala.Unit = null,
    secondsDownButtonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    secondsInputProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    secondsUpButtonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (hoursDownButtonProps != null) __obj.updateDynamic("hoursDownButtonProps")(hoursDownButtonProps)
    if (hoursInputProps != null) __obj.updateDynamic("hoursInputProps")(hoursInputProps)
    if (hoursUpButtonProps != null) __obj.updateDynamic("hoursUpButtonProps")(hoursUpButtonProps)
    if (id != null) __obj.updateDynamic("id")(id)
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText)
    if (meridiemDownButtonProps != null) __obj.updateDynamic("meridiemDownButtonProps")(meridiemDownButtonProps)
    if (meridiemInputProps != null) __obj.updateDynamic("meridiemInputProps")(meridiemInputProps)
    if (meridiemUpButtonProps != null) __obj.updateDynamic("meridiemUpButtonProps")(meridiemUpButtonProps)
    if (minutesDownButtonProps != null) __obj.updateDynamic("minutesDownButtonProps")(minutesDownButtonProps)
    if (minutesInputProps != null) __obj.updateDynamic("minutesInputProps")(minutesInputProps)
    if (minutesUpButtonProps != null) __obj.updateDynamic("minutesUpButtonProps")(minutesUpButtonProps)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (secondsDownButtonProps != null) __obj.updateDynamic("secondsDownButtonProps")(secondsDownButtonProps)
    if (secondsInputProps != null) __obj.updateDynamic("secondsInputProps")(secondsInputProps)
    if (secondsUpButtonProps != null) __obj.updateDynamic("secondsUpButtonProps")(secondsUpButtonProps)
    __obj.asInstanceOf[Anon_Disabled]
  }
}

