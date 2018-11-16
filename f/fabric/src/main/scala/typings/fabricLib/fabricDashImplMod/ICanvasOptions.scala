package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICanvasOptions extends IStaticCanvasOptions {
  /**
  	 * When true, objects use center point as the origin of rotate transformation.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredRotation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When true, objects use center point as the origin of scale transformation.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredScaling: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Default element class that's given to wrapper (div) element of canvas
  	 */
  var containerClass: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Default cursor value used for the entire canvas
  	 */
  var defaultCursor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Cursor value used during free drawing
  	 */
  var freeDrawingCursor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Default cursor value used when hovering over an object on canvas
  	 */
  var hoverCursor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Indicates that canvas is interactive. This property should not be changed.
  	 */
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When true, mouse events on canvas (mousedown/mousemove/mouseup) result in free drawing.
  	 * After mousedown, mousemove creates a shape,
  	 * and then mouseup finalizes it and adds an instance of `fabric.Path` onto canvas.
  	 */
  var isDrawingMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Default cursor value used when moving an object on canvas
  	 */
  var moveCursor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * When true, object detection happens on per-pixel basis rather than on per-bounding-box
  	 */
  var perPixelTargetFind: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Cursor value used for rotation point
  	 */
  var rotationCursor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Indicates whether group selection should be enabled
  	 */
  var selection: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Color of the border of selection (usually slightly darker than color of selection itself)
  	 */
  var selectionBorderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Color of selection
  	 */
  var selectionColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Default dash array pattern
  	 * If not empty the selection border is dashed
  	 */
  var selectionDashArray: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Width of a line used in object/group selection
  	 */
  var selectionLineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * When true, target detection is skipped when hovering over canvas. This can be used to improve performance.
  	 */
  var skipTargetFind: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Number of pixels around target pixel to tolerate (consider active) during object detection
  	 */
  var targetFindTolerance: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * When true, objects can be transformed by one side (unproportionally)
  	 */
  var uniScaleTransform: js.UndefOr[scala.Boolean] = js.undefined
}

