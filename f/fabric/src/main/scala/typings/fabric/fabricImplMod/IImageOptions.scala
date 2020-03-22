package typings.fabric.fabricImplMod

import typings.fabric.AnonMl
import typings.fabric.AnonTr
import typings.fabric.fabricStrings.circle
import typings.fabric.fabricStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IImageOptions extends IObjectOptions {
  /**
  	 * key used to retrieve the texture representing this image
  	 * @since 2.0.0
  	 * @type String
  	 */
  var cacheKey: js.UndefOr[String] = js.undefined
  /**
  	 * Image crop in pixels from original image size.
  	 * @since 2.0.0
  	 * @type Number
  	 */
  var cropX: js.UndefOr[Double] = js.undefined
  /**
  	 * Image crop in pixels from original image size.
  	 * @since 2.0.0
  	 * @type Number
  	 */
  var cropY: js.UndefOr[Double] = js.undefined
  /**
  	 * crossOrigin value (one of "", "anonymous", "allow-credentials")
  	 */
  var crossOrigin: js.UndefOr[String] = js.undefined
  /**
  	 * Image filter array
  	 */
  var filters: js.UndefOr[js.Array[IBaseFilter]] = js.undefined
  /**
  	 * minimum scale factor under which any resizeFilter is triggered to resize the image
  	 * 0 will disable the automatic resize. 1 will trigger automatically always.
  	 * number bigger than 1 are not implemented yet.
  	 * @type Number
  	 */
  var minimumScaleTrigger: js.UndefOr[Double] = js.undefined
  /**
  	 * When calling {@link fabric.Image.getSrc}, return value from element src with `element.getAttribute('src')`.
  	 * This allows for relative urls as image src.
  	 * @since 2.7.0
  	 * @type Boolean
  	 */
  var srcFromAttribute: js.UndefOr[Boolean] = js.undefined
}

