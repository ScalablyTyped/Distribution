package typings.fabric.fabricImplMod

import typings.fabric.anon.Ml
import typings.fabric.anon.Tr
import typings.fabric.fabricStrings.circle
import typings.fabric.fabricStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEllipseOptions extends IObjectOptions {
  /**
    * Horizontal radius
    */
  var rx: js.UndefOr[Double] = js.undefined
  /**
    * Vertical radius
    */
  var ry: js.UndefOr[Double] = js.undefined
}

object IEllipseOptions {
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
    rx: js.UndefOr[Double] = js.undefined,
    ry: js.UndefOr[Double] = js.undefined,
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
  ): IEllipseOptions = {
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
    if (!js.isUndefined(rx)) __obj.updateDynamic("rx")(rx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ry)) __obj.updateDynamic("ry")(ry.get.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[IEllipseOptions]
  }
}

