package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var altActionKey: js.UndefOr[String] = js.native
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
  var altSelectionKey: js.UndefOr[String | Null] = js.native
  /**
    * Indicates which key enable centered Transform
    * values: 'altKey', 'shiftKey', 'ctrlKey'.
    * If `null` or 'none' or any other string that is not a modifier key
    * feature is disabled feature disabled.
    * @since 1.6.2
    * @type String
    * @default
    */
  var centeredKey: js.UndefOr[String] = js.native
  /**
    * When true, objects use center point as the origin of rotate transformation.
    * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
    */
  var centeredRotation: js.UndefOr[Boolean] = js.native
  /**
    * When true, objects use center point as the origin of scale transformation.
    * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
    */
  var centeredScaling: js.UndefOr[Boolean] = js.native
  /**
    * Default element class that's given to wrapper (div) element of canvas
    */
  var containerClass: js.UndefOr[String] = js.native
  /**
    * Default cursor value used for the entire canvas
    */
  var defaultCursor: js.UndefOr[String] = js.native
  /**
    * Color of object's fill
    */
  var fill: js.UndefOr[String | Pattern | Gradient] = js.native
  /**
    * Indicates if the canvas can fire middle click events
    * @type Boolean
    * @since 1.7.8
    * @default
    */
  var fireMiddleClick: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if the canvas can fire right click events
    * @type Boolean
    * @since 1.6.5
    * @default
    */
  var fireRightClick: js.UndefOr[Boolean] = js.native
  /**
    * Cursor value used during free drawing
    */
  var freeDrawingCursor: js.UndefOr[String] = js.native
  /**
    * Canvas height
    * @type number
    * @default
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Default cursor value used when hovering over an object on canvas
    */
  var hoverCursor: js.UndefOr[String] = js.native
  /**
    * Indicates that canvas is interactive. This property should not be changed.
    */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
    * When true, mouse events on canvas (mousedown/mousemove/mouseup) result in free drawing.
    * After mousedown, mousemove creates a shape,
    * and then mouseup finalizes it and adds an instance of `fabric.Path` onto canvas.
    */
  var isDrawingMode: js.UndefOr[Boolean] = js.native
  /**
    * Default cursor value used when moving an object on canvas
    */
  var moveCursor: js.UndefOr[String] = js.native
  /**
    * Cursor value used for disabled elements ( corners with disabled action )
    * @type String
    * @since 2.0.0
    * @default
    */
  var notAllowedCursor: js.UndefOr[String] = js.native
  /**
    * When true, object detection happens on per-pixel basis rather than on per-bounding-box
    */
  var perPixelTargetFind: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether objects should remain in current stack position when selected.
    * When false objects are brought to top and rendered as part of the selection group
    * @type Boolean
    */
  var preserveObjectStacking: js.UndefOr[Boolean] = js.native
  /**
    * Cursor value used for rotation point
    */
  var rotationCursor: js.UndefOr[String] = js.native
  /**
    * Indicates whether group selection should be enabled
    */
  var selection: js.UndefOr[Boolean] = js.native
  /**
    * Color of the border of selection (usually slightly darker than color of selection itself)
    */
  var selectionBorderColor: js.UndefOr[String] = js.native
  /**
    * Color of selection
    */
  var selectionColor: js.UndefOr[String] = js.native
  /**
    * Default dash array pattern
    * If not empty the selection border is dashed
    */
  var selectionDashArray: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Select only shapes that are fully contained in the dragged selection rectangle.
    * @type Boolean
    * @default
    */
  var selectionFullyContained: js.UndefOr[Boolean] = js.native
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
  var selectionKey: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Width of a line used in object/group selection
    */
  var selectionLineWidth: js.UndefOr[Double] = js.native
  /**
    * When true, target detection is skipped when hovering over canvas. This can be used to improve performance.
    */
  var skipTargetFind: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the angle that an object will lock to while rotating.
    * @type Number
    * @since 1.6.7
    */
  var snapAngle: js.UndefOr[Double] = js.native
  /**
    * Indicates the distance from the snapAngle the rotation will lock to the snapAngle.
    * When `null`, the snapThreshold will default to the snapAngle.
    * @type null|Number
    * @since 1.6.7
    * @default
    */
  var snapThreshold: js.UndefOr[Null | Double] = js.native
  /**
    * Indicates if the right click on canvas can output the context menu or not
    * @type Boolean
    * @since 1.6.5
    * @default
    */
  var stopContextMenu: js.UndefOr[Boolean] = js.native
  /**
    * Number of pixels around target pixel to tolerate (consider active) during object detection
    */
  var targetFindTolerance: js.UndefOr[Double] = js.native
  /**
    * Keep track of the subTargets for Mouse Events
    * @type {Array.<fabric.Object>}
    * @since 3.6.0
    * @default
    */
  var targets: js.UndefOr[js.Array[Object]] = js.native
  /**
    * Indicates which key enable unproportional scaling
    * values: 'altKey', 'shiftKey', 'ctrlKey'.
    * If `null` or 'none' or any other string that is not a modifier key
    * feature is disabled feature disabled.
    * @since 1.6.2
    * @type String
    */
  var uniScaleKey: js.UndefOr[String] = js.native
  /**
    * When true, objects can be transformed by one side (unproportionally)
    * @type Boolean
    */
  var uniScaleTransform: js.UndefOr[Boolean] = js.native
  /**
    * Canvas width
    * @type number
    * @default
    */
  var width: js.UndefOr[Double] = js.native
}

