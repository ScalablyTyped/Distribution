package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectOptions extends js.Object {
  /**
    * Describes the object's corner position in canvas object absolute properties.
    */
  var aCoords: js.UndefOr[fabricLib.Anon_BlBr] = js.undefined
  /**
  	 * Angle of rotation of an object (in degrees)
  	 */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Background color of an object. Only works with text objects at the moment.
  	 */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Color of controlling borders of an object (when it's active)
  	 */
  var borderColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array specifying dash pattern of an object's border (hasBorder must be true)
    */
  var borderDashArray: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
  	 * Opacity of object's controlling borders when object is active and moving
  	 */
  var borderOpacityWhenMoving: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Scale factor of object's controlling borders
  	 */
  var borderScaleFactor: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * When true, this object will use center point as the origin of transformation
  	 * when being rotated via the controls.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredRotation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When true, this object will use center point as the origin of transformation
  	 * when being scaled via the controls.
  	 * <b>Backwards incompatibility note:</b> This property replaces "centerTransform" (Boolean).
  	 */
  var centeredScaling: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Function that determines clipping of an object (context is passed as a first argument)
  	 * Note that context origin is at the object's center point (not left/top corner)
  	 */
  var clipTo: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Color of controlling corners of an object (when it's active)
  	 */
  var cornerColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Array specifying dash pattern of an object's control (hasBorder must be true)
  	 */
  var cornerDashArray: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
  	 * Size of object's controlling corners (in pixels)
  	 */
  var cornerSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Color of controlling corners of an object (when it's active and transparentCorners false)
  	 */
  var cornerStrokeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specify style of control, 'rect' or 'circle'
  	 */
  var cornerStyle: js.UndefOr[fabricLib.fabricLibStrings.rect | fabricLib.fabricLibStrings.circle] = js.undefined
  /**
  	 * Not used by fabric, just for convenience
  	 */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
  	 * When set to `false`, an object can not be a target of events. All events propagate through it. Introduced in v1.3.4
  	 */
  var evented: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Color of object's fill
  	 */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Fill rule used to fill an object
  	 * accepted values are nonzero, evenodd
  	 * Backwards incompatibility note: This property was used for setting globalCompositeOperation until v1.4.12, use `globalCompositeOperation` instead
  	 */
  var fillRule: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * When true, an object is rendered as flipped horizontally
  	 */
  var flipX: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When true, an object is rendered as flipped vertically
  	 */
  var flipY: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Composite rule used for canvas globalCompositeOperation
  	 */
  var globalCompositeOperation: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * When set to `false`, object's controlling borders are not rendered
  	 */
  var hasBorders: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When set to `false`, object's controls are not displayed and can not be used to manipulate object
  	 */
  var hasControls: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When set to `false`, object's controlling rotating point will not be visible or selectable
  	 */
  var hasRotatingPoint: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Object height
  	 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Default cursor value used when hovering over this object on canvas
  	 */
  var hoverCursor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * When `false`, default object's values are not included in its serialization
  	 */
  var includeDefaultValues: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Left position of an object. Note that by default it's relative to object center. You can change this by setting originX={left/center/right}
  	 */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * When `true`, object horizontal movement is locked
  	 */
  var lockMovementX: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When `true`, object vertical movement is locked
  	 */
  var lockMovementY: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When `true`, object rotation is locked
  	 */
  var lockRotation: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When `true`, object cannot be flipped by scaling into negative values
  	 */
  var lockScalingFlip: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When `true`, object horizontal scaling is locked
  	 */
  var lockScalingX: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When `true`, object vertical scaling is locked
  	 */
  var lockScalingY: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * When `true`, object non-uniform scaling is locked
  	 */
  var lockUniScaling: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Minimum allowed scale value of an object
  	 */
  var minScaleLimit: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Not used by fabric, just for convenience
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * When `true`, object is cached on an additional canvas.
  	 */
  var objectCaching: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Opacity of an object
  	 */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Horizontal origin of transformation of an object (one of "left", "right", "center")
  	 */
  var originX: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Vertical origin of transformation of an object (one of "top", "bottom", "center")
  	 */
  var originY: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Padding between object and its controlling borders (in pixels)
  	 */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * When set to `true`, objects are "found" on canvas on per-pixel basis rather than according to bounding box
  	 */
  var perPixelTargetFind: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Offset for object's controlling rotating point (when enabled via `hasRotatingPoint`)
  	 */
  var rotatingPointOffset: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Object scale factor (horizontal)
  	 */
  var scaleX: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Object scale factor (vertical)
  	 */
  var scaleY: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * When set to `false`, an object can not be selected for modification (using either point-click-based or group-based selection).
  	 * But events still fire on it.
  	 */
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Shadow object representing shadow of this shape
  	 */
  var shadow: js.UndefOr[Shadow | java.lang.String] = js.undefined
  /**
    * Object skew factor (horizontal)
    */
  var skewX: js.UndefOr[scala.Double] = js.undefined
  /**
    * Object skew factor (vertical)
    */
  var skewY: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * When defined, an object is rendered via stroke and this property specifies its color
  	 */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Array specifying dash pattern of an object's stroke (stroke must be defined)
  	 */
  var strokeDashArray: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Line endings style of an object's stroke (one of "butt", "round", "square")
  	 */
  var strokeLineCap: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Corner style of an object's stroke (one of "bevil", "round", "miter")
  	 */
  var strokeLineJoin: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Maximum miter length (used for strokeLineJoin = "miter") of an object's stroke
  	 */
  var strokeMiterLimit: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Width of a stroke used to render this object
  	 */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Top position of an object. Note that by default it's relative to object center. You can change this by setting originY={top/center/bottom}
  	 */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Transform matrix (similar to SVG's transform matrix)
  	 */
  var transformMatrix: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * When true, object's controlling corners are rendered as transparent inside (i.e. stroke instead of fill)
  	 */
  var transparentCorners: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Type of an object (rect, circle, path, etc.).
  	 * Note that this property is meant to be read-only and not meant to be modified.
  	 * If you modify, certain parts of Fabric (such as JSON loading) won't work correctly.
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * When set to `false`, an object is not rendered on canvas
  	 */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Object width
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

