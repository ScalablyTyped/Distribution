package typings.fabric.fabricImplMod

import typings.fabric.anon.Ml
import typings.fabric.anon.Tr
import typings.fabric.fabricStrings.circle
import typings.fabric.fabricStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var aCoords: js.UndefOr[Tr] = js.undefined
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
  var absolutePositioned: js.UndefOr[Boolean] = js.undefined
  /**
    * Angle of rotation of an object (in degrees)
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * Background color of an object. Only works with text objects at the moment.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Color of controlling borders of an object (when it's active)
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * Array specifying dash pattern of an object's border (hasBorder must be true)
    */
  var borderDashArray: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Opacity of object's controlling borders when object is active and moving
    */
  var borderOpacityWhenMoving: js.UndefOr[Double] = js.undefined
  /**
    * Scale factor of object's controlling borders
    */
  var borderScaleFactor: js.UndefOr[Double] = js.undefined
  /**
    * List of properties to consider when checking if cache needs refresh
    * Those properties are checked by statefullCache ON ( or lazy mode if we want ) or from single
    * calls to Object.set(key, value). If the key is in this list, the object is marked as dirty
    * and refreshed at the next render
    * @type Array
    */
  var cacheProperties: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The canvas the object belongs to
    */
  var canvas: js.UndefOr[Canvas] = js.undefined
  /**
    * When true, this object will use center point as the origin of transformation
    * when being rotated via the controls.
    * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
    */
  var centeredRotation: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, this object will use center point as the origin of transformation
    * when being scaled via the controls.
    * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
    */
  var centeredScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * A fabricObject that, without stroke define a clipping area with their shape. filled in black
    * the clipPath object gets used when the object has rendered, and the context is placed in the center
    * of the object cacheCanvas.
    * If you want 0,0 of a clipPath to align with an object center, use clipPath.originX/Y to 'center'
    */
  var clipPath: js.UndefOr[Object] = js.undefined
  /**
    * Function that determines clipping of an object (context is passed as a first argument)
    * Note that context origin is at the object's center point (not left/top corner)
    */
  var clipTo: js.UndefOr[js.Function] = js.undefined
  /**
    * Color of controlling corners of an object (when it's active)
    */
  var cornerColor: js.UndefOr[String] = js.undefined
  /**
    * Array specifying dash pattern of an object's control (hasBorder must be true)
    */
  var cornerDashArray: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Size of object's controlling corners (in pixels)
    */
  var cornerSize: js.UndefOr[Double] = js.undefined
  /**
    * Color of controlling corners of an object (when it's active and transparentCorners false)
    */
  var cornerStrokeColor: js.UndefOr[String] = js.undefined
  /**
    * Specify style of control, 'rect' or 'circle'
    */
  var cornerStyle: js.UndefOr[rect | circle] = js.undefined
  /**
    * Not used by fabric, just for convenience
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * When set to `true`, object's cache will be rerendered next render call.
    */
  var dirty: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to `false`, an object can not be a target of events. All events propagate through it. Introduced in v1.3.4
    */
  var evented: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, object is not exported in OBJECT/JSON
    * since 1.6.3
    * @type Boolean
    * @default
    */
  var excludeFromExport: js.UndefOr[Boolean] = js.undefined
  /**
    * Color of object's fill
    */
  var fill: js.UndefOr[String | Pattern | Gradient] = js.undefined
  /**
    * Fill rule used to fill an object
    * accepted values are nonzero, evenodd
    * Backwards incompatibility note: This property was used for setting globalCompositeOperation until v1.4.12, use `globalCompositeOperation` instead
    */
  var fillRule: js.UndefOr[String] = js.undefined
  /**
    * When true, an object is rendered as flipped horizontally
    */
  var flipX: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, an object is rendered as flipped vertically
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  /**
    * Composite rule used for canvas globalCompositeOperation
    */
  var globalCompositeOperation: js.UndefOr[String] = js.undefined
  /**
    * The group the object is part of
    */
  var group: js.UndefOr[Group] = js.undefined
  /**
    * When set to `false`, object's controlling borders are not rendered
    */
  var hasBorders: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to `false`, object's controls are not displayed and can not be used to manipulate object
    */
  var hasControls: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to `false`, object's controlling rotating point will not be visible or selectable
    */
  var hasRotatingPoint: js.UndefOr[Boolean] = js.undefined
  /**
    * Object height
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * Default cursor value used when hovering over this object on canvas
    */
  var hoverCursor: js.UndefOr[String] = js.undefined
  /**
    * When `false`, default object's values are not included in its serialization
    */
  var includeDefaultValues: js.UndefOr[Boolean] = js.undefined
  /**
    * Meaningful ONLY when the object is used as clipPath.
    * if true, the clipPath will make the object clip to the outside of the clipPath
    * since 2.4.0
    * @type boolean
    * @default false
    */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /**
    * Left position of an object. Note that by default it's relative to object center. You can change this by setting originX={left/center/right}
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * When `true`, object horizontal movement is locked
    */
  var lockMovementX: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, object vertical movement is locked
    */
  var lockMovementY: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, object rotation is locked
    */
  var lockRotation: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, object cannot be flipped by scaling into negative values
    */
  var lockScalingFlip: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, object horizontal scaling is locked
    */
  var lockScalingX: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, object vertical scaling is locked
    */
  var lockScalingY: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, object horizontal skewing is locked
    * @type Boolean
    */
  var lockSkewingX: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, object vertical skewing is locked
    * @type Boolean
    */
  var lockSkewingY: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, object non-uniform scaling is locked
    */
  var lockUniScaling: js.UndefOr[Boolean] = js.undefined
  /**
    * storage for object full transform matrix
    */
  var matrixCache: js.UndefOr[js.Any] = js.undefined
  /**
    * Minimum allowed scale value of an object
    */
  var minScaleLimit: js.UndefOr[Double] = js.undefined
  /**
    * Default cursor value used when moving an object on canvas
    */
  var moveCursor: js.UndefOr[String] = js.undefined
  /**
    * Not used by fabric, just for convenience
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * When `true`, cache does not get updated during scaling. The picture will get blocky if scaled
    * too much and will be redrawn with correct details at the end of scaling.
    * this setting is performance and application dependant.
    * default to true
    * since 1.7.0
    * @type Boolean
    */
  var noScaleCache: js.UndefOr[Boolean] = js.undefined
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
  var oCoords: js.UndefOr[Ml] = js.undefined
  /**
    * When `true`, object is cached on an additional canvas.
    */
  var objectCaching: js.UndefOr[Boolean] = js.undefined
  /**
    * Opacity of an object
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * Horizontal origin of transformation of an object (one of "left", "right", "center")
    */
  var originX: js.UndefOr[String] = js.undefined
  /**
    * Vertical origin of transformation of an object (one of "top", "bottom", "center")
    */
  var originY: js.UndefOr[String] = js.undefined
  /**
    * storage for object transform matrix
    */
  var ownMatrixCache: js.UndefOr[js.Any] = js.undefined
  /**
    * Padding between object and its controlling borders (in pixels)
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * Determines if the fill or the stroke is drawn first (one of "fill" or "stroke")
    * @type String
    */
  var paintFirst: js.UndefOr[String] = js.undefined
  /**
    * When set to `true`, objects are "found" on canvas on per-pixel basis rather than according to bounding box
    */
  var perPixelTargetFind: js.UndefOr[Boolean] = js.undefined
  /**
    * Offset for object's controlling rotating point (when enabled via `hasRotatingPoint`)
    */
  var rotatingPointOffset: js.UndefOr[Double] = js.undefined
  /**
    * Object scale factor (horizontal)
    */
  var scaleX: js.UndefOr[Double] = js.undefined
  /**
    * Object scale factor (vertical)
    */
  var scaleY: js.UndefOr[Double] = js.undefined
  /**
    * When set to `false`, an object can not be selected for modification (using either point-click-based or group-based selection).
    * But events still fire on it.
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  /**
    * Selection Background color of an object. colored layer behind the object when it is active.
    * does not mix good with globalCompositeOperation methods.
    * @type String
    */
  var selectionBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Shadow object representing shadow of this shape
    */
  var shadow: js.UndefOr[Shadow | String] = js.undefined
  /**
    * Object skew factor (horizontal)
    */
  var skewX: js.UndefOr[Double] = js.undefined
  /**
    * Object skew factor (vertical)
    */
  var skewY: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the angle that an object will lock to while rotating. Can get from canvas.
    */
  var snapAngle: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the distance from the snapAngle the rotation will lock to the snapAngle. Can get from canvas.
    */
  var snapThreshold: js.UndefOr[Null | Double] = js.undefined
  /**
    * List of properties to consider when checking if state
    * of an object is changed (fabric.Object#hasStateChanged)
    * as well as for history (undo/redo) purposes
    * @type Array
    */
  var stateProperties: js.UndefOr[js.Array[String]] = js.undefined
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
  var statefullCache: js.UndefOr[Boolean] = js.undefined
  /**
    * When defined, an object is rendered via stroke and this property specifies its color
    */
  var stroke: js.UndefOr[String] = js.undefined
  /**
    * Array specifying dash pattern of an object's stroke (stroke must be defined)
    */
  var strokeDashArray: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Line offset of an object's stroke
    * @type Number
    * @default
    */
  var strokeDashOffset: js.UndefOr[Double] = js.undefined
  /**
    * Line endings style of an object's stroke (one of "butt", "round", "square")
    */
  var strokeLineCap: js.UndefOr[String] = js.undefined
  /**
    * Corner style of an object's stroke (one of "bevil", "round", "miter")
    */
  var strokeLineJoin: js.UndefOr[String] = js.undefined
  /**
    * Maximum miter length (used for strokeLineJoin = "miter") of an object's stroke
    */
  var strokeMiterLimit: js.UndefOr[Double] = js.undefined
  /**
    * When `false`, the stoke width will scale with the object.
    * When `true`, the stroke will always match the exact pixel size entered for stroke width.
    * default to false
    * @since 2.6.0
    * @type Boolean
    * @default false
    * @type Boolean
    */
  var strokeUniform: js.UndefOr[Boolean] = js.undefined
  /**
    * Width of a stroke used to render this object
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  /**
    * Top position of an object. Note that by default it's relative to object center. You can change this by setting originY={top/center/bottom}
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    * Transform matrix (similar to SVG's transform matrix)
    */
  var transformMatrix: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * When true, object's controlling corners are rendered as transparent inside (i.e. stroke instead of fill)
    */
  var transparentCorners: js.UndefOr[Boolean] = js.undefined
  /**
    * Type of an object (rect, circle, path, etc.).
    * Note that this property is meant to be read-only and not meant to be modified.
    * If you modify, certain parts of Fabric (such as JSON loading) won't work correctly.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * When set to `false`, an object is not rendered on canvas
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    * Object width
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IObjectOptions {
  @scala.inline
  def apply(
    aCoords: Tr = null,
    absolutePositioned: js.UndefOr[Boolean] = js.undefined,
    angle: js.UndefOr[Double] = js.undefined,
    backgroundColor: String = null,
    borderColor: String = null,
    borderDashArray: js.Array[Double] = null,
    borderOpacityWhenMoving: js.UndefOr[Double] = js.undefined,
    borderScaleFactor: js.UndefOr[Double] = js.undefined,
    cacheProperties: js.Array[String] = null,
    canvas: Canvas = null,
    centeredRotation: js.UndefOr[Boolean] = js.undefined,
    centeredScaling: js.UndefOr[Boolean] = js.undefined,
    clipPath: Object = null,
    clipTo: js.Function = null,
    cornerColor: String = null,
    cornerDashArray: js.Array[Double] = null,
    cornerSize: js.UndefOr[Double] = js.undefined,
    cornerStrokeColor: String = null,
    cornerStyle: rect | circle = null,
    data: js.Any = null,
    dirty: js.UndefOr[Boolean] = js.undefined,
    evented: js.UndefOr[Boolean] = js.undefined,
    excludeFromExport: js.UndefOr[Boolean] = js.undefined,
    fill: String | Pattern | Gradient = null,
    fillRule: String = null,
    flipX: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    globalCompositeOperation: String = null,
    group: Group = null,
    hasBorders: js.UndefOr[Boolean] = js.undefined,
    hasControls: js.UndefOr[Boolean] = js.undefined,
    hasRotatingPoint: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    hoverCursor: String = null,
    includeDefaultValues: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    lockMovementX: js.UndefOr[Boolean] = js.undefined,
    lockMovementY: js.UndefOr[Boolean] = js.undefined,
    lockRotation: js.UndefOr[Boolean] = js.undefined,
    lockScalingFlip: js.UndefOr[Boolean] = js.undefined,
    lockScalingX: js.UndefOr[Boolean] = js.undefined,
    lockScalingY: js.UndefOr[Boolean] = js.undefined,
    lockSkewingX: js.UndefOr[Boolean] = js.undefined,
    lockSkewingY: js.UndefOr[Boolean] = js.undefined,
    lockUniScaling: js.UndefOr[Boolean] = js.undefined,
    matrixCache: js.Any = null,
    minScaleLimit: js.UndefOr[Double] = js.undefined,
    moveCursor: String = null,
    name: String = null,
    noScaleCache: js.UndefOr[Boolean] = js.undefined,
    oCoords: Ml = null,
    objectCaching: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    originX: String = null,
    originY: String = null,
    ownMatrixCache: js.Any = null,
    padding: js.UndefOr[Double] = js.undefined,
    paintFirst: String = null,
    perPixelTargetFind: js.UndefOr[Boolean] = js.undefined,
    rotatingPointOffset: js.UndefOr[Double] = js.undefined,
    scaleX: js.UndefOr[Double] = js.undefined,
    scaleY: js.UndefOr[Double] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectionBackgroundColor: String = null,
    shadow: Shadow | String = null,
    skewX: js.UndefOr[Double] = js.undefined,
    skewY: js.UndefOr[Double] = js.undefined,
    snapAngle: js.UndefOr[Double] = js.undefined,
    snapThreshold: js.UndefOr[Null | Double] = js.undefined,
    stateProperties: js.Array[String] = null,
    statefullCache: js.UndefOr[Boolean] = js.undefined,
    stroke: String = null,
    strokeDashArray: js.Array[Double] = null,
    strokeDashOffset: js.UndefOr[Double] = js.undefined,
    strokeLineCap: String = null,
    strokeLineJoin: String = null,
    strokeMiterLimit: js.UndefOr[Double] = js.undefined,
    strokeUniform: js.UndefOr[Boolean] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined,
    transformMatrix: js.Array[_] = null,
    transparentCorners: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): IObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (aCoords != null) __obj.updateDynamic("aCoords")(aCoords.asInstanceOf[js.Any])
    if (!js.isUndefined(absolutePositioned)) __obj.updateDynamic("absolutePositioned")(absolutePositioned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderDashArray != null) __obj.updateDynamic("borderDashArray")(borderDashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(borderOpacityWhenMoving)) __obj.updateDynamic("borderOpacityWhenMoving")(borderOpacityWhenMoving.get.asInstanceOf[js.Any])
    if (!js.isUndefined(borderScaleFactor)) __obj.updateDynamic("borderScaleFactor")(borderScaleFactor.get.asInstanceOf[js.Any])
    if (cacheProperties != null) __obj.updateDynamic("cacheProperties")(cacheProperties.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (!js.isUndefined(centeredRotation)) __obj.updateDynamic("centeredRotation")(centeredRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(centeredScaling)) __obj.updateDynamic("centeredScaling")(centeredScaling.get.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipTo != null) __obj.updateDynamic("clipTo")(clipTo.asInstanceOf[js.Any])
    if (cornerColor != null) __obj.updateDynamic("cornerColor")(cornerColor.asInstanceOf[js.Any])
    if (cornerDashArray != null) __obj.updateDynamic("cornerDashArray")(cornerDashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(cornerSize)) __obj.updateDynamic("cornerSize")(cornerSize.get.asInstanceOf[js.Any])
    if (cornerStrokeColor != null) __obj.updateDynamic("cornerStrokeColor")(cornerStrokeColor.asInstanceOf[js.Any])
    if (cornerStyle != null) __obj.updateDynamic("cornerStyle")(cornerStyle.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(evented)) __obj.updateDynamic("evented")(evented.get.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeFromExport)) __obj.updateDynamic("excludeFromExport")(excludeFromExport.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.get.asInstanceOf[js.Any])
    if (globalCompositeOperation != null) __obj.updateDynamic("globalCompositeOperation")(globalCompositeOperation.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBorders)) __obj.updateDynamic("hasBorders")(hasBorders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasControls)) __obj.updateDynamic("hasControls")(hasControls.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasRotatingPoint)) __obj.updateDynamic("hasRotatingPoint")(hasRotatingPoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (hoverCursor != null) __obj.updateDynamic("hoverCursor")(hoverCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDefaultValues)) __obj.updateDynamic("includeDefaultValues")(includeDefaultValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockMovementX)) __obj.updateDynamic("lockMovementX")(lockMovementX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockMovementY)) __obj.updateDynamic("lockMovementY")(lockMovementY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockRotation)) __obj.updateDynamic("lockRotation")(lockRotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScalingFlip)) __obj.updateDynamic("lockScalingFlip")(lockScalingFlip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScalingX)) __obj.updateDynamic("lockScalingX")(lockScalingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScalingY)) __obj.updateDynamic("lockScalingY")(lockScalingY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockSkewingX)) __obj.updateDynamic("lockSkewingX")(lockSkewingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockSkewingY)) __obj.updateDynamic("lockSkewingY")(lockSkewingY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lockUniScaling)) __obj.updateDynamic("lockUniScaling")(lockUniScaling.get.asInstanceOf[js.Any])
    if (matrixCache != null) __obj.updateDynamic("matrixCache")(matrixCache.asInstanceOf[js.Any])
    if (!js.isUndefined(minScaleLimit)) __obj.updateDynamic("minScaleLimit")(minScaleLimit.get.asInstanceOf[js.Any])
    if (moveCursor != null) __obj.updateDynamic("moveCursor")(moveCursor.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noScaleCache)) __obj.updateDynamic("noScaleCache")(noScaleCache.get.asInstanceOf[js.Any])
    if (oCoords != null) __obj.updateDynamic("oCoords")(oCoords.asInstanceOf[js.Any])
    if (!js.isUndefined(objectCaching)) __obj.updateDynamic("objectCaching")(objectCaching.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (ownMatrixCache != null) __obj.updateDynamic("ownMatrixCache")(ownMatrixCache.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (paintFirst != null) __obj.updateDynamic("paintFirst")(paintFirst.asInstanceOf[js.Any])
    if (!js.isUndefined(perPixelTargetFind)) __obj.updateDynamic("perPixelTargetFind")(perPixelTargetFind.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotatingPointOffset)) __obj.updateDynamic("rotatingPointOffset")(rotatingPointOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleX)) __obj.updateDynamic("scaleX")(scaleX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleY)) __obj.updateDynamic("scaleY")(scaleY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (selectionBackgroundColor != null) __obj.updateDynamic("selectionBackgroundColor")(selectionBackgroundColor.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(skewX)) __obj.updateDynamic("skewX")(skewX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skewY)) __obj.updateDynamic("skewY")(skewY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapAngle)) __obj.updateDynamic("snapAngle")(snapAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapThreshold)) __obj.updateDynamic("snapThreshold")(snapThreshold.asInstanceOf[js.Any])
    if (stateProperties != null) __obj.updateDynamic("stateProperties")(stateProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(statefullCache)) __obj.updateDynamic("statefullCache")(statefullCache.get.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDashArray != null) __obj.updateDynamic("strokeDashArray")(strokeDashArray.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeDashOffset)) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.get.asInstanceOf[js.Any])
    if (strokeLineCap != null) __obj.updateDynamic("strokeLineCap")(strokeLineCap.asInstanceOf[js.Any])
    if (strokeLineJoin != null) __obj.updateDynamic("strokeLineJoin")(strokeLineJoin.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeMiterLimit)) __obj.updateDynamic("strokeMiterLimit")(strokeMiterLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeUniform)) __obj.updateDynamic("strokeUniform")(strokeUniform.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (transformMatrix != null) __obj.updateDynamic("transformMatrix")(transformMatrix.asInstanceOf[js.Any])
    if (!js.isUndefined(transparentCorners)) __obj.updateDynamic("transparentCorners")(transparentCorners.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectOptions]
  }
}

