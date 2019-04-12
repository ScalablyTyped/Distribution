package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fabricLib.fabricDashImplMod.ITextboxOptions because var conflicts: aCoords, absolutePositioned, angle, backgroundColor, borderColor, borderDashArray, borderOpacityWhenMoving, borderScaleFactor, cacheProperties, caching, canvas, centeredRotation, centeredScaling, charSpacing, clipPath, clipTo, cornerColor, cornerDashArray, cornerSize, cornerStrokeColor, cornerStyle, ctrlKeysMapDown, ctrlKeysMapUp, cursorColor, cursorDelay, cursorDuration, cursorWidth, data, deltaY, dirty, editable, editingBorderColor, evented, excludeFromExport, fill, fillRule, flipX, flipY, fontFamily, fontSize, fontStyle, fontWeight, globalCompositeOperation, group, hasBorders, hasControls, hasRotatingPoint, height, hiddenTextarea, hoverCursor, inCompositionMode, includeDefaultValues, inverted, isEditing, keysMap, left, lineHeight, linethrough, lockMovementX, lockMovementY, lockRotation, lockScalingFlip, lockScalingX, lockScalingY, lockSkewingX, lockSkewingY, lockUniScaling, matrixCache, minScaleLimit, moveCursor, name, noScaleCache, oCoords, objectCaching, opacity, originX, originY, overline, ownMatrixCache, padding, paintFirst, path, perPixelTargetFind, rotatingPointOffset, scaleX, scaleY, selectable, selectionBackgroundColor, selectionColor, selectionEnd, selectionStart, shadow, skewX, skewY, snapAngle, snapThreshold, stateProperties, statefullCache, stroke, strokeDashArray, strokeDashOffset, strokeLineCap, strokeLineJoin, strokeMiterLimit, strokeUniform, strokeWidth, styles, subscript, superscript, text, textAlign, textBackgroundColor, textLines, top, transformMatrix, transparentCorners, `type`, underline, useNative, visible, width. Inlined minWidth, dynamicMinWidth, splitByGrapheme */ @JSImport("fabric/fabric-impl", "Textbox")
@js.native
class Textbox protected () extends IText {
  /**
  	 * Constructor
  	 * @param text Text string
  	 * @param [options] Options object
  	 */
  def this(text: java.lang.String) = this()
  def this(text: java.lang.String, options: ITextboxOptions) = this()
  /**
  	 * Minimum calculated width of a textbox, in pixels.
  	 * fixed to 2 so that an empty textbox cannot go to 0
  	 * and is still selectable without text.
  	 * @type Number
  	 */
  var dynamicMinWidth: js.UndefOr[scala.Double] = js.native
  /**
  	 * Minimum width of textbox, in pixels.
  	 * @type Number
  	 */
  var minWidth: js.UndefOr[scala.Double] = js.native
  /**
  	 * Use this boolean property in order to split strings that have no white space concept.
  	 * this is a cheap way to help with chinese/japaense
  	 * @type Boolean
  	 * @since 2.6.0
  	 */
  var splitByGrapheme: js.UndefOr[scala.Boolean] = js.native
  /**
    * Returns larger of min width and dynamic min width
    * @return {Number}
    */
  def getMinWidth(): scala.Double = js.native
}

/* static members */
@JSImport("fabric/fabric-impl", "Textbox")
@js.native
object Textbox extends js.Object {
  /**
  	 * Returns fabric.Textbox instance from an object representation
  	 * @static
  	 * @memberOf fabric.Textbox
  	 * @param {Object} object Object to create an instance from
  	 * @param {Function} [callback] Callback to invoke when an fabric.Textbox instance is created
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Textbox = js.native
  def fromObject(`object`: js.Any, callback: js.Function): fabricLib.fabricDashImplMod.Textbox = js.native
}

