package typings.fundamentalReact.multiInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.fundamentalReact.AnonImageLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiInputProps
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Collection of items to display in the list. */
  var data: js.Array[String | Double | js.Array[String]]
  var disableStyles: js.UndefOr[Boolean] = js.undefined
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var listProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var localizedText: js.UndefOr[AnonImageLabel] = js.undefined
  /* Localized placeholder text of the input. */
  var placeHolder: js.UndefOr[String] = js.undefined
  var popoverProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Additional props to be spread to the tags `<div>` element. */
  var tagProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /* Callback function when a tag is added or removed. Returns array of tags selected. */
  def onTagsUpdate(tags: js.Array[String]): Unit
}

object MultiInputProps {
  @scala.inline
  def apply(
    data: js.Array[String | Double | js.Array[String]],
    onTagsUpdate: js.Array[String] => Unit,
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    buttonProps: StringDictionary[js.Any] = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    inputProps: StringDictionary[js.Any] = null,
    listProps: StringDictionary[js.Any] = null,
    localizedText: AnonImageLabel = null,
    placeHolder: String = null,
    popoverProps: StringDictionary[js.Any] = null,
    tagProps: StringDictionary[js.Any] = null
  ): MultiInputProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onTagsUpdate = js.Any.fromFunction1(onTagsUpdate))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (listProps != null) __obj.updateDynamic("listProps")(listProps.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (placeHolder != null) __obj.updateDynamic("placeHolder")(placeHolder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (tagProps != null) __obj.updateDynamic("tagProps")(tagProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiInputProps]
  }
}

