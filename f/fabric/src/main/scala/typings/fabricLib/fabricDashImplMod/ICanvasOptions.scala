package typings
package fabricLib.fabricDashImplMod

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
  var altActionKey: js.UndefOr[java.lang.String] = js.undefined
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
  var altSelectionKey: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
  	 * Indicates which key enable centered Transform
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled feature disabled.
  	 * @since 1.6.2
  	 * @type String
  	 * @default
  	 */
  var centeredKey: js.UndefOr[java.lang.String] = js.undefined
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
    * Color of object's fill
    */
  var fill: js.UndefOr[java.lang.String | Pattern] = js.undefined
  /**
  	 * Indicates if the canvas can fire middle click events
  	 * @type Boolean
  	 * @since 1.7.8
  	 * @default
  	 */
  var fireMiddleClick: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates if the canvas can fire right click events
  	 * @type Boolean
  	 * @since 1.6.5
  	 * @default
  	 */
  var fireRightClick: js.UndefOr[scala.Boolean] = js.undefined
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
  	 * Cursor value used for disabled elements ( corners with disabled action )
  	 * @type String
  	 * @since 2.0.0
  	 * @default
  	 */
  var notAllowedCursor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * When true, object detection happens on per-pixel basis rather than on per-bounding-box
  	 */
  var perPixelTargetFind: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates whether objects should remain in current stack position when selected.
  	 * When false objects are brought to top and rendered as part of the selection group
  	 * @type Boolean
  	 */
  var preserveObjectStacking: js.UndefOr[scala.Boolean] = js.undefined
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
  var selectionDashArray: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
  	 * Select only shapes that are fully contained in the dragged selection rectangle.
  	 * @type Boolean
  	 * @default
  	 */
  var selectionFullyContained: js.UndefOr[scala.Boolean] = js.undefined
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
  var selectionKey: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
  	 * Width of a line used in object/group selection
  	 */
  var selectionLineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * When true, target detection is skipped when hovering over canvas. This can be used to improve performance.
  	 */
  var skipTargetFind: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates the angle that an object will lock to while rotating.
  	 * @type Number
  	 * @since 1.6.7
  	 */
  var snapAngle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Indicates the distance from the snapAngle the rotation will lock to the snapAngle.
  	 * When `null`, the snapThreshold will default to the snapAngle.
  	 * @type null|Number
  	 * @since 1.6.7
  	 * @default
  	 */
  var snapThreshold: js.UndefOr[scala.Null | scala.Double] = js.undefined
  /**
  	 * Indicates if the right click on canvas can output the context menu or not
  	 * @type Boolean
  	 * @since 1.6.5
  	 * @default
  	 */
  var stopContextMenu: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Number of pixels around target pixel to tolerate (consider active) during object detection
  	 */
  var targetFindTolerance: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Indicates which key enable unproportional scaling
  	 * values: 'altKey', 'shiftKey', 'ctrlKey'.
  	 * If `null` or 'none' or any other string that is not a modifier key
  	 * feature is disabled feature disabled.
  	 * @since 1.6.2
  	 * @type String
  	 */
  var uniScaleKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * When true, objects can be transformed by one side (unproportionally)
  	 * @type Boolean
  	 */
  var uniScaleTransform: js.UndefOr[scala.Boolean] = js.undefined
}

