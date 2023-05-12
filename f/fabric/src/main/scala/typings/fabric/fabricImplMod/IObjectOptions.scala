package typings.fabric.fabricImplMod

import typings.fabric.anon.Ml
import typings.fabric.anon.Tr
import typings.fabric.fabricStrings.circle
import typings.fabric.fabricStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectOptions extends StObject {
  
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
  var data: js.UndefOr[Any] = js.undefined
  
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
    */
  var lockSkewingX: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, object vertical skewing is locked
    */
  var lockSkewingY: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, object non-uniform scaling is locked
    */
  var lockUniScaling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * storage for object full transform matrix
    */
  var matrixCache: js.UndefOr[Any] = js.undefined
  
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
  var ownMatrixCache: js.UndefOr[Any] = js.undefined
  
  /**
    * Padding between object and its controlling borders (in pixels)
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines if the fill or the stroke is drawn first (one of "fill" or "stroke")
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
    */
  var stateProperties: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * When `true`, object properties are checked for cache invalidation. In some particular
    * situation you may want this to be disabled ( spray brush, very big, groups)
    * or if your application does not allow you to modify properties for groups child you want
    * to disable it for groups.
    * default to false
    * since 1.7.0
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
    * @default false
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
  
  inline def apply(): IObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IObjectOptions] (val x: Self) extends AnyVal {
    
    inline def setACoords(value: Tr): Self = StObject.set(x, "aCoords", value.asInstanceOf[js.Any])
    
    inline def setACoordsUndefined: Self = StObject.set(x, "aCoords", js.undefined)
    
    inline def setAbsolutePositioned(value: Boolean): Self = StObject.set(x, "absolutePositioned", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePositionedUndefined: Self = StObject.set(x, "absolutePositioned", js.undefined)
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderDashArray(value: js.Array[Double]): Self = StObject.set(x, "borderDashArray", value.asInstanceOf[js.Any])
    
    inline def setBorderDashArrayUndefined: Self = StObject.set(x, "borderDashArray", js.undefined)
    
    inline def setBorderDashArrayVarargs(value: Double*): Self = StObject.set(x, "borderDashArray", js.Array(value*))
    
    inline def setBorderOpacityWhenMoving(value: Double): Self = StObject.set(x, "borderOpacityWhenMoving", value.asInstanceOf[js.Any])
    
    inline def setBorderOpacityWhenMovingUndefined: Self = StObject.set(x, "borderOpacityWhenMoving", js.undefined)
    
    inline def setBorderScaleFactor(value: Double): Self = StObject.set(x, "borderScaleFactor", value.asInstanceOf[js.Any])
    
    inline def setBorderScaleFactorUndefined: Self = StObject.set(x, "borderScaleFactor", js.undefined)
    
    inline def setCacheProperties(value: js.Array[String]): Self = StObject.set(x, "cacheProperties", value.asInstanceOf[js.Any])
    
    inline def setCachePropertiesUndefined: Self = StObject.set(x, "cacheProperties", js.undefined)
    
    inline def setCachePropertiesVarargs(value: String*): Self = StObject.set(x, "cacheProperties", js.Array(value*))
    
    inline def setCanvas(value: Canvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setCenteredRotation(value: Boolean): Self = StObject.set(x, "centeredRotation", value.asInstanceOf[js.Any])
    
    inline def setCenteredRotationUndefined: Self = StObject.set(x, "centeredRotation", js.undefined)
    
    inline def setCenteredScaling(value: Boolean): Self = StObject.set(x, "centeredScaling", value.asInstanceOf[js.Any])
    
    inline def setCenteredScalingUndefined: Self = StObject.set(x, "centeredScaling", js.undefined)
    
    inline def setClipPath(value: Object): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
    
    inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
    
    inline def setCornerColor(value: String): Self = StObject.set(x, "cornerColor", value.asInstanceOf[js.Any])
    
    inline def setCornerColorUndefined: Self = StObject.set(x, "cornerColor", js.undefined)
    
    inline def setCornerDashArray(value: js.Array[Double]): Self = StObject.set(x, "cornerDashArray", value.asInstanceOf[js.Any])
    
    inline def setCornerDashArrayUndefined: Self = StObject.set(x, "cornerDashArray", js.undefined)
    
    inline def setCornerDashArrayVarargs(value: Double*): Self = StObject.set(x, "cornerDashArray", js.Array(value*))
    
    inline def setCornerSize(value: Double): Self = StObject.set(x, "cornerSize", value.asInstanceOf[js.Any])
    
    inline def setCornerSizeUndefined: Self = StObject.set(x, "cornerSize", js.undefined)
    
    inline def setCornerStrokeColor(value: String): Self = StObject.set(x, "cornerStrokeColor", value.asInstanceOf[js.Any])
    
    inline def setCornerStrokeColorUndefined: Self = StObject.set(x, "cornerStrokeColor", js.undefined)
    
    inline def setCornerStyle(value: rect | circle): Self = StObject.set(x, "cornerStyle", value.asInstanceOf[js.Any])
    
    inline def setCornerStyleUndefined: Self = StObject.set(x, "cornerStyle", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
    
    inline def setDirtyUndefined: Self = StObject.set(x, "dirty", js.undefined)
    
    inline def setEvented(value: Boolean): Self = StObject.set(x, "evented", value.asInstanceOf[js.Any])
    
    inline def setEventedUndefined: Self = StObject.set(x, "evented", js.undefined)
    
    inline def setExcludeFromExport(value: Boolean): Self = StObject.set(x, "excludeFromExport", value.asInstanceOf[js.Any])
    
    inline def setExcludeFromExportUndefined: Self = StObject.set(x, "excludeFromExport", js.undefined)
    
    inline def setFill(value: String | Pattern | Gradient): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillRule(value: String): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    inline def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    inline def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setGlobalCompositeOperation(value: String): Self = StObject.set(x, "globalCompositeOperation", value.asInstanceOf[js.Any])
    
    inline def setGlobalCompositeOperationUndefined: Self = StObject.set(x, "globalCompositeOperation", js.undefined)
    
    inline def setGroup(value: Group): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHasBorders(value: Boolean): Self = StObject.set(x, "hasBorders", value.asInstanceOf[js.Any])
    
    inline def setHasBordersUndefined: Self = StObject.set(x, "hasBorders", js.undefined)
    
    inline def setHasControls(value: Boolean): Self = StObject.set(x, "hasControls", value.asInstanceOf[js.Any])
    
    inline def setHasControlsUndefined: Self = StObject.set(x, "hasControls", js.undefined)
    
    inline def setHasRotatingPoint(value: Boolean): Self = StObject.set(x, "hasRotatingPoint", value.asInstanceOf[js.Any])
    
    inline def setHasRotatingPointUndefined: Self = StObject.set(x, "hasRotatingPoint", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHoverCursor(value: String): Self = StObject.set(x, "hoverCursor", value.asInstanceOf[js.Any])
    
    inline def setHoverCursorUndefined: Self = StObject.set(x, "hoverCursor", js.undefined)
    
    inline def setIncludeDefaultValues(value: Boolean): Self = StObject.set(x, "includeDefaultValues", value.asInstanceOf[js.Any])
    
    inline def setIncludeDefaultValuesUndefined: Self = StObject.set(x, "includeDefaultValues", js.undefined)
    
    inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
    
    inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLockMovementX(value: Boolean): Self = StObject.set(x, "lockMovementX", value.asInstanceOf[js.Any])
    
    inline def setLockMovementXUndefined: Self = StObject.set(x, "lockMovementX", js.undefined)
    
    inline def setLockMovementY(value: Boolean): Self = StObject.set(x, "lockMovementY", value.asInstanceOf[js.Any])
    
    inline def setLockMovementYUndefined: Self = StObject.set(x, "lockMovementY", js.undefined)
    
    inline def setLockRotation(value: Boolean): Self = StObject.set(x, "lockRotation", value.asInstanceOf[js.Any])
    
    inline def setLockRotationUndefined: Self = StObject.set(x, "lockRotation", js.undefined)
    
    inline def setLockScalingFlip(value: Boolean): Self = StObject.set(x, "lockScalingFlip", value.asInstanceOf[js.Any])
    
    inline def setLockScalingFlipUndefined: Self = StObject.set(x, "lockScalingFlip", js.undefined)
    
    inline def setLockScalingX(value: Boolean): Self = StObject.set(x, "lockScalingX", value.asInstanceOf[js.Any])
    
    inline def setLockScalingXUndefined: Self = StObject.set(x, "lockScalingX", js.undefined)
    
    inline def setLockScalingY(value: Boolean): Self = StObject.set(x, "lockScalingY", value.asInstanceOf[js.Any])
    
    inline def setLockScalingYUndefined: Self = StObject.set(x, "lockScalingY", js.undefined)
    
    inline def setLockSkewingX(value: Boolean): Self = StObject.set(x, "lockSkewingX", value.asInstanceOf[js.Any])
    
    inline def setLockSkewingXUndefined: Self = StObject.set(x, "lockSkewingX", js.undefined)
    
    inline def setLockSkewingY(value: Boolean): Self = StObject.set(x, "lockSkewingY", value.asInstanceOf[js.Any])
    
    inline def setLockSkewingYUndefined: Self = StObject.set(x, "lockSkewingY", js.undefined)
    
    inline def setLockUniScaling(value: Boolean): Self = StObject.set(x, "lockUniScaling", value.asInstanceOf[js.Any])
    
    inline def setLockUniScalingUndefined: Self = StObject.set(x, "lockUniScaling", js.undefined)
    
    inline def setMatrixCache(value: Any): Self = StObject.set(x, "matrixCache", value.asInstanceOf[js.Any])
    
    inline def setMatrixCacheUndefined: Self = StObject.set(x, "matrixCache", js.undefined)
    
    inline def setMinScaleLimit(value: Double): Self = StObject.set(x, "minScaleLimit", value.asInstanceOf[js.Any])
    
    inline def setMinScaleLimitUndefined: Self = StObject.set(x, "minScaleLimit", js.undefined)
    
    inline def setMoveCursor(value: String): Self = StObject.set(x, "moveCursor", value.asInstanceOf[js.Any])
    
    inline def setMoveCursorUndefined: Self = StObject.set(x, "moveCursor", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoScaleCache(value: Boolean): Self = StObject.set(x, "noScaleCache", value.asInstanceOf[js.Any])
    
    inline def setNoScaleCacheUndefined: Self = StObject.set(x, "noScaleCache", js.undefined)
    
    inline def setOCoords(value: Ml): Self = StObject.set(x, "oCoords", value.asInstanceOf[js.Any])
    
    inline def setOCoordsUndefined: Self = StObject.set(x, "oCoords", js.undefined)
    
    inline def setObjectCaching(value: Boolean): Self = StObject.set(x, "objectCaching", value.asInstanceOf[js.Any])
    
    inline def setObjectCachingUndefined: Self = StObject.set(x, "objectCaching", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOriginX(value: String): Self = StObject.set(x, "originX", value.asInstanceOf[js.Any])
    
    inline def setOriginXUndefined: Self = StObject.set(x, "originX", js.undefined)
    
    inline def setOriginY(value: String): Self = StObject.set(x, "originY", value.asInstanceOf[js.Any])
    
    inline def setOriginYUndefined: Self = StObject.set(x, "originY", js.undefined)
    
    inline def setOwnMatrixCache(value: Any): Self = StObject.set(x, "ownMatrixCache", value.asInstanceOf[js.Any])
    
    inline def setOwnMatrixCacheUndefined: Self = StObject.set(x, "ownMatrixCache", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaintFirst(value: String): Self = StObject.set(x, "paintFirst", value.asInstanceOf[js.Any])
    
    inline def setPaintFirstUndefined: Self = StObject.set(x, "paintFirst", js.undefined)
    
    inline def setPerPixelTargetFind(value: Boolean): Self = StObject.set(x, "perPixelTargetFind", value.asInstanceOf[js.Any])
    
    inline def setPerPixelTargetFindUndefined: Self = StObject.set(x, "perPixelTargetFind", js.undefined)
    
    inline def setRotatingPointOffset(value: Double): Self = StObject.set(x, "rotatingPointOffset", value.asInstanceOf[js.Any])
    
    inline def setRotatingPointOffsetUndefined: Self = StObject.set(x, "rotatingPointOffset", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelectionBackgroundColor(value: String): Self = StObject.set(x, "selectionBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionBackgroundColorUndefined: Self = StObject.set(x, "selectionBackgroundColor", js.undefined)
    
    inline def setShadow(value: Shadow | String): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setSkewX(value: Double): Self = StObject.set(x, "skewX", value.asInstanceOf[js.Any])
    
    inline def setSkewXUndefined: Self = StObject.set(x, "skewX", js.undefined)
    
    inline def setSkewY(value: Double): Self = StObject.set(x, "skewY", value.asInstanceOf[js.Any])
    
    inline def setSkewYUndefined: Self = StObject.set(x, "skewY", js.undefined)
    
    inline def setSnapAngle(value: Double): Self = StObject.set(x, "snapAngle", value.asInstanceOf[js.Any])
    
    inline def setSnapAngleUndefined: Self = StObject.set(x, "snapAngle", js.undefined)
    
    inline def setSnapThreshold(value: Double): Self = StObject.set(x, "snapThreshold", value.asInstanceOf[js.Any])
    
    inline def setSnapThresholdNull: Self = StObject.set(x, "snapThreshold", null)
    
    inline def setSnapThresholdUndefined: Self = StObject.set(x, "snapThreshold", js.undefined)
    
    inline def setStateProperties(value: js.Array[String]): Self = StObject.set(x, "stateProperties", value.asInstanceOf[js.Any])
    
    inline def setStatePropertiesUndefined: Self = StObject.set(x, "stateProperties", js.undefined)
    
    inline def setStatePropertiesVarargs(value: String*): Self = StObject.set(x, "stateProperties", js.Array(value*))
    
    inline def setStatefullCache(value: Boolean): Self = StObject.set(x, "statefullCache", value.asInstanceOf[js.Any])
    
    inline def setStatefullCacheUndefined: Self = StObject.set(x, "statefullCache", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashArray(value: js.Array[Double]): Self = StObject.set(x, "strokeDashArray", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashArrayUndefined: Self = StObject.set(x, "strokeDashArray", js.undefined)
    
    inline def setStrokeDashArrayVarargs(value: Double*): Self = StObject.set(x, "strokeDashArray", js.Array(value*))
    
    inline def setStrokeDashOffset(value: Double): Self = StObject.set(x, "strokeDashOffset", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashOffsetUndefined: Self = StObject.set(x, "strokeDashOffset", js.undefined)
    
    inline def setStrokeLineCap(value: String): Self = StObject.set(x, "strokeLineCap", value.asInstanceOf[js.Any])
    
    inline def setStrokeLineCapUndefined: Self = StObject.set(x, "strokeLineCap", js.undefined)
    
    inline def setStrokeLineJoin(value: String): Self = StObject.set(x, "strokeLineJoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeLineJoinUndefined: Self = StObject.set(x, "strokeLineJoin", js.undefined)
    
    inline def setStrokeMiterLimit(value: Double): Self = StObject.set(x, "strokeMiterLimit", value.asInstanceOf[js.Any])
    
    inline def setStrokeMiterLimitUndefined: Self = StObject.set(x, "strokeMiterLimit", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeUniform(value: Boolean): Self = StObject.set(x, "strokeUniform", value.asInstanceOf[js.Any])
    
    inline def setStrokeUniformUndefined: Self = StObject.set(x, "strokeUniform", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setTransparentCorners(value: Boolean): Self = StObject.set(x, "transparentCorners", value.asInstanceOf[js.Any])
    
    inline def setTransparentCornersUndefined: Self = StObject.set(x, "transparentCorners", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
