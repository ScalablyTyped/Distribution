package typings.fundamentalReact.searchInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.anon.Callback
import typings.fundamentalReact.anon.Text
import typings.react.mod.ChangeEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInputProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var inShellbar: js.UndefOr[Boolean] = js.undefined
  var inputGroupAddonProps: js.UndefOr[js.Any] = js.undefined
  var inputGroupProps: js.UndefOr[js.Any] = js.undefined
  var inputProps: js.UndefOr[js.Any] = js.undefined
  var listProps: js.UndefOr[js.Any] = js.undefined
  var noSearchBtn: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]] = js.undefined
  var onEnter: js.UndefOr[js.Function1[/* value */ js.UndefOr[String | Double | js.Array[String]], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var popoverProps: js.UndefOr[js.Any] = js.undefined
  var searchBtnProps: js.UndefOr[js.Any] = js.undefined
  var searchList: js.UndefOr[js.Array[Callback]] = js.undefined
  var validationState: js.UndefOr[Text] = js.undefined
}

object SearchInputProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    inShellbar: js.UndefOr[Boolean] = js.undefined,
    inputGroupAddonProps: js.Any = null,
    inputGroupProps: js.Any = null,
    inputProps: js.Any = null,
    listProps: js.Any = null,
    noSearchBtn: js.UndefOr[Boolean] = js.undefined,
    onChange: /* event */ ChangeEvent[HTMLInputElement] => Unit = null,
    onEnter: /* value */ js.UndefOr[String | Double | js.Array[String]] => Unit = null,
    placeholder: String = null,
    popoverProps: js.Any = null,
    searchBtnProps: js.Any = null,
    searchList: js.Array[Callback] = null,
    validationState: Text = null
  ): SearchInputProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inShellbar)) __obj.updateDynamic("inShellbar")(inShellbar.get.asInstanceOf[js.Any])
    if (inputGroupAddonProps != null) __obj.updateDynamic("inputGroupAddonProps")(inputGroupAddonProps.asInstanceOf[js.Any])
    if (inputGroupProps != null) __obj.updateDynamic("inputGroupProps")(inputGroupProps.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (!js.isUndefined(noSearchBtn)) __obj.updateDynamic("noSearchBtn")(noSearchBtn.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (searchBtnProps != null) __obj.updateDynamic("searchBtnProps")(searchBtnProps.asInstanceOf[js.Any])
    if (searchList != null) __obj.updateDynamic("searchList")(searchList.asInstanceOf[js.Any])
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInputProps]
  }
}

