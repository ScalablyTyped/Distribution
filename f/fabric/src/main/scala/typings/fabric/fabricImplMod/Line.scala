package typings.fabric.fabricImplMod

import typings.fabric.anon.Axis1
import typings.fabric.anon.Center
import typings.fabric.anon.X1
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fabric.fabricImplMod.IObjectOptions because Already inherited
- typings.fabric.fabricImplMod.ILineOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, canvas, centeredRotation, centeredScaling, clipPath, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, data, dirty, evented, excludeFromExport, fill, fillRule, flipX, flipY, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hoverCursor, includeDefaultValues, inverted, left, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, ownMatrixCache, padding, paintFirst, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, top, transparentCorners, `type`, visible, width. Inlined x1, x2, y1, y2 */ @JSImport("fabric/fabric-impl", "Line")
@js.native
/**
  * Constructor
  * @param [points] Array of points
  * @param [options] Options object
  */
open class Line () extends Object {
  def this(points: js.Array[Double]) = this()
  def this(points: js.Array[Double], objObjects: ILineOptions) = this()
  def this(points: Unit, objObjects: ILineOptions) = this()
  
  /**
    * Returns svg representation of an instance
    * @return {Array} an array of strings with the specific svg representation
    * of the instance
    */
  def _toSVG(): String = js.native
  
  /**
    * Recalculates line points given width and height
    */
  def calcLinePoints(): X1 = js.native
  
  /**
    * Produces a function that calculates distance from canvas edge to Line origin.
    */
  def makeEdgeToOriginGetter(propertyNames: Axis1, originValues: Center): js.Function = js.native
  
  /**
    * x value or first line edge
    */
  var x1: js.UndefOr[Double] = js.native
  
  /**
    * x value or second line edge
    */
  var x2: js.UndefOr[Double] = js.native
  
  /**
    * y value or first line edge
    */
  var y1: js.UndefOr[Double] = js.native
  
  /**
    * y value or second line edge
    */
  var y2: js.UndefOr[Double] = js.native
}
/* static members */
object Line {
  
  @JSImport("fabric/fabric-impl", "Line")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fabric/fabric-impl", "Line.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  inline def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns fabric.Line instance from an SVG element
    * @static
    * @param {SVGElement} element Element to parse
    * @param {Object} [options] Options object
    * @param {Function} [callback] callback function invoked after parsing
    */
  inline def fromElement(element: SVGElement): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[Line]
  inline def fromElement(element: SVGElement, callback: js.Function): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Line]
  inline def fromElement(element: SVGElement, callback: js.Function, options: ILineOptions): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Line]
  inline def fromElement(element: SVGElement, callback: Unit, options: ILineOptions): Line = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Line]
  
  /**
    * Returns fabric.Line instance from an object representation
    * @param object Object to create an instance from
    */
  inline def fromObject(`object`: Any): Line = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Line]
}
