package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStaticCanvasOptions extends js.Object {
  /**
  	 * Indicates whether the browser can be scrolled when using a touchscreen and dragging on the canvas
  	 */
  var allowTouchScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Background color of canvas instance.
  	 * Should be set via setBackgroundColor
  	 */
  var backgroundColor: js.UndefOr[java.lang.String | Pattern] = js.undefined
  /**
  	 * Background image of canvas instance.
  	 * Should be set via setBackgroundImage
  	 * <b>Backwards incompatibility note:</b> The "backgroundImageOpacity" and "backgroundImageStretch" properties are deprecated since 1.3.9.
  	 */
  var backgroundImage: js.UndefOr[Image | java.lang.String] = js.undefined
  var backgroundImageOpacity: js.UndefOr[scala.Double] = js.undefined
  var backgroundImageStretch: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Function that determines clipping of entire canvas area
  	 * Being passed context as first argument. See clipping canvas area
  	 */
  var clipTo: js.UndefOr[js.Function1[/* context */ stdLib.CanvasRenderingContext2D, scala.Unit]] = js.undefined
  /**
  	 * Indicates whether object controls (borders/controls) are rendered above overlay image
  	 */
  var controlsAboveOverlay: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When true, canvas is scaled by devicePixelRatio for better rendering on retina screens
  	 */
  var enableRetinaScaling: js.UndefOr[scala.Boolean] = js.undefined
  var freeDrawingColor: js.UndefOr[java.lang.String] = js.undefined
  var freeDrawingLineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Indicates whether this canvas will use image smoothing, this is on by default in browsers
  	 */
  var imageSmoothingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates whether toObject/toDatalessObject should include default values
  	 */
  var includeDefaultValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Overlay color of canvas instance.
  	 * Should be set via setOverlayColor
  	 */
  var overlayColor: js.UndefOr[java.lang.String | Pattern] = js.undefined
  /**
  	 * Overlay image of canvas instance.
  	 * Should be set via setOverlayImage
  	 * <b>Backwards incompatibility note:</b> The "overlayImageLeft" and "overlayImageTop" properties are deprecated since 1.3.9.
  	 */
  var overlayImage: js.UndefOr[Image] = js.undefined
  var overlayImageLeft: js.UndefOr[scala.Double] = js.undefined
  var overlayImageTop: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Indicates whether objects should remain in current stack position when selected.
  	 * When false objects are brought to top and rendered as part of the selection group
  	 */
  var preserveObjectStacking: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates whether add, insertAt and remove should also re-render canvas.
  	 * Disabling this option could give a great performance boost when adding/removing a lot of objects to/from canvas at once
  	 * (followed by a manual rendering after addition/deletion)
  	 */
  var renderOnAddRemove: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates whether objects' state should be saved
  	 */
  var stateful: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The transformation (in the format of Canvas transform) which focuses the viewport
  	 */
  var viewportTransform: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

