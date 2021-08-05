package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICanvasOptions
  extends StObject
     with IStaticCanvasOptions {
  
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
    * Canvas height
    * @type number
    * @default
    */
  var height: js.UndefOr[Double] = js.undefined
  
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
    * Keep track of the subTargets for Mouse Events
    * @type {Array.<fabric.Object>}
    * @since 3.6.0
    * @default
    */
  var targets: js.UndefOr[js.Array[Object]] = js.undefined
  
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
  
  /**
    * Canvas width
    * @type number
    * @default
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ICanvasOptions {
  
  inline def apply(): ICanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvasOptions]
  }
  
  extension [Self <: ICanvasOptions](x: Self) {
    
    inline def setAltActionKey(value: String): Self = StObject.set(x, "altActionKey", value.asInstanceOf[js.Any])
    
    inline def setAltActionKeyUndefined: Self = StObject.set(x, "altActionKey", js.undefined)
    
    inline def setAltSelectionKey(value: String): Self = StObject.set(x, "altSelectionKey", value.asInstanceOf[js.Any])
    
    inline def setAltSelectionKeyNull: Self = StObject.set(x, "altSelectionKey", null)
    
    inline def setAltSelectionKeyUndefined: Self = StObject.set(x, "altSelectionKey", js.undefined)
    
    inline def setCenteredKey(value: String): Self = StObject.set(x, "centeredKey", value.asInstanceOf[js.Any])
    
    inline def setCenteredKeyUndefined: Self = StObject.set(x, "centeredKey", js.undefined)
    
    inline def setCenteredRotation(value: Boolean): Self = StObject.set(x, "centeredRotation", value.asInstanceOf[js.Any])
    
    inline def setCenteredRotationUndefined: Self = StObject.set(x, "centeredRotation", js.undefined)
    
    inline def setCenteredScaling(value: Boolean): Self = StObject.set(x, "centeredScaling", value.asInstanceOf[js.Any])
    
    inline def setCenteredScalingUndefined: Self = StObject.set(x, "centeredScaling", js.undefined)
    
    inline def setContainerClass(value: String): Self = StObject.set(x, "containerClass", value.asInstanceOf[js.Any])
    
    inline def setContainerClassUndefined: Self = StObject.set(x, "containerClass", js.undefined)
    
    inline def setDefaultCursor(value: String): Self = StObject.set(x, "defaultCursor", value.asInstanceOf[js.Any])
    
    inline def setDefaultCursorUndefined: Self = StObject.set(x, "defaultCursor", js.undefined)
    
    inline def setFill(value: String | Pattern | Gradient): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFireMiddleClick(value: Boolean): Self = StObject.set(x, "fireMiddleClick", value.asInstanceOf[js.Any])
    
    inline def setFireMiddleClickUndefined: Self = StObject.set(x, "fireMiddleClick", js.undefined)
    
    inline def setFireRightClick(value: Boolean): Self = StObject.set(x, "fireRightClick", value.asInstanceOf[js.Any])
    
    inline def setFireRightClickUndefined: Self = StObject.set(x, "fireRightClick", js.undefined)
    
    inline def setFreeDrawingCursor(value: String): Self = StObject.set(x, "freeDrawingCursor", value.asInstanceOf[js.Any])
    
    inline def setFreeDrawingCursorUndefined: Self = StObject.set(x, "freeDrawingCursor", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHoverCursor(value: String): Self = StObject.set(x, "hoverCursor", value.asInstanceOf[js.Any])
    
    inline def setHoverCursorUndefined: Self = StObject.set(x, "hoverCursor", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setIsDrawingMode(value: Boolean): Self = StObject.set(x, "isDrawingMode", value.asInstanceOf[js.Any])
    
    inline def setIsDrawingModeUndefined: Self = StObject.set(x, "isDrawingMode", js.undefined)
    
    inline def setMoveCursor(value: String): Self = StObject.set(x, "moveCursor", value.asInstanceOf[js.Any])
    
    inline def setMoveCursorUndefined: Self = StObject.set(x, "moveCursor", js.undefined)
    
    inline def setNotAllowedCursor(value: String): Self = StObject.set(x, "notAllowedCursor", value.asInstanceOf[js.Any])
    
    inline def setNotAllowedCursorUndefined: Self = StObject.set(x, "notAllowedCursor", js.undefined)
    
    inline def setPerPixelTargetFind(value: Boolean): Self = StObject.set(x, "perPixelTargetFind", value.asInstanceOf[js.Any])
    
    inline def setPerPixelTargetFindUndefined: Self = StObject.set(x, "perPixelTargetFind", js.undefined)
    
    inline def setPreserveObjectStacking(value: Boolean): Self = StObject.set(x, "preserveObjectStacking", value.asInstanceOf[js.Any])
    
    inline def setPreserveObjectStackingUndefined: Self = StObject.set(x, "preserveObjectStacking", js.undefined)
    
    inline def setRotationCursor(value: String): Self = StObject.set(x, "rotationCursor", value.asInstanceOf[js.Any])
    
    inline def setRotationCursorUndefined: Self = StObject.set(x, "rotationCursor", js.undefined)
    
    inline def setSelection(value: Boolean): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionBorderColor(value: String): Self = StObject.set(x, "selectionBorderColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionBorderColorUndefined: Self = StObject.set(x, "selectionBorderColor", js.undefined)
    
    inline def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    inline def setSelectionDashArray(value: js.Array[Double]): Self = StObject.set(x, "selectionDashArray", value.asInstanceOf[js.Any])
    
    inline def setSelectionDashArrayUndefined: Self = StObject.set(x, "selectionDashArray", js.undefined)
    
    inline def setSelectionDashArrayVarargs(value: Double*): Self = StObject.set(x, "selectionDashArray", js.Array(value :_*))
    
    inline def setSelectionFullyContained(value: Boolean): Self = StObject.set(x, "selectionFullyContained", value.asInstanceOf[js.Any])
    
    inline def setSelectionFullyContainedUndefined: Self = StObject.set(x, "selectionFullyContained", js.undefined)
    
    inline def setSelectionKey(value: String | js.Array[String]): Self = StObject.set(x, "selectionKey", value.asInstanceOf[js.Any])
    
    inline def setSelectionKeyUndefined: Self = StObject.set(x, "selectionKey", js.undefined)
    
    inline def setSelectionKeyVarargs(value: String*): Self = StObject.set(x, "selectionKey", js.Array(value :_*))
    
    inline def setSelectionLineWidth(value: Double): Self = StObject.set(x, "selectionLineWidth", value.asInstanceOf[js.Any])
    
    inline def setSelectionLineWidthUndefined: Self = StObject.set(x, "selectionLineWidth", js.undefined)
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSkipTargetFind(value: Boolean): Self = StObject.set(x, "skipTargetFind", value.asInstanceOf[js.Any])
    
    inline def setSkipTargetFindUndefined: Self = StObject.set(x, "skipTargetFind", js.undefined)
    
    inline def setSnapAngle(value: Double): Self = StObject.set(x, "snapAngle", value.asInstanceOf[js.Any])
    
    inline def setSnapAngleUndefined: Self = StObject.set(x, "snapAngle", js.undefined)
    
    inline def setSnapThreshold(value: Double): Self = StObject.set(x, "snapThreshold", value.asInstanceOf[js.Any])
    
    inline def setSnapThresholdNull: Self = StObject.set(x, "snapThreshold", null)
    
    inline def setSnapThresholdUndefined: Self = StObject.set(x, "snapThreshold", js.undefined)
    
    inline def setStopContextMenu(value: Boolean): Self = StObject.set(x, "stopContextMenu", value.asInstanceOf[js.Any])
    
    inline def setStopContextMenuUndefined: Self = StObject.set(x, "stopContextMenu", js.undefined)
    
    inline def setTargetFindTolerance(value: Double): Self = StObject.set(x, "targetFindTolerance", value.asInstanceOf[js.Any])
    
    inline def setTargetFindToleranceUndefined: Self = StObject.set(x, "targetFindTolerance", js.undefined)
    
    inline def setTargets(value: js.Array[Object]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: Object*): Self = StObject.set(x, "targets", js.Array(value :_*))
    
    inline def setUniScaleKey(value: String): Self = StObject.set(x, "uniScaleKey", value.asInstanceOf[js.Any])
    
    inline def setUniScaleKeyUndefined: Self = StObject.set(x, "uniScaleKey", js.undefined)
    
    inline def setUniScaleTransform(value: Boolean): Self = StObject.set(x, "uniScaleTransform", value.asInstanceOf[js.Any])
    
    inline def setUniScaleTransformUndefined: Self = StObject.set(x, "uniScaleTransform", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