object ICanvasOptions {
  @scala.inline
  def apply(): ICanvasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICanvasOptions]
  }
  @scala.inline
  implicit class ICanvasOptionsOps[Self <: ICanvasOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAltActionKey(value: String): Self = this.set("altActionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltActionKey: Self = this.set("altActionKey", js.undefined)
    @scala.inline
    def setAltSelectionKey(value: String): Self = this.set("altSelectionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAltSelectionKey: Self = this.set("altSelectionKey", js.undefined)
    @scala.inline
    def setAltSelectionKeyNull: Self = this.set("altSelectionKey", null)
    @scala.inline
    def setCenteredKey(value: String): Self = this.set("centeredKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenteredKey: Self = this.set("centeredKey", js.undefined)
    @scala.inline
    def setCenteredRotation(value: Boolean): Self = this.set("centeredRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenteredRotation: Self = this.set("centeredRotation", js.undefined)
    @scala.inline
    def setCenteredScaling(value: Boolean): Self = this.set("centeredScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenteredScaling: Self = this.set("centeredScaling", js.undefined)
    @scala.inline
    def setContainerClass(value: String): Self = this.set("containerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClass: Self = this.set("containerClass", js.undefined)
    @scala.inline
    def setDefaultCursor(value: String): Self = this.set("defaultCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCursor: Self = this.set("defaultCursor", js.undefined)
    @scala.inline
    def setFill(value: String | Pattern | Gradient): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFireMiddleClick(value: Boolean): Self = this.set("fireMiddleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFireMiddleClick: Self = this.set("fireMiddleClick", js.undefined)
    @scala.inline
    def setFireRightClick(value: Boolean): Self = this.set("fireRightClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFireRightClick: Self = this.set("fireRightClick", js.undefined)
    @scala.inline
    def setFreeDrawingCursor(value: String): Self = this.set("freeDrawingCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeDrawingCursor: Self = this.set("freeDrawingCursor", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHoverCursor(value: String): Self = this.set("hoverCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverCursor: Self = this.set("hoverCursor", js.undefined)
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    @scala.inline
    def setIsDrawingMode(value: Boolean): Self = this.set("isDrawingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDrawingMode: Self = this.set("isDrawingMode", js.undefined)
    @scala.inline
    def setMoveCursor(value: String): Self = this.set("moveCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveCursor: Self = this.set("moveCursor", js.undefined)
    @scala.inline
    def setNotAllowedCursor(value: String): Self = this.set("notAllowedCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotAllowedCursor: Self = this.set("notAllowedCursor", js.undefined)
    @scala.inline
    def setPerPixelTargetFind(value: Boolean): Self = this.set("perPixelTargetFind", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerPixelTargetFind: Self = this.set("perPixelTargetFind", js.undefined)
    @scala.inline
    def setPreserveObjectStacking(value: Boolean): Self = this.set("preserveObjectStacking", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveObjectStacking: Self = this.set("preserveObjectStacking", js.undefined)
    @scala.inline
    def setRotationCursor(value: String): Self = this.set("rotationCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationCursor: Self = this.set("rotationCursor", js.undefined)
    @scala.inline
    def setSelection(value: Boolean): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionBorderColor(value: String): Self = this.set("selectionBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionBorderColor: Self = this.set("selectionBorderColor", js.undefined)
    @scala.inline
    def setSelectionColor(value: String): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    @scala.inline
    def setSelectionDashArrayVarargs(value: Double*): Self = this.set("selectionDashArray", js.Array(value :_*))
    @scala.inline
    def setSelectionDashArray(value: js.Array[Double]): Self = this.set("selectionDashArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionDashArray: Self = this.set("selectionDashArray", js.undefined)
    @scala.inline
    def setSelectionFullyContained(value: Boolean): Self = this.set("selectionFullyContained", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionFullyContained: Self = this.set("selectionFullyContained", js.undefined)
    @scala.inline
    def setSelectionKeyVarargs(value: String*): Self = this.set("selectionKey", js.Array(value :_*))
    @scala.inline
    def setSelectionKey(value: String | js.Array[String]): Self = this.set("selectionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionKey: Self = this.set("selectionKey", js.undefined)
    @scala.inline
    def setSelectionLineWidth(value: Double): Self = this.set("selectionLineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionLineWidth: Self = this.set("selectionLineWidth", js.undefined)
    @scala.inline
    def setSkipTargetFind(value: Boolean): Self = this.set("skipTargetFind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipTargetFind: Self = this.set("skipTargetFind", js.undefined)
    @scala.inline
    def setSnapAngle(value: Double): Self = this.set("snapAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapAngle: Self = this.set("snapAngle", js.undefined)
    @scala.inline
    def setSnapThreshold(value: Double): Self = this.set("snapThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapThreshold: Self = this.set("snapThreshold", js.undefined)
    @scala.inline
    def setSnapThresholdNull: Self = this.set("snapThreshold", null)
    @scala.inline
    def setStopContextMenu(value: Boolean): Self = this.set("stopContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopContextMenu: Self = this.set("stopContextMenu", js.undefined)
    @scala.inline
    def setTargetFindTolerance(value: Double): Self = this.set("targetFindTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetFindTolerance: Self = this.set("targetFindTolerance", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Object*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[Object]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    @scala.inline
    def setUniScaleKey(value: String): Self = this.set("uniScaleKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniScaleKey: Self = this.set("uniScaleKey", js.undefined)
    @scala.inline
    def setUniScaleTransform(value: Boolean): Self = this.set("uniScaleTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniScaleTransform: Self = this.set("uniScaleTransform", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

