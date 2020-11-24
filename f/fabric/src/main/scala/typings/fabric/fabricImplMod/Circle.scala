package typings.fabric.fabricImplMod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fabric.fabricImplMod.IObjectOptions because Already inherited
- typings.fabric.fabricImplMod.ICircleOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transformMatrix, transparentCorners, `type`, visible, width. Inlined radius, startAngle, endAngle */ @JSImport("fabric/fabric-impl", "Circle")
@js.native
class Circle () extends Object {
  def this(options: ICircleOptions) = this()
  
  /**
    * Returns svg representation of an instance
    * @return {Array} an array of strings with the specific svg representation
    * of the instance
    */
  def _toSVG(): String = js.native
  
  /**
    * End angle of the circle
    */
  var endAngle: js.UndefOr[Double] = js.native
  
  /**
    * Returns horizontal radius of an object (according to how an object is scaled)
    */
  def getRadiusX(): Double = js.native
  
  /**
    * Returns vertical radius of an object (according to how an object is scaled)
    */
  def getRadiusY(): Double = js.native
  
  /**
    * Radius of this circle
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * Sets radius of an object (and updates width accordingly)
    */
  def setRadius(value: Double): Double = js.native
  
  /**
    * Start angle of the circle, moving clockwise
    */
  var startAngle: js.UndefOr[Double] = js.native
}
/* static members */
@JSImport("fabric/fabric-impl", "Circle")
@js.native
object Circle extends js.Object {
  
  /**
    * List of attribute names to account for when parsing SVG element (used by {@link fabric.Circle.fromElement})
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  /**
    * Returns Circle instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  def fromElement(element: SVGElement, options: ICircleOptions): Circle = js.native
  
  /**
    * Returns Circle instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: js.Any): Circle = js.native
}
