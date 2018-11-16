package typings
package ejDotWebDotAllLib.ejNs.SignatureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** This property is used to set the background color for the signature.
               * @Default {#ffffff}
               */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /** This property is used to set the background image for the signature.
               */
  var backgroundImage: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when the stroke is changed.
               */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, scala.Unit]] = js.undefined
  /** Enables or disables the Signature textbox widget.
               * @Default {true}
               */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the height of the Signature control.
               * @Default {100%}
               */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Enables/disables responsive support for the signature control (i.e) maintain the signature drawing during the window resizing time.
               * @Default {false}
               */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered when the pointer is clicked or touched in the signature canvas.
               */
  var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the pointer is moved in the signature canvas.
               */
  var mouseMove: js.UndefOr[js.Function1[/* e */ MouseMoveEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the pointer is released after click or touch in the signature canvas.
               */
  var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, scala.Unit]] = js.undefined
  /** Allows the type of the image format to be saved when the signature image is saved.
               */
  var saveImageFormat: js.UndefOr[SaveImageFormat | java.lang.String] = js.undefined
  /** Allows the signature image to be saved along with its background.
               * @Default {false}
               */
  var saveWithBackground: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables rounded corner.
               * @Default {true}
               */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the stroke color for the stroke of the signature.
               * @Default {#000000}
               */
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the stroke width for the stroke of the signature.
               * @Default {2}
               */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  /** Sets the width of the Signature control.
               * @Default {100%}
               */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