object IImageOptions {
  @scala.inline
  def apply(
    aCoords: AnonTr = null,
    absolutePositioned: js.UndefOr[Boolean] = js.undefined,
    angle: Int | Double = null,
    backgroundColor: String = null,
    borderColor: String = null,
    borderDashArray: js.Array[Double] = null,
    borderOpacityWhenMoving: Int | Double = null,
    borderScaleFactor: Int | Double = null,
    cacheKey: String = null,
    cacheProperties: js.Array[String] = null,
    canvas: Canvas = null,
    centeredRotation: js.UndefOr[Boolean] = js.undefined,
    centeredScaling: js.UndefOr[Boolean] = js.undefined,
    clipPath: Object = null,
    clipTo: js.Function = null,
    cornerColor: String = null,
    cornerDashArray: js.Array[Double] = null,
    cornerSize: Int | Double = null,
    cornerStrokeColor: String = null,
    cornerStyle: rect | circle = null,
    cropX: Int | Double = null,
    cropY: Int | Double = null,
    crossOrigin: String = null,
    data: js.Any = null,
    dirty: js.UndefOr[Boolean] = js.undefined,
    evented: js.UndefOr[Boolean] = js.undefined,
    excludeFromExport: js.UndefOr[Boolean] = js.undefined,
    fill: String | Pattern | Gradient = null,
    fillRule: String = null,
    filters: js.Array[IBaseFilter] = null,
    flipX: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    globalCompositeOperation: String = null,
    group: Group = null,
    hasBorders: js.UndefOr[Boolean] = js.undefined,
    hasControls: js.UndefOr[Boolean] = js.undefined,
    hasRotatingPoint: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    hoverCursor: String = null,
    includeDefaultValues: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    left: Int | Double = null,
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
    minScaleLimit: Int | Double = null,
    minimumScaleTrigger: Int | Double = null,
    moveCursor: String = null,
    name: String = null,
    noScaleCache: js.UndefOr[Boolean] = js.undefined,
    oCoords: AnonMl = null,
    objectCaching: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    originX: String = null,
    originY: String = null,
    ownMatrixCache: js.Any = null,
    padding: Int | Double = null,
    paintFirst: String = null,
    perPixelTargetFind: js.UndefOr[Boolean] = js.undefined,
    rotatingPointOffset: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectionBackgroundColor: String = null,
    shadow: Shadow | String = null,
    skewX: Int | Double = null,
    skewY: Int | Double = null,
    snapAngle: Int | Double = null,
    snapThreshold: Int | Double = null,
    srcFromAttribute: js.UndefOr[Boolean] = js.undefined,
    stateProperties: js.Array[String] = null,
    statefullCache: js.UndefOr[Boolean] = js.undefined,
    stroke: String = null,
    strokeDashArray: js.Array[Double] = null,
    strokeDashOffset: Int | Double = null,
    strokeLineCap: String = null,
    strokeLineJoin: String = null,
    strokeMiterLimit: Int | Double = null,
    strokeUniform: js.UndefOr[Boolean] = js.undefined,
    strokeWidth: Int | Double = null,
    top: Int | Double = null,
    transformMatrix: js.Array[_] = null,
    transparentCorners: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): IImageOptions = {
    val __obj = js.Dynamic.literal()
    if (aCoords != null) __obj.updateDynamic("aCoords")(aCoords.asInstanceOf[js.Any])
    if (!js.isUndefined(absolutePositioned)) __obj.updateDynamic("absolutePositioned")(absolutePositioned.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderDashArray != null) __obj.updateDynamic("borderDashArray")(borderDashArray.asInstanceOf[js.Any])
    if (borderOpacityWhenMoving != null) __obj.updateDynamic("borderOpacityWhenMoving")(borderOpacityWhenMoving.asInstanceOf[js.Any])
    if (borderScaleFactor != null) __obj.updateDynamic("borderScaleFactor")(borderScaleFactor.asInstanceOf[js.Any])
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(cacheKey.asInstanceOf[js.Any])
    if (cacheProperties != null) __obj.updateDynamic("cacheProperties")(cacheProperties.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (!js.isUndefined(centeredRotation)) __obj.updateDynamic("centeredRotation")(centeredRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(centeredScaling)) __obj.updateDynamic("centeredScaling")(centeredScaling.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath.asInstanceOf[js.Any])
    if (clipTo != null) __obj.updateDynamic("clipTo")(clipTo.asInstanceOf[js.Any])
    if (cornerColor != null) __obj.updateDynamic("cornerColor")(cornerColor.asInstanceOf[js.Any])
    if (cornerDashArray != null) __obj.updateDynamic("cornerDashArray")(cornerDashArray.asInstanceOf[js.Any])
    if (cornerSize != null) __obj.updateDynamic("cornerSize")(cornerSize.asInstanceOf[js.Any])
    if (cornerStrokeColor != null) __obj.updateDynamic("cornerStrokeColor")(cornerStrokeColor.asInstanceOf[js.Any])
    if (cornerStyle != null) __obj.updateDynamic("cornerStyle")(cornerStyle.asInstanceOf[js.Any])
    if (cropX != null) __obj.updateDynamic("cropX")(cropX.asInstanceOf[js.Any])
    if (cropY != null) __obj.updateDynamic("cropY")(cropY.asInstanceOf[js.Any])
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.asInstanceOf[js.Any])
    if (!js.isUndefined(evented)) __obj.updateDynamic("evented")(evented.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeFromExport)) __obj.updateDynamic("excludeFromExport")(excludeFromExport.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX.asInstanceOf[js.Any])
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY.asInstanceOf[js.Any])
    if (globalCompositeOperation != null) __obj.updateDynamic("globalCompositeOperation")(globalCompositeOperation.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBorders)) __obj.updateDynamic("hasBorders")(hasBorders.asInstanceOf[js.Any])
    if (!js.isUndefined(hasControls)) __obj.updateDynamic("hasControls")(hasControls.asInstanceOf[js.Any])
    if (!js.isUndefined(hasRotatingPoint)) __obj.updateDynamic("hasRotatingPoint")(hasRotatingPoint.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverCursor != null) __obj.updateDynamic("hoverCursor")(hoverCursor.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDefaultValues)) __obj.updateDynamic("includeDefaultValues")(includeDefaultValues.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(lockMovementX)) __obj.updateDynamic("lockMovementX")(lockMovementX.asInstanceOf[js.Any])
    if (!js.isUndefined(lockMovementY)) __obj.updateDynamic("lockMovementY")(lockMovementY.asInstanceOf[js.Any])
    if (!js.isUndefined(lockRotation)) __obj.updateDynamic("lockRotation")(lockRotation.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScalingFlip)) __obj.updateDynamic("lockScalingFlip")(lockScalingFlip.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScalingX)) __obj.updateDynamic("lockScalingX")(lockScalingX.asInstanceOf[js.Any])
    if (!js.isUndefined(lockScalingY)) __obj.updateDynamic("lockScalingY")(lockScalingY.asInstanceOf[js.Any])
    if (!js.isUndefined(lockSkewingX)) __obj.updateDynamic("lockSkewingX")(lockSkewingX.asInstanceOf[js.Any])
    if (!js.isUndefined(lockSkewingY)) __obj.updateDynamic("lockSkewingY")(lockSkewingY.asInstanceOf[js.Any])
    if (!js.isUndefined(lockUniScaling)) __obj.updateDynamic("lockUniScaling")(lockUniScaling.asInstanceOf[js.Any])
    if (matrixCache != null) __obj.updateDynamic("matrixCache")(matrixCache.asInstanceOf[js.Any])
    if (minScaleLimit != null) __obj.updateDynamic("minScaleLimit")(minScaleLimit.asInstanceOf[js.Any])
    if (minimumScaleTrigger != null) __obj.updateDynamic("minimumScaleTrigger")(minimumScaleTrigger.asInstanceOf[js.Any])
    if (moveCursor != null) __obj.updateDynamic("moveCursor")(moveCursor.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noScaleCache)) __obj.updateDynamic("noScaleCache")(noScaleCache.asInstanceOf[js.Any])
    if (oCoords != null) __obj.updateDynamic("oCoords")(oCoords.asInstanceOf[js.Any])
    if (!js.isUndefined(objectCaching)) __obj.updateDynamic("objectCaching")(objectCaching.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (ownMatrixCache != null) __obj.updateDynamic("ownMatrixCache")(ownMatrixCache.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paintFirst != null) __obj.updateDynamic("paintFirst")(paintFirst.asInstanceOf[js.Any])
    if (!js.isUndefined(perPixelTargetFind)) __obj.updateDynamic("perPixelTargetFind")(perPixelTargetFind.asInstanceOf[js.Any])
    if (rotatingPointOffset != null) __obj.updateDynamic("rotatingPointOffset")(rotatingPointOffset.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectionBackgroundColor != null) __obj.updateDynamic("selectionBackgroundColor")(selectionBackgroundColor.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (snapAngle != null) __obj.updateDynamic("snapAngle")(snapAngle.asInstanceOf[js.Any])
    if (snapThreshold != null) __obj.updateDynamic("snapThreshold")(snapThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(srcFromAttribute)) __obj.updateDynamic("srcFromAttribute")(srcFromAttribute.asInstanceOf[js.Any])
    if (stateProperties != null) __obj.updateDynamic("stateProperties")(stateProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(statefullCache)) __obj.updateDynamic("statefullCache")(statefullCache.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDashArray != null) __obj.updateDynamic("strokeDashArray")(strokeDashArray.asInstanceOf[js.Any])
    if (strokeDashOffset != null) __obj.updateDynamic("strokeDashOffset")(strokeDashOffset.asInstanceOf[js.Any])
    if (strokeLineCap != null) __obj.updateDynamic("strokeLineCap")(strokeLineCap.asInstanceOf[js.Any])
    if (strokeLineJoin != null) __obj.updateDynamic("strokeLineJoin")(strokeLineJoin.asInstanceOf[js.Any])
    if (strokeMiterLimit != null) __obj.updateDynamic("strokeMiterLimit")(strokeMiterLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeUniform)) __obj.updateDynamic("strokeUniform")(strokeUniform.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (transformMatrix != null) __obj.updateDynamic("transformMatrix")(transformMatrix.asInstanceOf[js.Any])
    if (!js.isUndefined(transparentCorners)) __obj.updateDynamic("transparentCorners")(transparentCorners.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImageOptions]
  }
}

