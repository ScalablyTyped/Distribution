package typings.ejDotWebDotAll.ejNs.ToggleButtonNs

import typings.ejDotWebDotAll.ejNs.ButtonSize
import typings.ejDotWebDotAll.ejNs.ButtonType
import typings.ejDotWebDotAll.ejNs.ContentType
import typings.ejDotWebDotAll.ejNs.ImagePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specify the icon in active state to the toggle button and it will be aligned from left margin of the button.
    */
  var activePrefixIcon: js.UndefOr[String] = js.undefined
  /** Specify the icon in active state to the toggle button and it will be aligned from right margin of the button.
    */
  var activeSuffixIcon: js.UndefOr[String] = js.undefined
  /** Sets the text when ToggleButton is in active state i.e.,checked state.
    * @Default {null}
    */
  var activeText: js.UndefOr[String] = js.undefined
  /** Fires when ToggleButton control state is changed successfully.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Fires when ToggleButton control is clicked successfully.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Specifies the contentType of the ToggleButton. See ContentType as below
    * @Default {ej.ContentType.TextOnly}
    */
  var contentType: js.UndefOr[ContentType | String] = js.undefined
  /** Fires when ToggleButton control is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Specify the CSS class to the ToggleButton to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specify the icon in default state to the toggle button and it will be aligned from left margin of the button.
    */
  var defaultPrefixIcon: js.UndefOr[String] = js.undefined
  /** Specify the icon in default state to the toggle button and it will be aligned from right margin of the button.
    */
  var defaultSuffixIcon: js.UndefOr[String] = js.undefined
  /** Specifies the text of the ToggleButton, when the control is a default state. i.e., unChecked state.
    * @Default {null}
    */
  var defaultText: js.UndefOr[String] = js.undefined
  /** Fires when ToggleButton control is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Save current model value to browser cookies for maintaining states. When refreshing the ToggleButton control page, the model value is applied from browser cookies or HTML 5local
    * storage.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Specify the Right to Left direction of the ToggleButton.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Specifies the state of the ToggleButton.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the height of the ToggleButton.
    * @Default {28pixel}
    */
  var height: js.UndefOr[Double | String] = js.undefined
  /** It allows to define the characteristics of the ToggleButton control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specifies the image position of the ToggleButton.
    * @Default {ej.ImagePosition.ImageLeft}
    */
  var imagePosition: js.UndefOr[ImagePosition | String] = js.undefined
  /** Allows to prevents the control switched to checked (active) state.
    * @Default {false}
    */
  var preventToggle: js.UndefOr[Boolean] = js.undefined
  /** Displays the ToggleButton with rounded corners.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Specifies the size of the ToggleButton. See ButtonSize as below
    * @Default {ej.ButtonSize.Normal}
    */
  var size: js.UndefOr[ButtonSize | String] = js.undefined
  /** It allows to define the ToggleButton state to checked(Active) or unchecked(Default) at initial time.
    * @Default {false}
    */
  var toggleState: js.UndefOr[Boolean] = js.undefined
  /** Specifies the type of the ToggleButton. See ButtonType as below
    * @Default {ej.ButtonType.Button}
    */
  var `type`: js.UndefOr[ButtonType | String] = js.undefined
  /** Specifies the width of the ToggleButton.
    * @Default {100pixel}
    */
  var width: js.UndefOr[Double | String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    activePrefixIcon: String = null,
    activeSuffixIcon: String = null,
    activeText: String = null,
    change: /* e */ ChangeEventArgs => Unit = null,
    click: /* e */ ClickEventArgs => Unit = null,
    contentType: ContentType | String = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    defaultPrefixIcon: String = null,
    defaultSuffixIcon: String = null,
    defaultText: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    htmlAttributes: js.Any = null,
    imagePosition: ImagePosition | String = null,
    preventToggle: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    size: ButtonSize | String = null,
    toggleState: js.UndefOr[Boolean] = js.undefined,
    `type`: ButtonType | String = null,
    width: Double | String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (activePrefixIcon != null) __obj.updateDynamic("activePrefixIcon")(activePrefixIcon)
    if (activeSuffixIcon != null) __obj.updateDynamic("activeSuffixIcon")(activeSuffixIcon)
    if (activeText != null) __obj.updateDynamic("activeText")(activeText)
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (defaultPrefixIcon != null) __obj.updateDynamic("defaultPrefixIcon")(defaultPrefixIcon)
    if (defaultSuffixIcon != null) __obj.updateDynamic("defaultSuffixIcon")(defaultSuffixIcon)
    if (defaultText != null) __obj.updateDynamic("defaultText")(defaultText)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (imagePosition != null) __obj.updateDynamic("imagePosition")(imagePosition.asInstanceOf[js.Any])
    if (!js.isUndefined(preventToggle)) __obj.updateDynamic("preventToggle")(preventToggle)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleState)) __obj.updateDynamic("toggleState")(toggleState)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

