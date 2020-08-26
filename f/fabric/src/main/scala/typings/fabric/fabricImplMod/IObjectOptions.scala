package typings.fabric.fabricImplMod

import typings.fabric.anon.Ml
import typings.fabric.anon.Tr
import typings.fabric.fabricStrings.circle
import typings.fabric.fabricStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectOptions extends js.Object {
  /**
    * Describe object's corner position in canvas object absolute coordinates
    * properties are tl,tr,bl,br and describe the four main corner.
    * each property is an object with x, y, instance of Fabric.Point.
    * The coordinates depends from this properties: width, height, scaleX, scaleY
    * skewX, skewY, angle, strokeWidth, top, left.
    * Those coordinates are usefull to understand where an object is. They get updated
    * with oCoords but they do not need to be updated when zoom or panning change.
    * The coordinates get updated with @method setCoords.
    * You can calculate them without updating with @method calcCoords(true);
    * @memberOf fabric.Object.prototype
    */
  var aCoords: js.UndefOr[Tr] = js.native
  /**
    * Meaningful ONLY when the object is used as clipPath.
    * if true, the clipPath will have its top and left relative to canvas, and will
    * not be influenced by the object transform. This will make the clipPath relative
    * to the canvas, but clipping just a particular object.
    * WARNING this is beta, this feature may change or be renamed.
    * since 2.4.0
    * @type boolean
    * @default false
    */
  var absolutePositioned: js.UndefOr[Boolean] = js.native
  /**
    * Angle of rotation of an object (in degrees)
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * Background color of an object. Only works with text objects at the moment.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * Color of controlling borders of an object (when it's active)
    */
  var borderColor: js.UndefOr[String] = js.native
  /**
    * Array specifying dash pattern of an object's border (hasBorder must be true)
    */
  var borderDashArray: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Opacity of object's controlling borders when object is active and moving
    */
  var borderOpacityWhenMoving: js.UndefOr[Double] = js.native
  /**
    * Scale factor of object's controlling borders
    */
  var borderScaleFactor: js.UndefOr[Double] = js.native
  /**
    * List of properties to consider when checking if cache needs refresh
    * Those properties are checked by statefullCache ON ( or lazy mode if we want ) or from single
    * calls to Object.set(key, value). If the key is in this list, the object is marked as dirty
    * and refreshed at the next render
    * @type Array
    */
  var cacheProperties: js.UndefOr[js.Array[String]] = js.native
  /**
    * The canvas the object belongs to
    */
  var canvas: js.UndefOr[Canvas] = js.native
  /**
    * When true, this object will use center point as the origin of transformation
    * when being rotated via the controls.
    * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
    */
  var centeredRotation: js.UndefOr[Boolean] = js.native
  /**
    * When true, this object will use center point as the origin of transformation
    * when being scaled via the controls.
    * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
    */
  var centeredScaling: js.UndefOr[Boolean] = js.native
  /**
    * A fabricObject that, without stroke define a clipping area with their shape. filled in black
    * the clipPath object gets used when the object has rendered, and the context is placed in the center
    * of the object cacheCanvas.
    * If you want 0,0 of a clipPath to align with an object center, use clipPath.originX/Y to 'center'
    */
  var clipPath: js.UndefOr[Object] = js.native
  /**
    * Function that determines clipping of an object (context is passed as a first argument)
    * Note that context origin is at the object's center point (not left/top corner)
    */
  var clipTo: js.UndefOr[js.Function] = js.native
  /**
    * Color of controlling corners of an object (when it's active)
    */
  var cornerColor: js.UndefOr[String] = js.native
  /**
    * Array specifying dash pattern of an object's control (hasBorder must be true)
    */
  var cornerDashArray: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Size of object's controlling corners (in pixels)
    */
  var cornerSize: js.UndefOr[Double] = js.native
  /**
    * Color of controlling corners of an object (when it's active and transparentCorners false)
    */
  var cornerStrokeColor: js.UndefOr[String] = js.native
  /**
    * Specify style of control, 'rect' or 'circle'
    */
  var cornerStyle: js.UndefOr[rect | circle] = js.native
  /**
    * Not used by fabric, just for convenience
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * When set to `true`, object's cache will be rerendered next render call.
    */
  var dirty: js.UndefOr[Boolean] = js.native
  /**
    * When set to `false`, an object can not be a target of events. All events propagate through it. Introduced in v1.3.4
    */
  var evented: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, object is not exported in OBJECT/JSON
    * since 1.6.3
    * @type Boolean
    * @default
    */
  var excludeFromExport: js.UndefOr[Boolean] = js.native
  /**
    * Color of object's fill
    */
  var fill: js.UndefOr[String | Pattern | Gradient] = js.native
  /**
    * Fill rule used to fill an object
    * accepted values are nonzero, evenodd
    * Backwards incompatibility note: This property was used for setting globalCompositeOperation until v1.4.12, use `globalCompositeOperation` instead
    */
  var fillRule: js.UndefOr[String] = js.native
  /**
    * When true, an object is rendered as flipped horizontally
    */
  var flipX: js.UndefOr[Boolean] = js.native
  /**
    * When true, an object is rendered as flipped vertically
    */
  var flipY: js.UndefOr[Boolean] = js.native
  /**
    * Composite rule used for canvas globalCompositeOperation
    */
  var globalCompositeOperation: js.UndefOr[String] = js.native
  /**
    * The group the object is part of
    */
  var group: js.UndefOr[Group] = js.native
  /**
    * When set to `false`, object's controlling borders are not rendered
    */
  var hasBorders: js.UndefOr[Boolean] = js.native
  /**
    * When set to `false`, object's controls are not displayed and can not be used to manipulate object
    */
  var hasControls: js.UndefOr[Boolean] = js.native
  /**
    * When set to `false`, object's controlling rotating point will not be visible or selectable
    */
  var hasRotatingPoint: js.UndefOr[Boolean] = js.native
  /**
    * Object height
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Default cursor value used when hovering over this object on canvas
    */
  var hoverCursor: js.UndefOr[String] = js.native
  /**
    * When `false`, default object's values are not included in its serialization
    */
  var includeDefaultValues: js.UndefOr[Boolean] = js.native
  /**
    * Meaningful ONLY when the object is used as clipPath.
    * if true, the clipPath will make the object clip to the outside of the clipPath
    * since 2.4.0
    * @type boolean
    * @default false
    */
  var inverted: js.UndefOr[Boolean] = js.native
  /**
    * Left position of an object. Note that by default it's relative to object center. You can change this by setting originX={left/center/right}
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * When `true`, object horizontal movement is locked
    */
  var lockMovementX: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, object vertical movement is locked
    */
  var lockMovementY: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, object rotation is locked
    */
  var lockRotation: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, object cannot be flipped by scaling into negative values
    */
  var lockScalingFlip: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, object horizontal scaling is locked
    */
  var lockScalingX: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, object vertical scaling is locked
    */
  var lockScalingY: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, object horizontal skewing is locked
    * @type Boolean
    */
  var lockSkewingX: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, object vertical skewing is locked
    * @type Boolean
    */
  var lockSkewingY: js.UndefOr[Boolean] = js.native
  /**
    * When `true`, object non-uniform scaling is locked
    */
  var lockUniScaling: js.UndefOr[Boolean] = js.native
  /**
    * storage for object full transform matrix
    */
  var matrixCache: js.UndefOr[js.Any] = js.native
  /**
    * Minimum allowed scale value of an object
    */
  var minScaleLimit: js.UndefOr[Double] = js.native
  /**
    * Default cursor value used when moving an object on canvas
    */
  var moveCursor: js.UndefOr[String] = js.native
  /**
    * Not used by fabric, just for convenience
    */
  var name: js.UndefOr[String] = js.native
  /**
    * When `true`, cache does not get updated during scaling. The picture will get blocky if scaled
    * too much and will be redrawn with correct details at the end of scaling.
    * this setting is performance and application dependant.
    * default to true
    * since 1.7.0
    * @type Boolean
    */
  var noScaleCache: js.UndefOr[Boolean] = js.native
  /**
    * Describe object's corner position in canvas element coordinates.
    * properties are tl,mt,tr,ml,mr,bl,mb,br,mtr for the main controls.
    * each property is an object with x, y and corner.
    * The `corner` property contains in a similar manner the 4 points of the
    * interactive area of the corner.
    * The coordinates depends from this properties: width, height, scaleX, scaleY
    * skewX, skewY, angle, strokeWidth, viewportTransform, top, left, padding.
    * The coordinates get updated with @method setCoords.
    * You can calculate them without updating with @method calcCoords;
    * @memberOf fabric.Object.prototype
    */
  var oCoords: js.UndefOr[Ml] = js.native
  /**
    * When `true`, object is cached on an additional canvas.
    */
  var objectCaching: js.UndefOr[Boolean] = js.native
  /**
    * Opacity of an object
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * Horizontal origin of transformation of an object (one of "left", "right", "center")
    */
  var originX: js.UndefOr[String] = js.native
  /**
    * Vertical origin of transformation of an object (one of "top", "bottom", "center")
    */
  var originY: js.UndefOr[String] = js.native
  /**
    * storage for object transform matrix
    */
  var ownMatrixCache: js.UndefOr[js.Any] = js.native
  /**
    * Padding between object and its controlling borders (in pixels)
    */
  var padding: js.UndefOr[Double] = js.native
  /**
    * Determines if the fill or the stroke is drawn first (one of "fill" or "stroke")
    * @type String
    */
  var paintFirst: js.UndefOr[String] = js.native
  /**
    * When set to `true`, objects are "found" on canvas on per-pixel basis rather than according to bounding box
    */
  var perPixelTargetFind: js.UndefOr[Boolean] = js.native
  /**
    * Offset for object's controlling rotating point (when enabled via `hasRotatingPoint`)
    */
  var rotatingPointOffset: js.UndefOr[Double] = js.native
  /**
    * Object scale factor (horizontal)
    */
  var scaleX: js.UndefOr[Double] = js.native
  /**
    * Object scale factor (vertical)
    */
  var scaleY: js.UndefOr[Double] = js.native
  /**
    * When set to `false`, an object can not be selected for modification (using either point-click-based or group-based selection).
    * But events still fire on it.
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * Selection Background color of an object. colored layer behind the object when it is active.
    * does not mix good with globalCompositeOperation methods.
    * @type String
    */
  var selectionBackgroundColor: js.UndefOr[String] = js.native
  /**
    * Shadow object representing shadow of this shape
    */
  var shadow: js.UndefOr[Shadow | String] = js.native
  /**
    * Object skew factor (horizontal)
    */
  var skewX: js.UndefOr[Double] = js.native
  /**
    * Object skew factor (vertical)
    */
  var skewY: js.UndefOr[Double] = js.native
  /**
    * Indicates the angle that an object will lock to while rotating. Can get from canvas.
    */
  var snapAngle: js.UndefOr[Double] = js.native
  /**
    * Indicates the distance from the snapAngle the rotation will lock to the snapAngle. Can get from canvas.
    */
  var snapThreshold: js.UndefOr[Null | Double] = js.native
  /**
    * List of properties to consider when checking if state
    * of an object is changed (fabric.Object#hasStateChanged)
    * as well as for history (undo/redo) purposes
    * @type Array
    */
  var stateProperties: js.UndefOr[js.Array[String]] = js.native
  /**
    * When `true`, object properties are checked for cache invalidation. In some particular
    * situation you may want this to be disabled ( spray brush, very big, groups)
    * or if your application does not allow you to modify properties for groups child you want
    * to disable it for groups.
    * default to false
    * since 1.7.0
    * @type Boolean
    * @default false
    */
  var statefullCache: js.UndefOr[Boolean] = js.native
  /**
    * When defined, an object is rendered via stroke and this property specifies its color
    */
  var stroke: js.UndefOr[String] = js.native
  /**
    * Array specifying dash pattern of an object's stroke (stroke must be defined)
    */
  var strokeDashArray: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Line offset of an object's stroke
    * @type Number
    * @default
    */
  var strokeDashOffset: js.UndefOr[Double] = js.native
  /**
    * Line endings style of an object's stroke (one of "butt", "round", "square")
    */
  var strokeLineCap: js.UndefOr[String] = js.native
  /**
    * Corner style of an object's stroke (one of "bevil", "round", "miter")
    */
  var strokeLineJoin: js.UndefOr[String] = js.native
  /**
    * Maximum miter length (used for strokeLineJoin = "miter") of an object's stroke
    */
  var strokeMiterLimit: js.UndefOr[Double] = js.native
  /**
    * When `false`, the stoke width will scale with the object.
    * When `true`, the stroke will always match the exact pixel size entered for stroke width.
    * default to false
    * @since 2.6.0
    * @type Boolean
    * @default false
    * @type Boolean
    */
  var strokeUniform: js.UndefOr[Boolean] = js.native
  /**
    * Width of a stroke used to render this object
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  /**
    * Top position of an object. Note that by default it's relative to object center. You can change this by setting originY={top/center/bottom}
    */
  var top: js.UndefOr[Double] = js.native
  /**
    * Transform matrix (similar to SVG's transform matrix)
    */
  var transformMatrix: js.UndefOr[js.Array[_]] = js.native
  /**
    * When true, object's controlling corners are rendered as transparent inside (i.e. stroke instead of fill)
    */
  var transparentCorners: js.UndefOr[Boolean] = js.native
  /**
    * Type of an object (rect, circle, path, etc.).
    * Note that this property is meant to be read-only and not meant to be modified.
    * If you modify, certain parts of Fabric (such as JSON loading) won't work correctly.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * When set to `false`, an object is not rendered on canvas
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Object width
    */
  var width: js.UndefOr[Double] = js.native
}

