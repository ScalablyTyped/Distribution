package typings.ejDotWebDotAll.ejNs.ButtonNs

import typings.ejDotWebDotAll.ejNs.ButtonSize
import typings.ejDotWebDotAll.ejNs.ButtonType
import typings.ejDotWebDotAll.ejNs.ContentType
import typings.ejDotWebDotAll.ejNs.ImagePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Fires when Button control is clicked successfully.Consider the scenario to perform any validation,modification of content or any other operations click on button,we can make use
    * of this click event to achieve the scenario.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
  /** Specifies the contentType of the Button. See below to know available ContentType
    * @Default {ej.ContentType.TextOnly}
    */
  var contentType: js.UndefOr[ContentType | String] = js.undefined
  /** Fires after Button control is created.If the user want to perform any operation after the button control creation then the user can make use of this create event.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root CSS class for Button theme, which is used customize.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Fires when the button is destroyed successfully.If the user want to perform any operation after the destroy button control then the user can make use of this destroy event.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specify the Right to Left direction to button
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Specifies the button control state.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the height of the Button.
    * @Default {28}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** It allows to define the characteristics of the Button control. It will helps to extend the capability of an HTML element.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specifies the image position of the Button. This image position is applicable only with the textandimage contentType property. The images can be positioned in both imageLeft and
    * imageRight options. See below to know about available ImagePosition
    * @Default {ej.ImagePosition.ImageLeft}
    */
  var imagePosition: js.UndefOr[ImagePosition | String] = js.undefined
  /** Specifies the primary icon for Button. This icon will be displayed from the left margin of the button.
    * @Default {null}
    */
  var prefixIcon: js.UndefOr[String] = js.undefined
  /** Convert the button as repeat button. It raises the 'Click' event repeatedly from the it is pressed until it is released.
    * @Default {false}
    */
  var repeatButton: js.UndefOr[Boolean] = js.undefined
  /** Displays the Button with rounded corners.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Specifies the size of the Button. See below to know available ButtonSize
    * @Default {ej.ButtonSize.Normal}
    */
  var size: js.UndefOr[ButtonSize | String] = js.undefined
  /** Specifies the secondary icon for Button. This icon will be displayed from the right margin of the button.
    * @Default {null}
    */
  var suffixIcon: js.UndefOr[String] = js.undefined
  /** Specifies the text content for Button.
    * @Default {null}
    */
  var text: js.UndefOr[String] = js.undefined
  /** Specified the time interval between two consecutive 'click' event on the button.
    * @Default {150}
    */
  var timeInterval: js.UndefOr[String] = js.undefined
  /** Specifies the Type of the Button. See below to know available ButtonType
    * @Default {ej.ButtonType.Submit}
    */
  var `type`: js.UndefOr[ButtonType | String] = js.undefined
  /** Specifies the width of the Button.
    * @Default {100px}
    */
  var width: js.UndefOr[String | Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    click: /* e */ ClickEventArgs => Unit = null,
    contentType: ContentType | String = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    htmlAttributes: js.Any = null,
    imagePosition: ImagePosition | String = null,
    prefixIcon: String = null,
    repeatButton: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    size: ButtonSize | String = null,
    suffixIcon: String = null,
    text: String = null,
    timeInterval: String = null,
    `type`: ButtonType | String = null,
    width: String | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(js.Any.fromFunction1(click))
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (imagePosition != null) __obj.updateDynamic("imagePosition")(imagePosition.asInstanceOf[js.Any])
    if (prefixIcon != null) __obj.updateDynamic("prefixIcon")(prefixIcon)
    if (!js.isUndefined(repeatButton)) __obj.updateDynamic("repeatButton")(repeatButton)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon)
    if (text != null) __obj.updateDynamic("text")(text)
    if (timeInterval != null) __obj.updateDynamic("timeInterval")(timeInterval)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

