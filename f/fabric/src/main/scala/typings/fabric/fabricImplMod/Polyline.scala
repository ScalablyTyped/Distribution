package typings.fabric.fabricImplMod

import typings.fabric.anon.Top
import typings.fabric.anon.X
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fabric.fabricImplMod.IObjectOptions because Already inherited
- typings.fabric.fabricImplMod.IPolylineOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined points */ @JSImport("fabric/fabric-impl", "Polyline")
@js.native
class Polyline protected () extends Object {
  /**
    * Constructor
    * @param points Array of points (where each point is an object with x and y)
    * @param [options] Options object
    * @param [skipOffset] Whether points offsetting should be skipped
    */
  def this(points: js.Array[X]) = this()
  def this(points: js.Array[X], options: IPolylineOptions) = this()
  
  /**
    * Calculate the polygon min and max point from points array,
    * returning an object with left, top, width, height to measure the polygon size
    * @private
    * @return {Object} object.left X coordinate of the polygon leftmost point
    * @return {Object} object.top Y coordinate of the polygon topmost point
    * @return {Object} object.width distance between X coordinates of the polygon leftmost and rightmost point
    * @return {Object} object.height distance between Y coordinates of the polygon topmost and bottommost point
    */
  def _calcDimensions(): Top = js.native
  
  var pathOffset: Point = js.native
  
  /**
    * Points array
    */
  var points: js.UndefOr[js.Array[Point]] = js.native
}
/* static members */
object Polyline {
  
  @JSImport("fabric/fabric-impl", "Polyline")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    */
  @JSImport("fabric/fabric-impl", "Polyline.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  @scala.inline
  def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Polyline  instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  @scala.inline
  def fromElement(element: SVGElement): Polyline = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[Polyline]
  @scala.inline
  def fromElement(element: SVGElement, options: IPolylineOptions): Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Polyline]
  
  /**
    * Returns fabric.Polyline instance from an object representation
    * @param object Object to create an instance from
    */
  @scala.inline
  def fromObject(`object`: js.Any): Polyline = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Polyline]
}