object IObjectOptions {
  @scala.inline
  def apply(): IObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObjectOptions]
  }
  @scala.inline
  implicit class IObjectOptionsOps[Self <: IObjectOptions] (val x: Self) extends AnyVal {
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
    def setACoords(value: Tr): Self = this.set("aCoords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteACoords: Self = this.set("aCoords", js.undefined)
    @scala.inline
    def setAbsolutePositioned(value: Boolean): Self = this.set("absolutePositioned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolutePositioned: Self = this.set("absolutePositioned", js.undefined)
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderDashArrayVarargs(value: Double*): Self = this.set("borderDashArray", js.Array(value :_*))
    @scala.inline
    def setBorderDashArray(value: js.Array[Double]): Self = this.set("borderDashArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderDashArray: Self = this.set("borderDashArray", js.undefined)
    @scala.inline
    def setBorderOpacityWhenMoving(value: Double): Self = this.set("borderOpacityWhenMoving", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderOpacityWhenMoving: Self = this.set("borderOpacityWhenMoving", js.undefined)
    @scala.inline
    def setBorderScaleFactor(value: Double): Self = this.set("borderScaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderScaleFactor: Self = this.set("borderScaleFactor", js.undefined)
    @scala.inline
    def setCachePropertiesVarargs(value: String*): Self = this.set("cacheProperties", js.Array(value :_*))
    @scala.inline
    def setCacheProperties(value: js.Array[String]): Self = this.set("cacheProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheProperties: Self = this.set("cacheProperties", js.undefined)
    @scala.inline
    def setCanvas(value: Canvas): Self = this.set("canvas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    @scala.inline
    def setCenteredRotation(value: Boolean): Self = this.set("centeredRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenteredRotation: Self = this.set("centeredRotation", js.undefined)
    @scala.inline
    def setCenteredScaling(value: Boolean): Self = this.set("centeredScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenteredScaling: Self = this.set("centeredScaling", js.undefined)
    @scala.inline
    def setClipPath(value: Object): Self = this.set("clipPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipPath: Self = this.set("clipPath", js.undefined)
    @scala.inline
    def setClipTo(value: js.Function): Self = this.set("clipTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClipTo: Self = this.set("clipTo", js.undefined)
    @scala.inline
    def setCornerColor(value: String): Self = this.set("cornerColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerColor: Self = this.set("cornerColor", js.undefined)
    @scala.inline
    def setCornerDashArrayVarargs(value: Double*): Self = this.set("cornerDashArray", js.Array(value :_*))
    @scala.inline
    def setCornerDashArray(value: js.Array[Double]): Self = this.set("cornerDashArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerDashArray: Self = this.set("cornerDashArray", js.undefined)
    @scala.inline
    def setCornerSize(value: Double): Self = this.set("cornerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerSize: Self = this.set("cornerSize", js.undefined)
    @scala.inline
    def setCornerStrokeColor(value: String): Self = this.set("cornerStrokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerStrokeColor: Self = this.set("cornerStrokeColor", js.undefined)
    @scala.inline
    def setCornerStyle(value: rect | circle): Self = this.set("cornerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCornerStyle: Self = this.set("cornerStyle", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirty: Self = this.set("dirty", js.undefined)
    @scala.inline
    def setEvented(value: Boolean): Self = this.set("evented", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvented: Self = this.set("evented", js.undefined)
    @scala.inline
    def setExcludeFromExport(value: Boolean): Self = this.set("excludeFromExport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeFromExport: Self = this.set("excludeFromExport", js.undefined)
    @scala.inline
    def setFill(value: String | Pattern | Gradient): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setFillRule(value: String): Self = this.set("fillRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillRule: Self = this.set("fillRule", js.undefined)
    @scala.inline
    def setFlipX(value: Boolean): Self = this.set("flipX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipX: Self = this.set("flipX", js.undefined)
    @scala.inline
    def setFlipY(value: Boolean): Self = this.set("flipY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipY: Self = this.set("flipY", js.undefined)
    @scala.inline
    def setGlobalCompositeOperation(value: String): Self = this.set("globalCompositeOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalCompositeOperation: Self = this.set("globalCompositeOperation", js.undefined)
    @scala.inline
    def setGroup(value: Group): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHasBorders(value: Boolean): Self = this.set("hasBorders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasBorders: Self = this.set("hasBorders", js.undefined)
    @scala.inline
    def setHasControls(value: Boolean): Self = this.set("hasControls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasControls: Self = this.set("hasControls", js.undefined)
    @scala.inline
    def setHasRotatingPoint(value: Boolean): Self = this.set("hasRotatingPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasRotatingPoint: Self = this.set("hasRotatingPoint", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHoverCursor(value: String): Self = this.set("hoverCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverCursor: Self = this.set("hoverCursor", js.undefined)
    @scala.inline
    def setIncludeDefaultValues(value: Boolean): Self = this.set("includeDefaultValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDefaultValues: Self = this.set("includeDefaultValues", js.undefined)
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLockMovementX(value: Boolean): Self = this.set("lockMovementX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockMovementX: Self = this.set("lockMovementX", js.undefined)
    @scala.inline
    def setLockMovementY(value: Boolean): Self = this.set("lockMovementY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockMovementY: Self = this.set("lockMovementY", js.undefined)
    @scala.inline
    def setLockRotation(value: Boolean): Self = this.set("lockRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockRotation: Self = this.set("lockRotation", js.undefined)
    @scala.inline
    def setLockScalingFlip(value: Boolean): Self = this.set("lockScalingFlip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScalingFlip: Self = this.set("lockScalingFlip", js.undefined)
    @scala.inline
    def setLockScalingX(value: Boolean): Self = this.set("lockScalingX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScalingX: Self = this.set("lockScalingX", js.undefined)
    @scala.inline
    def setLockScalingY(value: Boolean): Self = this.set("lockScalingY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockScalingY: Self = this.set("lockScalingY", js.undefined)
    @scala.inline
    def setLockSkewingX(value: Boolean): Self = this.set("lockSkewingX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockSkewingX: Self = this.set("lockSkewingX", js.undefined)
    @scala.inline
    def setLockSkewingY(value: Boolean): Self = this.set("lockSkewingY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockSkewingY: Self = this.set("lockSkewingY", js.undefined)
    @scala.inline
    def setLockUniScaling(value: Boolean): Self = this.set("lockUniScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLockUniScaling: Self = this.set("lockUniScaling", js.undefined)
    @scala.inline
    def setMatrixCache(value: js.Any): Self = this.set("matrixCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatrixCache: Self = this.set("matrixCache", js.undefined)
    @scala.inline
    def setMinScaleLimit(value: Double): Self = this.set("minScaleLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinScaleLimit: Self = this.set("minScaleLimit", js.undefined)
    @scala.inline
    def setMoveCursor(value: String): Self = this.set("moveCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveCursor: Self = this.set("moveCursor", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNoScaleCache(value: Boolean): Self = this.set("noScaleCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoScaleCache: Self = this.set("noScaleCache", js.undefined)
    @scala.inline
    def setOCoords(value: Ml): Self = this.set("oCoords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOCoords: Self = this.set("oCoords", js.undefined)
    @scala.inline
    def setObjectCaching(value: Boolean): Self = this.set("objectCaching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectCaching: Self = this.set("objectCaching", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setOriginX(value: String): Self = this.set("originX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginX: Self = this.set("originX", js.undefined)
    @scala.inline
    def setOriginY(value: String): Self = this.set("originY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginY: Self = this.set("originY", js.undefined)
    @scala.inline
    def setOwnMatrixCache(value: js.Any): Self = this.set("ownMatrixCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnMatrixCache: Self = this.set("ownMatrixCache", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaintFirst(value: String): Self = this.set("paintFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaintFirst: Self = this.set("paintFirst", js.undefined)
    @scala.inline
    def setPerPixelTargetFind(value: Boolean): Self = this.set("perPixelTargetFind", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerPixelTargetFind: Self = this.set("perPixelTargetFind", js.undefined)
    @scala.inline
    def setRotatingPointOffset(value: Double): Self = this.set("rotatingPointOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotatingPointOffset: Self = this.set("rotatingPointOffset", js.undefined)
    @scala.inline
    def setScaleX(value: Double): Self = this.set("scaleX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleX: Self = this.set("scaleX", js.undefined)
    @scala.inline
    def setScaleY(value: Double): Self = this.set("scaleY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleY: Self = this.set("scaleY", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelectionBackgroundColor(value: String): Self = this.set("selectionBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionBackgroundColor: Self = this.set("selectionBackgroundColor", js.undefined)
    @scala.inline
    def setShadow(value: Shadow | String): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setSkewX(value: Double): Self = this.set("skewX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewX: Self = this.set("skewX", js.undefined)
    @scala.inline
    def setSkewY(value: Double): Self = this.set("skewY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkewY: Self = this.set("skewY", js.undefined)
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
    def setStatePropertiesVarargs(value: String*): Self = this.set("stateProperties", js.Array(value :_*))
    @scala.inline
    def setStateProperties(value: js.Array[String]): Self = this.set("stateProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateProperties: Self = this.set("stateProperties", js.undefined)
    @scala.inline
    def setStatefullCache(value: Boolean): Self = this.set("statefullCache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatefullCache: Self = this.set("statefullCache", js.undefined)
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    @scala.inline
    def setStrokeDashArrayVarargs(value: Double*): Self = this.set("strokeDashArray", js.Array(value :_*))
    @scala.inline
    def setStrokeDashArray(value: js.Array[Double]): Self = this.set("strokeDashArray", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDashArray: Self = this.set("strokeDashArray", js.undefined)
    @scala.inline
    def setStrokeDashOffset(value: Double): Self = this.set("strokeDashOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeDashOffset: Self = this.set("strokeDashOffset", js.undefined)
    @scala.inline
    def setStrokeLineCap(value: String): Self = this.set("strokeLineCap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLineCap: Self = this.set("strokeLineCap", js.undefined)
    @scala.inline
    def setStrokeLineJoin(value: String): Self = this.set("strokeLineJoin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeLineJoin: Self = this.set("strokeLineJoin", js.undefined)
    @scala.inline
    def setStrokeMiterLimit(value: Double): Self = this.set("strokeMiterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeMiterLimit: Self = this.set("strokeMiterLimit", js.undefined)
    @scala.inline
    def setStrokeUniform(value: Boolean): Self = this.set("strokeUniform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeUniform: Self = this.set("strokeUniform", js.undefined)
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setTransformMatrixVarargs(value: js.Any*): Self = this.set("transformMatrix", js.Array(value :_*))
    @scala.inline
    def setTransformMatrix(value: js.Array[_]): Self = this.set("transformMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformMatrix: Self = this.set("transformMatrix", js.undefined)
    @scala.inline
    def setTransparentCorners(value: Boolean): Self = this.set("transparentCorners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparentCorners: Self = this.set("transparentCorners", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

