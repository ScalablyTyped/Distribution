package typings
package fundamentalDashReactLib.libSearchInputSearchInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInputProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var inShellbar: js.UndefOr[scala.Boolean] = js.undefined
  var inputProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var listProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Set to **true** to render without a search button. */
  var noSearchBtn: js.UndefOr[scala.Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[/* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement], scala.Unit]
  ] = js.undefined
  /* Callback function when the user hits the <Enter> key. */
  var onEnter: js.UndefOr[
    js.Function1[
      /* value */ js.UndefOr[java.lang.String | scala.Double | js.Array[java.lang.String]], 
      scala.Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /* Additional props to be spread to the search `<button>` element. */
  var searchBtnProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Collection of items to display in the dropdown list. */
  var searchList: js.UndefOr[js.Array[fundamentalDashReactLib.Anon_Callback]] = js.undefined
}

object SearchInputProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    inShellbar: js.UndefOr[scala.Boolean] = js.undefined,
    inputProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    listProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    noSearchBtn: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement] => scala.Unit = null,
    onEnter: /* value */ js.UndefOr[java.lang.String | scala.Double | js.Array[java.lang.String]] => scala.Unit = null,
    placeholder: java.lang.String = null,
    searchBtnProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    searchList: js.Array[fundamentalDashReactLib.Anon_Callback] = null
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

