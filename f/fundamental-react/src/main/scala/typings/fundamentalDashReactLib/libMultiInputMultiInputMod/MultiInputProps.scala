package typings
package fundamentalDashReactLib.libMultiInputMultiInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiInputProps
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /* Collection of items to display in the list. */
  var data: js.Array[java.lang.String | scala.Double | js.Array[java.lang.String]]
  var inputProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var listProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var localizedText: js.UndefOr[fundamentalDashReactLib.Anon_ImageLabel] = js.undefined
  /* Localized placeholder text of the input. */
  var placeHolder: js.UndefOr[java.lang.String] = js.undefined
  /* Additional props to be spread to the tags `<div>` element. */
  var tagProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /* Callback function when a tag is added or removed. Returns array of tags selected. */
  def onTagsUpdate(tags: js.Array[java.lang.String]): scala.Unit
}

object MultiInputProps {
  @scala.inline
  def apply(
    data: js.Array[java.lang.String | scala.Double | js.Array[java.lang.String]],
    onTagsUpdate: js.Array[java.lang.String] => scala.Unit,
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    buttonProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    inputProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    listProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    localizedText: fundamentalDashReactLib.Anon_ImageLabel = null,
    placeHolder: java.lang.String = null,
    tagProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): MultiInputProps = {
    val __obj = js.Dynamic.literal(data = data, onTagsUpdate = js.Any.fromFunction1(onTagsUpdate))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps)
    if (listProps != null) __obj.updateDynamic("listProps")(listProps)
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText)
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder)
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps)
    __obj.asInstanceOf[MultiInputProps]
  }
}

