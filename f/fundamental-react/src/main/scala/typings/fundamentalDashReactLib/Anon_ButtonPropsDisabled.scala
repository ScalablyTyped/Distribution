package typings
package fundamentalDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonPropsDisabled
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var localizedText: js.UndefOr[Anon_MeridiemAM] = js.undefined
  /* Additional props to be spread to the `Time` component. */
  var timeProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Initial time value for the input. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ButtonPropsDisabled {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    buttonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    inputProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    localizedText: Anon_MeridiemAM = null,
    timeProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    value: java.lang.String = null
  ): Anon_ButtonPropsDisabled = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText)
    if (timeProps != null) __obj.updateDynamic("timeProps")(timeProps)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ButtonPropsDisabled]
  }
}

