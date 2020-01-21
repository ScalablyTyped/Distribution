package typings.fabric.fabricImplMod

import typings.fabric.AnonBlBrTl
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICanvasOptions extends IStaticCanvasOptions {
  /**
  	 * Indicates which key enable alternate action on corner
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled feature disabled.
  	 * @since 1.6.2
  	 * @type String
  	 * @default
  	 */
  var altActionKey: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates which key enable alternative selection
  	 * in case of target overlapping with active object
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * For a series of reason that come from the general expectations on how
  	 * things should work, this feature works only for preserveObjectStacking true.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled.
  	 * @since 1.6.5
  	 * @type null|String
  	 * @default
  	 */
  var altSelectionKey: js.UndefOr[String | Null] = js.undefined
  /**
  	 * Indicates which key enable centered Transform
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled feature disabled.
  	 * @since 1.6.2
  	 * @type String
  	 * @default
  	 */
  var centeredKey: js.UndefOr[String] = js.undefined
  /**
  	 * When true, objects use center point as the origin of rotate transformation.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredRotation: js.UndefOr[Boolean] = js.undefined
  /**
  	 * When true, objects use center point as the origin of scale transformation.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredScaling: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Default element class that's given to wrapper (div) element of canvas
  	 */
  var containerClass: js.UndefOr[String] = js.undefined
  /**
  	 * Default cursor value used for the entire canvas
  	 */
  var defaultCursor: js.UndefOr[String] = js.undefined
  /**
  	 * Color of object's fill
  	 */
  var fill: js.UndefOr[String | Pattern | Gradient] = js.undefined
  /**
  	 * Indicates if the canvas can fire middle click events
  	 * @type Boolean
  	 * @since 1.7.8
  	 * @default
  	 */
  var fireMiddleClick: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Indicates if the canvas can fire right click events
  	 * @type Boolean
  	 * @since 1.6.5
  	 * @default
  	 */
  var fireRightClick: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Cursor value used during free drawing
  	 */
  var freeDrawingCursor: js.UndefOr[String] = js.undefined
  /**
  	 * Default cursor value used when hovering over an object on canvas
  	 */
  var hoverCursor: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates that canvas is interactive. This property should not be changed.
  	 */
  var interactive: js.UndefOr[Boolean] = js.undefined
  /**
  	 * When true, mouse events on canvas (mousedown/mousemove/mouseup) result in free drawing.
  	 * After mousedown, mousemove creates a shape,
  	 * and then mouseup finalizes it and adds an instance of `fabric.Path` onto canvas.
  	 */
  var isDrawingMode: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Default cursor value used when moving an object on canvas
  	 */
  var moveCursor: js.UndefOr[String] = js.undefined
  /**
  	 * Cursor value used for disabled elements ( corners with disabled action )
  	 * @type String
  	 * @since 2.0.0
  	 * @default
  	 */
  var notAllowedCursor: js.UndefOr[String] = js.undefined
  /**
  	 * When true, object detection happens on per-pixel basis rather than on per-bounding-box
  	 */
  var perPixelTargetFind: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Indicates whether objects should remain in current stack position when selected.
  	 * When false objects are brought to top and rendered as part of the selection group
  	 * @type Boolean
  	 */
  var preserveObjectStacking: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Cursor value used for rotation point
  	 */
  var rotationCursor: js.UndefOr[String] = js.undefined
  /**
  	 * Indicates whether group selection should be enabled
  	 */
  var selection: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Color of the border of selection (usually slightly darker than color of selection itself)
  	 */
  var selectionBorderColor: js.UndefOr[String] = js.undefined
  /**
  	 * Color of selection
  	 */
  var selectionColor: js.UndefOr[String] = js.undefined
  /**
  	 * Default dash array pattern
  	 * If not empty the selection border is dashed
  	 */
  var selectionDashArray: js.UndefOr[js.Array[Double]] = js.undefined
  /**
  	 * Select only shapes that are fully contained in the dragged selection rectangle.
  	 * @type Boolean
  	 * @default
  	 */
  var selectionFullyContained: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Indicates which key or keys enable multiple click selection
  	 * Pass value as a string or array of strings
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or empty or containing any other string that is not a modifier key
  	 * feature is disabled.
  	 * @since 1.6.2
  	 * @type String|Array
  	 * @default
  	 */
  var selectionKey: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
  	 * Width of a line used in object/group selection
  	 */
  var selectionLineWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * When true, target detection is skipped when hovering over canvas. This can be used to improve performance.
  	 */
  var skipTargetFind: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Indicates the angle that an object will lock to while rotating.
  	 * @type Number
  	 * @since 1.6.7
  	 */
  var snapAngle: js.UndefOr[Double] = js.undefined
  /**
  	 * Indicates the distance from the snapAngle the rotation will lock to the snapAngle.
  	 * When `null`, the snapThreshold will default to the snapAngle.
  	 * @type null|Number
  	 * @since 1.6.7
  	 * @default
  	 */
  var snapThreshold: js.UndefOr[Null | Double] = js.undefined
  /**
  	 * Indicates if the right click on canvas can output the context menu or not
  	 * @type Boolean
  	 * @since 1.6.5
  	 * @default
  	 */
  var stopContextMenu: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Number of pixels around target pixel to tolerate (consider active) during object detection
  	 */
  var targetFindTolerance: js.UndefOr[Double] = js.undefined
  /**
  	 * Indicates which key enable unproportional scaling
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled feature disabled.
  	 * @since 1.6.2
  	 * @type String
  	 */
  var uniScaleKey: js.UndefOr[String] = js.undefined
  /**
  	 * When true, objects can be transformed by one side (unproportionally)
  	 * @type Boolean
  	 */
  var uniScaleTransform: js.UndefOr[Boolean] = js.undefined
}

