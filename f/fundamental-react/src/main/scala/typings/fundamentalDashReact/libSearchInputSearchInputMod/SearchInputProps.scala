package typings.fundamentalDashReact.libSearchInputSearchInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalDashReact.Anon_Callback
import typings.react.reactMod.ChangeEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInputProps
  extends /* x */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var inShellbar: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var listProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Set to **true** to render without a search button. */
  var noSearchBtn: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* event */ ChangeEvent[HTMLInputElement], Unit]] = js.undefined
  /* Callback function when the user hits the <Enter> key. */
  var onEnter: js.UndefOr[js.Function1[/* value */ js.UndefOr[String | Double | js.Array[String]], Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  /* Additional props to be spread to the search `<button>` element. */
  var searchBtnProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Collection of items to display in the dropdown list. */
  var searchList: js.UndefOr[js.Array[Anon_Callback]] = js.undefined
}

object SearchInputProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    inShellbar: js.UndefOr[Boolean] = js.undefined,
    inputProps: StringDictionary[js.Any] = null,
    listProps: StringDictionary[js.Any] = null,
    noSearchBtn: js.UndefOr[Boolean] = js.undefined,
    onChange: /* event */ ChangeEvent[HTMLInputElement] => Unit = null,
    onEnter: /* value */ js.UndefOr[String | Double | js.Array[String]] => Unit = null,
    placeholder: String = null,
    searchBtnProps: StringDictionary[js.Any] = null,
    searchList: js.Array[Anon_Callback] = null
  ): SearchInputProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(inShellbar)) __obj.updateDynamic("inShellbar")(inShellbar)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (listProps != null) __obj.updateDynamic("listProps")(listProps)
    if (!js.isUndefined(noSearchBtn)) __obj.updateDynamic("noSearchBtn")(noSearchBtn)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (searchBtnProps != null) __obj.updateDynamic("searchBtnProps")(searchBtnProps)
    if (searchList != null) __obj.updateDynamic("searchList")(searchList)
    __obj.asInstanceOf[SearchInputProps]
  }
}

