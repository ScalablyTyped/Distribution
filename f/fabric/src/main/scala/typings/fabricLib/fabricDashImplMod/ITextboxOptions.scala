package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextboxOptions extends ITextOptions {
  /**
  	 * Minimum calculated width of a textbox, in pixels.
  	 * fixed to 2 so that an empty textbox cannot go to 0
  	 * and is still selectable without text.
  	 * @type Number
  	 */
  var dynamicMinWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Minimum width of textbox, in pixels.
  	 * @type Number
  	 */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Use this boolean property in order to split strings that have no white space concept.
  	 * this is a cheap way to help with chinese/japaense
  	 * @type Boolean
  	 * @since 2.6.0
  	 */
  var splitByGrapheme: js.UndefOr[scala.Boolean] = js.undefined
}

object ITextboxOptions {
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
    caching: js.UndefOr[scala.Boolean] = js.undefined,
    centeredRotation: js.UndefOr[scala.Boolean] = js.undefined,
    centeredScaling: js.UndefOr[scala.Boolean] = js.undefined,
    charSpacing: scala.Int | scala.Double = null,
    clipPath: Object = null,
    clipTo: js.Function = null,
    cornerColor: java.lang.String = null,
    cornerDashArray: js.Array[scala.Double] = null,
    cornerSize: scala.Int | scala.Double = null,
    cornerStrokeColor: java.lang.String = null,
    cornerStyle: fabricLib.fabricLibStrings.rect | fabricLib.fabricLibStrings.circle = null,
    ctrlKeysMapDown: js.Any = null,
    ctrlKeysMapUp: js.Any = null,
    cursorColor: java.lang.String = null,
    cursorDelay: scala.Int | scala.Double = null,
    cursorDuration: scala.Int | scala.Double = null,
    cursorWidth: scala.Int | scala.Double = null,
    data: js.Any = null,
    deltaY: scala.Int | scala.Double = null,
    dirty: js.UndefOr[scala.Boolean] = js.undefined,
    dynamicMinWidth: scala.Int | scala.Double = null,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    editingBorderColor: java.lang.String = null,
    evented: js.UndefOr[scala.Boolean] = js.undefined,
    excludeFromExport: js.UndefOr[scala.Boolean] = js.undefined,
    fill: java.lang.String = null,
    fillRule: java.lang.String = null,
    flipX: js.UndefOr[scala.Boolean] = js.undefined,
    flipY: js.UndefOr[scala.Boolean] = js.undefined,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    fontStyle: fabricLib.fabricLibStrings.Empty | fabricLib.fabricLibStrings.normal | fabricLib.fabricLibStrings.italic | fabricLib.fabricLibStrings.oblique = null,
    fontWeight: java.lang.String | scala.Double = null,
    globalCompositeOperation: java.lang.String = null,
    hasBorders: js.UndefOr[scala.Boolean] = js.undefined,
    hasControls: js.UndefOr[scala.Boolean] = js.undefined,
    hasRotatingPoint: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    hoverCursor: java.lang.String = null,
    inCompositionMode: js.UndefOr[scala.Boolean] = js.undefined,
    includeDefaultValues: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    isEditing: js.UndefOr[scala.Boolean] = js.undefined,
    keysMap: js.Any = null,
    left: scala.Int | scala.Double = null,
    lineHeight: scala.Int | scala.Double = null,
    linethrough: js.UndefOr[scala.Boolean] = js.undefined,
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
    minWidth: scala.Int | scala.Double = null,
    moveCursor: java.lang.String = null,
    name: java.lang.String = null,
    noScaleCache: js.UndefOr[scala.Boolean] = js.undefined,
    oCoords: fabricLib.Anon_BlBrMb = null,
    objectCaching: js.UndefOr[scala.Boolean] = js.undefined,
    opacity: scala.Int | scala.Double = null,
    originX: java.lang.String = null,
    originY: java.lang.String = null,
    overline: js.UndefOr[scala.Boolean] = js.undefined,
    ownMatrixCache: js.Any = null,
    padding: scala.Int | scala.Double = null,
    paintFirst: java.lang.String = null,
    path: java.lang.String = null,
    perPixelTargetFind: js.UndefOr[scala.Boolean] = js.undefined,
    rotatingPointOffset: scala.Int | scala.Double = null,
    scaleX: scala.Int | scala.Double = null,
    scaleY: scala.Int | scala.Double = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectionBackgroundColor: java.lang.String = null,
    selectionColor: java.lang.String = null,
    selectionEnd: scala.Int | scala.Double = null,
    selectionStart: scala.Int | scala.Double = null,
    shadow: Shadow | java.lang.String = null,
    skewX: scala.Int | scala.Double = null,
    skewY: scala.Int | scala.Double = null,
    splitByGrapheme: js.UndefOr[scala.Boolean] = js.undefined,
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
    styles: js.Any = null,
    subscript: fabricLib.Anon_Baseline = null,
    superscript: fabricLib.Anon_Baseline = null,
    text: java.lang.String = null,
    textAlign: java.lang.String = null,
    textBackgroundColor: java.lang.String = null,
    top: scala.Int | scala.Double = null,
    transformMatrix: js.Array[_] = null,
    transparentCorners: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    underline: js.UndefOr[scala.Boolean] = js.undefined,
    useNative: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): ITextboxOptions = {
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
    if (!js.isUndefined(caching)) __obj.updateDynamic("caching")(caching)
    if (!js.isUndefined(centeredRotation)) __obj.updateDynamic("centeredRotation")(centeredRotation)
    if (!js.isUndefined(centeredScaling)) __obj.updateDynamic("centeredScaling")(centeredScaling)
    if (charSpacing != null) __obj.updateDynamic("charSpacing")(charSpacing.asInstanceOf[js.Any])
    if (clipPath != null) __obj.updateDynamic("clipPath")(clipPath)
    if (clipTo != null) __obj.updateDynamic("clipTo")(clipTo)
    if (cornerColor != null) __obj.updateDynamic("cornerColor")(cornerColor)
    if (cornerDashArray != null) __obj.updateDynamic("cornerDashArray")(cornerDashArray)
    if (cornerSize != null) __obj.updateDynamic("cornerSize")(cornerSize.asInstanceOf[js.Any])
    if (cornerStrokeColor != null) __obj.updateDynamic("cornerStrokeColor")(cornerStrokeColor)
    if (cornerStyle != null) __obj.updateDynamic("cornerStyle")(cornerStyle.asInstanceOf[js.Any])
    if (ctrlKeysMapDown != null) __obj.updateDynamic("ctrlKeysMapDown")(ctrlKeysMapDown)
    if (ctrlKeysMapUp != null) __obj.updateDynamic("ctrlKeysMapUp")(ctrlKeysMapUp)
    if (cursorColor != null) __obj.updateDynamic("cursorColor")(cursorColor)
    if (cursorDelay != null) __obj.updateDynamic("cursorDelay")(cursorDelay.asInstanceOf[js.Any])
    if (cursorDuration != null) __obj.updateDynamic("cursorDuration")(cursorDuration.asInstanceOf[js.Any])
    if (cursorWidth != null) __obj.updateDynamic("cursorWidth")(cursorWidth.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (deltaY != null) __obj.updateDynamic("deltaY")(deltaY.asInstanceOf[js.Any])
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty)
    if (dynamicMinWidth != null) __obj.updateDynamic("dynamicMinWidth")(dynamicMinWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (editingBorderColor != null) __obj.updateDynamic("editingBorderColor")(editingBorderColor)
    if (!js.isUndefined(evented)) __obj.updateDynamic("evented")(evented)
    if (!js.isUndefined(excludeFromExport)) __obj.updateDynamic("excludeFromExport")(excludeFromExport)
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule)
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX)
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (globalCompositeOperation != null) __obj.updateDynamic("globalCompositeOperation")(globalCompositeOperation)
    if (!js.isUndefined(hasBorders)) __obj.updateDynamic("hasBorders")(hasBorders)
    if (!js.isUndefined(hasControls)) __obj.updateDynamic("hasControls")(hasControls)
    if (!js.isUndefined(hasRotatingPoint)) __obj.updateDynamic("hasRotatingPoint")(hasRotatingPoint)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hoverCursor != null) __obj.updateDynamic("hoverCursor")(hoverCursor)
    if (!js.isUndefined(inCompositionMode)) __obj.updateDynamic("inCompositionMode")(inCompositionMode)
    if (!js.isUndefined(includeDefaultValues)) __obj.updateDynamic("includeDefaultValues")(includeDefaultValues)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (!js.isUndefined(isEditing)) __obj.updateDynamic("isEditing")(isEditing)
    if (keysMap != null) __obj.updateDynamic("keysMap")(keysMap)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(linethrough)) __obj.updateDynamic("linethrough")(linethrough)
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
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (moveCursor != null) __obj.updateDynamic("moveCursor")(moveCursor)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(noScaleCache)) __obj.updateDynamic("noScaleCache")(noScaleCache)
    if (oCoords != null) __obj.updateDynamic("oCoords")(oCoords)
    if (!js.isUndefined(objectCaching)) __obj.updateDynamic("objectCaching")(objectCaching)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX)
    if (originY != null) __obj.updateDynamic("originY")(originY)
    if (!js.isUndefined(overline)) __obj.updateDynamic("overline")(overline)
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
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (selectionEnd != null) __obj.updateDynamic("selectionEnd")(selectionEnd.asInstanceOf[js.Any])
    if (selectionStart != null) __obj.updateDynamic("selectionStart")(selectionStart.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (skewX != null) __obj.updateDynamic("skewX")(skewX.asInstanceOf[js.Any])
    if (skewY != null) __obj.updateDynamic("skewY")(skewY.asInstanceOf[js.Any])
    if (!js.isUndefined(splitByGrapheme)) __obj.updateDynamic("splitByGrapheme")(splitByGrapheme)
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
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (subscript != null) __obj.updateDynamic("subscript")(subscript)
    if (superscript != null) __obj.updateDynamic("superscript")(superscript)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (textBackgroundColor != null) __obj.updateDynamic("textBackgroundColor")(textBackgroundColor)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (transformMatrix != null) __obj.updateDynamic("transformMatrix")(transformMatrix)
    if (!js.isUndefined(transparentCorners)) __obj.updateDynamic("transparentCorners")(transparentCorners)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    if (!js.isUndefined(useNative)) __obj.updateDynamic("useNative")(useNative)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextboxOptions]
  }
}

