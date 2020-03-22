package typings.fundamentalReact.multiInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiInputProps
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var data: js.Array[_]
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[js.Any] = js.undefined
  var listProps: js.UndefOr[js.Any] = js.undefined
  var onTagsUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popoverProps: js.UndefOr[js.Any] = js.undefined
  var tagProps: js.UndefOr[js.Any] = js.undefined
  var validationState: js.UndefOr[AnonText] = js.undefined
}

object MultiInputProps {
  @scala.inline
  def apply(
    data: js.Array[_],
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    buttonProps: js.Any = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputProps: js.Any = null,
    listProps: js.Any = null,
    onTagsUpdate: /* repeated */ js.Any => _ = null,
    placeholder: String = null,
    popoverProps: js.Any = null,
    tagProps: js.Any = null,
    validationState: AnonText = null
  ): MultiInputProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (onTagsUpdate != null) __obj.updateDynamic("onTagsUpdate")(js.Any.fromFunction1(onTagsUpdate))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiInputProps]
  }
}

