package typings
package ejDotWebDotAllLib.ejNs.SplitButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the arrowPosition of the Split or Dropdown Button.See arrowPosition
    * @Default {ej.ArrowPosition.Right}
    */
  var arrowPosition: js.UndefOr[java.lang.String | ejDotWebDotAllLib.ejNs.ArrowPosition] = js.undefined
  /** Fires before menu of the split button control is opened.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Specifies the buttonMode like Split or Dropdown Button.See ButtonMode
    * @Default {ej.ButtonMode.Split}
    */
  var buttonMode: js.UndefOr[java.lang.String | ejDotWebDotAllLib.ejNs.ButtonMode] = js.undefined
  /** Fires when Button control is clicked successfully
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, scala.Unit]] = js.undefined
  /** Fires before the list content of Button control is closed
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, scala.Unit]] = js.undefined
  /** Specifies the contentType of the Split Button.See ContentType
    * @Default {ej.ContentType.TextOnly}
    */
  var contentType: js.UndefOr[java.lang.String | ejDotWebDotAllLib.ejNs.ContentType] = js.undefined
  /** Fires after Split Button control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Set the root class for Split Button control theme
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when the Split Button is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Specifies the enableRTL property for Split Button while initialization.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the disabling of Split Button if enabled is set to false.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the height of the Split Button.
    * @Default {â€œâ€}
    */
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** Specifies the HTML Attributes of the Split Button.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specifies the imagePosition of the Split Button.See imagePositions
    * @Default {ej.ImagePosition.ImageRight}
    */
  var imagePosition: js.UndefOr[java.lang.String | ejDotWebDotAllLib.ejNs.ImagePosition] = js.undefined
  /** Fires when a menu item is Hovered out successfully
    */
  var itemMouseOut: js.UndefOr[js.Function1[/* e */ ItemMouseOutEventArgs, scala.Unit]] = js.undefined
  /** Fires when a menu item is Hovered in successfully
    */
  var itemMouseOver: js.UndefOr[js.Function1[/* e */ ItemMouseOverEventArgs, scala.Unit]] = js.undefined
  /** Fires when a menu item is clicked successfully
    */
  var itemSelected: js.UndefOr[js.Function1[/* e */ ItemSelectedEventArgs, scala.Unit]] = js.undefined
  /** Fires before the list content of Button control is opened
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, scala.Unit]] = js.undefined
  /** Specifies the image content for Split Button while initialization.
    */
  var prefixIcon: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the showRoundedCorner property for Split Button while initialization.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the size of the Button. See ButtonSize
    * @Default {ej.ButtonSize.Normal}
    */
  var size: js.UndefOr[java.lang.String | ejDotWebDotAllLib.ejNs.ButtonSize] = js.undefined
  /** Specifies the image content for Split Button while initialization.
    */
  var suffixIcon: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the target of splitbutton menu while initialization with ID or class as a selector.
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the list content for Split Button while initialization
    */
  var targetID: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text content for Split Button while initialization.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the width of the Split Button.
    * @Default {â€œâ€}
    */
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    arrowPosition: java.lang.String | ejDotWebDotAllLib.ejNs.ArrowPosition = null,
    beforeOpen: js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit] = null,
    buttonMode: java.lang.String | ejDotWebDotAllLib.ejNs.ButtonMode = null,
    click: js.Function1[/* e */ ClickEventArgs, scala.Unit] = null,
    close: js.Function1[/* e */ CloseEventArgs, scala.Unit] = null,
    contentType: java.lang.String | ejDotWebDotAllLib.ejNs.ContentType = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    height: java.lang.String | scala.Double = null,
    htmlAttributes: js.Any = null,
    imagePosition: java.lang.String | ejDotWebDotAllLib.ejNs.ImagePosition = null,
    itemMouseOut: js.Function1[/* e */ ItemMouseOutEventArgs, scala.Unit] = null,
    itemMouseOver: js.Function1[/* e */ ItemMouseOverEventArgs, scala.Unit] = null,
    itemSelected: js.Function1[/* e */ ItemSelectedEventArgs, scala.Unit] = null,
    open: js.Function1[/* e */ OpenEventArgs, scala.Unit] = null,
    prefixIcon: java.lang.String = null,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String | ejDotWebDotAllLib.ejNs.ButtonSize = null,
    suffixIcon: java.lang.String = null,
    target: java.lang.String = null,
    targetID: java.lang.String = null,
    text: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (arrowPosition != null) __obj.updateDynamic("arrowPosition")(arrowPosition.asInstanceOf[js.Any])
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen)
    if (buttonMode != null) __obj.updateDynamic("buttonMode")(buttonMode.asInstanceOf[js.Any])
    if (click != null) __obj.updateDynamic("click")(click)
    if (close != null) __obj.updateDynamic("close")(close)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (imagePosition != null) __obj.updateDynamic("imagePosition")(imagePosition.asInstanceOf[js.Any])
    if (itemMouseOut != null) __obj.updateDynamic("itemMouseOut")(itemMouseOut)
    if (itemMouseOver != null) __obj.updateDynamic("itemMouseOver")(itemMouseOver)
    if (itemSelected != null) __obj.updateDynamic("itemSelected")(itemSelected)
    if (open != null) __obj.updateDynamic("open")(open)
    if (prefixIcon != null) __obj.updateDynamic("prefixIcon")(prefixIcon)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetID != null) __obj.updateDynamic("targetID")(targetID)
    if (text != null) __obj.updateDynamic("text")(text)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