object ICanvasOptions {
  @scala.inline
  def apply(
    allowTouchScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    altActionKey: java.lang.String = null,
    altSelectionKey: java.lang.String = null,
    backgroundColor: java.lang.String | Pattern = null,
    backgroundImage: Image | java.lang.String = null,
    backgroundVpt: js.UndefOr[scala.Boolean] = js.undefined,
    centeredKey: java.lang.String = null,
    centeredRotation: js.UndefOr[scala.Boolean] = js.undefined,
    centeredScaling: js.UndefOr[scala.Boolean] = js.undefined,
    clipPath: Object = null,
    clipTo: /* context */ stdLib.CanvasRenderingContext2D => scala.Unit = null,
    containerClass: java.lang.String = null,
    controlsAboveOverlay: js.UndefOr[scala.Boolean] = js.undefined,
    defaultCursor: java.lang.String = null,
    enableRetinaScaling: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String | Pattern = null,
    fireMiddleClick: js.UndefOr[scala.Boolean] = js.undefined,
    fireRightClick: js.UndefOr[scala.Boolean] = js.undefined,
    freeDrawingCursor: java.lang.String = null,
    hoverCursor: java.lang.String = null,
    imageSmoothingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    includeDefaultValues: js.UndefOr[scala.Boolean] = js.undefined,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    isDrawingMode: js.UndefOr[scala.Boolean] = js.undefined,
    moveCursor: java.lang.String = null,
    notAllowedCursor: java.lang.String = null,
    overlayColor: java.lang.String | Pattern = null,
    overlayImage: Image = null,
    overlayVpt: js.UndefOr[scala.Boolean] = js.undefined,
    perPixelTargetFind: js.UndefOr[scala.Boolean] = js.undefined,
    preserveObjectStacking: js.UndefOr[scala.Boolean] = js.undefined,
    renderOnAddRemove: js.UndefOr[scala.Boolean] = js.undefined,
    rotationCursor: java.lang.String = null,
    selection: js.UndefOr[scala.Boolean] = js.undefined,
    selectionBorderColor: java.lang.String = null,
    selectionColor: java.lang.String = null,
    selectionDashArray: js.Array[scala.Double] = null,
    selectionFullyContained: js.UndefOr[scala.Boolean] = js.undefined,
    selectionKey: java.lang.String | js.Array[java.lang.String] = null,
    selectionLineWidth: scala.Int | scala.Double = null,
    skipOffscreen: js.UndefOr[scala.Boolean] = js.undefined,
    skipTargetFind: js.UndefOr[scala.Boolean] = js.undefined,
    snapAngle: scala.Int | scala.Double = null,
    snapThreshold: scala.Int | scala.Double = null,
    stateful: js.UndefOr[scala.Boolean] = js.undefined,
    stopContextMenu: js.UndefOr[scala.Boolean] = js.undefined,
    svgViewportTransformation: js.UndefOr[scala.Boolean] = js.undefined,
    targetFindTolerance: scala.Int | scala.Double = null,
    uniScaleKey: java.lang.String = null,
    uniScaleTransform: js.UndefOr[scala.Boolean] = js.undefined,
    viewportTransform: js.Array[scala.Double] = null,
    vptCoords: fabricLib.Anon_BlBrTl = null
  ): ICanvasOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTouchScrolling)) __obj.updateDynamic("allowTouchScrolling")(allowTouchScrolling)
    if (altActionKey != null) __obj.updateDynamic("altActionKey")(altActionKey)
    if (altSelectionKey != null) __obj.updateDynamic("altSelectionKey")(altSelectionKey)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundVpt)) __obj.updateDynamic("backgroundVpt")(backgroundVpt)
    if (centeredKey != null) __obj.updateDynamic("centeredKey")(centeredKey)
    if (!js.isUndefined(centeredRotation)) __obj.updateDynamic("centeredRotation")(centeredRotation)
    if (!js.isUndefined(centeredScaling)) __obj.updateDynamic("centeredScaling")(centeredScaling)
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath)
    if (clipTo != null) __obj.updateDynamic("clipTo")(js.Any.fromFunction1(clipTo))
    if (containerClass != null) __obj.updateDynamic("containerClass")(containerClass)
    if (!js.isUndefined(controlsAboveOverlay)) __obj.updateDynamic("controlsAboveOverlay")(controlsAboveOverlay)
    if (defaultCursor != null) __obj.updateDynamic("defaultCursor")(defaultCursor)
    if (!js.isUndefined(enableRetinaScaling)) __obj.updateDynamic("enableRetinaScaling")(enableRetinaScaling)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(fireMiddleClick)) __obj.updateDynamic("fireMiddleClick")(fireMiddleClick)
    if (!js.isUndefined(fireRightClick)) __obj.updateDynamic("fireRightClick")(fireRightClick)
    if (freeDrawingCursor != null) __obj.updateDynamic("freeDrawingCursor")(freeDrawingCursor)
    if (hoverCursor != null) __obj.updateDynamic("hoverCursor")(hoverCursor)
    if (!js.isUndefined(imageSmoothingEnabled)) __obj.updateDynamic("imageSmoothingEnabled")(imageSmoothingEnabled)
    if (!js.isUndefined(includeDefaultValues)) __obj.updateDynamic("includeDefaultValues")(includeDefaultValues)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (!js.isUndefined(isDrawingMode)) __obj.updateDynamic("isDrawingMode")(isDrawingMode)
    if (moveCursor != null) __obj.updateDynamic("moveCursor")(moveCursor)
    if (notAllowedCursor != null) __obj.updateDynamic("notAllowedCursor")(notAllowedCursor)
    if (overlayColor != null) __obj.updateDynamic("overlayColor")(overlayColor.asInstanceOf[js.Any])
    if (overlayImage != null) __obj.updateDynamic("overlayImage")(overlayImage)
    if (!js.isUndefined(overlayVpt)) __obj.updateDynamic("overlayVpt")(overlayVpt)
    if (!js.isUndefined(perPixelTargetFind)) __obj.updateDynamic("perPixelTargetFind")(perPixelTargetFind)
    if (!js.isUndefined(preserveObjectStacking)) __obj.updateDynamic("preserveObjectStacking")(preserveObjectStacking)
    if (!js.isUndefined(renderOnAddRemove)) __obj.updateDynamic("renderOnAddRemove")(renderOnAddRemove)
    if (rotationCursor != null) __obj.updateDynamic("rotationCursor")(rotationCursor)
    if (!js.isUndefined(selection)) __obj.updateDynamic("selection")(selection)
    if (selectionBorderColor != null) __obj.updateDynamic("selectionBorderColor")(selectionBorderColor)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (selectionDashArray != null) __obj.updateDynamic("selectionDashArray")(selectionDashArray)
    if (!js.isUndefined(selectionFullyContained)) __obj.updateDynamic("selectionFullyContained")(selectionFullyContained)
    if (selectionKey != null) __obj.updateDynamic("selectionKey")(selectionKey.asInstanceOf[js.Any])
    if (selectionLineWidth != null) __obj.updateDynamic("selectionLineWidth")(selectionLineWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(skipOffscreen)) __obj.updateDynamic("skipOffscreen")(skipOffscreen)
    if (!js.isUndefined(skipTargetFind)) __obj.updateDynamic("skipTargetFind")(skipTargetFind)
    if (snapAngle != null) __obj.updateDynamic("snapAngle")(snapAngle.asInstanceOf[js.Any])
    if (snapThreshold != null) __obj.updateDynamic("snapThreshold")(snapThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful)
    if (!js.isUndefined(stopContextMenu)) __obj.updateDynamic("stopContextMenu")(stopContextMenu)
    if (!js.isUndefined(svgViewportTransformation)) __obj.updateDynamic("svgViewportTransformation")(svgViewportTransformation)
    if (targetFindTolerance != null) __obj.updateDynamic("targetFindTolerance")(targetFindTolerance.asInstanceOf[js.Any])
    if (uniScaleKey != null) __obj.updateDynamic("uniScaleKey")(uniScaleKey)
    if (!js.isUndefined(uniScaleTransform)) __obj.updateDynamic("uniScaleTransform")(uniScaleTransform)
    if (viewportTransform != null) __obj.updateDynamic("viewportTransform")(viewportTransform)
    if (vptCoords != null) __obj.updateDynamic("vptCoords")(vptCoords)
    __obj.asInstanceOf[ICanvasOptions]
  }
}

