package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPathOptions extends IObjectOptions {
  /**
  	 * Array of path points
  	 */
  var path: js.UndefOr[js.Array[Point]] = js.undefined
}

object IPathOptions {
  @scala.inline
  def apply(
    aCoords: fabricLib.Anon_BlBrTlTr = null,
    absolutePositioned: js.UndefOr[scala.Boolean] = js.undefined,
    angle: scala.Int | scala.Double = null,
    backgroundColor: java.lang.String = null,
    borderColor: java.lang.String = null,
    borderDashArray: js.Array[scala.Double] = null,
    borderOpacityWhenMoving: scala.Int | scala.Double = null,
    borderScaleFactor: scala.Int | scala.Double = null,
    cacheProperties: js.Array[java.lang.String] = null,
    centeredRotation: js.UndefOr[scala.Boolean] = js.undefined,
    centeredScaling: js.UndefOr[scala.Boolean] = js.undefined,
    clipPath: Object = null,
    clipTo: js.Function = null,
    cornerColor: java.lang.String = null,
    cornerDashArray: js.Array[scala.Double] = null,
    cornerSize: scala.Int | scala.Double = null,
    cornerStrokeColor: java.lang.String = null,
    cornerStyle: fabricLib.fabricLibStrings.rect | fabricLib.fabricLibStrings.circle = null,
    data: js.Any = null,
    dirty: js.UndefOr[scala.Boolean] = js.undefined,
    evented: js.UndefOr[scala.Boolean] = js.undefined,
    excludeFromExport: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String | Pattern = null,
    fillRule: java.lang.String = null,
    flipX: js.UndefOr[scala.Boolean] = js.undefined,
    flipY: js.UndefOr[scala.Boolean] = js.undefined,
    globalCompositeOperation: java.lang.String = null,
    hasBorders: js.UndefOr[scala.Boolean] = js.undefined,
    hasControls: js.UndefOr[scala.Boolean] = js.undefined,
    hasRotatingPoint: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    hoverCursor: java.lang.String = null,
    includeDefaultValues: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    left: scala.Int | scala.Double = null,
    lockMovementX: js.UndefOr[scala.Boolean] = js.undefined,
    lockMovementY: js.UndefOr[scala.Boolean] = js.undefined,
    lockRotation: js.UndefOr[scala.Boolean] = js.undefined,
    lockScalingFlip: js.UndefOr[scala.Boolean] = js.undefined,
    lockScalingX: js.UndefOr[scala.Boolean] = js.undefined,
    lockScalingY: js.UndefOr[scala.Boolean] = js.undefined,
    lockSkewingX: js.UndefOr[scala.Boolean] = js.undefined,
    lockSkewingY: js.UndefOr[scala.Boolean] = js.undefined,
    lockUniScaling: js.UndefOr[scala.Boolean] = js.undefined,
    matrixCache: js.Any = null,
    minScaleLimit: scala.Int | scala.Double = null,
    moveCursor: java.lang.String = null,
    name: java.lang.String = null,
    noScaleCache: js.UndefOr[scala.Boolean] = js.undefined,
    oCoords: fabricLib.Anon_BlBrMb = null,
    objectCaching: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    originX: java.lang.String = null,
    originY: java.lang.String = null,
    ownMatrixCache: js.Any = null,
    padding: scala.Int | scala.Double = null,
    paintFirst: java.lang.String = null,
    path: js.Array[Point] = null,
    perPixelTargetFind: js.UndefOr[scala.Boolean] = js.undefined,
    rotatingPointOffset: scala.Int | scala.Double = null,
    scaleX: scala.Int | scala.Double = null,
    scaleY: scala.Int | scala.Double = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectionBackgroundColor: java.lang.String = null,
    shadow: Shadow | java.lang.String = null,
    skewX: scala.Int | scala.Double = null,
    skewY: scala.Int | scala.Double = null,
    stateProperties: js.Array[java.lang.String] = null,
    statefullCache: js.UndefOr[scala.Boolean] = js.undefined,
    stroke: java.lang.String = null,
    strokeDashArray: js.Array[scala.Double] = null,
    strokeDashOffset: scala.Int | scala.Double = null,
    strokeLineCap: java.lang.String = null,
    strokeLineJoin: java.lang.String = null,
    strokeMiterLimit: scala.Int | scala.Double = null,
    strokeUniform: js.UndefOr[scala.Boolean] = js.undefined,
    strokeWidth: scala.Int | scala.Double = null,
    top: scala.Int | scala.Double = null,
    transformMatrix: js.Array[_] = null,
    transparentCorners: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): IPathOptions = {
    val __obj = js.Dynamic.literal()
    if (aCoords != null) __obj.updateDynamic("aCoords")(aCoords)
    if (!js.isUndefined(absolutePositioned)) __obj.updateDynamic("absolutePositioned")(absolutePositioned)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (borderDashArray != null) __obj.updateDynamic("borderDashArray")(borderDashArray)
    if (borderOpacityWhenMoving != null) __obj.updateDynamic("borderOpacityWhenMoving")(borderOpacityWhenMoving.asInstanceOf[js.Any])
    if (borderScaleFactor != null) __obj.updateDynamic("borderScaleFactor")(borderScaleFactor.asInstanceOf[js.Any])
    if (cacheProperties != null) __obj.updateDynamic("cacheProperties")(cacheProperties)
    if (!js.isUndefined(centeredRotation)) __obj.updateDynamic("centeredRotation")(centeredRotation)
    if (!js.isUndefined(centeredScaling)) __obj.updateDynamic("centeredScaling")(centeredScaling)
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath)
    if (clipTo != null) __obj.updateDynamic("clipTo")(clipTo)
    if (cornerColor != null) __obj.updateDynamic("cornerColor")(cornerColor)
    if (cornerDashArray != null) __obj.updateDynamic("cornerDashArray")(cornerDashArray)
    if (cornerSize != null) __obj.updateDynamic("cornerSize")(cornerSize.asInstanceOf[js.Any])
    if (cornerStrokeColor != null) __obj.updateDynamic("cornerStrokeColor")(cornerStrokeColor)
    if (cornerStyle != null) __obj.updateDynamic("cornerStyle")(cornerStyle.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty)
    if (!js.isUndefined(evented)) __obj.updateDynamic("evented")(evented)
    if (!js.isUndefined(excludeFromExport)) __obj.updateDynamic("excludeFromExport")(excludeFromExport)
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule)
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX)
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY)
    if (globalCompositeOperation != null) __obj.updateDynamic("globalCompositeOperation")(globalCompositeOperation)
    if (!js.isUndefined(hasBorders)) __obj.updateDynamic("hasBorders")(hasBorders)
    if (!js.isUndefined(hasControls)) __obj.updateDynamic("hasControls")(hasControls)
    if (!js.isUndefined(hasRotatingPoint)) __obj.updateDynamic("hasRotatingPoint")(hasRotatingPoint)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverCursor != null) __obj.updateDynamic("hoverCursor")(hoverCursor)
    if (!js.isUndefined(includeDefaultValues)) __obj.updateDynamic("includeDefaultValues")(includeDefaultValues)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(lockMovementX)) __obj.updateDynamic("lockMovementX")(lockMovementX)
    if (!js.isUndefined(lockMovementY)) __obj.updateDynamic("lockMovementY")(lockMovementY)
    if (!js.isUndefined(lockRotation)) __obj.updateDynamic("lockRotation")(lockRotation)
    if (!js.isUndefined(lockScalingFlip)) __obj.updateDynamic("lockScalingFlip")(lockScalingFlip)
    if (!js.isUndefined(lockScalingX)) __obj.updateDynamic("lockScalingX")(lockScalingX)
    if (!js.isUndefined(lockScalingY)) __obj.updateDynamic("lockScalingY")(lockScalingY)
    if (!js.isUndefined(lockSkewingX)) __obj.updateDynamic("lockSkewingX")(lockSkewingX)
    if (!js.isUndefined(lockSkewingY)) __obj.updateDynamic("lockSkewingY")(lockSkewingY)
    if (!js.isUndefined(lockUniScaling)) __obj.updateDynamic("lockUniScaling")(lockUniScaling)
    if (matrixCache != null) __obj.updateDynamic("matrixCache")(matrixCache)
    if (minScaleLimit != null) __obj.updateDynamic("minScaleLimit")(minScaleLimit.asInstanceOf[js.Any])
    if (moveCursor != null) __obj.updateDynamic("moveCursor")(moveCursor)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(noScaleCache)) __obj.updateDynamic("noScaleCache")(noScaleCache)
    if (oCoords != null) __obj.updateDynamic("oCoords")(oCoords)
    if (!js.isUndefined(objectCaching)) __obj.updateDynamic("objectCaching")(objectCaching)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX)
    if (originY != null) __obj.updateDynamic("originY")(originY)
    if (ownMatrixCache != null) __obj.updateDynamic("ownMatrixCache")(ownMatrixCache)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paintFirst != null) __obj.updateDynamic("paintFirst")(paintFirst)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(perPixelTargetFind)) __obj.updateDynamic("perPixelTargetFind")(perPixelTargetFind)
    if (rotatingPointOffset != null) __obj.updateDynamic("rotatingPointOffset")(rotatingPointOffset.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selectionBackgroundColor != null) __obj.updateDynamic("selectionBackgroundColor")(selectionBackgroundColor)
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (stateProperties != null) __obj.updateDynamic("stateProperties")(stateProperties)
    if (!js.isUndefined(statefullCache)) __obj.updateDynamic("statefullCache")(statefullCache)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (strokeDashArray != null) __obj.updateDynamic("strokeDashArray")(strokeDashArray)
    if (strokeDashOffset != null) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.asInstanceOf[js.Any])
    if (strokeLineCap != null) __obj.updateDynamic("strokeLineCap")(strokeLineCap)
    if (strokeLineJoin != null) __obj.updateDynamic("strokeLineJoin")(strokeLineJoin)
    if (strokeMiterLimit != null) __obj.updateDynamic("strokeMiterLimit")(strokeMiterLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeUniform)) __obj.updateDynamic("strokeUniform")(strokeUniform)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (transformMatrix != null) __obj.updateDynamic("transformMatrix")(transformMatrix)
    if (!js.isUndefined(transparentCorners)) __obj.updateDynamic("transparentCorners")(transparentCorners)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathOptions]
  }
}

