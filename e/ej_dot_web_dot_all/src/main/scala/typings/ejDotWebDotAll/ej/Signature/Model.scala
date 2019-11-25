package typings.ejDotWebDotAll.ej.Signature

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** This property is used to set the background color for the signature.
    * @Default {#ffffff}
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** This property is used to set the background image for the signature.
    */
  var backgroundImage: js.UndefOr[String] = js.undefined
  /** Triggers when the stroke is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Enables or disables the Signature textbox widget.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Sets the height of the Signature control.
    * @Default {100%}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Enables/disables responsive support for the signature control (i.e) maintain the signature drawing during the window resizing time.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Triggered when the pointer is clicked or touched in the signature canvas.
    */
  var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, Unit]] = js.undefined
  /** Triggered when the pointer is moved in the signature canvas.
    */
  var mouseMove: js.UndefOr[js.Function1[/* e */ MouseMoveEventArgs, Unit]] = js.undefined
  /** Triggered when the pointer is released after click or touch in the signature canvas.
    */
  var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, Unit]] = js.undefined
  /** Allows the type of the image format to be saved when the signature image is saved.
    */
  var saveImageFormat: js.UndefOr[SaveImageFormat | String] = js.undefined
  /** Allows the signature image to be saved along with its background.
    * @Default {false}
    */
  var saveWithBackground: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables rounded corner.
    * @Default {true}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Sets the stroke color for the stroke of the signature.
    * @Default {#000000}
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  /** Sets the stroke width for the stroke of the signature.
    * @Default {2}
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  /** Sets the width of the Signature control.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    backgroundImage: String = null,
    change: /* e */ ChangeEventArgs => Unit = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: String = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    mouseDown: /* e */ MouseDownEventArgs => Unit = null,
    mouseMove: /* e */ MouseMoveEventArgs => Unit = null,
    mouseUp: /* e */ MouseUpEventArgs => Unit = null,
    saveImageFormat: SaveImageFormat | String = null,
    saveWithBackground: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String = null,
    strokeWidth: Int | Double = null,
    width: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (mouseDown != null) __obj.updateDynamic("mouseDown")(js.Any.fromFunction1(mouseDown))
    if (mouseMove != null) __obj.updateDynamic("mouseMove")(js.Any.fromFunction1(mouseMove))
    if (mouseUp != null) __obj.updateDynamic("mouseUp")(js.Any.fromFunction1(mouseUp))
    if (saveImageFormat != null) __obj.updateDynamic("saveImageFormat")(saveImageFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(saveWithBackground)) __obj.updateDynamic("saveWithBackground")(saveWithBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