object ICanvasOptions {
  @scala.inline
  def apply(
    allowTouchScrolling: js.UndefOr[Boolean] = js.undefined,
    altActionKey: String = null,
    altSelectionKey: String = null,
    backgroundColor: String | Pattern = null,
    backgroundImage: Image | String = null,
    backgroundVpt: js.UndefOr[Boolean] = js.undefined,
    centeredKey: String = null,
    centeredRotation: js.UndefOr[Boolean] = js.undefined,
    centeredScaling: js.UndefOr[Boolean] = js.undefined,
    clipPath: Object = null,
    clipTo: /* context */ CanvasRenderingContext2D => Unit = null,
    containerClass: String = null,
    controlsAboveOverlay: js.UndefOr[Boolean] = js.undefined,
    defaultCursor: String = null,
    enableRetinaScaling: js.UndefOr[Boolean] = js.undefined,
    fill: String | Pattern | Gradient = null,
    fireMiddleClick: js.UndefOr[Boolean] = js.undefined,
    fireRightClick: js.UndefOr[Boolean] = js.undefined,
    freeDrawingCursor: String = null,
    hoverCursor: String = null,
    imageSmoothingEnabled: js.UndefOr[Boolean] = js.undefined,
    includeDefaultValues: js.UndefOr[Boolean] = js.undefined,
    interactive: js.UndefOr[Boolean] = js.undefined,
    isDrawingMode: js.UndefOr[Boolean] = js.undefined,
    moveCursor: String = null,
    notAllowedCursor: String = null,
    overlayColor: String | Pattern = null,
    overlayImage: Image = null,
    overlayVpt: js.UndefOr[Boolean] = js.undefined,
    perPixelTargetFind: js.UndefOr[Boolean] = js.undefined,
    preserveObjectStacking: js.UndefOr[Boolean] = js.undefined,
    renderOnAddRemove: js.UndefOr[Boolean] = js.undefined,
    rotationCursor: String = null,
    selection: js.UndefOr[Boolean] = js.undefined,
    selectionBorderColor: String = null,
    selectionColor: String = null,
    selectionDashArray: js.Array[Double] = null,
    selectionFullyContained: js.UndefOr[Boolean] = js.undefined,
    selectionKey: String | js.Array[String] = null,
    selectionLineWidth: Int | Double = null,
    skipOffscreen: js.UndefOr[Boolean] = js.undefined,
    skipTargetFind: js.UndefOr[Boolean] = js.undefined,
    snapAngle: Int | Double = null,
    snapThreshold: Int | Double = null,
    stateful: js.UndefOr[Boolean] = js.undefined,
    stopContextMenu: js.UndefOr[Boolean] = js.undefined,
    svgViewportTransformation: js.UndefOr[Boolean] = js.undefined,
    targetFindTolerance: Int | Double = null,
    uniScaleKey: String = null,
    uniScaleTransform: js.UndefOr[Boolean] = js.undefined,
    viewportTransform: js.Array[Double] = null,
    vptCoords: AnonBlBrTl = null
  ): ICanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTouchScrolling)) __obj.updateDynamic("allowTouchScrolling")(allowTouchScrolling.asInstanceOf[js.Any])
    if (altActionKey != null) __obj.updateDynamic("altActionKey")(altActionKey.asInstanceOf[js.Any])
    if (altSelectionKey != null) __obj.updateDynamic("altSelectionKey")(altSelectionKey.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundVpt)) __obj.updateDynamic("backgroundVpt")(backgroundVpt.asInstanceOf[js.Any])
    if (centeredKey != null) __obj.updateDynamic("centeredKey")(centeredKey.asInstanceOf[js.Any])
    if (!js.isUndefined(centeredRotation)) __obj.updateDynamic("centeredRotation")(centeredRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(centeredScaling)) __obj.updateDynamic("centeredScaling")(centeredScaling.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipTo != null) __obj.updateDynamic("clipTo")(js.Any.fromFunction1(clipTo))
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass.asInstanceOf[js.Any])
    if (!js.isUndefined(controlsAboveOverlay)) __obj.updateDynamic("controlsAboveOverlay")(controlsAboveOverlay.asInstanceOf[js.Any])
    if (defaultCursor != null) __obj.updateDynamic("defaultCursor")(defaultCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRetinaScaling)) __obj.updateDynamic("enableRetinaScaling")(enableRetinaScaling.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(fireMiddleClick)) __obj.updateDynamic("fireMiddleClick")(fireMiddleClick.asInstanceOf[js.Any])
    if (!js.isUndefined(fireRightClick)) __obj.updateDynamic("fireRightClick")(fireRightClick.asInstanceOf[js.Any])
    if (freeDrawingCursor != null) __obj.updateDynamic("freeDrawingCursor")(freeDrawingCursor.asInstanceOf[js.Any])
    if (hoverCursor != null) __obj.updateDynamic("hoverCursor")(hoverCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(imageSmoothingEnabled)) __obj.updateDynamic("imageSmoothingEnabled")(imageSmoothingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDefaultValues)) __obj.updateDynamic("includeDefaultValues")(includeDefaultValues.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (!js.isUndefined(isDrawingMode)) __obj.updateDynamic("isDrawingMode")(isDrawingMode.asInstanceOf[js.Any])
    if (moveCursor != null) __obj.updateDynamic("moveCursor")(moveCursor.asInstanceOf[js.Any])
    if (notAllowedCursor != null) __obj.updateDynamic("notAllowedCursor")(notAllowedCursor.asInstanceOf[js.Any])
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (overlayImage != null) __obj.updateDynamic("overlayImage")(overlayImage.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayVpt)) __obj.updateDynamic("overlayVpt")(overlayVpt.asInstanceOf[js.Any])
    if (!js.isUndefined(perPixelTargetFind)) __obj.updateDynamic("perPixelTargetFind")(perPixelTargetFind.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveObjectStacking)) __obj.updateDynamic("preserveObjectStacking")(preserveObjectStacking.asInstanceOf[js.Any])
    if (!js.isUndefined(renderOnAddRemove)) __obj.updateDynamic("renderOnAddRemove")(renderOnAddRemove.asInstanceOf[js.Any])
    if (rotationCursor != null) __obj.updateDynamic("rotationCursor")(rotationCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(selection)) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionBorderColor != null) __obj.updateDynamic("selectionBorderColor")(selectionBorderColor.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (selectionDashArray != null) __obj.updateDynamic("selectionDashArray")(selectionDashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(selectionFullyContained)) __obj.updateDynamic("selectionFullyContained")(selectionFullyContained.asInstanceOf[js.Any])
    if (selectionKey != null) __obj.updateDynamic("selectionKey")(selectionKey.asInstanceOf[js.Any])
    if (selectionLineWidth != null) __obj.updateDynamic("selectionLineWidth")(selectionLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(skipOffscreen)) __obj.updateDynamic("skipOffscreen")(skipOffscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(skipTargetFind)) __obj.updateDynamic("skipTargetFind")(skipTargetFind.asInstanceOf[js.Any])
    if (snapAngle != null) __obj.updateDynamic("snapAngle")(snapAngle.asInstanceOf[js.Any])
    if (snapThreshold != null) __obj.updateDynamic("snapThreshold")(snapThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful.asInstanceOf[js.Any])
    if (!js.isUndefined(stopContextMenu)) __obj.updateDynamic("stopContextMenu")(stopContextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(svgViewportTransformation)) __obj.updateDynamic("svgViewportTransformation")(svgViewportTransformation.asInstanceOf[js.Any])
    if (targetFindTolerance != null) __obj.updateDynamic("targetFindTolerance")(targetFindTolerance.asInstanceOf[js.Any])
    if (uniScaleKey != null) __obj.updateDynamic("uniScaleKey")(uniScaleKey.asInstanceOf[js.Any])
    if (!js.isUndefined(uniScaleTransform)) __obj.updateDynamic("uniScaleTransform")(uniScaleTransform.asInstanceOf[js.Any])
    if (viewportTransform != null) __obj.updateDynamic("viewportTransform")(viewportTransform.asInstanceOf[js.Any])
    if (vptCoords != null) __obj.updateDynamic("vptCoords")(vptCoords.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasOptions]
  }
}

